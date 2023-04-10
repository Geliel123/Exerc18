import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com o tamanho do arquivo: ");
        double TamanhoArquivo = teclado.nextDouble();

        System.out.println("Digite a velocidade da internet: ");
        double VelicidadeInternet = teclado.nextDouble();

        double Tempo = TamanhoArquivo / VelicidadeInternet;

        System.out.println("Tempo de download é:" + Tempo);

    }

}
