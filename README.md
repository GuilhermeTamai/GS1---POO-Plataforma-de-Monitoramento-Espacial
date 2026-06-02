# 🚀 Plataforma Espacial

Projeto desenvolvido para a **Global Solution 2026** da disciplina de **Programação Orientada a Objetos (POO)**.  
O sistema simula o monitoramento de uma missão espacial, permitindo acompanhar sensores, controlar propulsão e verificar dados da missão em tempo real.

---

## 👨‍💻 Integrantes
- **Caio Castelão Carminato** — RM563630  
- **Guilherme Vasques Tamai** — RM563276  
- **Vitor Komura de Freitas** — RM563694  

---

## 📚 Conceitos de POO aplicados
- **Classe Abstrata**: `ComponenteEspacial` e `SistemaPropulsao`  
- **Interface**: `Sensor` implementada em três sensores diferentes  
- **Encapsulamento**: `DadosMissao` com atributos privados e validação  
- **Herança**: `PropulsaoQuimica` e `PropulsaoEletrica` herdando de `SistemaPropulsao`  
- **Polimorfismo**: lista de sensores tratada de forma uniforme  
- **Sobrescrita de métodos**: comportamento específico em cada tipo de propulsão e sensor  

---

## ⚙️ Funcionalidades
- Monitoramento de sensores espaciais com alertas automáticos  
- Controle de propulsão (química e elétrica)  
- Gerenciamento de dados da missão com acesso protegido por senha  
- Menu interativo no terminal para simulação  
- Sistema de alertas com diferentes níveis (ATENÇÃO, ALERTA, CRÍTICO)  

---

## 🛠️ Tecnologias
- **Java**  
- **Programação Orientada a Objetos (POO)**  
- **Eclipse IDE** para desenvolvimento e execução  

---

## 🚀 Como executar
1. Clone o repositório:
   git clone https://github.com/GuilhermeTamai/GS1---POO-Plataforma-de-Monitoramento-Espacial.git

2. Importe o projeto no **Eclipse IDE**

3. Certifique-se de que os pacotes estejam organizados:
   - `br.com.plataformaespacial.model` → classes de modelo  
   - `br.com.plataformaespacial.main` → classe principal `SistemaMonitoramento`

4. Execute a classe principal:
   'SistemaMonitoramento.java'

5. Use o menu interativo para navegar pelas opções disponíveis:
- **1** → Verificar sensores  
- **2** → Controlar propulsão  
- **3** → Dados da missão  
- **4** → Simular alerta combustível  
- **5** → Exibir status completo  
- **0** → Encerrar sistema

## 🔑 Senha de acesso
Para visualizar as coordenadas da missão, utilize a senha:
  'space123'
