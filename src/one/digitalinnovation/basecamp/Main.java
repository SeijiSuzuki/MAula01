package one.digitalinnovation.basecamp;

public class Main {
    public static void main(String[] args) {

//        Métodos da classe Calculadora;
        Calculadora calculadora = new Calculadora();

        double soma = calculadora.soma(5, 5);
        System.out.println(soma);

        double subtracao = calculadora.subtracao(15, 5);
        System.out.println(subtracao);

        double multiplicacao = calculadora.multiplicacao(10, 6);
        System.out.println(multiplicacao);

        double divisao = calculadora.divisao(25, 8);
        System.out.println(divisao);

//        Método da classe Emprestimo;
        Emprestimo emprestimo = new Emprestimo();

        emprestimo.calcularEmprestimo(1000, 0.12, 12);

//        Métodos da classe Mensagem;
        Mensagem mensagem = new Mensagem();

        mensagem.verificarHora(8);
        mensagem.verificarHora(15);
        mensagem.verificarHora(22);
    }
}
