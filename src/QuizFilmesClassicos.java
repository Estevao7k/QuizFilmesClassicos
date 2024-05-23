import java.util.Scanner;

public class QuizFilmesClassicos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("*********************************************");
        System.out.println("**** Quiz de Cinema ****");
        System.out.println("*********************************************");
        System.out.println("UNIFAN - Centro Universitário Alfredo Nasser");
        System.out.println("Professor: Brenno Pimenta");
        System.out.println("Aluno: Estevão F. Oliveira");
        System.out.println("Versão: 1.0 Final");
        System.out.println("*********************************************\n");

        String[][] perguntas = {
            {"Qual filme ganhou o Oscar de Melhor Filme em 2023?", 
             "A) Avatar: O Caminho da Água", "B) Elvis", "C) Tudo em Todo o Lugar ao Mesmo Tempo", "D) Os Banshees de Inisherin"},
            {"Quem dirigiu o clássico 'O Poderoso Chefão'?",
             "A) Martin Scorsese", "B) Francis Ford Coppola", "C) Quentin Tarantino", "D) Steven Spielberg"},
            {"Em que ano foi lançado 'Star Wars: Episódio IV - Uma Nova Esperança'?",
             "A) 1975", "B) 1977", "C) 1980", "D) 1983"},
            {"Qual atriz interpretou a personagem principal em 'Kill Bill'?",
             "A) Uma Thurman", "B) Lucy Liu", "C) Daryl Hannah", "D) Vivica A. Fox"},
            {"Qual o nome do primeiro filme da Pixar?",
             "A) Monstros S.A.", "B) Procurando Nemo", "C) Toy Story", "D) Vida de Inseto"},
            {"Qual o gênero do filme 'O Labirinto do Fauno'?",
             "A) Drama", "B) Comédia", "C) Fantasia", "D) Ação"},
            {"Quem interpretou o Coringa em 'O Cavaleiro das Trevas'?",
             "A) Jack Nicholson", "B) Joaquin Phoenix", "C) Jared Leto", "D) Heath Ledger"},
            {"Qual filme conta a história de um náufrago em uma ilha deserta?",
             "A) Titanic", "B) A Vida de Pi", "C) Náufrago", "D) Waterworld"},
            {"Qual o nome do diretor de 'A Origem' e 'Interestelar'?",
             "A) Steven Spielberg", "B) Quentin Tarantino", "C) Christopher Nolan", "D) Martin Scorsese"},
            {"Em que cidade se passa o filme 'Medianeras'?",
             "A) Rio de Janeiro", "B) Buenos Aires", "C) Cidade do México", "D) Santiago"},
            {"Qual o nome do filme brasileiro que conta a história de Zé Pequeno e Bené?",
             "A) Tropa de Elite", "B) Central do Brasil", "C) Cidade de Deus", "D) Carandiru"},
            {"Quem dirigiu o filme 'O Fabuloso Destino de Amélie Poulain'?",
             "A) Luc Besson", "B) François Ozon", "C) Jean-Pierre Jeunet", "D) Michel Gondry"},
            {"Qual o nome do personagem principal do filme 'O Senhor dos Anéis'?",
             "A) Aragorn", "B) Gandalf", "C) Legolas", "D) Frodo Baggins"},
            {"Em que ano foi lançado 'Jurassic Park'?",
             "A) 1989", "B) 1993", "C) 1997", "D) 2001"},
            {"Qual o nome da atriz que interpretou Hermione Granger na saga Harry Potter?",
             "A) Daniel Radcliffe", "B) Rupert Grint", "C) Emma Watson", "D) Maggie Smith"}
        };

        String[] respostas = {"C", "B", "B", "A", "C", "C", "D", "C", "C", "B", "C", "C", "D", "B", "C"};

        int pontuacao = 0;
        for (int i = 0; i < perguntas.length; i++) {
            for (String linha : perguntas[i]) {
                System.out.println(linha);
            }
            String respostaUsuario = input.nextLine().toUpperCase();
            if (respostaUsuario.equals(respostas[i])) {
                System.out.println("Correto!\n");
                pontuacao++;
            } else {
                System.out.println("Incorreto. A resposta certa é: " + respostas[i] + "\n");
            }
        }

        System.out.println("Sua pontuação final: " + pontuacao + "/" + perguntas.length);
    }
}
