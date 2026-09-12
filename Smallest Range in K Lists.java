import java.util.ArrayList;
import java.util.PriorityQueue;

class Solution {
	class Triplet implements Comparable<Triplet> {
		int value;
		int rowIndex;
		int columnIndex;
		
		Triplet(int value, int rowIndex, int columnIndex)
		{
			this.value = value;
			this.rowIndex = rowIndex;
			this.columnIndex = columnIndex;
		}
		
		public int compareTo(Triplet other)
		{
			return Integer.compare(this.value, other.value);
		}
	}
	
	public ArrayList<Integer> findSmallestRange(int[][] nums) {
		PriorityQueue<Triplet> minHeap = new PriorityQueue<>();
		
		int maximum = Integer.MIN_VALUE;
		
		for (int i = 0; i < nums.length; i++) {
			int val = nums[i][0];
			minHeap.add(new Triplet(val, i, 0));
			maximum = Math.max(maximum, val);
		}
		
		int start = minHeap.peek().value;
		int end = maximum;
		
		while (minHeap.size() == nums.length)
			{
			Triplet current = minHeap.remove();
			int row = current.rowIndex;
			int col = current.columnIndex;
			if (maximum - current.value < end - start)
				{
				start = current.value;
				end = maximum;
			}
			
			if (col + 1 < nums[row].length) {
				int nextValue = nums[row][col + 1];
				minHeap.add(new Triplet(nextValue, row, col + 1));
				maximum = Math.max(nextValue, maximum);
			}
			else
				break;
		}
		ArrayList<Integer> list = new ArrayList<>();
		list.add(start);
		list.add(end);
		return list;
	}
}
