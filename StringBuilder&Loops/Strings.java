//! Create StringBuilder (s1) initialized with the “Hello, Im Arsalan Rather | Aspiring Developer”
public class Strings {
    public static void main(String args[]) {
        StringBuilder adminInfo = new StringBuilder();
        adminInfo.append("Hello, Im Arsalan Rather | Aspiring Developer");
        System.out.println(adminInfo);
        System.out.println("------------------------------------------");
        System.out.println("Capacity: " + adminInfo.capacity());
        System.out.println("Length: " + adminInfo.length());
        System.out.println("SubString: " + adminInfo.substring(10, 24));
        System.out.println("Reverse: " + adminInfo.reverse());
    }
}