package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class multipleArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        // initialization
        for (int i = 0; i < 3; i++) {
            lists.add(new ArrayList<>());
        }
        // add element
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                lists.get(i).add(sc.nextInt());
            }
        }
        System.out.println(lists);
    }
}
