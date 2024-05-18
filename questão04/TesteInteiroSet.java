package questão04;

public class TesteInteiroSet {
    
    public static void main(String[] args) {
        InteiroSet conjuntoVazio = new InteiroSet();
        InteiroSet conjunto1 = new InteiroSet();
        conjunto1.insereElemento(0);
        conjunto1.insereElemento(100);

        System.out.println("Conjunto vazio: " + conjuntoVazio.toSetString());
        System.out.println("Conjunto 1: " + conjunto1.toSetString());

        System.out.println("Uniao: " + conjunto1.toSetString());
    }
}
