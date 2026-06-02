package br.com.plataformaespacial.model;

import java.util.Random;

// Sensor de temperatura que herda ComponenteEspacial e implementa Sensor
public class SensorTemperatura extends ComponenteEspacial implements Sensor {

    private double limite; // limite de alerta

    public SensorTemperatura(int id, String nome, double limite) {
        super(id, nome);
        this.limite = limite;
    }

    @Override
    public double lerValor() {
        Random random = new Random();
        temperatura = 20 + random.nextDouble() * 120; // valor aleatório
        return temperatura;
    }

    @Override
    public boolean verificarFuncionamento() {
        return status;
    }

    @Override
    public String retornarTipo() {
        return "Sensor de Temperatura";
    }

    @Override
    public void exibirStatus() {
        double valor = lerValor();
        System.out.println("\n--- SENSOR TEMPERATURA ---");
        System.out.println("Nome: " + nome);
        System.out.println("Valor atual: " + valor);
        verificarAlerta(valor);
    }

    // Método privado para verificar alertas
    private void verificarAlerta(double valor) {
        if (valor >= limite + 40) {
            System.out.println("CRÍTICO - Temperatura extremamente alta!");
        } else if (valor >= limite + 20) {
            System.out.println("ALERTA - Temperatura acima do limite!");
        } else if (valor >= limite) {
            System.out.println("ATENÇÃO - Temperatura elevada!");
        } else {
            System.out.println("Temperatura normal.");
        }
    }
}
