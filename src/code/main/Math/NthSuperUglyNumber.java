package code.main.Math;

import java.util.PriorityQueue;

public class NthSuperUglyNumber {
    // A min-heap to hold and automatically sort the ugly numbers
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    // Adding the first ugly number which is always 1
        minHeap.offer(1);
    // Variable to hold the current ugly number
    int currentUglyNumber = 0;

    // Generate the nth ugly number
        while (n-- > 0) {
        // Get the smallest ugly number from the min-heap
        currentUglyNumber = minHeap.poll();

        // Avoid duplicates by polling all instances of the current ugly number
        while (!minHeap.isEmpty() && minHeap.peek() == currentUglyNumber) {
            minHeap.poll();
        }

        // Multiply the current ugly number with each prime to get new ugly numbers
        for (int prime : primes) {
            // Check for overflow before adding the new ugly number
            if (prime <= Integer.MAX_VALUE / currentUglyNumber) {
                minHeap.offer(prime * currentUglyNumber);
            }
            // If current ugly number is divisible by prime, no need to check further
            if (currentUglyNumber % prime == 0) {
                break;
            }
        }
    }
    // Return the nth ugly number
        return currentUglyNumber;
}
