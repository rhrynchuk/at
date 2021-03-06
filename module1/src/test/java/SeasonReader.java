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
        Seasons seasons = null;

        switch (month.toUpperCase()) {
            case "DECEMBER":
            case "JANUARY":
            case "FEBRUARY":
                seasons = Seasons.WINTER;
                break;

            case "MARCH":
            case "APRIL":
            case "MAY":
                seasons = Seasons.SPRING;
                break;

            case "JUNE":
            case "JULY":
            case "AUGUST":
                seasons = Seasons.SUMMER;
                break;

            case "SEPTEMBER":
            case "OCTOBER":
            case "NOVEMBER":
                seasons = Seasons.AUTUMN;
                break;

            default:
                System.out.printf("Hey, are you sure such month even exists?");
        }
        if (seasons != null) {
            System.out.println(month + " is in " + seasons);
        }
    }
}
