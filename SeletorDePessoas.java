import java.util.Scanner;

public class SeletorDePessoas {
    public static void main(String[] args) {
        int sexo = 0, contagemMulheres = 0, contagemHomens = 0;
        float altura, somaAlturaHomens = 0, mediaAlturaHomens = 0, maiorAltura = 0, menorAltura = Float.MAX_VALUE;
        
        try (Scanner input = new Scanner(System.in)) {
            for(int i = 0; i < 10; i++){
                System.out.println("Escolha o sexo: 1 - Masculino, 2 - Feminino");
                sexo = input.nextInt();
                System.out.println("Qual a altura?");
                altura = input.nextFloat();

                if(sexo == 1){
                    contagemHomens++;
                    somaAlturaHomens += altura;
                } else if(sexo ==2){
                    contagemMulheres++;
                }
                if(altura > maiorAltura){
                    maiorAltura = altura;
                } else if(altura < menorAltura || menorAltura == 0){
                    menorAltura = altura;
                }
            }
        }

        System.out.println("A maior altura é " + maiorAltura);
        System.out.println("A menor altura é " + menorAltura);
        mediaAlturaHomens = somaAlturaHomens / contagemHomens;
        System.out.println("A média de altura dos homens é " + mediaAlturaHomens);
        System.out.println("A quantidade de mulheres é " + contagemMulheres);    }
} 
