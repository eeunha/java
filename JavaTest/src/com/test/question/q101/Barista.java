package com.test.question.q101;

public class Barista {
	Espresso makeEspresso(int bean) {
		Espresso e = new Espresso(bean);
		return e;
	}

	Espresso[] makeEspressoes(int bean, int count) {
		Espresso[] eArr = new Espresso[count];
		return eArr;
	}

	Latte makeLatte(int bean, int milk) {
		Latte l = new Latte(bean, milk);
		return l;
	}

	Latte[] makeLattes(int bean, int milk, int count) {
		Latte[] lArr = new Latte[count];
		return lArr;
	}

	Americano makeAmericano(int bean, int water, int ice) {
		Americano a = new Americano(bean, water, ice);
		return a;
	}

	Americano[] makeAmericanos(int bean, int water, int ice, int count) {
		Americano[] aArr = new Americano[count];
		return aArr;
	}

	void result() {
		// 판매 결과 출력
		System.out.println("\n=================================");
		System.out.println("판매 결과");
		System.out.println("=================================");
		System.out.println("\n---------------------------------");
		System.out.println("음료 판매량");
		System.out.println("---------------------------------");
		System.out.println("에스프레소: ");
		System.out.println("아메리카노: ");
		System.out.println("라테: ");

		System.out.println("\n---------------------------------");
		System.out.println("원자재 소비량");
		System.out.println("---------------------------------");

		System.out.println("\n---------------------------------");
		System.out.println("매출액");
		System.out.println("---------------------------------");

	}
}
