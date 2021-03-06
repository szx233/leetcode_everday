/**
 * @Author: jesse
 * @Date: 2021/1/31 5:58 下午
 * 初始时有 n 个灯泡关闭。
 * <p>
 * 第 1 轮，你打开所有的灯泡。 第 2 轮，每两个灯泡你关闭一次。 第 3 轮，每三个灯泡切换一次开关（如果关闭则开启，如果开启则关闭）。
 * <p>
 * 第 i 轮，每 i 个灯泡切换一次开关。 对于第 n 轮，你只切换最后一个灯泡的开关。
 * <p>
 * 找出 n 轮后有多少个亮着的灯泡。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/bulb-switcher
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T319 {
    public int bulbSwitch(int n) {
        return (int) Math.sqrt(n);
    }
}
