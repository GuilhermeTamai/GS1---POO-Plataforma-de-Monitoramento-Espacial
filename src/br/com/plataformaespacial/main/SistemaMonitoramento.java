package br.com.plataformaespacial.main;

import br.com.plataformaespacial.model.*;
import java.util.ArrayList;
import java.util.Scanner;

// Classe principal que contém o menu interativo
public class SistemaMonitoramento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instanciando sensores
        SensorTemperatura temp = new SensorTemperatura(1, "Temp-X1", 80);
        SensorPressao pressao = new SensorPressao(2, "Press-X1", 180);
        SensorRadiacao radiacao = new SensorRadiacao(3, "Rad-X1", 300);

        // Lista polimórfica de sensores
        ArrayList<Sensor> sensores = new ArrayList<>();
        sensores.add(temp);
        sensores.add(pressao);
        sensores.add(radiacao);

        // Liga sensores
        temp.ligar();
        pressao.ligar();
        radiacao.ligar();

        // Instanciando propulsão
        PropulsaoQuimica quimica = new PropulsaoQuimica("Motor Químico", 15);
        PropulsaoEletrica eletrica = new PropulsaoEletrica("Motor Elétrico", 8);

        // Dados da missão
        DadosMissao dados = new DadosMissao("SETOR-ALPHA", 65, "Órbita Lunar", 5);

        int opcao;
        do {
            // Menu principal
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Verificar sensores");
            System.out.println("2 - Controlar propulsão");
            System.out.println("3 - Dados da missão");
            System.out.println("4 - Simular alerta combustível");
            System.out.println("5 - Exibir status completo");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Exibe status dos sensores
                    for (Sensor sensor : sensores) {
                        System.out.println("\nTipo: " + sensor.retornarTipo());
                        ((ComponenteEspacial) sensor).exibirStatus();
                    }
                    break;

                case 2:
                    // Controle da propulsão
                    System.out.print("Potência do motor (0-100): ");
                    int potencia = scanner.nextInt();

                    quimica.setPotencia(potencia);
                    eletrica.setPotencia(potencia);

                    quimica.ligar();
                    quimica.acelerar();
                    System.out.println("Empuxo Químico: " + quimica.calcularEmpuxo());

                    eletrica.ligar();
                    eletrica.acelerar();
                    System.out.println("Empuxo Elétrico: " + eletrica.calcularEmpuxo());
                    break;

                case 3:
                    // Exibe dados da missão
                    dados.exibirDados();
                    scanner.nextLine(); // limpar buffer
                    System.out.print("Digite a senha: ");
                    String senha = scanner.nextLine();
                    System.out.println("Coordenadas: " + dados.getCoordenadas(senha));
                    break;

                case 4:
                    // Simula alerta de combustível
                    dados.setCombustivel(10);
                    break;

                case 5:
                    // Exibe status completo
                    for (Sensor sensor : sensores) {
                        System.out.println("\nTipo: " + sensor.retornarTipo());
                        ((ComponenteEspacial) sensor).exibirStatus();
                    }
                    System.out.println(temp);
                    dados.exibirDados();
                    break;

                case 0:
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
