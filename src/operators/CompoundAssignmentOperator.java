package operators;

public class CompoundAssignmentOperator {

    /*
     * Task:
     * Change the following program to use compound assignments.
     * The compound assignments look like: =+, =-, =% and so on.
     */
        public static void main(String[] args) {
            int totalResult = 20;

            totalResult += 30;
            System.out.println("Total result: " + totalResult);

            totalResult -= 43;
            System.out.println("Total result: " + totalResult);

            totalResult *= 4;
            System.out.println("Total result: " + totalResult);

            totalResult /= 8;
            System.out.println("Total result: " + totalResult);

            totalResult %= 7;
            System.out.println("Total result: " + totalResult);

            // Hint: int totalResult += 30;
            // ...
        }
    }

