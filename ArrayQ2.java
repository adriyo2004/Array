import java.util.Scanner;

class ArrayQ2{
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
        System.out.println("The elements above the secondary diagonal are : ");
        for(int i=0;i<m;i++){
            for(int j=0;j<m-1-i;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}