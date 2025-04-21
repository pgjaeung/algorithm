import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.
        int date[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        int sum=0;
        if(m1==m2 && d1==d2){
            else sum+=d2-d1;
            System.out.println(sum+1);
            System.exit(0);
        }
        for(int i=m1; i<=m2; i++){
            if(i==m2) sum+=d2;
            else if(i==m1) sum+=date[m1-1]-d1;
            else sum+=date[i-1];
        } 
        System.out.println(sum+1);
    }
}