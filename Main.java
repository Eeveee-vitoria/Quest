import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Scanner(System.in);

        // Cabecalho
        System.out.println("Centro Universitario Alfredo Nasser- UNIFAN");
        System.out.println("Aluno: EVELLYN VITORIA SEGUNDO PERIODO ");
        System.out.println("Professor: BRENNO PIMENTA");
        System.out.println("=====================================================");
        System.out.println("========== QUESTIONARIO SOBRE ANATOMIA ==========");
        System.out.println("=====================================================");

        Questao[] questoes = new Questao[15];
        
        questoes[0] = new Questao("1- Qual é o principal osso do braço?",
                new String[]{"Rádio", "Ulna", "Fêmur", "Húmero", "Escápula"}, "D");

        questoes[1] = new Questao("2- Onde se localiza o músculo trapézio?",
                new String[]{"No antebraço", "Na coxa", "Nas costas", "No pescoço", "No abdômen"}, "C");

        questoes[2] = new Questao("3- Qual estrutura do sistema nervoso é responsável pela coordenação e equilíbrio?",
                new String[]{"Medula espinhal", "Cerebelo", "Bulbo encefálico", "Hipotálamo", "Córtex cerebral"}, "B");

        questoes[3] = new Questao("4- Qual é o nome do maior órgão do corpo humano?",
                new String[]{"Fígado", "Coração", " Rins", "Pele", " Pulmões"}, "D");

        questoes[4] = new Questao("5-  O que a artéria carótida abastece? ",
                new String[]{" O cérebro", "O fígado", "O coração", "Os músculos do peito", " O sistema digestivo"}, "A");

        questoes[5] = new Questao("6- Qual é a função principal dos glóbulos vermelhos no sangue?",
                new String[]{" Combater infecções", "Transportar oxigênio", "Coagular o sangue", "Produzir anticorpos", " Controlar a pressão sanguínea"}, "B");

        questoes[6] = new Questao("7- Onde se encontra o coração no corpo humano? ",
                new String[]{"Na região abdominal", "Na cavidade craniana", "Na cavidade torácica", "Na pelve", "Na região lombar"}, "C");

        questoes[7] = new Questao("8- Qual é a função principal do pâncreas?",
                new String[]{"Produzir bile", "Controlar os batimentos cardíacos", "Produzir insulina e enzimas digestivas", "Filtrar o sangue", " Armazenar glicogênio"}, "C");

        questoes[8] = new Questao("9- Qual é o osso que forma a parte superior da cabeça?",
                new String[]{"Mandíbula", "Maxilar", "Frontal", "Parietal", "Occipital"}, "D");

        questoes[9] = new Questao("10- Qual estrutura do olho é responsável pela percepção das cores?",
                new String[]{"Retina", "Córnea", "Cristalino", " Íris", "Pupila"}, "A");

        questoes[10] = new Questao("11-  A medula espinhal faz parte de qual sistema do corpo? ",
                new String[]{"Sistema respiratório", "Sistema nervoso central", "Sistema digestivo", "Sistema muscular", "Sistema linfático"}, "B");

        questoes[11] = new Questao("12-  Qual é o nome do osso que compõe a parte frontal do crânio?",
                new String[]{"Frontal", "Nasal", " Temporal", "Occipital", " Parietal"}, "A");

        questoes[12] = new Questao("13-  Qual é o nome do músculo responsável pelo movimento da coxa?",
                new String[]{"Bíceps femoral", "Quadríceps femoral", "Trapezoide", "Peitoral maior", "Trapézio"}, "B");

        questoes[13] = new Questao("14-  A principal função dos alvéolos pulmonares é:",
                new String[]{" Produzir hormônios", "Filtrar o oxigênio do sangue", "Realizar a troca gasosa (oxigênio e dióxido de carbono)", "Armazenar oxigênio", "Produzir muco"}, "C");

        questoes[14] = new Questao("15-Qual é a principal função dos rins?",
                new String[]{" Produzir bile", "Regular a pressão arterial", " Filtrar as toxinas do sangue e produzir urina", " Controlar os níveis de glicose", "Produzir hormônios de crescimento"}, "C");
            
        Scanner scanner = new Scanner(System.in);
        String respostaUsuario;
        int totalCorretas = 0;

        // Loop para exibir e verificar as questões
        for (int i = 0; i < questoes.length; i++) {
            questoes[i].exibirQuestao();
            System.out.print("Digite sua resposta ");
            respostaUsuario = scanner.nextLine();

            if (questoes[i].verificarResposta(respostaUsuario)) {
                totalCorretas++;
            } else {
                System.out.println("Você errou na questão " + (i + 1) + "!");
            }
        }

        System.out.println("\nVocê acertou " + totalCorretas + " de 15 questões.");

        scanner.close();
    }
}
