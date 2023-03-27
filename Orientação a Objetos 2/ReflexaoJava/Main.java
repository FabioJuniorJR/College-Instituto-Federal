package ReflexaoJava;

public class Main {

    public static void main(String[] ãrgs) {
        Pessoa pessoa = new Pessoa(/*"437179572", "Fábio Adriano Correa de Oliveira Junior", "57234556X", "12/12/2003"*/ );
        Notas notas = new Notas();
        //MediaDecisao aprovadoNot = new MediaDecisao();
        pessoa.setNome("Fábio Adiano Correa de Oliveira Júnior");
        pessoa.setCpf("456-576-123-01");
        pessoa.setCep("8501410");
        pessoa.setDataNascimento("14/12/2003");
        pessoa.setRg("56.374.590-X");
        pessoa.setNumeroEnd(1042);
        pessoa.setRua("Rua Sao Judas Tadeu");
        pessoa.setApto(0);

        notas.setAtv1(9);
        notas.setAtv2(8);
        notas.setAtv3(7);
        notas.setNota1(8);
        notas.setNota2(6);
        notas.setNota3(8);

        //double resultado = aprovadoNot.calculaMediaSemestre();
        //System.out.print(resultado);
        System.out.println("--------------------------------------------------");
        System.out.println(pessoa.toString());
        System.out.println("--------------------------------------------------");
        System.out.println(notas.toString());
        System.out.println("--------------------------------------------------");
        String resultado = notas.verificaAprovado_Recusado(); 
        System.out.println(resultado);
        System.out.println(notas.calculaMediaSemestre());
        System.out.println("--------------------------------------------------");
        //System.out.println(aprovadoNot.toString());
        


    }
}