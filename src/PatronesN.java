import java.util.Scanner;

public class PatronesN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero entero positivo: ");
        int n = scanner.nextInt();
        if (n<=0) {
            System.out.print("Introduce un numero entero positivo: ");
            return;
        }
for (int i = 1; <= n; 1++) {
    for (j = 1; j<= i; j++) {
        System.out.print();
    }
    System.out.print();
}
scanner.close();
    }
}
