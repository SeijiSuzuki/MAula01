package one.digitalinnovation.basecamp;

public class Emprestimo {
    public void calcularEmprestimo(double valorEmprestimo, double jurosEmprestimo, int parcelasEmprestimo){
        double emprestimoTotal = valorEmprestimo;

        Calculadora calculadora = new Calculadora();

        for(int i = 1; i <= parcelasEmprestimo; i++){
            emprestimoTotal += calculadora.multiplicacao(valorEmprestimo, jurosEmprestimo);
            System.out.println(emprestimoTotal);
        }
    }
}
