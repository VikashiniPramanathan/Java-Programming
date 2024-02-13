package Normal_Problems;

public class coins {
    public static int coin(int n) {
        int a=0;
        for(int i=0;i<n;i++){
//            System.out.println("value of i: "+i);
            for(int j=0;j<i+1;j++){
//                System.out.println("value of j: "+j);
                n--;
//                System.out.println("value of n: "+n);
            }
            a++;
//            System.out.println("value of a: "+a);
        }
        return a;
    }
    public static void main(String args[]){
        int n=8;
        int count=coin(n);
        System.out.println(count);
    }
}
