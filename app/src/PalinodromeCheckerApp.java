import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalinodromeCheckerApp {
    static void main() {


                String text = "madam";

                Stack<Character> stack = new Stack<>();
                Queue<Character> queue = new LinkedList<>();

                for (int i = 0; i < text.length(); i++) {
                    char ch = text.charAt(i);
                    stack.push(ch);
                    queue.add(ch);
                }

                boolean isPalindrome = true;

                while (!stack.isEmpty()) {
                    if (stack.pop() != queue.remove()) {
                        isPalindrome = false;
                        break;
                    }
                }

                if (isPalindrome) {
                    System.out.println(text + " is a Palindrome");
                } else {
                    System.out.println(text + " is not a Palindrome");
                }
            }
        }















