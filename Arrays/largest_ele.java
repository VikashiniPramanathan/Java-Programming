package Arrays;

public class largest_ele {
    public static void main(String args[]){
        int max=0;
        int a[]=new int[]{10,15,99,33};
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println("Largest element is: "+max);
    }
}
