package Arraytest2;

public class arraydemo2 {
    public static void main(String[] args) {
        int[]arr={4,5,7,2,8,11,9};
        int max=getMax(arr);
        System.out.println("max:"+max);
    }
    public static int getMax(int[] arr){
        int max=arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

}
