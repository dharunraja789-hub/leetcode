// Last updated: 13/02/2026, 10:09:24
class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int area = -1;
        int mx = 0;
        while (l < r)
        {
            mx = Math.min(height[l], height[r]) * (r - l);
            if (area < mx)
            {
                area = mx;
            }
            if (height[l] <= height[r])
            {
                l++;
            }
            else
            {
                r--;
            }
        }

        return area;
    }
}