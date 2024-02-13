package Arrays;

public class Multiplication {
    public static void main(String args[]){
        int a[]={-1,1,0,-3,3};
     //   int a[]={10, 3, 5, 6, 2};
        int n=a.length;
        int b[]=new int[n];

/*        for(int i=0;i<a.length;i++){
            multi=multi*a[i];
        }
        for(int i=0;i<n;i++){
            b[i]=multi/a[i];
            System.out.print(b[i]+" ");
        }

 */
        for(int i=0;i<n;i++){
            int multi=1;
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                else{
                    b[i]=multi*a[j];
                    multi=b[i];

                }
            }
            System.out.print(b[i]+" ");
        }
    }
}
