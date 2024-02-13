package Arrays;

public class separateOddEven {
    public static void main(String args[]) {

        int temp = 0;
        int a[]={34,77,89,12,56,33};
        int left = 0;
        int right = a.length - 1;
        for (int i = 0; i < a.length; i++) {
            while (a[left] % 2 == 0) {
                left++;
            }
            while (a[right] % 2!=0) {
                right--;
            }
            if (left < right) {
                temp = a[left];
                System.out.println("temp: "+temp);
                a[left] = a[right];
                System.out.println("l: "+a[left]);
                a[right] = temp;
                System.out.println("r: "+a[right]);
            }
            System.out.print(a[i]+" ");
        }
//
    }
}
