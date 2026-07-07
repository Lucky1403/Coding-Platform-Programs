#include <bits/stdc++.h>
#include <vector>
#include <cmath>
#include <algorithm>
#include <iostream>
using namespace std;

class Solution {
public:
    int diagonalSum(vector<vector<int>>& mat) {
        int n = mat.size();

        int sum = 0;

        for(int i = 0; i < n; i++)
        {
            if(n % 2 == 0)
            {
                sum += mat[i][i];

                int k = n - 1 - i;

                sum += mat[i][k];
            }
            else
            {
                sum += mat[i][i];

                int k = n - 1 - i;

                if(i == k)
                {
                    sum = sum;
                }
                else
                {
                    sum += mat[i][k];
                }
            }
        }
        return sum;
    }
};