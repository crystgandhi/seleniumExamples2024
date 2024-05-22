package com.seleniumExamples2024;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

public class Practice {
	int[] arr = { 45, 91, 86, 12, 29 };

	public static void main(String[] args) {
		Practice practice=new Practice();
		practice.ascendingOrder();
		System.out.println();
		practice.descendingOrder();
		System.out.println();
		practice.ascendingOrder2();
		System.out.println();
		practice.descendingOrder2();
		System.out.println();
		
	}
	//Ascending order
	public void ascendingOrder() {
		//In an array of length n, sorting n−1 elements guarantees the entire array is sorted.
				for (int i = 0; i < arr.length - 1; i++) {
					for (int k = 0; k < arr.length - 1; k++) {
						if (arr[k] > arr[k + 1]) {
							int temp = arr[k];
							arr[k] = arr[k + 1];
							arr[k + 1] = temp;
						}
					}
				}
				for (int k = 0; k < arr.length; k++) {
					System.out.println(arr[k]);
				}
	}
	public void descendingOrder() {
		//In an array of length n, sorting n−1 elements guarantees the entire array is sorted.
				for (int i = 0; i < arr.length - 1; i++) {
					for (int k = 0; k < arr.length - 1; k++) {
						if (arr[k] < arr[k + 1]) {
							int temp = arr[k];
							arr[k] = arr[k + 1];
							arr[k + 1] = temp;
						}
					}
				}
				for (int k = 0; k < arr.length; k++) {
					System.out.println(arr[k]);
				}
	}
	public void ascendingOrder2() {
		Arrays.sort(arr);
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}
}
	public void descendingOrder2() {
		Arrays.sort(arr);
		for (int k = arr.length-1; k>=0 ; k--) {
			System.out.println(arr[k]);
		}
}

	
}
