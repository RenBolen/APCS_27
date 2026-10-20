/*
 *	Author: Ren Bolen
 *  Date: Occtober 17, 2026
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String answer1 = Cipher.encode("6v lvp u5vuy5 y1z5 qpsqy5r"); 
		System.out.println(answer1);
		System.out.println();
		String answer2 = Cipher.encode("sv8vq17r 1r q25 85rq");
		System.out.println(answer2);
		System.out.println();
		String answer3 = Cipher.encode("q25 z5l qv wpx85s f 1r gg");
		System.out.println(answer3);
		System.out.println();
		String answer4 = Cipher.keyedEncode("z8r8v 6yzzc 64r8 oys sx z8r8v 6y4z6 ty 18t oys 9yqz", 33);
		System.out.println(answer4);
		System.out.println();
		String answer5 = Cipher.encode("29y4 v4 v2q9w1r 05sr5l wpx85s 1r z5l qv d");
		System.out.println(answer5);
		System.out.println();
		String answer6 = Cipher.keyedEncode("a8 1oy 92 1kx rxdj in 4", 6);
		System.out.println(answer6);
		System.out.println();
		String answer7 = Cipher.keyedEncode("549q94u8 q3t sxys0u3 q7u 2e vqb47y9u bq7yqr1u 3q2u8", 13);
		System.out.println(answer7);
		System.out.println();
		String answer8 = Cipher.encode("lvpo5 rp775rr4pyyl 7vxuy5q56 q25 41srq r57q1vw");
		System.out.println(answer8);
		System.out.println();
		String answer9 = Cipher.keyedEncode("u4y i1e i5 i6ita5c 314c1i66e1 i5f by6i5 hea5c zbi58 u4y", 27);
		System.out.println(answer9);
		System.out.println();
		String answer10 = Cipher.keyedEncode("amlb mfhp7fcj jlgq fo tap s9a bjlslql aflipa lb hlg9b 210z t9ct", 16);
		System.out.println(answer10);
		System.out.println();
		System.out.println("Type a sentence to be encoded.");
		String encodedMessage = sc.nextLine();
		String answer11 = Cipher.encode(encodedMessage);
		System.out.println("Encoded sentence: " + answer11);
		System.out.println();
		String answer12 = Cipher.keyedEncode("I finished all my homework for the weekend", 23);
		System.out.println("Message: " + answer12);

	}
	
}
