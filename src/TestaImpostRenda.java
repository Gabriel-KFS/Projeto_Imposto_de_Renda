import java.util.Scanner;
public class TestaImpostRenda {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ImpostoRenda Calculo = new ImpostoRenda();

        System.out.println("Digite o nome do funcionario: ");
        Calculo.setNome(leia.next());
        System.out.println("Digite a faixa salarial do funcionario: ");
        Calculo.setSalario(leia.nextDouble());


        System.out.println("O funcionario: " + Calculo.getNome());
        System.out.println("Obtem o salario de: " + Calculo.getSalario());
        Calculo.impostoRenda();
        Calculo.sobra();



    }
}
