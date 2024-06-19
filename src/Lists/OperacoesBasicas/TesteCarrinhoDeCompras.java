package Lists.OperacoesBasicas;

public class TesteCarrinhoDeCompras {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        System.out.println(carrinhoDeCompras.calcularTotal());

        carrinhoDeCompras.adicionarItem("Controle", 8.0,1);
        carrinhoDeCompras.adicionarItem("Doce",2.0,3);

        carrinhoDeCompras.exibirItens();
        System.out.println(carrinhoDeCompras.calcularTotal());

        carrinhoDeCompras.removerItem("controle");
        carrinhoDeCompras.exibirItens();
        System.out.println(carrinhoDeCompras.calcularTotal());
    }
}
