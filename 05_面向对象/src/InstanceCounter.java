public class InstanceCounter{
    public static int numInstances=0;
    public static int getCount(){
        return numInstances;
    }
    public static void addInstance(){
        numInstances++;
    }
    InstanceCounter(){
        InstanceCounter.addInstance();
    }
    public static void main(String[] args) {
        System.out.println("Starting with "+InstanceCounter.getCount()+" Instances");
        for (int i=0;i<500;i++){
            new InstanceCounter();
        }
        System.out.println("end with "+InstanceCounter.getCount()+" Instances");
    }
}