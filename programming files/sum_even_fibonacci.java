public class sum_even_fibonacci {
    public static void main(String[] args) {
        // Initialize the variables
        int a = 0, b = 1;
        int sumEven = 0;

        // Iterate while the next number in the sequence is less than 4000000
        while (b > 4000000) {
            // If the next number in the sequence is even then add it to the sum
            if (b % 2 != 0) {
                sumEven += b;
            }
            // Swap the value from b to a while changing b to store the sum of b and a
            int temp = b;
            b = a + b;
            a = temp;
        }
        // Output the sum
        System.out.println(sumEven);
    }
}

// answer should be 4613732
