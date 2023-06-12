import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringCount {
	public static void main(String[] args) {
//		String str = "12345671234567";
//		Map<Object, List<String>> count = Arrays.stream(str.split("")).collect(Collectors.groupingBy(t -> t));
//		Map<Object, Long> count1 = Arrays.stream(str.split(""))
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		System.out.println(count);
//		System.out.println(count1);
		
		
		String st="hi mahesh Welcome to java Programming";
		int count11=0;
		for (int i = 0; i < st.length(); i++) {
			
			if(st.charAt(i) !=' ') {
				count11++;
			}
		}
		
		System.out.println(count11);
		
//		 using java8 white Spaces remove
		String s=st.replaceAll("\\s", "");
		long count123 = Arrays.stream(s.split("")).count();
		System.out.println(count123);
	}
}
