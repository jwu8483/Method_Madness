package JackieWu;
public class jWuLib {
    //String Methods
    public static boolean isPalindrome(String str) {

        String x = "";
        for (int i = str.length(); i > 0; i--) {//Reverses the string
            x = x + str.substring(i - 1, i);
        }
        if (str.equals(x)) {//Checks if the reversed string is equal to the original
            return true;
        } else {
            return false;
        }
    }

    public static String dateStr(String str) {

        String Month = str.substring(0, 2);//Takes the Month part of the string
        String day = str.substring(3, 5);//Takes the Day part of the string
        String Year = str.substring(6, 10);//Takes the year part of the string
        return day + "-" + Month + "-" + Year;//Rearranges the string and adds "-" in between
    }

    public static void fooBarBaz(int n)
    {
        for (int i = 1; i < n + 1; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("baz");//Prints "baz" when it is a multiple of 5 and 3
            }
            else if (i % 3 == 0) {
                System.out.println("foo");//Prints "foo" when it is a multiple of 3
            }
            else if (i % 5 == 0) {
                System.out.println("bar");//Prints "bar" when it is a multiple of 5
            }
            else
            {
                System.out.println(i);//Prints out the number if it isn't a multiple of 3 or 5
            }

        }
    }
    //Math Methods
    public static int sumUpTo(int n) {
        int x = 0;
        for (int i = 0; i < n + 1; i++) {//Adds the number and previous number until the nth number
            x = x + i;
        }
        return x;
    }
    public static void primePrinter(int num) {
        int n = 0;
        String result = "";
        int i = 2;
        int k = 0;
        while (n < num) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    k++;
                }
            }
            if (k == 2) {//Checks if number has only 2 factors
                result += i + " ";
                n++;
            }
            i++;
            k = 0;

        }
            System.out.println(result);
        }
    }
