import java.util.Arrays;
import java.util.List;

public class java8demo {
	public static void main(String[] args) {
		Integer[] arr = { 123, 456, 789, 234, 467 };

		List<Integer> asList = Arrays.asList(arr);
		System.out.println(asList);

		asList.stream().map(t -> {
			int rev = 0;
			while (t > 0) {
				rev = rev * 10 + t % 10;
				t = t / 10;
			}
			return rev;
		}).sorted().forEach(System.out::println);

	}
}