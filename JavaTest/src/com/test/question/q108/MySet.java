package com.test.question.q108;

public class MySet {
	private String[] set;
	private int index;

	public MySet() {
		this.set = new String[4];
		this.index = -1;
	}

	public boolean add(String value) {
		// 중복여부 파악하기
		for (int i = 0; i <= this.index; i++) {
			if (this.set[i].equals(value)) {
				// 중복
				return false;
			}
		}

		this.index++;

		// 중복이 아닐 때
		this.set[this.index] = value;

		return true;
	}

	public int size() {
		return this.index + 1;
	}

	public boolean remove(String value) {
		// 해당 값이 있나 검색

		for (int i = 0; i <= this.index; i++) {
			if (this.set[i].equals(value)) {
				// 중복
				return true;
			}
		}

		return false;
	}

	public void clear() {
		this.index = -1;
	}

	public boolean hasNext() {

	}

	public String next() {

	}
}
