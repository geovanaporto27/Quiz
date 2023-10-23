class Questao {
    private String questaoText;
    private String RespostaCorreta;

    public Questao(String questaoText, String RespostaCorreta, String questaocText, String questaodText, String respostaCorreta2) {
        this.questaoText = questaoText;
        this.RespostaCorreta = RespostaCorreta;
    }

    public String getquestaoText() {
        return questaoText;
    }

    public String getrespostaCorreta() {
        return RespostaCorreta;
    }

    public static void main(String[] args) {
        QuizGame quiz = new QuizGame();

        quiz.criarQuestãoAberta("Qual é o nome do professor de POO ", "Antonio Dias");
        quiz.criarQuestãoAberta("A Terra é redonda?", "Sim");
        quiz.criarQuestãoAberta("Quanto é 57 + 28 * 3 / 2?", "99");

        int numeroDeQuestoes= 3; 
        quiz.play(numeroDeQuestoes);
    }

    public void setQuestaoText(String newQuestaoText) {
    }

    public void setRespostaCorreta(String newRespostaCorreta) {
    }


    public String getQuestaoText() {
        return null;
    }

    public String getRespostaCorreta() {
        return null;
    }
}