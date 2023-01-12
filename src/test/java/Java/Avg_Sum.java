package Java;

import org.testng.annotations.*;

import java.util.Scanner;

public class Avg_Sum {

        float a=1, b=3 , c=6 ,avg;
        int sum;
        Scanner in;
        @BeforeTest

        void scanner() {
            in = new Scanner(System.in);
        }
        @Test
        void a() {
            System.out.println("enter value of a : ");
            a = in.nextInt();
        }
        @Test
        void b() {
            System.out.println("enter value of b : ");
            b = in.nextInt();
        }
        @Test
        void c() {
            System.out.println("enter value of c : ");
            c = in.nextInt();
        }
        @AfterMethod
        void sum() {
                System.out.println("sum of the a,b,c is  " + (a + b + c));
        }
        @AfterMethod
        void avg() {
                System.out.println("avg of the a,b,c is  " + ((a + b + c) / 3));
            }
    }

