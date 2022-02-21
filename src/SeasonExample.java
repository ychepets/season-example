package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeasonExample {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter a month here to find what is the season now");

        String month = br.readLine();
        switch (month.toLowerCase()) {
            case "december":
            case "january":
            case "february":
                System.out.println("It is WINTER");
                break;
            case "march":
            case "april":
            case "may":
                System.out.println("It is SPRING");
                break;
            case "june":
            case "july":
            case "august":
                System.out.println("It is SUMMER");
                break;
            case "september":
            case "october":
            case "november":
                System.out.println("It is AUTUMN");
                break;
            default:
                System.out.println("Please set the correct month name");
        }
    }
}
