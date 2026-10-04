package questao3;

public class TesteProduto {
    public static void main(String[] args) {
        Produto produto = new Produto(1, "Teclado", 89.90, 15);
        produto.exibirInfo();

        System.out.println("\nTentando definir um preço negativo...");
        produto.setPreco(-10);

        System.out.println("\nAlterando o preço para 79,90...");
        produto.setPreco(79.90);
        produto.exibirInfo();
    }
}
