public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {1,4,7,6,9,8,10};
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.println("The first peak element in the array is " + arr[i]);
                break;
            }
        }
    }
}