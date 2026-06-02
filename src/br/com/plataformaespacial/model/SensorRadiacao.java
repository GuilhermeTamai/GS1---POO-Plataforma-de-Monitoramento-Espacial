package br.com.plataformaespacial.model;

import java.util.Random;

// Sensor de radiação que herda ComponenteEspacial e implementa Sensor
public class SensorRadiacao extends ComponenteEspacial implements Sensor {

    private double limite; // limite de alerta

    public SensorRadiacao(int id, String nome, double limite) {
        super(id, nome);
        this.limite = limite;
    }

    @Override
    public double lerValor() {
        Random random = new Random();
        return random.nextDouble() * 500; // valor aleatório
    }

    @Override
    public boolean verificarFuncionamento() {
        return status;
    }

    @Override
    public String retornarTipo() {
        return "Sensor de Radiação";
    }

    @Override
    public void exibirStatus() {
        double valor = lerValor();
        System.out.println("\n--- SENSOR RADIAÇÃO ---");
        System.out.println("Valor atual: " + valor);

        if (valor > limite) {
            System.out.println("CRÍTICO - Radiação perigosa!");
        } else {
            System.out.println("Radiação em nível seguro.");
        }
    }
}
