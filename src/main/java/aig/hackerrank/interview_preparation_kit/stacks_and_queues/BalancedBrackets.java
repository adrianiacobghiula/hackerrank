package aig.hackerrank.interview_preparation_kit.stacks_and_queues;

/*
https://www.hackerrank.com/challenges/balanced-brackets
 */
import java.util.Deque;
import java.util.LinkedList;

public class BalancedBrackets {

  private static final String INVALID_NESTING = "NO";
  private static final String PROPERLY_NESTING = "YES";

  private boolean isProperlyNested(char current, char popped) {
    return ((popped == '(') && (current == ')'))
        || ((popped == '[') && (current == ']'))
        || ((popped == '{') && (current == '}'));
  }

  String isBalanced(String s) {
    Deque<Character> stack = new LinkedList<>();
    for (Character value : s.toCharArray()) {
      switch (value) {
        case '(':
        case '[':
        case '{':
          {
            stack.push(value);
            break;
          }
        case ')':
        case ']':
        case '}':
          {
            if (stack.isEmpty()) {
              return INVALID_NESTING;
            }
            Character popped = stack.pop();
            if (!isProperlyNested(value, popped)) {
              return INVALID_NESTING;
            }
          }
      }
    }
    if (!stack.isEmpty()) {
      return INVALID_NESTING;
    }
    return PROPERLY_NESTING;
  }
}
