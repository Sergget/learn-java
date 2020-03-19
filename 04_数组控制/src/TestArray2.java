public class TestArray2 {
    public static void main(String[] args) {
        int[] newArray;
        double[] newArray2={1,2,3,4,5,6,7};

        for (double d : newArray2) {
            System.out.println(d);
        }

        for(int i=0;i<7;i++){
            System.out.printf("Index %d of newArray2 is %.2f \n",i,newArray2[i]);
        }
    }
}