import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassificacaoCriminosa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> perguntas = new ArrayList<>();
        
        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");
        
        int respostasPositivas = 0;
        
        for (String pergunta : perguntas) {
            System.out.println(pergunta + " (Responda 'sim' ou 'não'): ");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("sim")) {
                respostasPositivas++;
            }
        }
        scanner.close();
        
        String classificacao;
        if (respostasPositivas == 2) {
            classificacao = "Suspeita";
        } else if (respostasPositivas >= 3 && respostasPositivas <= 4) {
            classificacao = "Cúmplice";
        } else if (respostasPositivas == 5) {
            classificacao = "Assassino";
        } else {
            classificacao = "Inocente";
        }
        
        System.out.println("Classificação: " + classificacao);
    }
}

