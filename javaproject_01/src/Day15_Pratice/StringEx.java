package Day15_Pratice;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "show me the money";
		for (int i=0; i<str.length(); i++) {
			// 캐릭터를 문자열로
			String word = Character.toString(str.charAt(i));
			// 문자열을 소문자로
			System.out.println(word.toLowerCase());
			// 문자열을 대문자로
			System.out.println(word.toUpperCase());
		}
		
	}

}
