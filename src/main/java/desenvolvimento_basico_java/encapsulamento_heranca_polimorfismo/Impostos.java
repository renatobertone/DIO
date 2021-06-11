package desenvolvimento_basico_java.encapsulamento_heranca_polimorfismo;

public class Impostos {

    public static void main(String[] args) {


/*        Funcionarios generico = new Funcionarios();
        generico.setValorSalario(1000.0);
        System.out.println(generico.calculaImposto());
*/

        Funcionarios gerente = new Gerente();
        gerente.setValorSalario(2000.0);
        System.out.println("Valor de imposto pago pelo gerente: R$" + gerente.calculaImposto());

        Funcionarios supervisor = new Supervisor();
        supervisor.setValorSalario(1500.0);
        System.out.println("Valor de imposto pago pelo supervisor: R$" + supervisor.calculaImposto());

        Funcionarios atendente = new Atendente();
        atendente.setValorSalario(1100.0);
        System.out.println("Valor de imposto pago pelo atendente: R$" + atendente.calculaImposto());

    }
}
