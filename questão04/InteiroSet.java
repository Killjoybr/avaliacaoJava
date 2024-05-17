package questão04;


public class InteiroSet {
    boolean[] conjunto = new boolean[101];
    
    public InteiroSet() {
        for (int i = 0; i < conjunto.length; i++) {
            conjunto[i] = false; // Inicializando o conjunto com numeros fora do conjunto
        }
    }

    public boolean[] union(boolean[] conjunto1, boolean[] conjunto2){
        boolean[] conjuntoUniao = new boolean[101];
        for (int i = 0; i < conjuntoUniao.length; i++) {
            conjuntoUniao[i] = (conjunto1[i] || conjunto2[i]) ? true : false; // Utilizando operador ternario para verificar se pertence a uniao ou nao
        }
        return conjuntoUniao;
    }

    public boolean[] interseccao(boolean[] conjunto1, boolean[] conjunto2){
        boolean[] conjuntoInterseccao = new boolean[101];
        for (int i = 0; i < conjuntoInterseccao.length; i++) {
            conjuntoInterseccao[i] = (conjunto1[i] && conjunto2[i]) ? true : false; // Utilizando operador ternario para verificar se pertence a interseccao ou nao
        }
        return conjuntoInterseccao;
    }

    public void insereElemento(int elemento){
        conjunto[elemento] = true; // Marcando o elemento como pertencente ao conjunto
    }

    public void deleteElemento(int elemento){
        conjunto[elemento] = false; // Marcando o elemento como nao pertencente ao conjunto
    }

    public String toSetString(){
        String conjuntoString = "";
        for (int i = 0; i < conjunto.length; i++) {
            conjuntoString += (conjunto[i]) ? i + " " : "-"; // Utilizando operador ternario para verificar se pertence ao conjunto ou nao e assimilar espaco ou "-" a string
        }
        return conjuntoString;
    }

    public String ehIgualTo(boolean[] conjunto1, boolean[] conjunto2){
        for (int i = 0; i < conjunto1.length; i++) {
            if (conjunto1[i] != conjunto2[i]) {
                return "Nao eh igual"; // Se houver algum elemento diferente
            }
        }
        return "Eh igual"; // Se todos os elementos forem iguais
    }
}