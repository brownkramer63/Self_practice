package GroupWork;

import java.util.Stack;

public class FindAllElementsGreaterThanTheirRight {
    public static void main(String[] args) {
        int[] arr = {10,4,6,3,5};

     find(arr);
    }
public static void find(int[] arr){

    Stack<Integer> part1 =new Stack<>();

    for (int each:arr
         ) {
        //checks each element of our array againest latest addition to stack
        while (!part1.isEmpty() && part1.peek()<each){
            //removes from stack
            part1.pop();
        }

        //if stack is empty or if each is greater that all that follow it gets added

        part1.push(each);
    }
    //prints it out
    while (!part1.isEmpty()) {
        System.out.print(part1.pop() + " ");
    }


}

}
