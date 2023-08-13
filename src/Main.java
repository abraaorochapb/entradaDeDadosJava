import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x ;
        System.out.print("Digite uma palavra: ");
        x = sc.next();
        System.out.println("Você digitou: " + x);

        int y;
        System.out.print("Digite um número inteiro: ");
        y = sc.nextInt();
        System.out.println("Você digitou: " + y);

        double z;
        System.out.print("Digite um número real: ");
        z = sc.nextDouble();
        System.out.println("Você digitou: " + z);

        String s;
        sc.nextLine();
        System.out.print("Digite uma frase: ");
        s = sc.nextLine();
        System.out.println("Você digitou: " + s);

        sc.close();
    }

}
