/*
If the key value is found twice in the array, the output is: "The index of the second occurrence of the key value is: index" where index is the 0-based index of the second occurrence of the key.
if the key value is found only once, the output is: "Key found only once."
If the key value is not found, the output is: "Key not found."
Refer to the sample output for the formatting specifications.

Sample test cases:
Input 1:
5            => array size
1 2 3 5 6 2  => arr elements
2            => key value
Output 1:
  The index of the second occurrence of

Input-2:
4
1 2 3 4
8
Output 2:
   Key not found.

Input 3:
4
1234
1
Output 3:
    Key found only once
 */
package Arrays;

public class Placement {
    public static void main(String[] args){
        int[] a={1,2,3,4,2};
        int in=0;
        int key=2;
        int count=-1;
        for(int i=0;i<a.length;i++){
            if(key==a[i]){
                in=i;
                count=count+(-1);
            }
        }
        if(-2 > count){
            System.out.println("The index occured twice :"+in);
        } else if (count==-2) {
            System.out.println("key found once");
        }else{
            System.out.println("key not found");
        }
    }
}
