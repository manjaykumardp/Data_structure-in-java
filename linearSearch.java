package DataStructure.java.com;

import java.util.Scanner;

public class LinearSearch
{
      static void   search(int k, int []arr1) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == k) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1= new int[n];
        int i;
        int key =6;
        for( i=0;i< arr1.length;i++) {

           arr1[i] = sc.nextInt();

        }
        search(key, arr1);
    }
}
