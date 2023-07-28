package com.test.question;

/*

2023.07.27

Q. 아래와 같이 출력하시오.

2	7	6
9	5	1
4	3	8

마방진

규칙
가로, 세로, 대각선 각각의 합이 모두 같다.

1. 숫자 1 - 아무데나 1 적기 (예시 - 1,2)
2. 방향 정하기 - 2, 5, 7, 11시 방향 중 택 1 (예시 - 2시)
3. 배열이 배열 주변으로 똑같은게 반복된다고 생각하자.
계속 해당 시 방향으로 숫자 넣기
이미 있으면 자기자리(기준점)에서 왼쪽에 넣기

*/
public class Q079 {
	public static void main(String[] args) {
		int[][] nums = new int[3][3];

		int value = 1;
		int maxValue = 9;

		while (value <= maxValue) {
			
		}

		printArr(nums);
	}

	private static void printArr(int[][] nums) {
		// 출력 > 수정없이 그대로 사용
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
	}
}
