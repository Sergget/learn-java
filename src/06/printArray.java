import java.util.Arrays;

public class printArray{
    public static void main(String[] args) {
        int[] arr={1,3,4,6,9,12};
        //method 1
        System.out.println("For loop:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        //method 2
        System.out.println("forEach Loop:");
        for(int i:arr){
            System.out.println(i);
        }

        //method 3
        System.out.println("toString() method:");
        System.out.println(Arrays.toString(arr));
    }
}