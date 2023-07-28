package com.test.question;

import java.util.Scanner;

/*
	2023.07.28
	
	Q. 주민등록번호 유효성 검사를 하시오.
	
	조건 
		- '-'의 입력 유무 상관 없이 검사하시오.
		
	입력
		주민등록번호: 951220-1021547
	출력
		올바른 주민등록번호입니다.
		
	입력
		주민등록번호: 951220-1234567
	출력
		올바르지 않은 주민등록번호입니다.
		
	불일치한 경우가 발생한 경우, 바로 불일치 문자열 출력 후 종료
*/
public class Q085 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("주민등록번호: ");
		String jumin = scan.nextLine();

		// '-' 없애고 시작. -> replace("-", "")
		System.out.println(jumin.replace("-", ""));

		// 월 숫자 검사 (2, 3번째)
		int month = Integer.parseInt(jumin.substring(2, 4));
		if (month < 1 || month > 12) { // 불일치
			// 바로 종료
			System.out.println("올바르지 않은 주민등록번호입니다.");
			return;
		}

		// 일 숫자 검사 (우선 31일로 고정. 추후에 정확히 파악하기.) (4, 5번째)
		int date = Integer.parseInt(jumin.substring(4, 6));
		if (date < 1 || date > 31) { // 불일치
			// 바로 종료
			System.out.println("올바르지 않은 주민등록번호입니다.");
			return;
		}

		// 랜덤 (7,8,9,10) -> x
		// 출생신고 순서 (11) -> x

		// 공식의 답
		// 0~11까지 숫자를 모두 돌면서 곱하고 더한다. (공식)

		// 최종 답과 불일치
		// 바로 종료

		// 최종 공식의 답도 일치한 경우 정답 출력

		scan.close();
	}
}
