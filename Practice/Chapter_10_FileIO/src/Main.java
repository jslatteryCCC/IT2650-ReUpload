import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        squareDigits(9129);
        /*
        Welcome. In this kata, you are asked to square every digit of a
        number and concatenate them. For example, if we run 9119 through
        the function, 811181 will come out, because 92 is 81 and 12 is 1.
        Note: The function accepts an integer and returns an integer
         */
    }

    public static int squareDigits(int n) {
        // TODO Implement me
        LinkedList<Integer> stack = new LinkedList<Integer>();
        while (n > 0){
            stack.push((int) Math.pow(n % 10, 2));
            n = n / 10;
        }
        //if I could access the first number, I'd multiply it by 10 to the power of a variable that'
        // the the length of the list, store it, and add the next number to it raised to the power of
        // the length of the list -1, etc, until the final int would be 10 raised to 0 - or 1
        System.out.println(stack);
        return stack.pop();

    }

}



        //return phrase.substring(0,1).toUpperCase() + phrase.substring(1);

