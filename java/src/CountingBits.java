import java.util.Arrays;

/**
 * @author liukang
 * @since 2016/3/19
 */
public class CountingBits {
	public static int[] countBits(int num) {
		if(num < 0){
			return null;
		}
		int[] ret = new int[num + 1];
		ret[0] = 0;
		for (int i = 1; i <= num; i++){
			int parent = i >> 1;
			ret[i] = ret[parent] + (i & 1);
		}
		return ret;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(countBits(5)));
	}
}
