package com.test.java.obj.inheritance;

import java.util.Arrays;

public class Bob {
	public static void main(String[] args) {
		String[] menu = { "찌개", "국밥", "국수", "돈까스", "분식", "일식", "중식", "햄버거", "제육", "삼겹살", "볶음밥" };
		int idx = (int) (Math.random() * menu.length);

		System.out.println("오늘 뭐 먹지? > " + menu[idx]);

		System.out.println("----------------");

//		int n = 12;
//		System.out.println(solution(n));

//		int x = 2;
//		int n = 5;
//		System.out.println(Arrays.toString(solution(x, n)));

//		int n = 10;
//		System.out.println(solution(n));

//		int n = 123;
//		System.out.println(solution(n));

//		int[] arr = { 1, 2, 3, 4 };
//		System.out.println(solution(arr));

//		int num = 3;
//		System.out.println(solution(num));

//		long n = 12345L;
//		System.out.println(Arrays.toString(solution(n)));

//		String s = "pPoooyY";
//		System.out.println(solution(s));
//		
//		String s = "1234";
//		System.out.println(solution(s));
		
		long n = 121L;
		System.out.println(solution(n));
	}
	
	public static long solution(long n) {
        long answer = 0;
        
        
        
        return answer;
    }

	public static int solution(String s) {
		int answer = Integer.parseInt(s);
		
		
		return answer;
	}

//	static boolean solution(String s) {
//		int countP = 0;
//		int countY = 0;
//
//		for (int i = 0; i < s.length(); i++) {
//			char c = s.charAt(i);
//			if (c == 'p' || c == 'P') {
//				countP++;
//			}
//
//			if (c == 'y' || c == 'Y') {
//				countY++;
//			}
//		}
//
//		return (countP == countY) ? true : false;
//	}

//	public static int[] solution(long n) {
//		String num = n + "";
//		int[] answer = new int[num.length()];
//
//		for (int i = 0; i < num.length(); i++) {
//			answer[i] = Integer.parseInt(num.substring(num.length() - 1 - i, num.length() - i));
////			answer[i] = num.charAt(num.length() - 1 - i) - '0';
//		}
//
//		return answer;
//	}

	public static String solution(int num) {
		return (num % 2 == 0) ? "Even" : "Odd";
	}

	public static double solution(int[] arr) {
		double answer = 0;

		for (int n : arr) {
			answer += n;
		}

		return answer / arr.length;
	}

//	public static int solution(int n) {
//		int answer = 0;
//
//		while (n > 0) {
//			answer += n % 10;
//			n /= 10;
//		}
//
//		return answer;
//	}

//	public static int solution(int n) {
//		int answer = 0;
//		for (int i = 1; i < n; i++) {
//			if (n % i == 1) return answer = i;
//		}
//		return n - 1;
//	}

	public static long[] solution(int x, int n) {
		long[] answer = new long[n];

		long sum = 0;

		for (int i = 0; i < n; i++) {
			sum += x;
			answer[i] = sum;
		}

		return answer;
	}

//	public static int solution(int n) {
//		int answer = 0;
//
////		for (int i = 1; i <= n; i++) {
////			if (n % i == 0)
////				answer += i;
////		}
////		return answer;
//
//		for (int i = 1; i <= n / 2; i++) {
//			if (n % i == 0) {
//				answer += i;
//			}
//		}
//
//		return answer + n;
//	}
}
