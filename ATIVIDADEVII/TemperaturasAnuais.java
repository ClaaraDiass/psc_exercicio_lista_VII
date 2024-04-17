import java.util.ArrayList;
import java.util.Scanner;

public class TemperaturasAnuais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> temperaturas = new ArrayList<>();
        
        for (int i = 1; i <= 12; i++) {
            System.out.print("Digite a temperatura média do mês " + i + ": ");
            double temperatura = scanner.nextDouble();
            temperaturas.add(temperatura);
        }
        
        double soma = 0;
        for (double temperatura : temperaturas) {
            soma += temperatura;
        }
        double mediaAnual = soma / 12;
        
        System.out.println("Temperaturas acima da média anual:");
        for (int i = 0; i < temperaturas.size(); i++) {
            if (temperaturas.get(i) > mediaAnual) {
                String mes = obterNomeMes(i + 1);
                System.out.println("Mês: " + mes + " - Temperatura: " + temperaturas.get(i));
            }
        }
        scanner.close();
    }
    
    public static String obterNomeMes(int numeroMes) {
        switch (numeroMes) {
            case 1: return "Janeiro";
            case 2: return "Fevereiro";
            case 3: return "Março";
            case 4: return "Abril";
            case 5: return "Maio";
            case 6: return "Junho";
            case 7: return "Julho";
            case 8: return "Agosto";
            case 9: return "Setembro";
            case 10: return "Outubro";
            case 11: return "Novembro";
            case 12: return "Dezembro";
            default: return "Mês inválido";
        }
    }
}