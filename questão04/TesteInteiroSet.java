package questão04;

import java.util.Arrays;

public class TesteInteiroSet {
    
    public static void main(String[] args) {
        InteiroSet conjuntoVazio = new InteiroSet();
        InteiroSet conjunto1 = new InteiroSet();
        conjunto1.insereElemento(0);
        conjunto1.insereElemento(100);
        boolean[] uniao = conjunto1.union(conjunto1.conjunto, conjuntoVazio.conjunto);
        boolean[] interseccao = conjunto1.interseccao(conjunto1.conjunto, conjuntoVazio.conjunto);

        System.out.println("Conjunto vazio: " + conjuntoVazio.toSetString());
        System.out.println("Conjunto 1: " + conjunto1.toSetString());

        System.out.println("Uniao: " + Arrays.toString(uniao));
        System.out.println("Uniao: " + Arrays.toString(interseccao));

        System.out.println("Conjunto 1 eh igual ao conjunto vazio? " + conjunto1.ehIgualTo(conjunto1.conjunto, conjuntoVazio.conjunto));
        System.out.println("Conjunto 1 eh igual ao conjunto 1? " + conjunto1.ehIgualTo(conjunto1.conjunto, conjunto1.conjunto));
    }
}
