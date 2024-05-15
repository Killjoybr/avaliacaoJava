public class fatura {
    String numero;
    String descricao;
    int qtdComprada;
    double precoPorItem;
    
    public fatura(String numero, String descricao, int qtdComprada, double precoPorItem) {
        this.numero = numero;
        this.descricao = descricao;
        this.qtdComprada = qtdComprada;
        this.precoPorItem = precoPorItem;
    }

    public double getTotalFatura(){
        double valor;

        if (precoPorItem < 0) {
            precoPorItem = 0.0;
        }

        valor = (precoPorItem * qtdComprada) < 0 ? 0.0 : precoPorItem * qtdComprada;

        return valor;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdComprada() {
        return qtdComprada;
    }

    public void setQtdComprada(int qtdComprada) {
        this.qtdComprada = qtdComprada;
    }

    public double getPrecoPorItem() {
        return precoPorItem;
    }

    public void setPrecoPorItem(double precoPorItem) {
        this.precoPorItem = precoPorItem;
    }

    
    
}