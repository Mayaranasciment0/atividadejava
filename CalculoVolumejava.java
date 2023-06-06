
import java.util.Scanner;
//aluna mayara Wyrla N. da silva//
public class CalculoVolumejava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do { //menu//
            System.out.println("Menu de Opções");
            System.out.println("1. Calcular volume do Cubo");
            System.out.println("2. Calcular volume do Paralelepípedo");
            System.out.println("0. Sair");
            System.out.print("Escolha a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: //volume do cubo//
                    System.out.print("Digite o lado do cubo: ");
                    double ladoCubo = scanner.nextDouble();
                    double volumeCubo = calcularVolumeCubo(ladoCubo);
                    System.out.println("O volume do cubo é: " + volumeCubo);
                    break;
                case 2: //volume do paralelepípedo//
                    System.out.println("Digite as dimensões do paralelepípedo: largura, altura e comprimento");
                    System.out.print("Digite a largura do paralelepípedo: ");
                    double largura = scanner.nextDouble();
                    System.out.print("Digite a altura do paralelepípedo: ");
                    double altura = scanner.nextDouble();
                    System.out.print("Digite o comprimento do paralelepípedo: ");
                    double comprimento = scanner.nextDouble();
                    double volumeParalelepipedo = calcularVolumeParalelepipedo(largura, altura, comprimento);
                    System.out.println("O volume do paralelepípedo é: " + volumeParalelepipedo);
                    break;
                case 0: //sair do programada//
                    System.out.println("Encerrando o programa.");
                    break;
                default: //invalidar caso não seja as opções 1,2 ou 0//
                    System.out.println("Opção inválida.");
                    break;
            }

            System.out.println(); // Linha em branco para separar as execuções
        } while (opcao != 0);
    }

    public static double calcularVolumeCubo(double lado) {
        double volume = Math.pow(lado, 3);
        return volume;
    }

    public static double calcularVolumeParalelepipedo(double largura, double altura, double comprimento) {
        double volume = largura * altura * comprimento;
        return volume;
    }
}