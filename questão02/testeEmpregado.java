package questão02;

public class testeEmpregado {
    static empregado empregado1 = new empregado("Joao", "Silva", 1500.0);
    static empregado empregado2 = new empregado("Carlos", "Chandretti", 6570.0);
    
    public static void main(String[] args) {
        System.out.println(empregado1.getNome() + " recebe: R$" + empregado1.getSalarioMensal());
        System.out.println(empregado2.getNome() + " recebe: R$" + empregado2.getSalarioMensal());

        empregado1.aumentarSalario(10);
        empregado2.aumentarSalario(10);

        System.out.println(empregado1.getNome() + " apos o aumento de 10% recebe: R$" + empregado1.getSalarioMensal());
        System.out.println(empregado2.getNome() + " apos o aumento de 10% recebe: R$" + empregado2.getSalarioMensal());
    }
}
