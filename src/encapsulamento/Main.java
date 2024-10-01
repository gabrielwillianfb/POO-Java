package encapsulamento;

public class Main {
    public static void main(String[] args) {
        ProdutoValidacao lapis = new ProdutoValidacao("Lapis", 13, 22);
        System.out.println("O produto sairá por: R$" + lapis.aplicarDesconto(50) + " com desconto!");
    }
}
