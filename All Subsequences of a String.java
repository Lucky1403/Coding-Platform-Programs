import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
	public List<String> powerSet(String s) {
		List<String> list = new ArrayList<>();
		subsets("", s, 0, list);
		
		Collections.sort(list);
		return list;
	}
	
	public static void subsets(String ans, String s, int idx, List<String> list)
	{
		if (idx == s.length())
		{
			list.add(ans);
			return;
		}
		
		char ch = s.charAt(idx);
		subsets(ans + ch, s, idx + 1, list);
		subsets(ans, s, idx + 1, list);
	}
}
