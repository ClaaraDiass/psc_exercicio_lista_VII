import java.util.ArrayList;
import java.util.Scanner;

public class CalculadoraSalarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> vendasBrutas = new ArrayList<>();
        
        System.out.println("Digite as vendas brutas de cada vendedor (digite -1 para encerrar):");
        double vendaBruta = scanner.nextDouble();
        while (vendaBruta != -1) {
            vendasBrutas.add(vendaBruta);
            vendaBruta = scanner.nextDouble();
        }
        
        int[] faixasSalariais = new int[9];
        for (double venda : vendasBrutas) {
            double salario = 200 + (0.09 * venda);
            if (salario >= 200 && salario <= 299) {
                faixasSalariais[0]++;
            } else if (salario >= 300 && salario <= 399) {
                faixasSalariais[1]++;
            } else if (salario >= 400 && salario <= 499) {
                faixasSalariais[2]++;
            } else if (salario >= 500 && salario <= 599) {
                faixasSalariais[3]++;
            } else if (salario >= 600 && salario <= 699) {
                faixasSalariais[4]++;
            } else if (salario >= 700 && salario <= 799) {
                faixasSalariais[5]++;
            } else if (salario >= 800 && salario <= 899) {
                faixasSalariais[6]++;
            } else if (salario >= 900 && salario <= 999) {
                faixasSalariais[7]++;
            } else {
                faixasSalariais[8]++;
            }
        }

        int inicioFaixa = 200;
        for (int i = 0; i < faixasSalariais.length; i++) {
            int fimFaixa = inicioFaixa + 99;
            if (i == faixasSalariais.length - 1) {
                fimFaixa = 1000;
            }
            System.out.println("$" + inicioFaixa + " - $" + fimFaixa + ": " + faixasSalariais[i] + " vendedores");
            inicioFaixa += 100;
        }
        scanner.close();
    }
}
