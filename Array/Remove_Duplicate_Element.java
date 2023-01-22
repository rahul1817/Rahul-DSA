package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Remove_Duplicate_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size");
        int s = sc.nextInt();
        int[] a = new int[s];
        int[] b = new int[s];
        int c = 0, ct = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        a[j] = -1;
                        ct++;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                b[c] = a[i];
                c++;
            }
        }
        System.out.println(Arrays.toString(b));
        for (int i = 0; i < b.length - ct; i++) {
            System.out.print(b[i] + " ");
        }
    }

}
