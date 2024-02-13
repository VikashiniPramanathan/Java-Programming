/*Given an array with n distinct integers d[0], d[1], … d[n – 1] and a threshold t, how many triplets (i, j, k) exist such that d[i] < d[j] < d[k], and d[i] + d[j] + d[k] <= t.
Constraint:
0 < n ? 30,000
0 <= d[i] < 10,000,000
0 < t < 300,000,000
(Note that the input is not always sorted.)

Sample Input:
t => Threshold, N=> No. of values in array then N number follows denotes values..
8 5 1 2 3 4 6

Sample Output:
3
Explanation:

{1, 2, 3} => 1 + 2 + 3 <= 8
{1, 2, 4} => 1 + 2 + 4 <= 8
{1, 3, 4} => 1 + 3 + 4 <= 8*/

package Normal_Problems;

public class mallow_tech {
    public static void triplet(int[] nums,int threshold){
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                for(int k=0;k<j;k++){
                    if(nums[k]+nums[j]+nums[i]<=threshold){
                        //System.out.println(nums[i]+" "+nums[j]+" "+nums[k]);
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String args[]){
        int nums[]={1,2,3,4,6};
        int threshold=8;
        triplet(nums,threshold);
    }
}
