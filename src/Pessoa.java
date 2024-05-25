public class Produto {

    String nome;
    double preco;
    double descontoParaPix;



    double pegaPrecoFinal(boolean pagamentoViaPix) {
        if (pagamentoViaPix == true) {
            return preco - descontoParaPix;
        } else {
            return preco;
        }
    }
    public static void main(String[] args) {
        Produto meuProduto = new Produto();

        meuProduto.preco = 100;
        meuProduto.descontoParaPix = 10 ;
        meuProduto.pegaPrecoFinal(true);
        System.out.println(meuProduto.pegaPrecoFinal(true));
    }
}

