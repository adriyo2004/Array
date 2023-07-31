import java.util.Scanner;
public class EvenElements {
    public static void main(String[] args) {
        int length;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Length of array : ");
        length=sc.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the array : ");
        for(int n=0;n<length;n++){
            arr[n]=sc.nextInt();
        }
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
            }
        }
    }
}