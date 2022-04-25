package Arraytest3;

public class arraydemo3{
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9};
        System.out.println("逆序前");
        printArray(arr);
        System.out.println("逆序后");
        reserve(arr);
        printArray(arr);
    }
    public static void reserve(int[]arr){
        for(int first=0,end= arr.length-1;first<=end;first++,end--){
         int temp=arr[first];
         arr[first]=arr[end];
         arr[end]=temp;
        }
    }
    public  static void printArray(int[]arr){
        System.out.print("[");
        for(int x=0;x<=arr.length-1;x++){
            if(x== arr.length-1){
                System.out.println(arr[x]+"]");
            }else{
                System.out.print(arr[x]+",");
            }
        }
    }


}
