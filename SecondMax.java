public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {34,21,54,65,43};
        int max = arr[0];
        int smax = arr[0];
        for (int i : arr) {
            if (i > max) {
                smax = max;
                max = i;
            } else if (i > smax && i!= max) {
                smax = i;
            }
        }
        System.out.println("The second largest element in the array is " + smax);
    }
}