/**
 * @author liukang
 * @since 2016/3/20
 */
public class SingleNumber {
	public int singleNumber(int[] nums) {
		int single = 0;
		for (int num : nums) {
			single ^= num;
		}
		return single;
	}
}
