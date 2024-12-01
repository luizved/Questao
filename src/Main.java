public class Main {
    public static void main(String[] args) {

        //METODO DE PARA TRAZER O CABECALHO DE UMA CLASSE PARA A PRINCIPAL
        Cabecalho imp = new Cabecalho();
        imp.cab();


        int totalPerguntas = 6; // Atualize para 15 ou para quantidade total conforme adicionar mais perguntas
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

        System.out.println("----------------------------------------------------------------");

        Questao p7= new Questao();
        p7.pergunta = "(7) Qual animal a mamute Ellie acredita ser?";
        p7.opcaoA = "(A) - Gambá";
        p7.opcaoB = "(B) - Gato";
        p7.opcaoC = "(C) - Leão";
        p7.opcaoD = "(D) - Galinha";
        p7.opcaoE = "(E) - Rato";
        p7.correta = "a";

        p7.escrevaQuestao();
        resposta = p7.leiaResposta();
        System.out.println(resposta);
        p7.isCorreta(resposta);

        //if e else para realizar a contabilização dos acertos e dos erros
        if(p7.isCorreta(resposta)) {
            acertos++;
        }else{}

        System.out.println("-----------------------------------------------------------------");

        Questao p8= new Questao();
        p8.pergunta = "(8) Qual o nome original, em inglês, do filme A ERA DO GELO ?";
        p8.opcaoA = "(A) - Ice island";
        p8.opcaoB = "(B) - Snow age";
        p8.opcaoC = "(C) - Snow island";
        p8.opcaoD = "(D) - Ice age";
        p8.opcaoE = "(E) - N.D.A";
        p8.correta = "d";

        p8.escrevaQuestao();
        resposta = p8.leiaResposta();
        System.out.println(resposta);
        p8.isCorreta(resposta);

        //if e else para realizar a contabilização dos acertos e dos erros
        if(p8.isCorreta(resposta)) {
            acertos++;
        }else{}

        System.out.println("-------------------------------------------------------");

        Questao p9= new Questao();
        p9.pergunta = "(9) Qual o nome do melhor amigo do Capitão America ?";
        p9.opcaoA = "(A) - James Barnes";
        p9.opcaoB = "(B) - Steve Rogers";
        p9.opcaoC = "(C) - The winter soldier";
        p9.opcaoD = "(D) - Tony Stark";
        p9.opcaoE = "(E) - N.D.A";
        p9.correta = "a";

        p9.escrevaQuestao();
        resposta = p9.leiaResposta();
        System.out.println(resposta);
        p9.isCorreta(resposta);

        //if e else para realizar a contabilização dos acertos e dos erros
        if(p9.isCorreta(resposta)) {
            acertos++;
        }else{}

        System.out.println("--------------------------------------------------------");

        Questao p10= new Questao();
        p10.pergunta = "(10) Quem deu a aranha de ferro para o Peter ?";
        p10.opcaoA = "(A) - Hulk";
        p10.opcaoB = "(B) - Homem de ferro";
        p10.opcaoC = "(C) - Thor";
        p10.opcaoD = "(D) - Batman";
        p10.opcaoE = "(E) - N.D.A";
        p10.correta = "b";

        p10.escrevaQuestao();
        resposta = p10.leiaResposta();
        System.out.println(resposta);
        p10.isCorreta(resposta);

        //if e else para realizar a contabilização dos acertos e dos erros
        if(p10.isCorreta(resposta)) {
            acertos++;
        }else{}

        System.out.println("--------------------------------------------------------");

        Questao p11= new Questao();
        p11.pergunta = "(11) Quantas joias do infinito existem ?";
        p11.opcaoA = "(A) - 9";
        p11.opcaoB = "(B) - 6";
        p11.opcaoC = "(C) - 3";
        p11.opcaoD = "(D) - 7";
        p11.opcaoE = "(E) - 2";
        p11.correta = "b";

        p11.escrevaQuestao();
        resposta = p11.leiaResposta();
        System.out.println(resposta);
        p11.isCorreta(resposta);

        //if e else para realizar a contabilização dos acertos e dos erros
        if(p11.isCorreta(resposta)) {
            acertos++;
        }else{}

        System.out.println("--------------------------------------------------------");

        Questao p12= new Questao();
        p12.pergunta = "(12) Quantos aliens são disponiveis para o primeiro Ben 10 ?";
        p12.opcaoA = "(A) - 9";
        p12.opcaoB = "(B) - 6";
        p12.opcaoC = "(C) - 3";
        p12.opcaoD = "(D) - 10";
        p12.opcaoE = "(E) - 2";
        p12.correta = "d";

        p12.escrevaQuestao();
        resposta = p12.leiaResposta();
        System.out.println(resposta);
        p12.isCorreta(resposta);

        //if e else para realizar a contabilização dos acertos e dos erros
        if(p12.isCorreta(resposta)) {
            acertos++;
        }else{}

        System.out.println("--------------------------------------------------------");

        Questao p13= new Questao();
        p13.pergunta = "(13) Quantos filmes Velozes e furiosos existem ate o momento ?";
        p13.opcaoA = "(A) - 9";
        p13.opcaoB = "(B) - 6";
        p13.opcaoC = "(C) - 3";
        p13.opcaoD = "(D) - 10";
        p13.opcaoE = "(E) - 2";
        p13.correta = "d";

        p13.escrevaQuestao();
        resposta = p13.leiaResposta();
        System.out.println(resposta);
        p13.isCorreta(resposta);

        //if e else para realizar a contabilização dos acertos e dos erros
        if(p13.isCorreta(resposta)) {
            acertos++;
        }else{}

        System.out.println("--------------------------------------------------------");

        Questao p14= new Questao();
        p14.pergunta = "(14) Quantos filmes Velozes e furiosos existem ate o momento ?";
        p14.opcaoA = "(A) - 9";
        p14.opcaoB = "(B) - 6";
        p14.opcaoC = "(C) - 3";
        p14.opcaoD = "(D) - 10";
        p14.opcaoE = "(E) - 2";
        p14.correta = "d";

        p14.escrevaQuestao();
        resposta = p14.leiaResposta();
        System.out.println(resposta);
        p14.isCorreta(resposta);

        //if e else para realizar a contabilização dos acertos e dos erros
        if(p14.isCorreta(resposta)) {
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