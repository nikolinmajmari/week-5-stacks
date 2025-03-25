package stack.main;

import stack.StackInterface;
import util.Helpers;
import stack.array.ArrayStack;

import java.util.Iterator;

public class MainArrayStack {
    public static void main(String[] args) {
        StackInterface<Integer> stack = new ArrayStack<>();
        stack.push(4);
        stack.push(2);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(2);
        System.out.println(stack); /// 2,3,2,1,2,4
        System.out.println(stack.peek());///2
        System.out.println(stack);/// 2,3,2,1,2,4
        System.out.println(stack.pop());/// 2
        System.out.println(stack);/// 3,2,1,2,4
        System.out.println(stack.pop());
        System.out.println(stack);/// 2,1,2,4
        stack.push(5);
        stack.push(3);
        System.out.println(stack);///5,3,2,1,2,4
        System.out.println(Helpers.max(stack)); /// 5
        System.out.println(Helpers.min(stack)); /// 1
        System.out.print("[");
        Iterator it = stack.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }
        for(Integer node: stack){
            System.out.printf("%d, ", node);
        }
        System.out.print("]\n");/// [5, 3, 2, 1, 2, 4,]
        System.out.println(stack.size()); /// 0
    }
}
