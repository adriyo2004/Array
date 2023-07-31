import java.util.Scanner;

class ArrayQ5{
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
        System.out.println("The elements of middle row and the elements of middle column are : ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==(m-1)/2 || j==(n-1)/2){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}