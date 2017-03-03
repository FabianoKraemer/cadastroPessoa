package poo;

import agenda.Pessoa;
import agenda.Endereco;

/**
 *
 * Essa é a classe principal do meu projeto. Usarei ela para criar instâncias
 * das mais classses.
 */
public class Principal {

    public static void main(String[] args) {

        Endereco e = new Endereco("rua", "123", "praia", "sje", "sc", "88666-103", "Brasil");

        Pessoa p = new Pessoa("Fabiano", "1234", e, "fabiano.kra@gmail.com");
        
        p.imprimirDados();
        
    }

}
