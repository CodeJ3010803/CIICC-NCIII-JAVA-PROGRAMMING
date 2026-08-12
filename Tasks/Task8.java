package Tasks;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("--- Running Task 8 (Varargs & Cumulative Sums) ---\n");

        int grandTotal = computeCumulativeSums(4, 5, 10);

        System.out.println("\nGrand total sum of all parameters: " + grandTotal);
    }

    public static int computeCumulativeSums(int... numbers) {
        int totalSumOfParams = 0;

        for (int num : numbers) {
            int cumulativeSum = 0;
            
            for (int i = 1; i <= num; i++) {
                cumulativeSum += i;
            }

            System.out.println("Parameter: " + num + " -> Cumulative Sum (1 to " + num + ") = " + cumulativeSum);
            totalSumOfParams += num;
        }

        return totalSumOfParams;
    }
}
