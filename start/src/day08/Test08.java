package day08;
/*
	"black pink" 라는 문자열을 기억하는 변수 str을 만들고 그 중에서
	 	1. black 만 추출해서 출력
	 	2. pink 만 추출해서 출력
 */
public class Test08 {
	public static void main(String[] args) {
		String str = "black pink";//문자열 변수
		//String word1;//잘라낸 단어 변수1
		//String word2;//잘라낸 단어 변수2
		String word1, word2;
		int idx1 = str.indexOf(' ');//문자열중 특정 문자의 위치값 알려주는 함수
		//word1 = str.substring(0,' ');//black추출
		word1 = str.substring(0, idx1);//black추출
		word2 = str.substring(idx1+1);//pink추출
		System.out.println(word1);//출력
		System.out.println(word2);//출력
		
		
	}

}


