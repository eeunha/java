package com.test.java.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

//23.08.08
public class Ex67_sort {
	public static void main(String[] args) {

		// Ex67_sort.java

		// 배열 or 컬렉션
		// - 오름차순 정렬, 내림차순 정렬
		// 1. 직접 알고리즘 구현
		// 2. JDK 제공 기능

		// 2 + 1 > JDK 제공 + 커스터마이징 + 익명 클래스 사용(선택)

		// int[] nums 와 거의 같음
		Integer[] nums = { 1, 5, 2, 4, 3 }; // value type 말고 class type

		System.out.println(Arrays.toString(nums));

		// 오름차순 정렬
		Arrays.sort(nums); // Quick Sort
		System.out.println(Arrays.toString(nums));

		// 내림차순 정렬 > 지원 안함 > 직접 구현
//		Arrays.sort(배열, Comparator);

	}// main
}

class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		
		// 
		
		return 0;
	}

}