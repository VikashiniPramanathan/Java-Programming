package Arrays;

public class Palindrome {
    public static void main(String args[]){
        int a[]={2,3,4,3,2};
        int n=a.length;
        int temp=n;
        int b[]=new int[n];

        for(int i=0;i<b.length;i++){
            b[i]=a[n-1];
            n--;
            System.out.print(b[i]+" ");
        }
        for(int i=0;i<temp;i++){
            if(a[i]!=b[i]){
                System.out.println("false");
            }
        }
        System.out.println("true");

    }

}
