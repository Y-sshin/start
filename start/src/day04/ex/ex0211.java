package day04.ex;

import java.util.*;
public class ex0211 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자입력 :");
		String str = sc.nextLine();
		for(int i = 0 ; i<str.length() ; i++) {
			char ch = (char) str.charAt(i);
			if(ch<'A') {
				System.out.print(ch);
			}else if(ch<'a'){
				if(ch>'Z') {
					System.out.print(ch);		
				}else {
					System.out.print((char)(ch + ('a'-'A')));							
				}
			}else if(ch<='z') {
				System.out.print((char)(ch - ('a'-'A')));							
			}else {
				System.out.print(ch);		
			}
		}
	}
}