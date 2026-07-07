#include <bits/stdc++.h>    
#include <vector>
#include <cmath>
#include <algorithm>
#include <iostream>
using namespace std;

class Solution {
public:
    bool isPrime(int num)
    {
        if (num <= 1)
        {
            return false;
        }

        if(num == 2)
        {
            return true;
        }

        if(num % 2 == 0)
        {
            return false;
        }

        int limit = sqrt(num);
        for(int i = 3; i <= limit ; i+=2)
        {
            if(num % i == 0)
            {
                return false;
            }
        }

        return true;
    }

    int diagonalPrime(vector<vector<int>>& nums) {
        
        int maxValue = 0;
        int n = nums.size();

        for(int i = 0; i < n; i++)
        {
            if(isPrime(nums[i][i]))
            {
                maxValue = max(maxValue, nums[i][i]);
            }

            int k = n - 1 - i;
            if(isPrime(nums[i][k]))
            {  
                maxValue = max(maxValue, nums[i][k]);
            }
        }
        return maxValue;
    }
};