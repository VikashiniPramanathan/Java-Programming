package Normal_Problems;

public class Primenumber {
    public static void main(String[] args) {
        int num=79;
        int count = 0;
        for(int i=2; i<num; i++)
        {
            if(num%i == 0)
            {
                count++;
                break;
            }
        }

        if(count==0)
            System.out.println("\nIt is a Prime Number.");
        else
            System.out.println("\nIt is not a Prime Number.");
    }
}
