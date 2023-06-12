
public class asdf {

	public static boolean stringCheck(String str) {
		boolean b = false;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == '{' && str.charAt(j) == '}') {
					b = true;
				} else if (str.charAt(i) == '[' && str.charAt(j) == ']') {
					b = true;
				} else if (str.charAt(i) == '(' && str.charAt(j) == ')') {
					b = true;
				}
			}
		}
		return b;

	}

	public static void main(String[] args) {

		boolean ss = stringCheck("()");
		System.out.println(ss);

	}

}
