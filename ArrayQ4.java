import java.util.Scanner;

class ArrayQ4{
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
        int max=arr[0][0];
        for(int[] row : arr){
            for(int element : row){
                if(element>max){
                    max=element;
                }
            }
        }
        System.out.println("The largest element in the matrix is : "+max);
    }
}