package Arrays;

public class Sort0and1 {
    public static void main(String args[]){
        int a[]={0,1,1,0,1,0,1};
        int temp=0;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.print(a[i]+" ");
        }
    }
}
