package Task5;

public class MyFunnyTools {
	
	interface StrFunc {
		 String myConcatenation(String a, String b);
	}
	
	
	
	static String createMyConcatenation(StrFunc strFunc, String a, String b) {
		return strFunc.myConcatenation(a, b);
	}
	
	public static void main(String[] args) {
		String res = createMyConcatenation(String::concat, "Hi", " Hello");
	}
}
