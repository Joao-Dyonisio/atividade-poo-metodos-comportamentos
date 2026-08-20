package main;

import Model.Passageiro;

public class Main {
    public static void main(String[] args) {
        Passageiro passageiro1 = new Passageiro("João Dyonisio", "532456968", 20);
        System.out.println("Recarga do passeiro 1:");
        passageiro1.adicionarSaldo(30.0);

        Passageiro passageiro2 = new Passageiro("Maria Eduarda", "678098456", 15);
        System.out.println("Recarga do passeiro 2:");
        passageiro2.adicionarSaldo(60.0);

        System.out.println();
        System.out.println("---- Sistema Recarga ----");
        System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$ " + passageiro1.saldo + " | CPF: " + passageiro1.cpf);
        System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$ " + passageiro2.saldo + " | CPF: " + passageiro2.cpf);

        System.out.println();
        System.out.println("Pagando viagem do passageiro 1");
        passageiro1.pagarViagem(20.0);
        System.out.println("Pagando viagem do passageiro 2");
        passageiro2.pagarViagem(30.0);

        System.out.println("\n--- TESTES INVÁLIDOS ---");

        passageiro1.adicionarSaldo(-10.0);
        passageiro1.adicionarSaldo(0);

        passageiro1.pagarViagem(-20.0);
        passageiro1.pagarViagem(100.0);

        System.out.println();
        System.out.println("Apresentação do documento do passageiro 1");
        passageiro1.apresentarDocumento();
        System.out.println("Apresentação do documento do passageiro 2");
        passageiro2.apresentarDocumento();

        System.out.println();
        System.out.println("Passageiro 1 é menor de idade ?");
        passageiro1.podeViajarSozinho();
        System.out.println("Passageiro 2 é menor de idade ?");
        passageiro2.podeViajarSozinho();

    }
}
