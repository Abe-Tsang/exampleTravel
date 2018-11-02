public class Itinerary {
    private String flight;
    private String hotel;
    private String rentalCar;

    public Itinerary(String _flight, String _hotel, String _rentalCar){
        flight = _flight;
        hotel = _hotel;
        rentalCar = _rentalCar;
    }

    public String getFlight() {
        return flight;
    }

    public String getHotel() {
        return hotel;
    }

    public String getRentalCar() {
        return rentalCar;
    }
    public String toString(){
        return flight + " " + hotel + " " + rentalCar;
    }
}
