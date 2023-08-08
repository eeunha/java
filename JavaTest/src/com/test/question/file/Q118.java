package com.test.question.file;

import java.io.File;

/*
 	23.08.08
 
  	Q. 폴더 내의 모든 파일들을 찾아 크기를 비교하고, 크기가 큰 순으로 정렬하시오.

조건..
자식 폴더내의 파일도 모두 검색하시오.
부모 자식 폴더에 상관없이 파일을 한번에 비교하시오.


리소스..
폴더 > 크기 정렬
파일 다운로드


출력..
[파일명]      [크기]     [파일이 들어있는 폴더]
aaa.exe    57KB    AAA 
bbb.exe    50KB    BBB 
ccc.dat     41KB    AAA 
ddd.txt     20KB    CCC 
..

 
 */
public class Q118 {
	public static void main(String[] args) {
		File dir = new File("C:\\class\\code\\java\\파일_디렉토리_문제\\크기 정렬");

		search(dir);
	}

	private static void search(File dir) {
		File[] list = dir.listFiles();

		for (File f : list) {
			
		}

	}
}
