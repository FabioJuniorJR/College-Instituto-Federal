package ReflexaoJava;
import java.util.Scanner;
public class Main {

    public static void main(String[] ãrgs) {
        Scanner keyboard = new Scanner(System.in);
        Pessoa pessoa = new Pessoa(/*"437179572", "Fábio Adriano Correa de Oliveira Junior", "57234556X", "12/12/2003"*/ );
        Notas notas = new Notas();
        /*
    

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
        //System.out.println(aprovadoNot.toString());*/
        System.out.println("---------------------------");
        System.out.println("Initializing...");
        System.out.println("Carregando Pacotes...");
        System.out.println("Pack 1/3 - 100%");
        System.out.println("Pack 2/3 - 100%");
        System.out.println("Pack 3/3 - 100%");
        int option = 0;
        while(option != 4){
            System.out.println("---------------------------");
            System.out.println("Hello User of the Desktop");
            System.out.println("Please, write one option:");
            System.out.println("1 - register user");
            System.out.println("2 - set note");
            System.out.println("3 - calculator median");
            System.out.println("4 - resulte school");
            System.out.println("5 - quit");
            System.out.println("---------------------------");
            option = keyboard.nextInt();

            switch(option){
                case 1:
                    System.out.print("Digite o nome do Aluno: ");
                    String name = keyboard.next();
                    pessoa.setNome(name);

                    System.out.print("Digite o cpf do Aluno: ");
                    String cpf = keyboard.next();
                    pessoa.setCpf(cpf);

                    System.out.print("Digite o cep do Aluno: ");
                    String cep = keyboard.next();
                    pessoa.setCep(cep);

                    System.out.print("Digite a dataNascimento do Aluno: ");
                    String dataNascimento = keyboard.next();
                    pessoa.setDataNascimento(dataNascimento);

                    System.out.print("Digite o rg do Aluno: ");
                    String rg = keyboard.next();
                    pessoa.setRg(rg);

                    System.out.print("Digite numero do endereco do Aluno: ");
                    int numeroEnd = keyboard.nextInt();
                    pessoa.setNumeroEnd(numeroEnd);

                    System.out.print("Digite o nome da rua do Aluno: ");
                    String rua = keyboard.next();
                    pessoa.setRua(rg);

                    System.out.print("Digite o numero do apartamento do Aluno: ");
                    int apto = keyboard.nextInt();
                    pessoa.setApto(apto);
                    break;
                    
                case 2:
                    double result = 0;
                    while(result != 0){
                    System.out.print("Digite a nota da atividade 1: ");
                    int atividade1 = keyboard.nextInt();
                    result = notas.REFLECTEDtentouEscreverNegativo(atividade1);
                    notas.setAtv1(atividade1);
                    }

                    result = 0;
                    while(result != 0){                    
                    System.out.print("Digite a nota da atividade 2: ");
                    int atividade2 = keyboard.nextInt();
                    notas.setAtv1(atividade2);
                    }

                    result = 0;
                    while(result != 0){
                    System.out.print("Digite a nota da atividade 3: ");
                    int atividade3 = keyboard.nextInt();
                    notas.setAtv1(atividade3);
                    }

                    result = 0;
                    while(result != 0){
                    System.out.print("Digite a nota da prova 1: ");
                    int prova1 = keyboard.nextInt();
                    notas.setAtv1(prova1);
                    }

                    result = 0;
                    while(result != 0){
                    System.out.print("Digite a nota da prova 2: ");
                    int prova2 = keyboard.nextInt();
                    notas.setAtv1(prova2);
                    }

                    result = 0;
                    while(result != 0){
                    System.out.print("Digite a nota da prova 3: ");
                    int prova3 = keyboard.nextInt();
                    notas.setAtv1(prova3);
                    }


                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                default:
                    System.out.print("Error, please write the option correct");
            }
        }


    }
}