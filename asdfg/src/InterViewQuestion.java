
public class InterViewQuestion {

	public static boolean stringCheck(String str) {
		char[] ch = str.toCharArray();
		boolean b = false;
		for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if (ch[i] == '{' && ch[j] == '}') {
					b = true;
				} else if (ch[i] == '[' && ch[j] == ']') {
					b = true;
				} else if (ch[i] == '(' && ch[j] == ')') {
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
