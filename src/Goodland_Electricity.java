/*
This code was contributed by Elaaf Salem.
A solution for this problem by Hackerrank:
https://www.hackerrank.com/challenges/pylons/problem
 */


import java.util.*;

public class Goodland_Electricity {

        static int pylons(int k, int[] arr) {

            int changes = 0, cur = k - 1, pre = -1, n = arr.length;
            boolean covered = false;

            while(cur < n){

                changes++;

                while (cur < n && cur >= 0 && arr[cur] == 0) cur--;
                if (!covered && cur < pre ) return -1;
                else if (cur == pre){
                    if (covered) return --changes;
                    else return -1;
                }

                pre = cur;
                cur += 2 * k - 1;

                if (cur >= n) {

                    cur = n - 1;
                    covered = true;

                }

            }

            return changes;

        }


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int k = in.nextInt();
            int[] arr = new int[n];
            for (int arr_i = 0; arr_i < n; arr_i++) {
                arr[arr_i] = in.nextInt();
            }
            int result = pylons(k, arr);
            System.out.println(result);
            in.close();
        }

}
