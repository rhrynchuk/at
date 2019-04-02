import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by romanhrynchuk on 4/1/19.
 */
public class SeasonReader {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Input your month:");
        String month = br.readLine();


        switch (month.toUpperCase()) {
            case "DECEMBER":
            case "JANUARY":
            case "FEBRUARY":
                System.out.println(month + " is in " + Seasons.WINTER);
                break;

            case "MARCH":
            case "APRIL":
            case "MAY":
                System.out.println(month + " is in " + Seasons.SPRING);
                break;

            case "JUNE":
            case "JULY":
            case "AUGUST":
                System.out.println(month +" is in "+ Seasons.SUMMER);
                break;

            case "SEPTEMBER":
            case "OCTOBER":
            case "NOVEMBER":
                System.out.println(month +" is in "+ Seasons.AUTUMN);
                break;

            default:
                System.out.println("Hey, are you sure such month even exists?");
        }
    }
}
