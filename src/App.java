
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        double a, b;
        
        System.out.println("Digite o quanto você ganha por hora");
        a = entrada.nextDouble();
        System.out.println("Digite o numero de horas trabalhadas no mês");
        b = entrada.nextDouble();
        double c;
        c= a * b;

        System.out.println("O seu salario é de: " + c);
        


    }
}
