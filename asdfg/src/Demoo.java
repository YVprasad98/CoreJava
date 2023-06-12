import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demoo {
	public static void main(String[] args) {
		int[] arr = { 123, 456, 789,123 };
		int [] revNum=new int[arr.length];
		for (int j = 0; j < arr.length; j++) {
			int num = arr[j];
			int rev = 0;
			while (num > 0) {
				rev = rev * 10 + num % 10;
				num = num / 10;
			}
//			System.out.println(rev);
			revNum[j]=rev;
			rev = 0;
		}
		
		System.out.println(Arrays.toString(arr));
		
		List<Integer> li=new ArrayList<>();
		for (Integer i : revNum) {
			li.add(i);
		}
		System.out.println(li);
		Collections.sort(li);
		System.out.println(li);
	}
}
