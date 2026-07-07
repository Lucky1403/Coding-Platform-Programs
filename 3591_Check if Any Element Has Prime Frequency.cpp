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
        
        if (num == 2)
        {
            return true;
        }

        if(num % 2 == 0)
        {
            return false;
        }

        int limit = sqrt(num);
        for(int i = 3; i <= limit; i+= 2)
        {
            if(num % i == 0)
            {
                return false;
            }
        }

        return true;
    }

    bool checkPrimeFrequency(vector<int>& nums) {
        
        unordered_map<int, int> frequency;
        for(int num : nums)
        {
            frequency[num]++;
        }

        for(auto&pair : frequency)
        {
            if(isPrime(pair.second))
            {
                return true;
            }
        }
        return false;
    }
};