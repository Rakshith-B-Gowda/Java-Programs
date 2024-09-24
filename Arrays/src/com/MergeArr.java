package com;

class MergeArr {
	public static void main(String[] args) {
		int[] ar = new int[] {10,20,30,40,50};
		int[] br = {15,25,35};
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < br.length; i++) {
			System.out.print(br[i]+" ");
		}
		System.out.println();
		int[] cr = merge(ar,br);
		for (int i = 0; i < cr.length; i++) {
			System.out.print(cr[i]+" ");
		}
	}

	static int[] merge(int[] a, int[] b) {
		int[] c = new int[a.length+b.length];
		int i=0, j=0, k=0;
		
		while (i<a.length && j<b.length) {
			c[k++] = a[i++];
			c[k++] = b[j++];
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
