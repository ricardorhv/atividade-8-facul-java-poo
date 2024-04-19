import model.Carro;
import model.Garagem;
import model.Marca;
import model.Pessoa;
import model.Veiculo;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa1 = new Pessoa("Ricardo", "123.456.789-10", null);
        Pessoa pessoa2 = new Pessoa("Guilherme", "123.456.789-10", null);
        Garagem garagem = new Garagem("Avenida Brasil, Centro - 222", 10);

        Marca marca1 = new Marca();
        marca1.setNome("BMW");
        marca1.setPaisDeOrigem("EUA");

        Marca marca2 = new Marca();
        marca2.setNome("Audi");
        marca2.setPaisDeOrigem("EUA");

        Carro carro = new Carro("Prata", 2, "i8", 2020, marca1);
        Carro carro2 = new Carro("Vermelho", 4, "RS 7", 2020, marca2);

        pessoa1.adicionarVeiculo(carro);
        pessoa2.adicionarVeiculo(carro2);

        garagem.listarVeiculosArmazenados();

        garagem.ocuparVaga(carro);
        garagem.desocuparVaga(carro);

        garagem.ocuparVaga(carro2);
        garagem.ocuparVaga(carro);
        garagem.verificarSeVagaEstaEmUso(2);

        garagem.listarVeiculosArmazenados();
    }
}
