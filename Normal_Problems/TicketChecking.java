package Normal_Problems;

import java.sql.SQLOutput;

public class TicketChecking {
    public static void main(String args[]){
        char c='S';
        if(c=='e'||c=='E'){
            System.out.println("early bird ticket");
        } else if (c=='d'||c=='D') {
            System.out.println("discount");

        }
        else if(c=='v' || c=='V'){
            System.out.println("VIP ticket");
        }
        else if(c=='s' || c=='S'){
            System.out.println("standard ticket");
        }
        else if(c=='c'|| c=='C'){
            System.out.println("children ticket");
        }

    }
}
