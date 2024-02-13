package Arrays;

public class Targetpair {
  public static void main(String args[]){
        int a[]={1,3,6,2,5,4,3,2,4};
                int sum=7,count=0;

                for(int i=0;i<(a.length)-1;i++){
                    for(int j=i+1;j<a.length;j++){

                        if(a[i]+a[j]==sum){
                            System.out.print("("+a[i]+","+a[j]+")");
                            count++;
                        }
                    }
                }
      System.out.println();
                System.out.println(count);
            }



}

