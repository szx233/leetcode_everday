// 给定一个整数，编写一个函数来判断它是否是 2 的幂次方。

// 示例 1:

// 输入: 1
// 输出: true
// 解释: 20 = 1
// 示例 2:

// 输入: 16
// 输出: true
// 解释: 24 = 16
// 示例 3:

// 输入: 218
// 输出: false

class T231 {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
// 重点在于对位运算符的理解
// 解法1：&运算，同1则1。 return (n > 0) && (n & -n) == n;
// 解释：2的幂次方在二进制下，只有1位是1，其余全是0。例如:8---00001000。负数的在计算机中二进制表示为补码(原码->正常二进制表示，原码按位取反(0-1,1-0)，最后再+1。然后两者进行与操作，得到的肯定是原码中最后一个二进制的1。例如8&(-8)->00001000 & 11111000 得 00001000，即8。 建议自己动手算一下，按照这个流程来一遍，加深印象。
// 解法2：移位运算：把二进制数进行左右移位。左移1位，扩大2倍；右移1位，缩小2倍。 return (n>0) && (1<<30) % n == 0;
// 解释：1<<30得到最大的2的整数次幂，对n取模如果等于0，说明n只有因子2。