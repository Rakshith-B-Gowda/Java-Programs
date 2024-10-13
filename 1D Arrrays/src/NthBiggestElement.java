
class NthBiggestElement {
	public static void main(String[] args) {
		int[] ar = {10, 20, 30, 40, 50, 5};
		int big = nBiggest(ar , 3);
		System.out.println("nth Biggest element is "+big);
	}

	static int nBiggest(int[] x, int n) {
		for (int i = 0; i < x.length; i++) {
			int count=0;
			for (int j = 0; j < x.length; j++) {
				if (x[j] > x[i]) 
					count++;
			}
			if (count == n-1) {
				return x[i];
			}
		}
		System.out.println("No Big Elements");
		return 0;
	}
}
