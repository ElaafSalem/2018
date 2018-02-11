
import java.io.IOException;
import java.util.*;

public class problem1 {
    public static void main(String[] args) throws IOException {

        final int MAX = 1000;
        final String[] ones = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"},
                 teens = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
                         "seventeen", "eighteen", "nineteen"},
                 tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
                         "ninety", "hundred"},
                 others= {"", "thousand", "million", "billion"};

        String name  = new Scanner(System.in).nextLine();

        int[] stack = new int[MAX];
        int top = 0; //holds the top index value

        String[] names = name.split(" ");

        for (int i = 0; i < names.length; i++) {
            if (names[i].contains("and") || names[i].contains(",")){
                stack[top-2] *= stack[top-1]; top--;
            }
            for (int j = 0; j < ones.length; j++) {
                if (names[i].contains(ones[j])) stack[top++] = j;
            }
            for (int j = 1; j < teens.length; j++) {
                if (names[i].contains(teens[j])) stack[top++] = j + 10;
            }
            for (int j = 1; j < tens.length; j++) {
                if (names[i].contains(tens[j])) stack[top++] = j * 10;
            }
            for (int j = 1; j < others.length; j++) {
                if (names[i].contains(others[j])) stack[top++] = (int)Math.pow(10 , j*3);
            }

        }
        //TODO: fix the following bug: "one hundred" is interpreted as 101
        int sum = 0, index = 0;
        while(index != top)
                sum += stack[index++];

        System.out.println(sum);
    }

}
