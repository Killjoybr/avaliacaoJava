package questão03;

public class TesteData {
    static Data aniversario = new Data(4, 1, 2021);
    static Data date = new Data(14, 5, 2024);

    public static void main(String[] args) {
        String data1 = aniversario.displayData();
        String data2 = date.displayData();

        System.out.println("Data 1: " + data1);
        System.out.println("Data 2: " + data2);
    }
}
