import java.util.Scanner;

public class AA {
    public static void main(String[] args){
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        add ad = new add();
        ad.add(a, b);
    }
}
