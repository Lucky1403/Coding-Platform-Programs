#include<vector>
#include<algorithm>
#include<iostream>
#include<string>
#include<list>
using namespace std;

class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        
        erase(nums, val);

        int n = nums.size();
        return n;
    }
};