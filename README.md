Problema 1

**Projeto em Java Orientado a Objetos: Sistema de Gestão de Propriedades**

Desenvolva um sistema em Java para gerenciar propriedades, onde as entidades principais são Pessoa, Veículo, Marca e Garagem. Cada Pessoa pode ser proprietária de um ou mais Veículos e pode possuir uma Garagem para armazená-los. Os Veículos podem ser de diferentes Marcas.

O sistema deve permitir as seguintes funcionalidades:

1. **Cadastro de Pessoa:**
   - Atributos: nome, CPF, lista de veículos de propriedade, garagem (opcional).
   - Métodos: adicionar veículo, remover veículo, atribuir garagem.

2. **Cadastro de Veículo:**
   - Atributos: modelo, ano de fabricação, marca.
   - Métodos: listar informações.

3. **Cadastro de Marca:**
   - Atributos: nome, país de origem.
   - Métodos: listar informações.

4. **Cadastro de Garagem:**
   - Atributos: endereço, capacidade de vagas, lista de veículos armazenados.
   - Métodos: adicionar veículo, remover veículo, listar veículos armazenados, ocupar vaga, desocupar vaga, pesquisar vaga disponível, verificar se a vaga está em uso.

A classe Garagem deve gerenciar os veículos armazenados, possibilitando ocupar e desocupar vagas, além de pesquisar se existe vaga disponível e quantas estão disponíveis. Também deve ser capaz de verificar se uma vaga específica está em uso. Qualquer veículo pode ser armazenado em qualquer garagem, promovendo flexibilidade no sistema. O sistema deve ser implementado seguindo os princípios de orientação a objetos, como encapsulamento, herança e polimorfismo. Deve permitir interações como cadastro, consulta e atualização das informações relacionadas às entidades Pessoa, Veículo, Marca e Garagem. Além disso, é importante garantir a integridade dos dados e a consistência das operações realizadas pelo usuário.
