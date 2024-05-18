# Avaliação Prática Java 
- 1. Crie  uma  classe  em  Java  chamada fatura  para  uma  loja  de suprimentos de informática. A classe deve conter quatro variáveis – o número (String), a descrição (String), a quantidade comprada de um item (int) e o preço por item (double). A classe deve ter um construtor e um método get e set para cada variável de instância. Além disso, forneça um método chamado getTotalFatura que calcula o valor da fatura e depois retorna o valor como um double. Se o valor não for positivo, ele deve ser configurado como 0. Se o preço por item não  for  positivo,  ele  deve  ser  configurado  como  0.0.  Escreva  um aplicativo de teste chamado FaturaTeste (em outro arquivo) que demonstra as capacidades da classe Fatura.

- 2. Crie uma classe em Java chamada Empregado que inclui três partes de  informações  como  variáveis  de  instância  –  nome  (String), sobrenome (String) e um salário mensal (double). A classe deve ter um construtor, métodos get e set para cada variável de instância. Escreva um aplicativo de teste chamado EmpregadoTeste que cria dois objetos Empregado e exibe o salário anula de cada objeto. Então dê a cada Empregado um aumento de 10% e exiba novamente o salário anual de cada Empregado.

- 3. Crie uma classe em Java chamada Data que inclui três informações como variáveis de instância – mês (int), dia (int) e ano (int). A classe deve ter métodos get e set para cada variável e um construtor que inicializa as variáveis e assume que os valores fornecidos são corretos. Forneça um método displayData que exibe o dia, o mês e o ano separados por barras normais ( / ). Escreva um aplicativo de teste chamado DataTeste que demonstra as capacidades da classe Data.

- 4.  Crie  uma  classe  em  Java  chamada InteiroSet.  Cada  objeto InteiroSet pode armazenar inteiros no intervalo de 0 a 100. O conjunto é representado por um array de booleans. O elemento do array a[i] é true se o inteiro i estiver no conjunto. O elemento do array a[j] é false se o inteiro não estiver no conjunto. O construtor sem argumento inicializa o array Java como ‘conjunto vazio’ (todos os valores false). Forneça os seguintes métodos: 
    - Método union cria um terceiro conjunto que é a união teórica de dois conjuntos existentes (isto é, aplicação da função lógica OU 
    sobre os conjuntos e retorna o valor lógico true ou false);

    - Método intersecção cria um terceiro conjunto que é a intersecção teórica de dois conjuntos existentes (isto é, aplicação da função lógica AND sobre os conjuntos e retorna o valor lógico true ou false);
    
    - Método insereElemento insere um novo elemento inteiro k em um conjunto (configurando a[k] como true);

    - Método deleteElemento exclui o inteiro m (configurando a[m] como false).

    - Método toSetString retorna uma string contendo um conjunto como uma lista de números separados por espaço. Inclua somente os elementos que estão presentes no conjunto. Utilize – para representar um conjunto vazio;
    
    - Método ehIgualTo determina se dois conjuntos são iguais;
