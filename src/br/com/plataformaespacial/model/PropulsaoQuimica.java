package br.com.plataformaespacial.model;

// Propulsão química que herda SistemaPropulsao
public class PropulsaoQuimica extends SistemaPropulsao {

    private double combustivelConsumido;

    public PropulsaoQuimica(String nome, double combustivelConsumido) {
        super(nome);
        this.combustivelConsumido = combustivelConsumido;
    }

    @Override
    public void acelerar() {
        System.out.println("\nPropulsão Química acelerando com " + potencia + "% de potência.");
    }

    @Override
    public double calcularEmpuxo() {
        return potencia * 150; // cálculo específico para propulsão química
    }
}
