import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // Please write your code here.
        int temp = (24-11)*60-11;
        if(A<=11){
            if(B<11)
            System.out.println("-1");
            else if(B==11){
                System.out.println(C-11);
            }
            else{
                System.out.println((B-11)*60+C-11);
            }
        }
        else{
            int day = (A-11)*24*60;
            System.out.println(day+(B-11)*60+C-11);

        }

    }
}