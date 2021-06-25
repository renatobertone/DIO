package desenvolvimentoBasicoJava.EncapsulamentoHerancaPolimorfismo;

public class Funcionarios {

    private String gerente;
    private String supervisor;
    private String atendente;
    private double valorSalario;

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getAtendente(String atendente) {
        return atendente;
    }

    public void setAtendente(String atendente) {
        this.atendente = atendente;
    }

    public double getValorSalario() {
        return valorSalario;
    }

    public void setValorSalario(double valorSalario) {
        this.valorSalario = valorSalario;
    }

    public double calculaImposto() {
        return this.valorSalario * 0;

    }
}
