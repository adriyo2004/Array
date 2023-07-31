import java.util.*;
class sumOfAllEvenIndex{
    public static void main(String[] args) {
        int length;
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Length of array : ");
        length=sc.nextInt();
        int array[]=new int[length];
        int sum=0;
        System.out.println("Enter The array : ");
        for (int n=0;n<length;n++){
            array[n] = sc.nextInt();
            if(n%2==0){
                sum+=array[n];
            }
        }
        System.out.println("The sum of the elements of even index : "+sum);
    }
}
