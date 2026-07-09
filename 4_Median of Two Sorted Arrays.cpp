#include<vector>
#include<algorithm>
#include<iostream>
using namespace std;

class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {

        nums1.insert(nums1.end(), nums2.begin(), nums2.end());

        sort(nums1.begin(), nums1.end());

        int size = nums1.size();
        double answer = 0.00;

        if(size % 2 != 0)
        {
            answer = nums1[(size)/2];
            return answer;
        }
        else
        {
            answer = static_cast<double>(nums1[size/2] + nums1[(size/2) - 1]) / 2;
            return answer;
        }
    }
};