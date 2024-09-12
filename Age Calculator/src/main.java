
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Age Calculator");
        System.out.println("Please enter your birthdate in the following order:");
        
        System.out.println("Day:");
        int day1 = scanner.nextInt();
        
        //
        
        if (day1 > 31 || day1 < 1) {
            System.out.println("Please enter a valid day.");
        } 
        else {
            System.out.println("Day entered successfully.");
        }
        
        System.out.println("Month:");
        int month1 = scanner.nextInt();
        if (month1 > 12 || month1 < 1) {
            System.out.println("Please enter a valid month.");
        } 
        else {
            System.out.println("Month entered successfully.");
        }
        
        System.out.println("Year:");
        int year1 = scanner.nextInt();
        System.out.println("Year entered successfully.");
        
        //
        
        System.out.println("Please enter today's date in the following order:");
        
        System.out.println("Day:");
        int day2 = scanner.nextInt();
        if (day2 > 31 || day2 < 1) {
            System.out.println("Please enter a valid day.");
        } 
        else {
            System.out.println("Day entered successfully.");
        }
        
        System.out.println("Month:");
        int month2 = scanner.nextInt();
        if (month2 > 12 || month2 < 1) {
            System.out.println("Please enter a valid month.");
        } 
        else {
            System.out.println("Month entered successfully.");
        }
        
        System.out.println("Year:");
        int year2 = scanner.nextInt();
        if (year1 > year2) {
            System.out.println("Your birth year cannot be greater than the current year.");
        } 
        else {
            System.out.println("Year entered successfully.");
        }
        
        //Calculate
        
        int year3 = (year2 - year1);
        int month3 = (month2 - month1);
        int day3 = (day2 - day1);
        
        if (day3 < 0) {
            day3 = (day3 + 30);
            month3 = (month3 - 1);
        } 
        else {}

        if (month3 < 0) {
            month3 = (month3 + 12);
            year3 = (year3 - 1);
        } 
        else {}
        
        //Result
        
        System.out.println("You are exactly " + year3 + " years, " + month3 + " months, and " + day3 + " days old.");
    }
}

