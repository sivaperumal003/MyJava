package number;

public class Substr {

	public static void main(String[] args) {
		String str = "surerar";
		int len = str.length();

		for (int i = 0; i < len; i++) {
		    for (int j = i + 2; j <= len; j++) {
		        System.out.println(str.substring(i, j));
		    }
		}

	}

}
