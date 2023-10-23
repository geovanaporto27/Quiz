import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizGame {
    private List<Questao> questoes = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void criarQuestãoAberta(String string) {
        System.out.print("Adicione a Questão: ");
        String questaoText = scanner.nextLine();
        System.out.print("Adicione a resposta correta: ");
        String respostaCorreta = scanner.nextLine();
        Questao questao = new Questao(questaoText, respostaCorreta, respostaCorreta, respostaCorreta, respostaCorreta);
        questoes.add(questao);
        System.out.println("Questão adicionada!");
    }

    public void criarQuestãoFechada(String string, String string2, String string3, String string4) {
        System.out.print("Adicione a Questão: ");
        String questaoText = scanner.nextLine();
        System.out.print("Adicione a alternativa a): ");
        String questaoaText = scanner.nextLine();
        System.out.print("Adicione a alternativa b): ");
        String questaobText = scanner.nextLine();
        System.out.print("Adicione a alternativa c): ");
        String questaocText = scanner.nextLine();
        System.out.print("Adicione a alternativa d): ");
        String questaodText = scanner.nextLine();
        System.out.print("Adicione a resposta correta: ");
        String respostaCorreta = scanner.nextLine();
        Questao questao = new Questao(questaoText, questaoaText, questaobText, questaocText, questaodText);
        questoes.add(questao);
        System.out.println("Questão adicionada!");
    }

    public void criarQuestãoVF(String string) {
        System.out.print("Adicione a Questão: ");
        String questaoText = scanner.nextLine();
        System.out.print("Adicione a resposta correta: ");
        String respostaCorreta = scanner.nextLine();
        Questao questao = new Questao(questaoText, respostaCorreta, respostaCorreta, respostaCorreta, respostaCorreta);
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

    public void responderQuestaoAberta() {
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

    public void responderQuestaoFechada() {
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

    public void responderQuestaoVF() {
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

    public void criarQuestãoAberta(String string, String string2) {
    }

    public void criarQuestãoVF(String string, String string2) {
    }

    public void criarQuestãoFechada(String string, String string2) {
    }

    public void play(int numeroDeQuestoes) {

    }
}