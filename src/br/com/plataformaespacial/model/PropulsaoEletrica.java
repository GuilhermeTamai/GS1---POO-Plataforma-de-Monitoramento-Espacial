package br.com.plataformaespacial.model;

// Propulsão elétrica que herda SistemaPropulsao
public class PropulsaoEletrica extends SistemaPropulsao {

    private double consumoEnergia;

    public PropulsaoEletrica(String nome, double consumoEnergia) {
        super(nome);
        this.consumoEnergia = consumoEnergia;
    }

    @Override
    public void acelerar() {
        System.out.println("\nPropulsão Elétrica acelerando com " + potencia + "% de potência.");
    }

    @Override
    public double calcularEmpuxo() {
        return potencia * 100; // cálculo específico para propulsão elétrica
    }
}
