package Arrays;

public class sorting {
    public static void main(String args[]) {
        int a[] = new int[]{2,1,4,3};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];  //ascending order
                    a[i] = a[j];
                    a[j] = temp;
                }
                /*if (a[i] < a[j]) {
                    int temp = a[j];  //descending order
                    a[j] = a[i];
                    a[i] = temp;
                }*/
            }
            System.out.print(a[i]+" ");
        }

        //getting input from user for sorting array in asc order
   /* public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){               //descending order
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(""+a[i]);
        }
    }*/
    }
}
