package Normal_Problems;

public class Armstrong_2 {
    public static void main(String args[]){
    int a=1634;
    int temp=a;
    int c=0,sum=0;
    while(temp!=0){
        temp=temp/10;
        c++;

        System.out.println("temp value: "+temp);
        System.out.println("count value: "+c);
    }
    System.out.println();
    temp=a;
    System.out.println(temp);
    while(temp!=0){
        int rem=temp%10;
        System.out.println("rem value: "+rem);
        sum+=Math.pow(rem,c);
        System.out.println("sum value: "+sum);
        temp=temp/10;
        System.out.println("temp value: "+temp);
    }
    System.out.println(sum);
    if(a==sum){
        System.out.println("it is armstrong number");
    }
    else{
        System.out.println("not armstrong");
    }
}
}
