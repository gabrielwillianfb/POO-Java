package oito;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Gerente("João", 10000));
        funcionarios.add(new Desenvolvedor("Pedro", 8000));
        funcionarios.add(new Estagiario("Gabriel", 1000));
        funcionarios.add(new Desenvolvedor("Amanda", 4000));
        System.out.println("Folha de Pagamento de Agosto");
        calcularFolhaPagamento(funcionarios);
        funcionarios.set(2, funcionarios.get(2).promover(6000));
        System.out.println("Folha de Pagamento de Setembro");
        calcularFolhaPagamento(funcionarios);
    }

    public static void calcularFolhaPagamento(ArrayList<Funcionario> funcionarios) {
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getName() + " recebe: " +
                    funcionario.calcularSalario() + ". Salario Base: " +
                    funcionario.getSalario() + ", Bonus: " +
                    funcionario.getBonus() + " ."
            );
        }
        System.out.println();
    }
}
