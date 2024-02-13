package Arrays;

public class Snake {
    public static void main(String args[]){
        int a[][]={{10,20,30},
                {40,50,50},
                {60,70,80}};
        for(int i=1;i<a.length;i++){
            if(i%2==0){
                for(int j=0;i<a.length;i++)
                    System.out.print(a[i][j]+" ");
            }
            else{
                for (int j = a.length - 1; j >= 0; j--)
                    System.out.print(a[i][j] + " ");
            }
        }

    }
}
