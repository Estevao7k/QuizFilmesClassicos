import java.util.Scanner;

public class QuizFilmesClassicos {

    public static void main(String[] args) {
        //cabecalho
        System.out.println("\nQuiz de Filmes Clássicos");
        System.out.println("\nDesenvolvedor: Estevão F. Oliveira");
        System.out.println("Versão: PILOTO\n");


        int pontuacao = 0;
        Scanner scanner = new Scanner(System.in);

        String[][] perguntasRespostas = {
                {"Qual filme clássico é conhecido pela frase 'A vida é uma caixa de bombons. Você nunca sabe o que vai tirar?'", "a) O Poderoso Chefão", "b) Casablanca", "c) Forrest Gump", "d) E o Vento Levou", "e) Star Wars"},
                {"Qual filme clássico é conhecido pela frase 'Aqui olhando para você, garoto?'", "a) 12 Homens e Uma Sentença", "b) O Tubarão", "c) O Mágico de Oz", "d) O Poderoso Chefão", "e) Casablanca"}
        };

        for (String[] perguntaResposta : perguntasRespostas) {
            exibirPergunta(perguntaResposta);
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase(perguntaResposta[4])) {
                pontuacao++;
                System.out.println("Resposta correta!");
            } else {
                System.out.println("Resposta incorreta. A resposta correta é " + perguntaResposta[4] + ".");
            }
        }

        System.out.println("\nSua pontuação final: " + pontuacao + " pontos");
        avaliarPontuacao(pontuacao);
    }

    private static void exibirPergunta(String[] perguntaResposta) {
        System.out.println("\n" + perguntaResposta[0]);
        for (int i = 1; i < perguntaResposta.length; i++) {
            System.out.println("  " + perguntaResposta[i]);
        }
        System.out.print("Sua resposta: ");}

}