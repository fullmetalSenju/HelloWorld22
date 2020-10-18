package operators;

/**
 * Task:
 * In the following program, explain why the value "6" is printed twice in a row.
 * Put the explanation in comments.
 */
public class PrePostIncrement {
    public static void main(String[] args) {
        int i = 10;
        i++;
        System.out.println(i);    // "11"
        ++i;
        System.out.println(i);    // "12"
        //this is prefix and the operator is applied before the rest of the expression
        System.out.println(++i);  // "13"
        //and this is postfix, the operator is applied after the expression
        System.out.println(i++);  // "13"
        System.out.println(i);    // "14"
    }
}