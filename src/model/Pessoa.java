package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Pessoa {
  private String nome;
  private String CPF;
  private Garagem garagem;
  private ArrayList<Carro> listaDeVeiculos;

  public Pessoa(String nome, String CPF, Garagem garagem) {
    this.nome = nome;
    this.CPF = CPF;
    this.garagem = garagem;
    this.listaDeVeiculos = new ArrayList<>();
  }

  public void adicionarVeiculo(Carro carro) {
    listaDeVeiculos.add(carro);
  }

  public void removerVeiculo() {
    Scanner sc = new Scanner(System.in);
    int escolha;

    System.out.println("Escolha um veiculo para ser removido:");
    for (Carro carro : listaDeVeiculos) {
      System.out.println(listaDeVeiculos.indexOf(carro));
      carro.listarInformacoes();
    }
    escolha = sc.nextInt();

    listaDeVeiculos.remove(escolha);
    System.out.println("Veiculo removido com sucesso!");
  }

  public void atribuirGaragem(Garagem garagem) {
    this.garagem = garagem;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCPF() {
    return CPF;
  }

  public void setCPF(String CPF) {
    this.CPF = CPF;
  }

  public Garagem getGaragem() {
    return garagem;
  }

  public void setGaragem(Garagem garagem) {
    this.garagem = garagem;
  }

}
