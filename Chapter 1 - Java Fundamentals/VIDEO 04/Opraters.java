public class Opraters {
        public static void main(String[] args) {
                // 1. Unary Opraters
                /*
                 * 1. + : Addition
                 * 2. - : Subtraction
                 * 3. ++ : Increments the value by 1
                 * 4. -- : Decrements the value by 1
                 */
                /*
                 * int a = 20;
                 * 
                 * System.out.println(a++);
                 * System.out.println(a);
                 * System.out.println(++a);
                 * System.out.println(a);
                 * System.out.println(a--);
                 * System.out.println(a);
                 * System.out.println(--a);
                 */
                /*
                 * a = 20
                 * a++ : a + 1 : 20 + 1 : 21
                 * ++a : 1 + a : 1 + 21 : 22
                 * a-- : a - 1 : 22 - 1 : 21
                 * --a : 1 - a : 1 - 21 : 20
                 */

                // Arithmetic Opraters

                /*
                 * 1. +
                 * 2. -
                 * 3. * : Multiply
                 * 4. / : Divide
                 * 5. % : reminder
                 */
                /*
                 * int a = 20;
                 * int b = 30;
                 * System.out.println(a + b);
                 * System.out.println(a - b);
                 * System.out.println(a * b);
                 * System.out.println(a / b);
                 */
                // 3. Bitwise Opreters
                /*
                 * << : Signed Left Shift
                 * >> : Signed Right Shift
                 * & : Bitwise AND
                 * | : Bitwise OR
                 */

                // Example
                /*
                 * int a = 20;
                 * int b = 30;
                 * System.out.println(a << 2);
                 * System.out.println(a >> 2);
                 * System.out.println(a < b & a > b);
                 */

                // 4. Logical Opreters

                /*
                 * 1. || : Logical OR
                 * 2. && : Logical And
                 */

                // Example
                /*
                 * int a = 10;
                 * int b = 20;
                 * int c = 20;
                 * System.out.println(a < b && a > b);
                 * System.out.println(a < b || a > b);
                 * System.out.println(a == b || a > b);
                 * System.out.println(a < b && c == b);
                 */

                // 5. Ternary Opreters
                /*
                 * 1.Sintax: variable = (expression)? True:False
                 */

                // Example
                /*
                 * int a = 2;
                 * int b = 5;
                 * int min = (a > b)?b:a;
                 * System.out.println(min);
                 */
                // 6. Equality and Relational Opreters

                /*
                 * 1. == : Equal to
                 * 2. != : not-Equal to
                 * 3. > : Greter Than
                 * 4. >= : Greter Than or equal to
                 * 5. < : Less than
                 * 6. <= : Less Than or equal to
                 */

                // Example
                /*
                 * int x = 10;
                 * int y = 20;
                 * System.out.println("1. == : Equal to "+ (x == y));
                 * System.out.println("2. != : not-Equal to "+ (x != y));
                 * System.out.println("3. > : Greter Than "+ (x > y));
                 * System.out.println("4. >= : Greter Than or equal to "+ (x >= y));
                 * System.out.println("5. < : Less than "+ (x < y));
                 * System.out.println("6. <= : Less Than or equal to "+ (x <= y));
                 */

                // 7. Assignment Oprater:
                // more in assinment md
                int a = 10;
                int b = 5;

                // Original values
                System.out.println("Original value of 'a': " + a);
                System.out.println("Original value of 'b': " + b);

                a += b; // Equivalent to a = a + b;
                System.out.println("After 'a += b': " + a);

                a -= b; // Equivalent to a = a - b;
                System.out.println("After 'a -= b': " + a);

                a *= b; // Equivalent to a = a * b;
                System.out.println("After 'a *= b': " + a);

                a /= b; // Equivalent to a = a / b;
                System.out.println("After 'a /= b': " + a);

                a %= b; // Equivalent to a = a % b;
                System.out.println("After 'a %= b': " + a);

        }
}
