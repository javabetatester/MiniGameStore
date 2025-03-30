// DECLARAÇÃO DO PACOTE - Organiza a classe no namespace "models"
package models;

// IMPORTAÇÃO - Importa a interface que esta classe implementa
import interfaces.Loja;

// DEFINIÇÃO DA CLASSE - Classe Jogador que implementa a interface Loja
// Tipo: Classe (não primitivo, tipo de referência)
public class Jogador implements Loja {
    // ATRIBUTOS (Variáveis de Instância)

    // Tipo: Atributo
    // Tipo de Dado: String (não primitivo, tipo de referência)
    // Função: Armazena o nome do jogador
    private String nome;

    // Tipo: Atributo
    // Tipo de Dado: int (primitivo)
    // Função: Armazena a idade do jogador
    private int idade;

    // Tipo: Atributo
    // Tipo de Dado: String (não primitivo, tipo de referência)
    // Função: Armazena o apelido (nickname) do jogador
    private String nick;

    // Tipo: Atributo
    // Tipo de Dado: double (primitivo)
    // Função: Armazena o saldo financeiro disponível para o jogador
    private double saldo;

    // Tipo: Atributo
    // Tipo de Dado: double (primitivo)
    // Função: Armazena o total de horas jogadas pelo jogador
    private double horasJogadas;

    // Tipo: Atributo
    // Tipo de Dado: Array de objetos Jogo (não primitivo, tipo de referência)
    // Função: Armazena os jogos que o jogador possui
    private Jogo[] listaJogos;

    // CONSTRUTOR
    // Tipo: Construtor
    // Função: Inicializa um novo objeto Jogador com os parâmetros fornecidos
    public Jogador(String nome, int idade, String nick, double saldo, double horasJogadas) {
        this.nome = nome;          // Inicializa o atributo nome
        this.idade = idade;        // Inicializa o atributo idade
        this.nick = nick;          // Inicializa o atributo nick
        this.saldo = saldo;        // Inicializa o atributo saldo
        this.horasJogadas = horasJogadas;  // Inicializa o atributo horasJogadas
        this.listaJogos = new Jogo [5];    // Inicializa o array listaJogos com capacidade para 5 jogos
    }

    // MÉTODOS ACESSORES (GETTERS E SETTERS)

    // Tipo: Método acessor (getter)
    // Função: Retorna o array de jogos do jogador
    // Retorno: Jogo[] (não primitivo, tipo de referência)
    public Jogo[] getListaJogos() {
        return listaJogos;
    }

    // Tipo: Método acessor (setter)
    // Função: Define a lista de jogos do jogador
    // Parâmetro: listaJogos (Jogo[]) - novo array de jogos
    public void setListaJogos(Jogo[] listaJogos) {
        this.listaJogos = listaJogos;
    }

    // Tipo: Método acessor (getter)
    // Função: Retorna o total de horas jogadas
    // Retorno: double (primitivo)
    public double getHorasJogadas() {
        return horasJogadas;
    }

    // Tipo: Método acessor (setter)
    // Função: Define o total de horas jogadas
    // Parâmetro: horasJogadas (double) - novo valor de horas jogadas
    public void setHorasJogadas(double horasJogadas) {
        this.horasJogadas = horasJogadas;
    }

    // Tipo: Método acessor (getter)
    // Função: Retorna o saldo atual do jogador
    // Retorno: double (primitivo)
    public double getSaldo() {
        return saldo;
    }

    // Tipo: Método acessor (setter)
    // Função: Define o saldo do jogador
    // Parâmetro: saldo (double) - novo valor de saldo
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Tipo: Método acessor (getter)
    // Função: Retorna o apelido do jogador
    // Retorno: String (não primitivo, tipo de referência)
    public String getNick() {
        return nick;
    }

    // Tipo: Método acessor (setter)
    // Função: Define o apelido do jogador
    // Parâmetro: nick (String) - novo apelido
    public void setNick(String nick) {
        this.nick = nick;
    }

    // Tipo: Método acessor (getter)
    // Função: Retorna a idade do jogador
    // Retorno: int (primitivo)
    public int getIdade() {
        return idade;
    }

    // Tipo: Método acessor (setter)
    // Função: Define a idade do jogador
    // Parâmetro: idade (int) - nova idade
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Tipo: Método acessor (getter)
    // Função: Retorna o nome do jogador
    // Retorno: String (não primitivo, tipo de referência)
    public String getNome() {
        return nome;
    }

    // Tipo: Método acessor (setter)
    // Função: Define o nome do jogador
    // Parâmetro: nome (String) - novo nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // MÉTODOS DE IMPLEMENTAÇÃO DA INTERFACE

    // Tipo: Método (implementação de interface)
    // Anotação: @Override - indica que este método sobrescreve um método da interface
    // Função: Permite ao jogador comprar um jogo se tiver idade e saldo suficientes
    // Parâmetro: j (Jogo) - o jogo a ser comprado
    @Override // SERVE PARA SE CERTIFICAR QUE ESTÁ IMPLEMENTANDO UM METODO EXISTENTE //
    public void comprarJogo(Jogo j) {
        // Verifica se o jogador tem idade mínima e saldo suficiente
        if(this.idade >= j.getFaixaEtaria() && j.getPreco() <= this.saldo){
            this.listaJogos[0] = j;  // Adiciona o jogo na posição 0 da lista (problema: sobrescreve jogos existentes)
            this.saldo = this.saldo - j.getPreco();  // Deduz o preço do jogo do saldo
        } else{
            // Exibe mensagem de erro se as condições não forem atendidas
            System.out.println("Você não tem os requisitos para comprar esse jogo.");
        }
    }

    // Tipo: Método (implementação de interface)
    // Anotação: @Override - indica que este método sobrescreve um método da interface
    // Função: Deveria permitir ao jogador avaliar um jogo, mas está sem implementação
    // Parâmetros:
    //   - j (Jogo) - o jogo a ser avaliado
    //   - estrela (int) - a classificação em estrelas
    @Override
    public void avaliarJogo(Jogo j, int estrela) {
        // Método sem implementação (vazio)
    }

    // Tipo: Método (implementação de interface)
    // Anotação: @Override - indica que este método sobrescreve um método da interface
    // Função: Registra as horas jogadas de um determinado jogo
    // Parâmetros:
    //   - j (Jogo) - o jogo a ser jogado
    //   - horas (int) - quantidade de horas a ser registrada
    @Override
    public void jogar(Jogo j, int horas) {
        // Percorre a lista de jogos do jogador
        for (Jogo jogo: this.listaJogos){
            if(jogo != null){  // Verifica se a posição do array não é nula
                // PROBLEMA: Comparação de strings com == em vez de .equals()
                if(jogo.getTitulo() == j.getTitulo()){  // Verifica se é o jogo desejado
                    this.horasJogadas += horas;  // Adiciona as horas ao total do jogador
                    jogo.setTempoJogado(horas);  // Registra as horas no objeto jogo
                }else {
                    // PROBLEMA: Vai imprimir para cada jogo que não corresponder
                    System.out.println("NAO TEM ESSE");
                }
            }
        }
    }
}