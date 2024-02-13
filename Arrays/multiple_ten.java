package Arrays;

public class multiple_ten {
    public static void main(String arge[]){
        int a[]={5,34,30,13,90,56,70};
        int i,temp,p=0;
        for(i=0;i<a.length;i++){
            if(a[i]%10!=0){
                temp=a[p];
                a[p++]=a[i];
                a[i]=temp;
            }
        }
        for(i=0;i<a.length;i++){
            System.out.println(a[i]);
        }


    }
}
