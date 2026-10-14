package Day5;

public class replaceNegative {
    public static void main(String[] args) {
        int[] a={-1,2,3,-6};
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                a[i]=0;
                System.out.print(a[i]+" ");
            }else{
                System.out.print(a[i]+" ");
            }
        }
    }
}
//cannot use enhanced for loop ,because we have to use  the array's index for replacing an element 