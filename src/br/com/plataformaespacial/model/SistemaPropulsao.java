package br.com.plataformaespacial.model;

// Classe abstrata para sistemas de propulsão
public abstract class SistemaPropulsao {

    protected String nome;
    protected boolean ligado;
    protected int potencia;

    public SistemaPropulsao(String nome) {
        this.nome = nome;
    }

    public void ligar() {
        ligado = true;
        System.out.println(nome + " ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println(nome + " desligado.");
    }

    // Setter com validação
    public void setPotencia(int potencia) {
        if (potencia >= 0 && potencia <= 100) {
            this.potencia = potencia;
        } else {
            System.out.println("Potência inválida!");
        }
    }

    // Métodos abstratos que cada tipo de propulsão deve implementar
    public abstract void acelerar();
    public abstract double calcularEmpuxo();
}
