import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        BuscadorDeCep consultaCep = new BuscadorDeCep();

        try {
            Endereco novoEndereco = consultaCep.buscarCep("01001000");
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEndereco);

        }catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando Aplicação...");
        }
    }
}