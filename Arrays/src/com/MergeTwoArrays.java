package com;

// Given two sorted arrays merge the two arrays into a new sorted array

class MergeTwoArrays {
	public static void main(String[] args) {
		int[] ar = {10, 20 ,30 ,40 ,50};
		int[] br = {15, 16 ,25 ,45 ,55};
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < br.length; i++) {
			System.out.print(br[i]+" ");
		}
		System.out.println();
		
		int[] cr = mergeArrSort(ar,br);
		
		for (int i = 0; i < cr.length; i++) {
			System.out.print(cr[i]+" ");
		}
	}

	 static int[] mergeArrSort(int[] a, int[] b) {
		 int[] c = new int[a.length + b.length];
		 int i=0,j=0,k=0;
		 
		 while (i<a.length && j<b.length) {
			if (a[i]<b[j]) {
				c[k++] = a[i++];
			}
			else {
				c[k++] = b[j++];
			}
		}
		 
		 while (i<a.length) {
			c[k++] = a[i++];
		}
		 
		 while (j<b.length) {
				c[k++] = b[j++];
			}
		 
		 return c;
	}
}
