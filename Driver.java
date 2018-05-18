package Assignment2;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        System.out.println("input number");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = Integer.valueOf(str);

        MyCalculator run = new MyCalculator();
        System.out.println(run.divisor_sum(n));

    }

}
