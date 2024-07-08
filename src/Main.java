public class Main {
    public static void main(String[] args) {

        BuscadorDeCep consultaCep = new BuscadorDeCep();

        Endereco novoEndereco = consultaCep.buscarCep("01001000");
        System.out.println(novoEndereco);
    }
}