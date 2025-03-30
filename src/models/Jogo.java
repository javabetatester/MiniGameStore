// DECLARAÇÃO DO PACOTE - Organiza a classe no namespace "models"
package models;

// DEFINIÇÃO DA CLASSE - Representa um jogo no sistema
// Tipo: Classe (não primitivo, tipo de referência)
public class Jogo {
    // ATRIBUTOS (Variáveis de Instância)

    // Tipo: Atributo
    // Tipo de Dado: String (não primitivo, tipo de referência)
    // Função: Armazena o título do jogo
    private String titulo;

    // Tipo: Atributo
    // Tipo de Dado: String (não primitivo, tipo de referência)
    // Função: Armazena o nome da empresa desenvolvedora do jogo
    private String desenvolvedora;

    // Tipo: Atributo
    // Tipo de Dado: String (não primitivo, tipo de referência)
    // Função: Armazena o gênero do jogo (ex: ação, aventura, RPG)
    private String genero;

    // Tipo: Atributo
    // Tipo de Dado: String (não primitivo, tipo de referência)
    // Função: Armazena o ano de lançamento do jogo
    private String anoLancamento;

    // Tipo: Atributo
    // Tipo de Dado: int (primitivo)
    // Função: Armazena a classificação indicativa do jogo (idade mínima)
    private int faixaEtaria;

    // Tipo: Atributo
    // Tipo de Dado: int (primitivo)
    // Função: Armazena o tempo médio estimado para completar o jogo
    private int tempoMedio;

    // Tipo: Atributo
    // Tipo de Dado: double (primitivo)
    // Função: Armazena o preço do jogo
    private double preco;

    // Tipo: Atributo
    // Tipo de Dado: double (primitivo)
    // Função: Armazena a soma total de estrelas recebidas em avaliações
    private double estrelas;

    // Tipo: Atributo
    // Tipo de Dado: double (primitivo)
    // Função: Armazena a média das avaliações (estrelas/contador)
    private double media;

    // Tipo: Atributo
    // Tipo de Dado: int (primitivo)
    // Função: Armazena o número de avaliações recebidas
    private int contador;

    // Tipo: Atributo
    // Tipo de Dado: int (primitivo)
    // Função: Armazena o tempo total jogado neste jogo
    private int tempoJogado;

    // CONSTRUTOR
    // Tipo: Construtor
    // Função: Inicializa um novo objeto Jogo com os parâmetros fornecidos
    public Jogo(String titulo, String desenvolvedora, String genero, String anoLancamento, int faixaEtaria, int tempoMedio, double preco) {
        this.titulo = titulo;                // Inicializa o atributo título
        this.desenvolvedora = desenvolvedora;  // Inicializa o atributo desenvolvedora
        this.genero = genero;                // Inicializa o atributo gênero
        this.anoLancamento = anoLancamento;  // Inicializa o atributo anoLancamento
        this.faixaEtaria = faixaEtaria;      // Inicializa o atributo faixaEtaria
        this.tempoMedio = tempoMedio;        // Inicializa o atributo tempoMedio
        this.preco = preco;                  // Inicializa o atributo preço
        // Observação: Os atributos estrelas, media, contador e tempoJogado são inicializados com seus valores padrão (0)
    }

    // MÉTODOS ACESSORES (GETTERS E SETTERS)

    // Tipo: Método acessor (getter)
    // Função: Retorna o título do jogo
    // Retorno: String (não primitivo, tipo de referência)
    public String getTitulo() {
        return titulo;
    }

    // Tipo: Método acessor (setter)
    // Função: Define o título do jogo
    // Parâmetro: titulo (String) - novo título
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Tipo: Método acessor (getter)
    // Função: Retorna a desenvolvedora do jogo
    // Retorno: String (não primitivo, tipo de referência)
    public String getDesenvolvedora() {
        return desenvolvedora;
    }

    // Tipo: Método acessor (setter)
    // Função: Define a desenvolvedora do jogo
    // Parâmetro: desenvolvedora (String) - nova desenvolvedora
    public void setDesenvolvedora(String desenvolvedora) {
        this.desenvolvedora = desenvolvedora;
    }

    // Tipo: Método acessor (getter)
    // Função: Retorna o gênero do jogo
    // Retorno: String (não primitivo, tipo de referência)
    public String getGenero() {
        return genero;
    }

    // Tipo: Método acessor (setter)
    // Função: Define o gênero do jogo
    // Parâmetro: genero (String) - novo gênero
    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Tipo: Método acessor (getter)
    // Função: Retorna o ano de lançamento do jogo
    // Retorno: String (não primitivo, tipo de referência)
    public String getAnoLancamento() {
        return anoLancamento;
    }

    // Tipo: Método acessor (setter)
    // Função: Define o ano de lançamento do jogo
    // Parâmetro: anoLancamento (String) - novo ano de lançamento
    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    // Tipo: Método acessor (getter)
    // Função: Retorna a faixa etária do jogo
    // Retorno: int (primitivo)
    public int getFaixaEtaria() {
        return faixaEtaria;
    }

    // Tipo: Método acessor (setter)
    // Função: Define a faixa etária do jogo
    // Parâmetro: faixaEtaria (int) - nova faixa etária
    public void setFaixaEtaria(int faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    // Tipo: Método acessor (getter)
    // Função: Retorna o tempo médio para completar o jogo
    // Retorno: int (primitivo)
    public int getTempoMedio() {
        return tempoMedio;
    }

    // Tipo: Método acessor (setter)
    // Função: Define o tempo médio para completar o jogo
    // Parâmetro: tempoMedio (int) - novo tempo médio
    public void setTempoMedio(int tempoMedio) {
        this.tempoMedio = tempoMedio;
    }

    // Tipo: Método acessor (getter)
    // Função: Retorna o preço do jogo
    // Retorno: double (primitivo)
    public double getPreco() {
        return preco;
    }

    // Tipo: Método acessor (setter)
    // Função: Define o preço do jogo
    // Parâmetro: preco (double) - novo preço
    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Tipo: Método acessor (getter)
    // Função: Retorna o total de estrelas das avaliações
    // Retorno: double (primitivo)
    public double getEstrelas() {
        return estrelas;
    }

    // Tipo: Método acessor (setter) com lógica adicional
    // Função: Adiciona uma nova avaliação em estrelas e recalcula a média
    // Parâmetro: estrelas (int) - número de estrelas da nova avaliação
    public void setEstrelas(int estrelas) {
        contador = contador + 1;  // Incrementa o contador de avaliações

        // Se for a primeira avaliação, define diretamente o valor
        if (this.estrelas == 0) {
            this.estrelas = estrelas;
        } else {
            // Senão, adiciona ao total existente
            this.estrelas += estrelas;
        }

        // Recalcula a média dividindo o total de estrelas pelo número de avaliações
        this.media = this.estrelas / this.contador;
    }

    // Tipo: Método acessor (getter)
    // Função: Retorna a média das avaliações em estrelas
    // Retorno: double (primitivo)
    public double getMedia() {
        return media;
    }

    // Tipo: Método acessor (getter)
    // Função: Retorna o tempo total jogado neste jogo
    // Retorno: int (primitivo)
    public int getTempoJogado() {
        return tempoJogado;
    }

    // Tipo: Método acessor (setter) com lógica adicional
    // Função: Adiciona mais tempo ao contador de tempo jogado
    // Parâmetro: tempoJogado (int) - tempo adicional jogado
    public void setTempoJogado(int tempoJogado) {
        // Adiciona o tempo fornecido ao tempo total já registrado
        this.tempoJogado += tempoJogado;
    }
}