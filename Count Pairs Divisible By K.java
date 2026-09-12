import java.util.HashMap;

class Solution {
	public int countKdivPairs(int[] arr, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int ele : arr)
			{
			int num = ele % k;
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		int pairs = 0;
		if (map.containsKey(0))
			{
			int zeroCount = map.get(0);
			pairs += (zeroCount * (zeroCount - 1));
			map.remove(0);
		}
		
		if (k % 2 == 0 && map.containsKey(k/2)) {
			int halfCount = map.get(k/2);
			pairs += (halfCount * (halfCount - 1));
			map.remove(k/2);
		}
		
		for (int key : map.keySet())
			{
			int rem = k - key;
			if (map.containsKey(rem))
				pairs += ((map.get(key)) * (map.get(rem)));
		}
		
		int answer = (pairs/2);
		return answer;
	}
}