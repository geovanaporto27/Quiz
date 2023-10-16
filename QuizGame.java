import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizGame {
    private List<Questao> questoes = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void criarQuestão() {
        System.out.print("Adicione a Questão: ");
        String questaoText = scanner.nextLine();
        System.out.print("Adicione a resposta correta: ");
        String respostaCorreta = scanner.nextLine();
        Questao questao = new Questao(questaoText, respostaCorreta);
        questoes.add(questao);
        System.out.println("Questão adicionada!");
    }

    public void exibirQuestão() {
        System.out.println("Questões: ");
        for (int i = 0; i < questoes.size(); i++) {
            Questao questao = questoes.get(i);
            System.out.println((i + 1) + ". " + questao.getQuestaoText());
        }
    }

    public void responderQuestao() {
        if (questoes.isEmpty()) {
            System.out.println("Não há questões disponíveis");
            return;
        }

        int score = 0;
        for (Questao questao : questoes) {
            System.out.println("Questão: " + questao.getQuestaoText());
            String userAnswer = scanner.nextLine();
            if (userAnswer.equalsIgnoreCase(questao.getRespostaCorreta())) {
                System.out.println("Correto!");
                score++;
            } else {
                System.out.println("Incorreto, a resposta correta é: " + questao.getRespostaCorreta());
            }
        }

        System.out.println("Quiz completo, sua pontuação é: " + score + "/" + questoes.size());
    }

    public void removerQuestão() {
        exibirQuestão();
        System.out.print("Número da questão a ser removida: ");
        int numeroQuestao = scanner.nextInt();

        if (numeroQuestao >= 1 && numeroQuestao <= questoes.size()) {
            questoes.remove(numeroQuestao - 1);
            System.out.println("Questão removida!");
        } else {
            System.out.println("Número da questão inválido!");
        }
    }

    public void editarQuestao() {
        exibirQuestão();
        System.out.print("Digite o número da questão a ser editada: ");
        int numeroQuestao = scanner.nextInt();

        if (numeroQuestao >= 1 && numeroQuestao <= questoes.size()) {
            Questao questao = questoes.get(numeroQuestao - 1);
            System.out.println("Questão atual: " + questao.getQuestaoText());
            System.out.print("Nova Questão: ");
            scanner.nextLine();
            String newQuestaoText = scanner.nextLine();
            System.out.println("Resposta atual: " + questao.getRespostaCorreta());
            System.out.print("Nova resposta:  ");
            String newRespostaCorreta = scanner.nextLine();
            questao.setQuestaoText(newQuestaoText);
            questao.setRespostaCorreta(newRespostaCorreta);
            System.out.println("Questão atualizada!");
        } else {
            System.out.println("Número da questão inválido!");
        }
    }

    public static void main(String[] args) {
        QuizGame quiz = new QuizGame();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\nMenu:");
                System.out.println("1. Criar Nova Questão");
                System.out.println("2. Responder Questões");
                System.out.println("3. Editar Questão");
                System.out.println("4. Remover Questão");
                System.out.println("5. Sair");
                System.out.print("Selecione a Opção:");

                int opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        quiz.criarQuestão();
                        break;
                    case 2:
                        quiz.responderQuestao();
                        break;
                    case 3:
                        quiz.editarQuestao();
                        break;
                    case 4:
                        quiz.removerQuestão();
                        break;
                    case 5:
                        System.out.println("Adeus!");
                        System.exit(0);
                    default:
                        System.out.println("Escolha inválida!");
                }
            }
        }
    }

    public void criarQuestão(String string, String string2) {
    }

    public void play(int numeroDeQuestoes) {
    }
}