package HackerRank_Questions;

import java.util.*;

public class JavaLoopII {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        int counter = scanner.nextInt();
        int[] a = new int[counter];
        int[] b = new int[counter];
        int[] n = new int[counter];

        for (int i = 0; i<counter; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
            n[i] = scanner.nextInt();
        }

        for (int i = 0; i<counter; i++) {
            int sum = a[i];
            int power = 1;
            for (int j=0; j<n[i]; j++) {
                sum = sum + b[i]*power;
                power = power*2;
                System.out.print(sum + " ");
            }
            System.out.println();
        }


    }
}