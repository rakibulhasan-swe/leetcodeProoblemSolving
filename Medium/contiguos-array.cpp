//https://leetcode.com/problems/contiguous-array/
class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        std::unordered_map<int, int> indices;
        indices[0] = -1;
        int count = 0, max_length = 0;
        for (int i = 0; i < nums.size(); i++) {
            count += (nums[i] == 0 ? -1 : 1);
            if (indices.count(count)) {
                max_length = std::max(max_length, i - indices[count]);
            } else {
                indices[count] = i;
            }
        }
        return max_length;
    }
};