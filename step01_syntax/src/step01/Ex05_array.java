package step01;

import java.util.Arrays;

public class Ex05_array {

	public static void main(String[] args) {
		//배열 : *** 반드시 표기값을 갖는다
		
		int[] arr1 = new int[5];
		
		int[] arr2 = {1, 2, 3, 4, 5};

		String[] idol = {"레드벨벳", "뉴진스", "아이브"};

		//데이터 접근
		//arr2[4] //arr 중 5의 값
		
		//System.out.println(arr2[4]);
		//*주의
		//System.out.println(arr2[5]); //예외
		
		// ? 모든 데이터 출력?
		//System.out.println(arr2); //[I@15db9742 :주소
		
//		for (int i=0; i < arr2.length; i++ ) {
//			System.out.println(arr[i]);
//		}
//		
		//향상된 for문
		/*
		  for( : 집합객체명) {
		  수행코드;
		  }
		 */
		
		for(int v : arr2) {
			System.out.println(v);
		}
		
		//얕은 복사
		int[] nums = {1, 2, 3};
		int[] copynums = nums;
		
		copynums[1] = 20;
		System.out.println(copynums[1]);
		System.out.println(nums[1]);
		
		//완벽한 분리를 위해서는 깊은 복사가 필요함. (p. 83)
		//Arrays.copyOf
		
		System.out.println(Arrays.copyOf(nums, nums.length)); //배열의 주소가 나옴
		int[] deepnums = Arrays.copyOf(nums, nums.length);
		
		
	}

}
