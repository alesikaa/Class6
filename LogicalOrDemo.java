package Class6;
import java.sql.SQLOutput;
import java.util.Scanner;
public class LogicalOrDemo {
    public static void main(String[] args) {
        System.out.println("Please enter the day");
        Scanner scan=new Scanner(System.in);
        String day= scan.next();
        if (day.equalsIgnoreCase("Monday")|| day.equalsIgnoreCase("Fridai")) {
            System.out.println("No class today");
        }else if (day.equalsIgnoreCase("Saturday")|| day.equalsIgnoreCase("Sunday")) {
            System.out.println("Java class Enjoy");
        } else if (day.equalsIgnoreCase("Wednesday")|| day.equalsIgnoreCase("Tuesday")){
            System.out.println("Manual Testing class");
        }else if (day.equalsIgnoreCase("Thursday")){
            System.out.println("Review Class");
        }else{
            System.out.println("Wrong day entered");
        }
    }
}

