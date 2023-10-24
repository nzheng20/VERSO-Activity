#include <iostream>

int main()
{
    // Initialize variables
    int a = 0, b = 1;
    int sum_even = 0;

    // Iterate while the next number in the sequence is less than 4000000
    while (b < 4000000) {
        // Check if the next number in the sequence is even, and if so add it to the sum
        if (b % 2 == 0) {
            sum_even += b;
        }
        // Move the value from b to a while changing b to the sum of b and a
        int temp = b;
        b = a + b;
        a = temp;
    }
    // Output the sum
    std::cout << sum_even << std::endl;

    return 0;
}

// answer should be 4613732
