
public class Test {

	public static void main(String[] args) {
		String str="abcabcdabc";
		String sub="abc";
		int count = 0;
		int pos = 0;
		int idx;
		while ((idx = str.indexOf(sub, pos)) != -1) {
			++count;
			pos = idx + sub.length();
		}
		System.out.println(count);
	}
}
