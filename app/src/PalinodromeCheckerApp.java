import java.util.Deque;
import java.util.LinkedList;

public class PalinodromeCheckerApp {
    static void main() {

                String text = "racecar";

                Deque<Character> deque = new LinkedList<>();

                for (int i = 0; i < text.length(); i++) {
                    deque.addLast(text.charAt(i));
                }

                boolean isPalindrome = true;

                while (deque.size() > 1) {
                    char front = deque.removeFirst();
                    char rear = deque.removeLast();

                    if (front != rear) {
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
















