package com.test.question.q107;

public class MyHashMap {
	private String[] keys;
	private String[] values;
	private int index;

	public MyHashMap() {
		this.keys = new String[4];
		this.values = new String[4];
		this.index = -1;
	}

	public String put(String key, String value) {
		String beforeValue = "";

		for (int i = 0; i <= this.index; i++) {
			// 변경인 경우
			if (this.keys[i].equals(key)) {
				beforeValue = this.values[i];
				this.values[i] = value;

				return beforeValue;
			}
		}

		// 최초 삽입인 경우
		this.index++;
		this.keys[this.index] = key;
		this.values[this.index] = value;

		return null;
	}

	public String get(String key) {
		if (this.index == -1)
			throw new IndexOutOfBoundsException();

		for (int i = 0; i <= this.index; i++) {
			System.out.println("i: " + i);
//			System.out.println(Arrays.toString(this.keys));
//			System.out.println(Arrays.toString(this.values));
			if (this.keys[i].equals(key)) {
				return this.values[i];
			}
		}
		return "null";
	}

	public int size() {
		return this.index + 1;
	}

	public String remove(String key) {
		String value = "";
		int keyIndex = -1;

		for (int i = 0; i <= this.index; i++) {
			if (this.keys[i].equals(key)) {
				value = this.values[i];
				keyIndex = i;
				break;
			}
		}

		for (int i = keyIndex; i <= this.index; i++) {
			this.keys[i] = this.keys[i + 1];
			this.values[i] = this.values[i + 1];
		}

		return value;
	}

	public boolean containsKey(String key) {
		// 비어있을 떄
		if (this.index == -1) {
			return false;
		}

		for (int i = 0; i <= this.index; i++) {
			if (this.keys[i].equals(key)) {
				return true;
			}
		}
		return false;
	}

	public boolean containsValue(String value) {
		// 비어있을 떄
		if (this.index == -1) {
			return false;
		}

		for (int i = 0; i <= this.index; i++) {
			if (this.values[i].equals(value)) {
				return true;
			}
		}
		return false;
	}

	public void clear() {
		this.index = -1;
	}

	public void trimToSize() {
		String[] tempK = new String[this.index];
		String[] tempV = new String[this.index];

		for (int i = 0; i < this.index; i++) {
			tempK[i] = this.keys[i];
			tempV[i] = this.values[i];
		}

		this.keys = tempK;
		this.values = tempV;
	}
}
