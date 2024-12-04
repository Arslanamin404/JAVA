public class BikeRide implements RideService {
    private static final double RIDE_PER_KM = 5.00;

    public void bookRide(String pickup, String destination) {
        System.out.printf("Booking Bike ride from %s to %s\n", pickup, destination);
    }

    public double calculateFare(double distance) {
        return (RIDE_PER_KM * distance);
    }
}
