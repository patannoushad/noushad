package Java;

public class demo {
    public static void main(String[] args) {
        test1();
        test1(3);
        test1(3,4);
    }
    public static void test1() {
        System.out.println("value of test1----");
    }
    public static void test1(int a) {
        System.out.println("values of test 2  ---" + a);
    }
    public static void test1(int a,int b) {
        System.out.println("values of test 3  ---" + a + b);
    }
}