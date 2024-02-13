package Normal_Problems;

public class primeFrom1ton {
    public static void main(String args[]){
        int n=100;
        int flag;
        for(int i=2;i<=100;i++){
            flag=1;
            for(int j=2;j<i/2;j++){  
                if(i%j==0){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                System.out.print("\t"+i);
            }
        }

    }
}
