package Arraytest1;

public class arraydemo1 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 1, 0};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println("max:"+max);
    }
}
