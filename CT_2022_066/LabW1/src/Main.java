import java.text.SimpleDateFormat;
import java.util.*;

import static java.lang.Math.*;
import static java.util.Calendar.MONTH;

public class Main {
    public static void main(String[] args) {
        // System.out.println("shopping List:");
        // System.out.println("\t\t\tApple");
        // System.out.println("\t\t\tBanana");
        //System.out.println("\t\t\tLow fat Milk");

        // System.out.println("Shopping List:\n\t\t\tApple\n\t\t\tBanana\n\t\t\tLow fat Milk");

        // String country = "Sri Lanka";

        // System.out.println("My Country is " + country);
        // System.out.println(country.length());
        // System.out.println(country.indexOf("L"));
        // System.out.println(country.substring(0, 3));

        // String java;
        // java = "I Love You and you Love me";
        // System.out.println(java.indexOf("Love"));
        // System.out.println(java.indexOf("you"));
        // System.out.println(country + "! " + java);

        //Scanner scanner = new Scanner(System.in); // used for user input

       // System.out.println("Enter Your Name: ");
       // String name = scanner.next();
       // System.out.println("Hi,"+name);

        //int age = scanner.nextInt();
        //System.out.println("Age,"+age);

        //System.out.println("Enter your firstName");
        //String firstName = scanner.next();

        //System.out.println("Enter your middlename");
        //String middleName = scanner.next();

        //System.out.println("Enter your lastName");
        //String lastName = scanner.next();

        //System.out.println("firstname: "+firstName);
        //System.out.println("firstname: "+middleName);
        //System.out.println("firstname: "+lastName);

        //System.out.println(firstName.substring(0, 1)+"."+middleName.substring(0, 1)+"."+lastName.substring(0, 1));

        //System.out.println(firstName + " " + middleName + " " + lastName);

        //int num = 14;
        //int num1 = 20;
        //System.out.println(num+" "+num1);
        //System.out.println(num+num1); // working as addition operator

        //Scanner scanner = new Scanner(System.in);

        //System.out.println("Enter year: ");
        //int year = scanner.nextInt();

        //System.out.println("Enter month: ");
        //int month = scanner.nextInt();

        //System.out.println("Enter date: ");
        //int date = scanner.nextInt();

        //GregorianCalendar myCalender = new GregorianCalendar();
        //myCalender.set(year,month -1,date);
        //System.out.println(myCalender.getTime());

        //GregorianCalendar independenceDay = new GregorianCalendar(1948,1,4);
        //System.out.println(independenceDay.get(Calendar.MONTH));

        Date today = new Date();
        //System.out.println(today);

        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
        //System.out.println(simpleDateFormat.format(today));

        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        //System.out.println(simpleDateFormat.format(today));

        //double num1 = 22.15;
        //int num2 = 25;
        //int num3 = 27;

        //System.out.println(Math.round(num1));
        //System.out.println(Math.floor(num1));
        //System.out.println(Math.abs(num1));
        //System.out.println(Math.ceil(num1));

        //System.out.println(Math.sqrt(num2));
        //System.out.println(Math.cbrt(num3));

        //System.out.println(Math.exp(2.0));

        //System.out.println(Math.min(4,2));
        //System.out.println(Math.max(4,2));

        Random random = new Random();
        //int randomNumber = random.nextInt(10) + 1;
        int randomNumber = random.nextInt(20 - 10 ) + 1;
        System.out.println(randomNumber);
    }
}
