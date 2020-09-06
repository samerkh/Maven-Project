import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year;

        Calendar c = new Calendar();

        do {
            System.out.print("Enter a year: ");

            year = sc.nextInt();

            if(year == 0){
                System.out.println("Goodbye!");
            }
            else{
                c.setYear(year);
                System.out.println(c.isLeapYear());
            }
        } while (year != 0);


    }
}
