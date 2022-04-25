package Arraytest4;

public class arraytest4 {
    public static void main(String[] args) {
        int[] arr = {250, 2500, 3600, 123, 45};
        int index = getIndex(arr, 250);
        System.out.println("250在数组中第一次出现的索引是：" + index);

    }
    public static int getIndex(int[]arr,int value){
        for (int i=0;i< arr.length-1;i++){
            if(arr[i]==value){
                return i;

            }
        }
        return -1;

    }






}

