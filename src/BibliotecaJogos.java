// IMPORTAÇÕES - Importa as classes necessárias do pacote models
import models.Jogo;     // Importa a classe Jogo
import models.Jogador;  // Importa a classe Jogador

// DEFINIÇÃO DA CLASSE - Classe principal que contém o método main
// Tipo: Classe (não primitivo, tipo de referência)
public class BibliotecaJogos {
    // MÉTODO MAIN - Ponto de entrada da aplicação Java
    // Tipo: Método (estático)
    // Função: Iniciar a execução do programa
    public static void main(String[] args) {
        //----JOGOS INSTANCIADOS----//
        // Criação de 5 objetos da classe Jogo, cada um representando um jogo diferente
        // Tipo: Criação de objetos (instâncias da classe Jogo)

        // Instancia um jogo "Senhor dos Anais" com gênero "Fantasia", classificação etária 13 anos
        Jogo j1 = new Jogo("Senhor dos Anais", "Hobbit", "Fantasia", "23/02/1992", 10, 400, 50);

        // Instancia um jogo "FIFA" com gênero "Soft", classificação etária 13 anos
        Jogo j2 = new Jogo("FIFA", "Jutis", "Soft", "05/09/2001", 4, 400, 50);

        // Instancia um jogo "CS GO" com gênero "Coca", classificação etária 9 anos
        Jogo j3 = new Jogo("CS GO", "Kilo", "Coca", "11/04/2005", 9, 400, 50);

        // Instancia um jogo "LOL" com gênero "Lulis", classificação etária 13 anos
        Jogo j4 = new Jogo("LOL", "Huti", "Lulis", "13/08/2002", 7, 400, 50);

        // Instancia um jogo "Valorant" com gênero "Tutis", classificação etária 13 anos
        Jogo j5 = new Jogo("Valorant", "Nanis", "Tutis", "03/01/2004", 13, 400, 50);

        // Criação de um array para armazenar objetos da classe Jogo
        // Tipo: Array (referência)
        // Função: Armazenar até 5 jogos
        Jogo[] listaJogos = new Jogo[5];

        // Adiciona dois jogos idênticos "Senhor dos Anais" nas primeiras posições do array
        // Tipo: Atribuição de objetos ao array
        listaJogos[0] = new Jogo("Senhor dos Anais", "Hobbit", "Fantasia", "23/02/1992", 13, 400, 50);
        listaJogos[1] = new Jogo("Senhor dos Anais", "Hobbit", "Fantasia", "23/02/1992", 13, 400, 50);
        // Observação: As posições 2, 3 e 4 do array permanecem com null

        //---JOGADORES INSTANCIADOS----//
        // Criação de 3 objetos da classe Jogador
        // Tipo: Criação de objetos (instâncias da classe Jogador)

        // Instancia um jogador "Jorge" com 11 anos, nickname "Xaolin", saldo 290.51 e 34 horas jogadas
        Jogador p1 = new Jogador("Jorge", 11,"Xaolin",290.51, 34);

        // Instancia um jogador "Xuxa" com 21 anos, nickname "Xaolin", saldo 290.51 e 34 horas jogadas
        Jogador p2 = new Jogador("Xuxa", 21,"Xaolin",290.51, 34);

        // Instancia um jogador "Jure" com 14 anos, nickname "Xaolin", saldo 290.51 e 34 horas jogadas
        Jogador p3 = new Jogador("Jure", 14,"Xaolin",290.51, 34);

        //---COMPRA DE JOGOS----//
        // Utiliza o método comprarJogo da classe Jogador
        // Tipo: Chamada de método

        // O jogador p1 (Jorge) tenta comprar o jogo j3 (CS GO)
        // Deve verificar idade (11 >= 9) e saldo (290.51 >= 50)
        p1.comprarJogo(j1);
        p1.comprarJogo(j2);

        // O jogador p2 (Xuxa) tenta comprar o jogo j3 (CS GO)
        // Deve verificar idade (21 >= 9) e saldo (290.51 >= 50)
        p2.comprarJogo(j2);
        p2.comprarJogo(j3);

        // O jogador p2 joga o jogo j3 por 52 horas
        // Tipo: Chamada de método
        // Observação: Isso deve adicionar 52 horas ao atributo horasJogadas de p2
        //             e ao atributo tempoJogado de j3 (para o jogador p2)
        p2.jogar(j2, 52);
        p2.jogar(j3, 103);

        // O jogador p1 joga o jogo j3 por 13 horas
        // Tipo: Chamada de método
        // Observação: Isso deve adicionar 13 horas ao atributo horasJogadas de p1
        //             e ao atributo tempoJogado de j3 (para o jogador p1)
        p1.jogar(j1,13);
        p1.jogar(j2,113 );

        // Obtém a lista de jogos do jogador p1
        // Tipo: Chamada de método (getter)
        p1.getListaJogos();
        p1.exibirBiblioteca();
        p2.exibirBiblioteca();
        // Itera pelo array de jogos do jogador p1
        // Tipo: Estrutura de repetição (loop for-each)
        for(Jogo jogo: p1.getListaJogos()){
            // Verifica se o elemento atual do array não é nulo
            if(jogo != null){
                // Imprime o tempo jogado para cada jogo não nulo na lista do jogador p1
                // Tipo: Chamada de método e saída em console
               // System.out.println(jogo.getTempoJogado());
            }
        }
    }
}