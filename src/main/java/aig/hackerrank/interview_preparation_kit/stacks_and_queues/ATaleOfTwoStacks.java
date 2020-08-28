package aig.hackerrank.interview_preparation_kit.stacks_and_queues;

import java.util.LinkedList;
import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/ctci-queue-using-two-stacks
 */
public class ATaleOfTwoStacks {

  public static void main(String[] args) {
    MyQueue<Integer> queue = new MyQueue<>();

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    for (int i = 0; i < n; i++) {
      int operation = scan.nextInt();
      if (operation == 1) { // enqueue
        queue.enqueue(scan.nextInt());
      } else if (operation == 2) { // dequeue
        queue.dequeue();
      } else if (operation == 3) { // print/peek
        System.out.println(queue.peek());
      }
    }
    scan.close();
  }

  private static class MyQueue<T> extends LinkedList<T> {

    public void enqueue(T nextInt) {
      addLast(nextInt);
    }

    public void dequeue() {
      removeFirst();
    }

    public T peek() {
      return peekFirst();
    }
  }
}
