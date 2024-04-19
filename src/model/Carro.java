package model;

public class Carro extends Veiculo {
  private String cor;
  private int quantidadeDePortas;

  public Carro(String cor, int quantidadeDePortas, String modelo, int anoDeFabricacao, Marca marca) {
    super(modelo, anoDeFabricacao, marca);

    this.cor = cor;
    this.quantidadeDePortas = quantidadeDePortas;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public int getQuantidadeDePortas() {
    return quantidadeDePortas;
  }

  public void setQuantidadeDePortas(int quantidadeDePortas) {
    this.quantidadeDePortas = quantidadeDePortas;
  }

  public void listarInformacoes() {
    super.listarInformacoes();
    System.out.println("Cor: " + this.cor);
    System.out.println("Quantidade de Portas: " + this.quantidadeDePortas);
  }

}
