package Arrays;

public class Remove3L {
    public static void main(String args[]) {
        int a[] = {3,5,1,7,6,2};
        int f = 0,s=0,t=0;
        for (int i = 0; i < a.length; i++) {
            if (f < a[i]) {
                t = s;
                s = f;
                f = a[i];
            }
            else if (s < a[i]) {
                t = s;
                s = a[i];
            }
            else if (t < a[i]) {
                t = a[i];
            }
        }
        System.out.println("3rd largest: "+t);
        for(int i=0;i<a.length;i++){
            if(a[i]==t){
                continue;
            }
            System.out.print(a[i]+" ");
        }
    }
}
