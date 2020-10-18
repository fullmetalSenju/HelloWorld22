package variables;

/**
 * Task:
 * Define three or more code blocks in the "main" method that include each other.
 * Then include any numbers of the different variables using any primitive data types
 * in those code of blocks.
 * Finally, to see and understand mechanism of limited access to local variables,
 * it suggests you to output all the above declared variables via System.out.println()
 * in each code of block.
 * See an example below.
 */
public class ScopeOfLocalVariables {
    public static void main(String[] args) {
        {
            int intValue = 97;
            // declare more variables of any types here

            String name = "Felix";

            {
                // declare another variable of any type here
                double number = 3.14;

                // ...

                // try to output all the earlier declared variables
                System.out.println("I'm trying " + name);
                System.out.println("to output something " + number);


                System.out.println("Let's try to use 'intValue' variable.");
                System.out.println("We can do it: " + intValue);
                System.out.println("Because we are in the inner block. That's why 'intValue' is accessible");
                //...

                {
                    // and declare two or more variable here as well
                    String name2 = "Maria";
                    char charValue = 'B';
                    //...

                    // try to output all the earlier declared variables
                    System.out.println("name " + name);
                    System.out.println("number " + number);
                    System.out.println("name2 " + name2);

                    System.out.println("intValue: " + intValue);
                    System.out.println("charValue: " + charValue);
                    //...
                }
                // try to output all the earlier declared variables
                System.out.println("name " + name);
                System.out.println("number " + number);
                //System.out.println("name2 " + name2);
                //Because "name2" is a local variable to the function above

                System.out.println("intValue: " + intValue);
                // We cannot use it here. Why?
                // System.out.println("charValue: " + charValue);
                //...

            }
        }
        {
//            System.out.println("name " + name);
//            System.out.println("number " + number);
//            System.out.println("name2 " + name2);
            //This is other function. It has just main, class and file scope. This function doesn`t have any declared variables

            // We cannot use it here. Why?
            // System.out.println("intValue: " + intValue);
        }
    }
}