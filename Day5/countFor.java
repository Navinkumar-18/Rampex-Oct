package Day5;

public class countFor {
    public static void main(String[] args) {
        int[] arr={10,20,60,70,80};
        int count=0;
        for(int i:arr){
            if(i>50){
                count=count+1;
            }
        }
        System.out.println(count);
    }
}
