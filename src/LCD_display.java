import java.util.*;
public class LCD_display {

        static String[][] zero = {
                {" ", "-", " "},
                {"|", " ", "|"},
                {" ", " ", " "},
                {"|", " ", "|"},
                {" ", "-", " "}
        };
        static String[][] one = {
                {"", "", " "},
                {"", "", "|"},
                {"", "", " "},
                {"", "", "|"},
                {"", "", " "}
        };
        static String[][] two = {
                {" ", "-", " "},
                {" ", " ", "|"},
                {" ", "-", " "},
                {"|", " ", " "},
                {" ", "-", " "}
        };
        static String[][] three = {
                {" ", "-", " "},
                {" ", " ", "|"},
                {" ", "-", " "},
                {" ", " ", "|"},
                {" ", "-", " "}
        };
        static String[][] four = {
                {" ", " ", " "},
                {"|", " ", "|"},
                {" ", "-", " "},
                {" ", " ", "|"},
                {" ", " ", " "}
        };
        static String[][] five = {
                {" ", "-", " "},
                {"|", " ", " "},
                {" ", "-", " "},
                {" ", " ", "|"},
                {" ", "-", " "}
        };
        static String[][] six = {
                {" ", "-", " "},
                {"|", " ", " "},
                {" ", "-", " "},
                {"|", " ", "|"},
                {" ", "-", " "}
        };
        static String[][] seven = {
                {"-", "-", " "},
                {" ", " ", "|"},
                {" ", " ", " "},
                {" ", " ", "|"},
                {" ", " ", " "}
        };
        static String[][] eight = {
                {" ", "-", " "},
                {"|", " ", "|"},
                {" ", "-", " "},
                {"|", " ", "|"},
                {" ", "-", " "}
        };
        static String[][] nine = {
                {" ", "-", " "},
                {"|", " ", "|"},
                {" ", "-", " "},
                {" ", " ", "|"},
                {" ", "-", " "}
        };
        // Note that the middle column is repeated. Also the second and the fourth row
        private static Scanner scan = new Scanner(System.in);
        public static void main(String[] args) {
            List<String[][]> numbers = new ArrayList<String[][]>();
            String inp = scan.nextLine();
            int s = scan.nextInt();
            for(int i = 0; i < inp.length(); i++){
                switch(inp.charAt(i)){
                    case '0': numbers.add(zero); break;
                    case '1': numbers.add(one); break;
                    case '2': numbers.add(two); break;
                    case '3': numbers.add(three); break;
                    case '4': numbers.add(four); break;
                    case '5': numbers.add(five); break;
                    case '6': numbers.add(six); break;
                    case '7': numbers.add(seven); break;
                    case '8': numbers.add(eight); break;
                    case '9': numbers.add(nine); break;
                }
            }
            print(numbers, s);
        }

        public static void print(List<String[][]> numbers, int repeation) {
            for(int row = 0; row < 5; row++) {
                if(row == 1 || row == 3) {
                    for(int i=0; i < repeation; i++) {
                        print_row(numbers, row, repeation);
                    }
                } else {
                    print_row(numbers, row, repeation);
                }
            }
        }

        public static void print_row(List<String[][]> numbers, int row, int repeation) {
            for(String[][] number: numbers) {
                System.out.print(number[row][0]);

                // Repeat the middle three times
                for(int i = 0; i < repeation; i++) {
                    System.out.print(number[row][1]);
                }

                System.out.print(number[row][2]);

                // Print the blank that seperates the numbers
                System.out.print(" ");
            }

            System.out.println();
        }

}
