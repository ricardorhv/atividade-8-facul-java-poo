package model;

public class Marca {
  private String nome;
  private String paisDeOrigem;

  public void listarInformacoes() {
    System.out.println("Nome: " + nome);
    System.out.println("País de origem: " + paisDeOrigem);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getPaisDeOrigem() {
    return paisDeOrigem;
  }

  public void setPaisDeOrigem(String paisDeOrigem) {
    this.paisDeOrigem = paisDeOrigem;
  }
}
