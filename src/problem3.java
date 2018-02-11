import java.util.Arrays;
import java.util.Scanner;

public class problem3 {
    public static void main(String[] args){
        int[] history = new int[new Scanner(System.in).nextInt()];
        int n = new Scanner(System.in).nextInt();
        for(int i = 0; i < history.length; i++){
            history[i] = new Scanner(System.in).nextInt();
        }
        System.out.println(notifications(history, n));
    }

    static int notifications(int[] history, int n){
        int notification = 0;
        for(int i = n-1; i < history.length - (n-1); i++){
            int[] med = new int[n];
            System.arraycopy(history, i - (n-1), med, 0, n);
            if (history[i] > calculateMedian(med))
                notification++;
        }
        return notification;
    }

    static int calculateMedian(int[] med){
        Arrays.sort(med);
        if(med.length % 2 == 0){
            return (med[med.length/2] + med[(med.length/2) + 1])/2;
        }
        return med[(med.length/2) + 1];
    }

}
