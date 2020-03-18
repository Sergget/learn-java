import java.util.Arrays;

public class bubbleSort{
    public static void main(String[] args) {
        int temp=0;
        int[] nums={28, 12, 89, 73, 65, 18, 96, 50, 8, 36};
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}