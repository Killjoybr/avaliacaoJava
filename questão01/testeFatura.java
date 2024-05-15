public class testeFatura {
    static fatura fatura1 = new fatura("00091", "padaria", 12, 2.50);

    public static void main(String[] args) {
        System.out.println("Descricao: " + fatura1.getDescricao());
        System.out.println("Pedido: " + fatura1.getNumero());
        System.out.println( "Preco/item : " + fatura1.getPrecoPorItem());
        System.out.println("Qtd: " + fatura1.getQtdComprada());
        System.out.println("Total a pagar: " + fatura1.getTotalFatura());
    }
}
