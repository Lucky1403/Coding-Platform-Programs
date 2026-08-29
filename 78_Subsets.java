import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        subsetFinder(ans, nums, 0, list);

        return list;
    }

    public void subsetFinder(List<Integer> ans, int[] nums, int idx,  List<List<Integer>> list)
    {
        if(idx == nums.length)
        {
            list.add(new ArrayList<>(ans));
            return;
        }
        ans.add(nums[idx]);
        subsetFinder(ans, nums, idx + 1, list);
        ans.remove(ans.size() - 1);
        subsetFinder(ans, nums, idx + 1, list);
    }
}