public class CarRide implements RideService {
    private static final double RATE_PER_KM = 10.00;

    public void bookRide(String pickup, String destination) {
        System.out.printf("Booking car ride from %s to %s.\n", pickup, destination);
    }

    public double calculateFare(double distance) {
        return (distance * RATE_PER_KM);
    };
}
