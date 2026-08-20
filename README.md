# 🚍 Sistema de Passageiro — POO em Java

## 📋 Sobre o projeto

Este projeto foi desenvolvido como atividade acadêmica para praticar os principais conceitos de **Programação Orientada a Objetos (POO)** utilizando a linguagem **Java**.

A aplicação representa um sistema simples de gerenciamento de um passageiro. Por meio da classe `Passageiro`, é possível armazenar informações do passageiro e controlar o saldo disponível para a realização de viagens.

Além da criação da classe e de seus atributos, o projeto implementa métodos capazes de **alterar o estado do objeto**, seguindo regras de negócio e validações para evitar operações inválidas.

---

## 🎯 Objetivo da atividade

O objetivo principal do projeto é praticar:

* Criação de classes e objetos;
* Definição de atributos;
* Criação e implementação de métodos;
* Uso de construtores;
* Encapsulamento;
* Alteração do estado de objetos;
* Criação de regras de negócio;
* Validação de dados utilizando estruturas condicionais;
* Testes com valores válidos e inválidos;
* Versionamento do projeto utilizando Git e GitHub.

A atividade também solicita a implementação de, pelo menos, **dois métodos que alterem o estado de um objeto**, requisito atendido pelos métodos:

* `adicionarSaldo()`
* `pagarViagem()`

---

# 👤 Classe `Passageiro`

A classe `Passageiro` representa um passageiro e armazena as principais informações necessárias para realizar viagens.

## 📦 Atributos

| Atributo | Tipo     | Descrição                                         |
| -------- | -------- | ------------------------------------------------- |
| `nome`   | `String` | Armazena o nome do passageiro                     |
| `cpf`    | `String` | Armazena o CPF do passageiro                      |
| `saldo`  | `double` | Armazena o saldo disponível para realizar viagens |

### Exemplo da estrutura da classe

```java
public class Passageiro {

    private String nome;
    private String cpf;
    private double saldo;

    public Passageiro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = 0.0;
    }
}
```

Os atributos são declarados como `private`, aplicando o conceito de **encapsulamento**. Dessa forma, o estado do objeto é controlado pelos métodos da própria classe.

---

# ⚙️ Métodos implementados

## ➕ `adicionarSaldo(double valor)`

O método `adicionarSaldo()` é responsável por adicionar um valor ao saldo disponível do passageiro.

### Regra de negócio

O valor informado deve ser **maior que zero**.

Caso seja informado um valor igual ou menor que zero, a operação não deve ser realizada.

### Exemplo válido

```java
passageiro1.adicionarSaldo(30.0);
```

Após a execução, o saldo do passageiro será aumentado em **R$ 30,00**.

### Exemplo inválido

```java
passageiro1.adicionarSaldo(-10.0);
```

A operação deve ser bloqueada, pois não é permitido adicionar valores negativos ao saldo.

---

## 💳 `pagarViagem(double valor)`

O método `pagarViagem()` permite que o passageiro utilize o saldo disponível para pagar uma viagem.

### Regras de negócio

Para que o pagamento seja realizado corretamente:

1. O valor da viagem deve ser maior que zero;
2. O passageiro deve possuir saldo suficiente;
3. O saldo não pode ficar negativo após o pagamento.

### Exemplo válido

```java
passageiro1.pagarViagem(20.0);
```

Se o passageiro possuir saldo suficiente, o valor da viagem será descontado do saldo disponível.

### Exemplo inválido — valor negativo

```java
passageiro1.pagarViagem(-20.0);
```

A operação deve ser bloqueada, pois o valor da viagem não pode ser negativo.

### Exemplo inválido — saldo insuficiente

```java
passageiro1.pagarViagem(100.0);
```

Caso o passageiro não possua saldo suficiente, o pagamento não será realizado.

---

# 🔄 Alteração do estado do objeto

Os métodos implementados modificam diretamente o atributo `saldo`, alterando o estado do objeto `Passageiro`.

### Exemplo

```java
Passageiro passageiro1 = new Passageiro(
    "João",
    "123456789"
);
```

Inicialmente, o objeto é criado com:

```text
Nome: João
CPF: 123456789
Saldo: R$ 0,00
```

Após adicionar saldo:

```java
passageiro1.adicionarSaldo(50.0);
```

O estado do objeto é alterado para:

```text
Saldo: R$ 50,00
```

Após pagar uma viagem:

```java
passageiro1.pagarViagem(20.0);
```

O estado é alterado novamente:

```text
Saldo: R$ 30,00
```

Isso demonstra que os métodos `adicionarSaldo()` e `pagarViagem()` atendem ao requisito da atividade de **alterar o estado de pelo menos um atributo do objeto**.

---

# 🧪 Testes realizados

Foram realizados testes com valores válidos e inválidos para verificar o funcionamento das regras de negócio.

## ✅ Testes válidos

```java
Passageiro passageiro1 = new Passageiro(
    "João",
    "123456789"
);

passageiro1.adicionarSaldo(30.0);
passageiro1.pagarViagem(20.0);
```

### Resultado esperado

```text
Saldo inicial: R$ 0,00
Saldo após adicionar: R$ 30,00
Saldo após pagar a viagem: R$ 10,00
```

---

## ❌ Testes inválidos

### Adicionar valor negativo

```java
passageiro1.adicionarSaldo(-10.0);
```

### Adicionar valor igual a zero

```java
passageiro1.adicionarSaldo(0);
```

### Pagar viagem com valor negativo

```java
passageiro1.pagarViagem(-20.0);
```

### Pagar viagem sem saldo suficiente

```java
passageiro1.pagarViagem(100.0);
```

Esses testes garantem que o objeto `Passageiro` não entre em um estado inconsistente, evitando, por exemplo, valores inválidos ou saldo negativo.

---

# 🧠 Conceitos de POO praticados

Neste projeto foram utilizados os seguintes conceitos de **Programação Orientada a Objetos**:

### 🔹 Classes

A classe `Passageiro` funciona como um modelo para representar passageiros.

### 🔹 Objetos

Objetos são criados a partir da classe `Passageiro`.

Exemplo:

```java
Passageiro passageiro1 = new Passageiro(
    "João",
    "123456789"
);
```

### 🔹 Atributos

Representam as características e o estado do objeto:

```java
private String nome;
private String cpf;
private double saldo;
```

### 🔹 Métodos

Representam os comportamentos do objeto:

```java
adicionarSaldo()
pagarViagem()
```

### 🔹 Encapsulamento

Os atributos são protegidos com `private`, permitindo que alterações sejam realizadas de forma controlada por meio dos métodos da classe.

### 🔹 Construtor

O construtor é utilizado para inicializar o objeto `Passageiro` com nome e CPF.

### 🔹 Regras de negócio

As estruturas condicionais garantem que operações inválidas não sejam realizadas.

---

# 🗂️ Estrutura do projeto

```text
atividade-poo-metodos-comportamentos/
│
├── src/
│   ├── Passageiro.java
│   └── Main.java
│
├── .gitignore
├── README.md
└── POO_19_08.iml
```

---

# 💻 Tecnologias utilizadas

* ☕ Java
* 🧠 Programação Orientada a Objetos (POO)
* 📝 IntelliJ IDEA
* 🌿 Git
* 🐙 GitHub

---

# ▶️ Como executar o projeto

## Pré-requisitos

Para executar o projeto, é necessário possuir:

* Java instalado na máquina;
* Uma IDE compatível com Java, como o IntelliJ IDEA.

## Passo a passo

1. Clone o repositório:

```bash
git clone <URL_DO_REPOSITORIO>
```

2. Abra o projeto na sua IDE;

3. Localize a classe principal do projeto;

4. Execute o método `main()`.

---

# 📚 Aprendizados

Com o desenvolvimento desta atividade, foi possível praticar como métodos podem representar comportamentos de objetos e como eles podem modificar o estado de seus atributos.

O projeto também demonstra a importância da validação de dados e das regras de negócio para evitar situações inconsistentes, como:

* Adicionar valores negativos ao saldo;
* Realizar pagamentos com valores inválidos;
* Permitir que o saldo fique negativo;
* Efetuar pagamentos sem saldo suficiente.

---

# 👨‍💻 Autor

**João Dyonisio**

Estudante de **Ciência da Computação** e desenvolvedor em formação.

🐙 GitHub: [Joao-Dyonisio](https://github.com/Joao-Dyonisio)

---

# 📄 Licença

Este projeto foi desenvolvido para fins acadêmicos e educacionais.

---

⭐ Se este projeto foi útil para você, considere deixar uma estrela no repositório!
