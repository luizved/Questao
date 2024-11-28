public class Main {
    public static void main(String[] args) {

        //METODO DE PARA TRAZER O CABECALHO DE UMA CLASSE PARA A PRINCIPAL
        Cabecalho imp = new Cabecalho();
        imp.cab();


        int totalPerguntas = 5; // Atualize para 15 ou para quantidade total conforme adicionar mais perguntas
        int acertos = 0;

        Questao p1= new Questao();
        p1.pergunta = "(1) - Qual o nome da arma do Thor em 'Vingadores Guerra Infinita'? ";
        p1.opcaoA = "(A) - Mjolnir";
        p1.opcaoB = "(B) - Stormbreaker";
        p1.opcaoC = "(C) - Tesseract";
        p1.opcaoD = "(D) - Éter";
        p1.opcaoE = "(E) - Bifrost";
        p1.correta = "b";

        p1.escrevaQuestao();
        String resposta = p1.leiaResposta();
        System.out.println(resposta);
        p1.isCorreta(resposta);

        //if e else para realizar a contabilização dos acertos e dos erros
        if(p1.isCorreta(resposta)) {
            acertos++;
        }else{}

        System.out.println("----------------------------------------------------------");

        Questao p2= new Questao();
        p2.pergunta = "(2) Qual é a composição do escudo do Capitão Ameriaca? ";
        p2.opcaoA = "(A) - Ferro";
        p2.opcaoB = "(B) - Adamantium";
        p2.opcaoC = "(C) - Vibranium";
        p2.opcaoD = "(D) - Gálio";
        p2.opcaoE = "(E) - Aço";
        p2.correta = "c";

        p2.escrevaQuestao();
        resposta = p2.leiaResposta();
        System.out.println(resposta);
        p2.isCorreta(resposta);

        //if e else para realizar a contabilização dos acertos e dos erros
        if(p2.isCorreta(resposta)) {
            acertos++;
        }else{}

        System.out.println("------------------------------------------------------------");

        Questao p3= new Questao();
        p3.pergunta = "(3) Qual a primeira jóia do infinito a aparecer nos filmes da marvel?";
        p3.opcaoA = "(A) - Jóia da Realidade";
        p3.opcaoB = "(B) - Jóia do Poder";
        p3.opcaoC = "(C) - Jóia do Tempo";
        p3.opcaoD = "(D) - Jóia do Espaço";
        p3.opcaoE = "(E) - Jóia da Mente";
        p3.correta = "d";

        p3.escrevaQuestao();
        resposta = p3.leiaResposta();
        System.out.println(resposta);
        p3.isCorreta(resposta);

        //if e else para realizar a contabilização dos acertos e dos erros
        if(p3.isCorreta(resposta)) {
            acertos++;
        }else{}

        System.out.println("-------------------------------------------------------------");

        Questao p4= new Questao();
        p4.pergunta = "(4) De qual planta Thanos é?";
        p4.opcaoA = "(A) - Titan";
        p4.opcaoB = "(B) - Vormir";
        p4.opcaoC = "(C) - Knowhere";
        p4.opcaoD = "(D) - Terra";
        p4.opcaoE = "(E) - Jupiter";
        p4.correta = "a";

        p4.escrevaQuestao();
        resposta = p4.leiaResposta();
        System.out.println(resposta);
        p4.isCorreta(resposta);

        //if e else para realizar a contabilização dos acertos e dos erros
        if(p4.isCorreta(resposta)) {
            acertos++;
        }else{}

        System.out.println("------------------------------------------------------------");

        Questao p5= new Questao();
        p5.pergunta = "(5) No filme 'A era do gelo' qual o nome do esquilo que vive atras da noz?";
        p5.opcaoA = "(A) - Scrap";
        p5.opcaoB = "(B) - Scrat";
        p5.opcaoC = "(C) - Slash";
        p5.opcaoD = "(D) - Screen";
        p5.opcaoE = "(E) - N.D.A";
        p5.correta = "b";

        p5.escrevaQuestao();
        resposta = p5.leiaResposta();
        System.out.println(resposta);
        p5.isCorreta(resposta);

        //if e else para realizar a contabilização dos acertos e dos erros
        if(p5.isCorreta(resposta)) {
            acertos++;
        }else{}

        System.out.println("-------------------------------------------------------------");

        Questao p6= new Questao();
        p6.pergunta = "(6) No filme 'A era do gelo' qual o nome da filha de Ellie com Manfred?";
        p6.opcaoA = "(A) - Framboesa";
        p6.opcaoB = "(B) - Cajuzinho";
        p6.opcaoC = "(C) - Amora";
        p6.opcaoD = "(D) - Laranja";
        p6.opcaoE = "(E) - N.D.A";
        p6.correta = "c";

        p6.escrevaQuestao();
        resposta = p6.leiaResposta();
        System.out.println(resposta);
        p6.isCorreta(resposta);

        //if e else para realizar a contabilização dos acertos e dos erros
        if(p6.isCorreta(resposta)) {
            acertos++;
        }else{}



        //--------------------------------------------------------------------------
        int erros = totalPerguntas - acertos;
        double porcentagemAcertos = (double) acertos / totalPerguntas * 100;

        System.out.println("Você acertou " + acertos + " de " + totalPerguntas + " perguntas.");
        System.out.println("Você errou " + erros + " perguntas.");
        System.out.printf("Porcentagem de acertos: %.2f%%\n", porcentagemAcertos);

    }
}