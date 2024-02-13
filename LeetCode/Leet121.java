package LeetCode;

public class Leet121 {
    public static void main(String[] args){
        int[] prices={7,1,5,3,6,4};
        int max=0;
        int min=Integer.MIN_VALUE;
        System.out.println(min);
        int res=0;
        int res2=0;
        for(int i=0;i<prices.length;i++){

            for(int j=i+1;j<prices.length;j++){

                if(prices[i]>prices[j]){
                 //   System.out.println("0");
                    break;
                }
                if(prices[i]<prices[j]){
                    if(max<prices[j]){
                        max=prices[j];
                    }
                    if(min>prices[j]) {
                        min = prices[j];
                        break;
                    }
                }
            }

        }
        res=max-min;

        System.out.println("res ans : "+res);

    }
}
