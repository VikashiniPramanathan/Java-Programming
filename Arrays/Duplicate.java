package Arrays;

public class Duplicate {
    public static void main(String args[]){
        int a[]={-1,-1,5,3};
        int count=0;
        for(int i=0;i<a.length;i++){
            int flag=0;
            for(int j=0;j<a.length;j++){
                if(i==j){
                    continue;
                }
                if(a[i]==a[j]){
                    flag=1;
                    continue;
                }
            }
            if(flag==0){
                count++;
                System.out.print(a[i]+" ");


            }
        }
        System.out.println();
        System.out.println("The count is: "+ count);
    }
}
