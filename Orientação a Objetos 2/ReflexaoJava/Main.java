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
        int option = 0;
        System.out.println("---------------------------");
        System.out.println("Initializing...");
        System.out.println("Carregando Pacotes...");
        System.out.println("Pack 1/3 - 100%");
        System.out.println("Pack 2/3 - 100%");
        System.out.println("Pack 3/3 - 100%");
        System.out.println("---------------------------");
        System.out.println("Hello User of the Desktop");
        System.out.println("Please, write one option:");
        System.out.println("1 - register user");
        System.out.println("2 - set note");
        System.out.println("3 - calculator median");
        System.out.println("4 - resulte school");
        System.out.println("5 - register one option retry");
        System.out.println("6 - quit");
        System.out.println("---------------------------");
        option = keyboard.nextInt();

        while(option != 6){
            switch(option){
                case 1: // set cadastro do aluno
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

                    option = mainMenu();
                    break;
                    
                case 2: // set notas do aluno
                    double result = 0;
                    while(result == 0){
                    System.out.print("Digite a nota da atividade 1: ");
                    int atividade1 = keyboard.nextInt();
                    result = notas.REFLECTEDtentouEscreverNegativo(atividade1);
                    if(result == 1){
                        break;
                        
                    }
                    notas.setAtv1(atividade1);
                    result = 1;
                    }

                    result = 0;
                    while(result == 0){                    
                    System.out.print("Digite a nota da atividade 2: ");
                    int atividade2 = keyboard.nextInt();
                    result = notas.REFLECTEDtentouEscreverNegativo(atividade2);
                    if(result == 1){
                        break;
                    }
                    notas.setAtv2(atividade2);
                    result = 1;
                    }

                    result = 0;
                    while(result == 0){
                    System.out.print("Digite a nota da atividade 3: ");
                    int atividade3 = keyboard.nextInt();
                    result = notas.REFLECTEDtentouEscreverNegativo(atividade3);
                    if(result == 1){
                        break;
                    }
                    notas.setAtv3(atividade3);
                    result = 1;
                    }

                    result = 0;
                    while(result == 0){
                    System.out.print("Digite a nota da prova 1: ");
                    int prova1 = keyboard.nextInt();
                    result = notas.REFLECTEDtentouEscreverNegativo(prova1);
                    if(result == 1){
                        break;
                    }
                    notas.setNota1(prova1);
                    result = 1;
                    }

                    result = 0;
                    while(result == 0){
                    System.out.print("Digite a nota da prova 2: ");
                    int prova2 = keyboard.nextInt();
                    result = notas.REFLECTEDtentouEscreverNegativo(prova2);
                    if(result == 1){
                        break;
                    }
                    notas.setNota2(prova2);
                    result = 1;
                    }

                    result = 0;
                    while(result == 0){
                    System.out.print("Digite a nota da prova 3: ");
                    int prova3 = keyboard.nextInt();
                    result = notas.REFLECTEDtentouEscreverNegativo(prova3);
                    if(result == 1){
                        break;
                    }
                    notas.setNota3(prova3);
                    result = 1;
                    }
                    option = mainMenu();
                    break; 

                case 3: // calcula media do semestre
                    String resultMedia = notas.calculaMediaSemestre();
                    System.out.println(resultMedia);
                    option = mainMenu();
                    break;

                case 4: // exibi o resultado final entre aprovado ou reprovado
                    String resultMediaSemestre = notas.calculaMediaSemestre();
                    System.out.println(resultMediaSemestre);
                    String aprRec = notas.verificaAprovado_Recusado();
                    System.out.println(aprRec);
                    option = mainMenu();
                    break;

                case 5: // escolhe nova opcao
                    option = mainMenu();
                    break;

                case 6: // finaliza o programa
                    break;

                default: // opcao incorreta
                int i = 6;
                while(i != 0){
                    System.out.println();
                    i--;
                }
                    System.out.println("---------------------------");
                    System.out.println("Error, please write the option correct");
                    mainMenu();
                    break;

            }
        }
        System.out.println("Finalizando programa");
        System.out.println("Thank you");
        System.out.println("---------------------------");


    }
    public static int mainMenu(){
        Scanner key = new Scanner(System.in);
        int option;
        System.out.println("---------------------------");
        System.out.println("Hello User of the Desktop");
        System.out.println("Please, write one option:");
        System.out.println("1 - register user");
        System.out.println("2 - set note");
        System.out.println("3 - calculator median");
        System.out.println("4 - resulte school");
        System.out.println("5 - register one option retry");
        System.out.println("6 - quit");
        System.out.println("---------------------------");
        return option = key.nextInt();
    }
}