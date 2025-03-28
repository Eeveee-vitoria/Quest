import java.util.Scanner;
\\ Classe da questao onde estou atribuindo para que o main funcione 
public class Questao {
    private String pergunta;
    private String[] opcoes;
    private String respostaCorreta;


    public Questao(String pergunta, String[] opcoes, String respostaCorreta) {
        this.pergunta = pergunta;
        this.opcoes = opcoes;
        this.respostaCorreta = respostaCorreta;
    }
    public void exibirQuestao() {
        System.out.println(pergunta);
        for (int i = 0; i < opcoes.length; i++) {
            System.out.println((char) ('a' + i) + ") " + opcoes[i]);
        }
    }
    public boolean verificarResposta(String respostaUsuario) {
        return respostaUsuario.equalsIgnoreCase(respostaCorreta);
    }
}
