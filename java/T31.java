// 实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。

// 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。

// 必须原地修改，只允许使用额外常数空间。

// 以下是一些例子，输入位于左侧列，其相应输出位于右侧列。
// 1,2,3 → 1,3,2
// 3,2,1 → 1,2,3
// 1,1,5 → 1,5,1

class T31 {
    public static void main(String[] args) {

    }

    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int i = len - 2;
        for (; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                break;
            }
        }
        if (i != -1) {
            for (int j = len - 1; j > i; j--) {
                if (nums[j] > nums[i]) {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                    break;
                }
            }
        }
        for (int m = i + 1, n = len - 1; m < n;) {
            int tmp = nums[m];
            nums[m++] = nums[n];
            nums[n--] = tmp;
        }
    }
}