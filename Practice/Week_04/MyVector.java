package Week_04;

import java.util.Vector;

public class MyVector {
    public static void main(String[] args) {
        Vector<Integer> nums = new Vector<>();

        System.out.println("Default Capacity: " + nums.capacity());
        System.out.println("Default Size: " + nums.size());
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);

        nums.add(2, 25);
        nums.remove(3);
        nums.add(60);
        
        for (int elem : nums) {
            System.out.print(elem + " ");
        }

        System.out.println("\nCapacity: " + nums.capacity());
        System.out.println("Size: " + nums.size());

    }
}
