package br.com.plataformaespacial.model;

// Interface que define o contrato dos sensores
public interface Sensor {
    double lerValor();              // Método para ler o valor do sensor
    boolean verificarFuncionamento(); // Verifica se está ligado
    String retornarTipo();          // Retorna o tipo do sensor
}
