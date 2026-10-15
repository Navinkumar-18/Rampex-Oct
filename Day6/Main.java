package Day6;

public class Main {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int k=1;  int n=a.length;
        k=k%n;
        for(int i=n-1;i>=n-k;i--){
            for(int j=0;j<n-k;j++){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }

        }
        for(int e:a){
            System.out.print(e+" ");
        }
    }
}
