import java.util.Scanner;
class ArrayQ1 {
    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        m = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        n = sc.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("Enter the matrix : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int countPos = 0;
        int countNeg = 0;
        int countEven = 0;
        int countOdd = 0;
        int countZero = 0;
        for (int[] row : arr) {
            for (int element : row) {
                if (element > 0) {
                    countPos++;
                } else if(element != 0){
                    countNeg++;
                }
                if (element % 2 == 0) {
                    countEven++;
                } else {
                    countOdd++;
                }
                if(element==0){
                    countZero++;
                }
            }
        }
        System.out.println("number of positive numbers = "+countPos);
        System.out.println("number of negative numbers = "+countNeg);
        System.out.println("number of even numbers = "+countEven);
        System.out.println("number of Odd numbers = "+countOdd);
        System.out.println("number of Zeros = "+countZero);
    }
}
