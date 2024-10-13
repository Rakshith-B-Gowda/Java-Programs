
class FreqOfEle {
	public static void main(String[] args) {
		int[] ar = {1,1,2,2,2,3,4,5,5,6,6,7};
		printFreq(ar);
	}

	static void printFreq(int[] x) {
		int big =  x[0];
		for (int i = 1; i < x.length; i++) {
			if (big < x[i]) {
				big = x[i];
			}
		}
		
		int[] count = new int[big+1];
		
		for (int i = 0; i < x.length; i++) {
			count[x[i]]++;
		}
		
		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0) {
				System.out.println(i+" present "+ count[i]);
			}
		}
	}
}
