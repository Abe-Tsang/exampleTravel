import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Driver {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your flight?");
        String flight = br.readLine();
        System.out.println("What is your hotel?");
        String hotel = br.readLine();
        System.out.println("What is your rental car? (Just press enter if none)");
        String rentalCar = br.readLine();
        Itinerary i = new Itinerary(flight, hotel, rentalCar);
        System.out.println(i.toString());
    }
}
