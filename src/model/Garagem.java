package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Garagem {
  private String endereco;
  private int capacidadeDeVagas;
  private ArrayList<Carro> listaDeVeiculosArmazenados;

  public Garagem(String endereco, int capacidadeDeVagas) {
    this.endereco = endereco;
    this.capacidadeDeVagas = capacidadeDeVagas;
    inicializarListaDeVeiculosArmazenados();
  }

  public void adicionarVeiculo(Carro carro) {
    listaDeVeiculosArmazenados.add(carro);
  }

  public void removerVeiculo(int index) {
    listaDeVeiculosArmazenados.set(index, null);
  }

  public void listarVeiculosArmazenados() {
    int index = 0;

    for (Carro carro : listaDeVeiculosArmazenados) {
      System.out.println("Vaga " + index);
      index++;

      if (carro == null) {
        System.out.println("Livre");
      } else {
        carro.listarInformacoes();
      }
    }
  }

  public void inicializarListaDeVeiculosArmazenados() {
    this.listaDeVeiculosArmazenados = new ArrayList<>();

    for (int i = 1; i <= this.capacidadeDeVagas; i++) {
      this.listaDeVeiculosArmazenados.add(null);
    }
  }

  public boolean verificarSePossuiVagaDisponivel() {
    for (Carro carro : listaDeVeiculosArmazenados) {
      if (carro == null) {
        return true;
      }
    }

    return false;
  }

  public int pesquisarVagaDisponivel() {
    int index = 0;

    for (Carro carro : listaDeVeiculosArmazenados) {
      if (carro == null) {
        System.out.println("Vaga disponível: " + index);
        return index;
      }

      index++;
    }

    System.out.println("Não possui vaga disponível!");
    return -1;
  }

  public int pesquisarQuantidadeDeVagasDisponiveis() {
    int contadorDeVagasDisponiveis = 0;
    for (Carro carro : listaDeVeiculosArmazenados) {
      if (carro == null) {
        contadorDeVagasDisponiveis++;
      }
    }

    return contadorDeVagasDisponiveis;
  }

  public boolean verificarSeVagaEstaEmUso(int numeroDaVaga) {
    Carro carro = listaDeVeiculosArmazenados.get(numeroDaVaga);
    boolean vagaEstaEmuso = carro != null;

    System.out.println((vagaEstaEmuso) ? "Vaga está ocupada!" : "Vaga não está em uso!");

    return vagaEstaEmuso;
  }

  public void ocuparVaga(Carro carro) {
    Scanner sc = new Scanner(System.in);

    if (verificarSePossuiVagaDisponivel()) {
      if (pesquisarQuantidadeDeVagasDisponiveis() > 1) {
        int vagaEscolhida;
        int index = 0;
        System.out.println("Escolha uma das vagas disponíveis: ");

        for (Carro carroArmazenado : listaDeVeiculosArmazenados) {
          if (carroArmazenado == null) {
            System.out.println(index);
          }
          index++;
        }
        vagaEscolhida = sc.nextInt();

        listaDeVeiculosArmazenados.set(vagaEscolhida, carro);
        System.out.println("Seu veículo foi armazenado!");
      } else {
        int vagaDisponivel = pesquisarVagaDisponivel();
        listaDeVeiculosArmazenados.set(vagaDisponivel, carro);
        System.out.println("Seu veículo está na vaga " + vagaDisponivel);
      }

    } else {
      System.out.println("Não há vagas disponíveis!");
    }
  }

  public void desocuparVaga(Carro carro) {
    System.out.println("Vaga desocupada!");
    int vaga = listaDeVeiculosArmazenados.indexOf(carro);
    removerVeiculo(vaga);
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public int getCapacidadeDeVagas() {
    return capacidadeDeVagas;
  }

  public void setCapacidadeDeVagas(int capacidadeDeVagas) {
    this.capacidadeDeVagas = capacidadeDeVagas;
  }

  public ArrayList<Carro> getListaDeVeiculosArmazenados() {
    return listaDeVeiculosArmazenados;
  }

  public void setListaDeVeiculosArmazenados(ArrayList<Carro> listaDeVeiculosArmazenados) {
    this.listaDeVeiculosArmazenados = listaDeVeiculosArmazenados;
  }

}
