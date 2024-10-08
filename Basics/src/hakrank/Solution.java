package hakrank;

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        for(int i=1; i<=(s.length()-k); i++ ){
            String str = s.substring(i,i+k);
            if (str.compareTo(largest) > 0) {
                largest = s.substring(i,i+k);
            }
            
            if (str.compareTo(smallest) < 0) {
                smallest = s.substring(i,i+k);
            }
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
