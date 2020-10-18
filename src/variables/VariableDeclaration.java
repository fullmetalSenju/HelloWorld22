package variables;

/*
 * Task:
 * Declare all the possible primitive data-type variables, assign some values and output them.
 */
public class VariableDeclaration {
    public static void main(String[] args) {
        byte byteValue = 100;
        short shortValue = 30549;

        // ...
        // Your code here

        char charValue = 'B';
        int intValue = 11;
        long longValue = 3434;
        float floatValue = 3.2222f;
        double doubleValue = 3.14;
        boolean booleanValue = true;


        System.out.println("A \"byte\" type variable: " + byteValue);
        System.out.println("A \"short\" type variable: " + shortValue);
        // ...
        // Your code here

        System.out.println("A \"char\" type variable: " + charValue);
        System.out.println("A \"int\" type variable: " + intValue);
        System.out.println("A \"long\" type variable: " + longValue);
        System.out.println("A \"float\" type variable: " + floatValue);
        System.out.println("A \"double\" type variable: " + doubleValue);
        System.out.println("A \"char\" type variable: " + booleanValue);
    }
}