package JackieWu;
public class jwulib {
    public static boolean isPalindrome(String str) {

        String x = "";
        for (int i = str.length(); i > 0; i--) {
            x = x + str.substring(i - 1, i);
        }
        if (str.equals(x)) {
            return true;
        } else {
            return false;
        }
    }
        public static String dateStr(String str){

            String Month = str.substring(0,2);
            String day = str.substring(3,5);
            String Year =str.substring(6,10);
            return day + "-" + Month + "-" + Year;
        }
        public static int isFibonnaci(int n) {

            while (int i < n;)
            {


            }
        }


    public static void main(String[] args) {
        System.out.println(isPalindrome("dog"));
        System.out.println(dateStr("12/13/1212"));
    }

}

