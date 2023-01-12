package Java;

import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("enter value of a :");
        num=in.nextInt();

        if (num%2==0){
            System.out.println(" numb is even : " +num);
        }else {
            System.out.println(" num is odd : " + num );
        }
    }
}
