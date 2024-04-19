package model;

import java.util.Date;

public abstract class Veiculo {
  private String modelo;
  private int anoDeFabricacao;
  private Marca marca;

  public Veiculo(String modelo, int anoDeFabricacao, Marca marca) {
    this.modelo = modelo;
    this.anoDeFabricacao = anoDeFabricacao;
    this.marca = marca;
  }

  public void listarInformacoes() {
    System.out.println("Modelo: " + this.modelo);
    System.out.println("Ano de Fabricação: " + this.anoDeFabricacao);
    System.out.println("Marca: " + this.marca.getNome());
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public int getAnoDeFabricacao() {
    return anoDeFabricacao;
  }

  public void setAnoDeFabricacao(int anoDeFabricacao) {
    this.anoDeFabricacao = anoDeFabricacao;
  }

  public Marca getMarca() {
    return marca;
  }

  public void setMarca(Marca marca) {
    this.marca = marca;
  }

}
