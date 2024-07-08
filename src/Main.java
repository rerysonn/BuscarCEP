import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        BuscadorDeCep consultaCep = new BuscadorDeCep();

        System.out.print("Digite o cep que deseja a consulta: ");
        String cep = leitura.nextLine();

        try {
            Endereco novoEndereco = consultaCep.buscarCep(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEndereco);

        }catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando Aplicação...");
        }
    }
}