package com;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUnion {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter 2 array size: ");
    	int a1 = sc.nextInt(), a2 = sc.nextInt();
        int[] array1 = new int[a1];
        System.out.println("Enter "+a1+" elements: ");
		for (int i = 0; i < array1.length; i++) {
			array1[i] = sc.nextInt();
		}
        int[] array2 = new int[a2];
        System.out.println("Enter "+a2+" elements: ");
        for (int i = 0; i < array2.length; i++) {
			array2[i] = sc.nextInt();
		}
        sc.close();
        int[] unionArray = getUnion(array1, array2);

        System.out.println("Union of two arrays: " + Arrays.toString(unionArray));
    }

    public static int[] getUnion(int[] array1, int[] array2) {
        int[] tempUnion = new int[array1.length + array2.length];
        int index = 0;

        for (int i = 0; i < array1.length; i++) {
            tempUnion[index++] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            tempUnion[index++] = array2[i];
        }

        int[] result = new int[tempUnion.length];
        int resultIndex = 0;

        for (int i = 0; i < tempUnion.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < resultIndex; j++) {
                if (tempUnion[i] == result[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                result[resultIndex++] = tempUnion[i];
            }
        }

        return Arrays.copyOf(result, resultIndex);
    }
}
