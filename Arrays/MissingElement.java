package Arrays;

public class MissingElement {
    static int MissingNumber(int arr[])
    {
        int n=arr.length;
        int total = 1;
        for (int i = 2; i <=n ; i++) {
            total += i;
            total -= arr[i - 2];
        }
        return total;
    }


    public static void main(String[] args)
    {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(MissingNumber(arr));
    }
}
