
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap vao ban kinh hinh tron: ");
        double r = scanner.nextInt();
        double result = r * Math.PI * 2;
        System.out.println("Chu vi hinh tron la: " + result);

        double result2 = Math.PI * Math.pow(r,2);
        System.out.println("Dien tich hinh tron la: " + result2);

    }
}

