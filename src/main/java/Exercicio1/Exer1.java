package Exercicio1;

public class Exer1 {


    public static void main(String[] args) {


        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario();

        funcionario1.nome = "Paulo";
        funcionario1.idade = 30;
        funcionario1.salario = 100;
        funcionario1.sexo = "Masculino";

        funcionario2.nome = "Renata";
        funcionario2.idade = 50;
        funcionario2.salario = 1000000;
        funcionario2.sexo = "Feminino";

        funcionario3.nome = "Lucas";
        funcionario3.idade = 18;
        funcionario3.salario = 500000;
        funcionario3.sexo = "Masculino";

        imprimir(funcionario1);
        imprimir(funcionario2);
        imprimir(funcionario3);

    }

    public static void imprimir(Funcionario funcionario) {
        if (funcionario.idade >= 18 && funcionario.salario >= 1000.50) {
            System.out.println("Nome é " + funcionario.nome);
            System.out.println("Idade é " + funcionario.idade);
            System.out.println("Salário é " + funcionario.salario);
            System.out.println("Sexo é " + funcionario.sexo);
        }
    }
}



