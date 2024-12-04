public interface RideService {
    void bookRide(String pickup, String destination);
    double calculateFare(double distance);
}