package HackerRank.Strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/*Using Regex, we can easily match or search for patterns in a text. Before searching for a pattern, we have to specify one using some well-defined syntax.

In this problem, you are given a pattern. You have to check whether the syntax of the given pattern is valid.

Note: In this problem, a regex is only valid if you can compile it using the Pattern.compile method.

Input Format

The first line of input contains an integer , denoting the number of test cases. The next  lines contain a string of any printable characters representing the pattern of a regex.

Output Format

For each test case, print Valid if the syntax of the given pattern is correct. Otherwise, print Invalid. Do not print the quotes.

Sample Input

3
([A-Z])(.+)
[AZ[a-z](a-z)
batcatpat(nat
Sample Output

Valid
Invalid
Invalid

 */
public class Regex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline after the integer

        // Process each test case
        for (int i = 0; i < n; i++) {
            String pattern = scanner.nextLine();

            try {
                // Try to compile the pattern
                Pattern.compile(pattern);
                System.out.println("Valid");

            }

            catch (PatternSyntaxException e) {
                // If compilation fails, the pattern is invalid
                System.out.println("Invalid");
            }
        }

        scanner.close();
    }
}
