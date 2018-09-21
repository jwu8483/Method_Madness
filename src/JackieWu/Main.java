package JackieWu;

public class Main {
        public static int sumUpTo(int n){
            int x = 0;
            for (int i = 0; i < n + 1; i++) {
                x = x + i;
            }
            return x;
        }
        public static void main(String[] args){
            System.out.println(sumUpTo(2));
        }

    }
