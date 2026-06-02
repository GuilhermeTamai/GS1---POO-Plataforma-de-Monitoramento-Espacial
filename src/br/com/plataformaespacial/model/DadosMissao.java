package br.com.plataformaespacial.model;

// Classe que encapsula os dados da missão espacial
public class DadosMissao {

    private String coordenadas;
    private double combustivel;
    private String trajetoria;
    private int tripulantes;

    private final String senha = "space123"; // senha para acesso restrito

    public DadosMissao(String coordenadas, double combustivel, String trajetoria, int tripulantes) {
        this.coordenadas = coordenadas;
        setCombustivel(combustivel); // usa setter para validar
        this.trajetoria = trajetoria;
        this.tripulantes = tripulantes;
    }

    // Getter protegido por senha
    public String getCoordenadas(String senhaDigitada) {
        if (senha.equals(senhaDigitada)) {
            return coordenadas;
        }
        return "Acesso negado!";
    }

    // Setter com validação
    public void setCombustivel(double combustivel) {
        if (combustivel >= 0 && combustivel <= 100) {
            this.combustivel = combustivel;
            if (combustivel < 20) {
                System.out.println("ALERTA - Combustível abaixo de 20%!");
            }
        } else {
            System.out.println("Valor inválido para combustível!");
        }
    }

    public double getCombustivel() {
        return combustivel;
    }

    // Exibe dados gerais da missão
    public void exibirDados() {
        System.out.println("\n--- DADOS DA MISSÃO ---");
        System.out.println("Trajetória: " + trajetoria);
        System.out.println("Tripulantes: " + tripulantes);
        System.out.println("Combustível: " + combustivel + "%");
    }
}
