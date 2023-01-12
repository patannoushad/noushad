package Java;

public class arrays {
    public static void main(String[] args) {
        int [][] a = {{9,7,5},{1,3,4}};
        for (int row=0;row<a.length;row++) {
            for (int col = 0; col < a[0].length; col++) {
                System.out.println("value of "+row+ "  " +col+"  --"+a[row][col]);
            }
        }
    }
}
