public class Average {
    public static double get_avg(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        int length = numbers.length;
        return sum / length;
    }

    public static void main(String[] args) {
        System.out.println(get_avg(1, 2, 3, 4, 5));
    }

}
