class Questao {
    private String questionText;
    private String correctAnswer;

    public Questao(String questionText, String correctAnswer) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }



    public static void main(String[] args) {
        QuizGame quiz = new QuizGame();

        // Adicione suas perguntas usando o método addQuestion
        quiz.criarQuestão("Qual é o nome do professor de POO ", "Antonio Dias");
        quiz.criarQuestão("A Terra é redonda?", "Sim");
        quiz.criarQuestão("Quantos alunos tem no segundo período de ADS", "38");
        quiz.criarQuestão("Qual a capital do Brasil?", "Brasília");
        quiz.criarQuestão("Quanto é 57 + 28 * 3 / 2?", "99");

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














