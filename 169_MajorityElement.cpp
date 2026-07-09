#include<vector>
#include<algorithm>
#include<iostream>
using namespace std;

class Solution {
public:
    int majorityElement(vector<int>& nums) {
        
        int n = nums.size();
        int candidate = -1;

        int count = 0;
        for(int i = 0; i < nums.size(); i++)
        {
            if(count == 0)
            {
                candidate = nums[i];
                count++;
            }
            else if(nums[i] == candidate)
            {
                count++;
            }
            else
            {
                count--;
            }
        }

        count = 0;
        for(int x : nums)
        {
            if(x == candidate)
            {
                count++;
            }
        }

        if(count > (n/2))
        {
            return candidate;
        }
        else
        {
            return -1;
        }
    }
};