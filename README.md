Sistema de Passageiro
📋 Sobre o projeto

Este projeto foi desenvolvido para praticar conceitos de Programação Orientada a Objetos (POO) utilizando a linguagem Java.

A classe Passageiro representa um passageiro no mundo real, armazenando informações como nome, CPF e saldo disponível para realizar viagens.

Além dos atributos, a classe possui métodos que permitem adicionar saldo e pagar uma viagem, garantindo que regras de negócio sejam respeitadas.

👤 Classe Passageiro

A classe Passageiro possui os seguintes atributos:

nome: armazena o nome do passageiro.
cpf: armazena o CPF do passageiro.
saldo: armazena o saldo disponível para realizar viagens.
Exemplo da classe
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
⚙️ Métodos
➕ adicionarSaldo()

O método adicionarSaldo(double valor) permite adicionar dinheiro ao saldo do passageiro.

Regra de negócio

O valor adicionado deve ser maior que zero.

Caso seja informado um valor igual ou menor que zero, a operação não será realizada.

Exemplo
passageiro1.adicionarSaldo(30.0);

Nesse exemplo, serão adicionados R$ 30,00 ao saldo do passageiro.

Exemplo inválido
passageiro1.adicionarSaldo(-10.0);

A operação será bloqueada, pois não é permitido adicionar um valor negativo.

💳 pagarViagem()

O método pagarViagem(double valor) permite que o passageiro utilize seu saldo para pagar uma viagem.

Regras de negócio

Para realizar o pagamento:

O valor da viagem deve ser maior que zero.
O passageiro deve possuir saldo suficiente.

Essas validações impedem que o saldo fique negativo ou que sejam realizados pagamentos com valores inválidos.

Exemplo válido
passageiro1.pagarViagem(20.0);

Se o passageiro possuir saldo suficiente, o valor será descontado.

Exemplo inválido
passageiro1.pagarViagem(100.0);

Caso o saldo seja menor que R$ 100,00, a operação será bloqueada.

🧪 Testes

A classe foi testada utilizando valores válidos e inválidos.

Testes válidos
Passageiro passageiro1 = new Passageiro(
    "João",
    "123456789"
);


passageiro1.adicionarSaldo(30.0);
passageiro1.pagarViagem(20.0);
Testes inválidos
passageiro1.adicionarSaldo(-10.0);
passageiro1.adicionarSaldo(0);


passageiro1.pagarViagem(-20.0);
passageiro1.pagarViagem(100.0);

Esses testes verificam se as regras de negócio estão funcionando corretamente e impedem que o objeto Passageiro fique em um estado inconsistente.

💻 Tecnologias utilizadas
Java
Programação Orientada a Objetos (POO)
Git
GitHub
📚 Conceitos praticados

Neste projeto foram praticados os seguintes conceitos:

Criação de classes e objetos.
Atributos.
Métodos.
Construtores.
Encapsulamento.
Alteração do estado de um objeto.
Regras de negócio utilizando if.
Validação de dados.
Testes com valores válidos e inválidos.
Versionamento com Git.
