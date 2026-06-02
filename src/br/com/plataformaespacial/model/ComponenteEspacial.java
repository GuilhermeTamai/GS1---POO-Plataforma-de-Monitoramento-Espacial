package br.com.plataformaespacial.model;

// Classe abstrata que serve como molde para os componentes espaciais
public abstract class ComponenteEspacial {

    // Atributos comuns a todos os componentes
    protected int id;
    protected String nome;
    protected boolean status;
    protected double temperatura;

    // Construtor
    public ComponenteEspacial(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.status = false; // começa desligado
        this.temperatura = 0;
    }

    // Método concreto para ligar o componente
    public void ligar() {
        status = true;
        System.out.println(nome + " ligado.");
    }

    // Método concreto para desligar o componente
    public void desligar() {
        status = false;
        System.out.println(nome + " desligado.");
    }

    // Método abstrato: cada componente define como exibir seu status
    public abstract void exibirStatus();

    @Override
    public String toString() {
        return "\nID: " + id +
               "\nNome: " + nome +
               "\nStatus: " + status;
    }
}
