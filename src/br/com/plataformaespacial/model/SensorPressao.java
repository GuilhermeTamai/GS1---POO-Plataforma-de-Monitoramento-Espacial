package br.com.plataformaespacial.model;

import java.util.Random;

// Sensor de pressão que herda ComponenteEspacial e implementa Sensor
public class SensorPressao extends ComponenteEspacial implements Sensor {

    private double limite; // limite de alerta

    public SensorPressao(int id, String nome, double limite) {
        super(id, nome);
        this.limite = limite;
    }

    @Override
    public double lerValor() {
        Random random = new Random();
        return 50 + random.nextDouble() * 200; // valor aleatório
    }

    @Override
    public boolean verificarFuncionamento() {
        return status;
    }

    @Override
    public String retornarTipo() {
        return "Sensor de Pressão";
    }

    @Override
    public void exibirStatus() {
        double valor = lerValor();
        System.out.println("\n--- SENSOR PRESSÃO ---");
        System.out.println("Valor atual: " + valor);

        if (valor > limite) {
            System.out.println("ALERTA - Pressão acima do limite!");
        } else {
            System.out.println("Pressão normal.");
        }
    }
}
