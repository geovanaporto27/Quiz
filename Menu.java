import java.util.Scanner;

public class Menu {
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
                        System.out.println("Qual o tipo de questão que deseja criar?");
                        System.out.println("1- Questões Multipla Escolha");
                        System.out.println("2- Questões Abertas");
                        System.out.println("3- Questões Verdadeiro/Falso");
                        int opcoes = scanner.nextInt();
                        scanner.nextLine();
                        switch (opcoes) {
                            case 1: 
                                quiz.criarQuestãoFechada(null, null, null, null);
                                break;
                            case 2:
                                quiz.criarQuestãoAberta(null);
                                break;
                            case 3: 
                                quiz.criarQuestãoVF(null);
                                break;
                        }
                    case 2:
                        System.out.println("Qual o tipo de questão que deseja responder?");
                        System.out.println("1- Questões Multipla Escolha");
                        System.out.println("2- Questões Abertas");
                        System.out.println("3- Questões Verdadeiro/Falso");
                        int opc = scanner.nextInt();
                        scanner.nextLine();
                        switch (opc) {
                            case 1: 
                                quiz.responderQuestaoFechada();
                            break;
                            case 2:
                                quiz.responderQuestaoAberta();
                                break;
                            case 3:
                                quiz.responderQuestaoVF();
                                break;
                        }
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

    public void criarQuestãoAberta(String string, String string2) {
    }

    public void criarQuestãoFechada(String string, String string2) {
    }

    public void criarQuestãoVF(String string, String string2) {
    }

    public void play(int numeroDeQuestoes) {
    }
}