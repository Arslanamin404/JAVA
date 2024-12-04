public class MainApp {
    public static void main(String[] args) {
        System.out.println("\n" + "-".repeat(50));
        System.out.println("\tWelcome to our Ride Sharing Service!");
        System.out.println("-".repeat(50) + "\n");

        RideService rideService;
        rideService = new CarRide();
        rideService.bookRide("Nowgam", "Lalchowk");
        System.out.printf("Car Ride Fare = ₹ %.2f", rideService.calculateFare(8));

        System.out.println("\n\n" + "-".repeat(50) + "\n");

        rideService = new BikeRide();
        rideService.bookRide("Hyderpora", "Rambagh");
        System.out.printf("Bike Ride Fare = ₹ %.2f", rideService.calculateFare(2));

        System.out.println("\n\n" + "-".repeat(50) + "\n");

    }
}
