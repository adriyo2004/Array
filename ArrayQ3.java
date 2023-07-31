import java.util.Scanner;

class ArrayQ3 {
    public static void main(String[] args) {
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns : ");
        m = sc.nextInt();
        int arr[][] = new int[m][m];
        System.out.println("Enter the matrix : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The elements of the two diagonals are : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
               if(i==j || i==m-j-1 ) {
                   System.out.print(arr[i][j] + " ");
               }
            }
        }
    }
}