package Arrays;

public class F_S_TLargest {
    public static void main(String args[]){
        int a[]={1,36,57,3};
        int f=0;
        int s=0;
        int t=0;
        for(int i=0;i<a.length;i++){
            if(f<a[i]){
                t=s;
                s=f;
                f=a[i];

            }
            else if(s<a[i]){
                t=s;
                s=a[i];

            }
            else if(t<a[i]){
                t=a[i];

            }

        }
        System.out.println("1st largest: "+f);
        System.out.println("2nd largest: "+s);
        System.out.println("3rd largest: "+t);
    }
}
