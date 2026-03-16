import java.util.Stack;
public class PalinodromeCheckerApp {
    static void main() {


                String text = "madam";

                Stack<Character> stack = new Stack<>();

                for (int i = 0; i < text.length(); i++) {
                    stack.push(text.charAt(i));
                }

                String reversed = "";
                while (!stack.isEmpty()) {
                    reversed = reversed + stack.pop();
                }

                if (text.equals(reversed)) {
                    System.out.println(text + " is a Palindrome");
                } else {
                    System.out.println(text + " is not a Palindrome");
                }
            }
        }












