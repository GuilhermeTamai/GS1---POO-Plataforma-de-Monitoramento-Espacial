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
   
   `SistemaMonitoramento.java`

6. Use o menu interativo para navegar pelas opções disponíveis:
- **1** → Verificar sensores  
- **2** → Controlar propulsão  
- **3** → Dados da missão  
- **4** → Simular alerta combustível  
- **5** → Exibir status completo  
- **0** → Encerrar sistema

## 🔑 Senha de acesso
Para visualizar as coordenadas da missão, utilize a senha:

`space123`

---

## 🖥️ Interface do Sistema

A interface do sistema foi desenvolvida para ser **simples, intuitiva e totalmente interativa via terminal**, permitindo ao usuário navegar entre as opções e visualizar os resultados em tempo real.

### 🧩 Menu Principal
![Menu Principal](imagens/menuPOO.png)

O menu apresenta todas as opções disponíveis para interação com o sistema:
- **1** → Verificar sensores  
- **2** → Controlar propulsão  
- **3** → Dados da missão  
- **4** → Simular alerta combustível  
- **5** → Exibir status completo  
- **0** → Encerrar sistema  

---

### 📊 Demonstração das Funcionalidades

#### 1️⃣ Verificar Sensores
![Escolha 1](imagens/escolha1.png)

#### 2️⃣ Controlar Propulsão
![Escolha 2](imagens/escolha2.png)

##### ⚠️ Tentativa incorreta
![Erro Propulsão](imagens/escolha2incorreta.png)

#### 3️⃣ Dados da Missão
![Escolha 3](imagens/escolha3.png)

##### 🔒 Senha incorreta
![Erro Senha](imagens/escolha3senhaincorreta.png)

#### 4️⃣ Simular Alerta de Combustível
![Escolha 4](imagens/escolha4.png)

#### 5️⃣ Exibir Status Completo
![Escolha 5](imagens/escolha5.png)

### 💡 Observação
Os prints acima demonstram o funcionamento real do sistema, incluindo **validações de entrada** e **tratamento de erros**, garantindo uma experiência completa e segura para o usuário.
