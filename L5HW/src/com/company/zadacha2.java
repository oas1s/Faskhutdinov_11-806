import java.util.Scanner;

public class zadacha2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строчку");
        String str = sc.nextLine();
        char[] v = str.toCharArray();
        for (int i = 0; i < v.length; i++){
            if (v[i] >= '0' && v[i] <= '9'){
                v[i] = '*';
            }
        }
        System.out.println(v);
    }
}