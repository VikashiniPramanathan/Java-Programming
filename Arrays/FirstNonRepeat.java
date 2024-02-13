package Arrays;

public class FirstNonRepeat {
    public static  void main(String args[]){
        int a[]={9, 4, 9, 6, 7, 4};
        int j=0;
        for(int i=0;i<a.length;i++){
            int count=0;
            for( j=0;j<a.length;j++){
                if( a[i]==a[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.print(a[i]);
                break;
            }
        }
    }
}
