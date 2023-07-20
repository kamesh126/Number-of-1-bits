import java.util.Scanner;
public class Numberof1bits {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int val=count(n);
            System.out.println(val);
        }

        public static boolean check(int n, int i){
            boolean str=false;
            if((n&(1<<i))!=0) {
                str=true;
            }

            return str;

        }
        public static int count(int n) {
            int cou=0;
            for(int i=0;i<n;i++){
                if(check(n,i)){
                    cou++;
                }
            }
            return cou;
        }

    }
