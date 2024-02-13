package Normal_Problems;
public class Prime {
    public static void main(String[] args){
        int n=5;
        int total=0;
        for(int i=2;i<=n;i++){
            int count=0;

            for(int j=1;j<=n;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                total++;
                System.out.print(i+" ");

            }
        }
        System.out.println();
        System.out.println(total);
    }
}
