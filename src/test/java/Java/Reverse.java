package Java;

public class Reverse {
    public static void main(String[] args) {
        String word = "This is my testing classroom";

        String a[]=word.split(" ");

      //  System.out.println(" ");
        for (int i=a.length-1;i>=0;i--){

            System.out.print(a[i]+ "  ");

        }
    }
}
