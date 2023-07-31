public class MaxNumberInArray {
    public static void main(String[] args) {
        int[] arr = {34,21,54,65,43};
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("The maximum element in the array is " + max);
    }
}