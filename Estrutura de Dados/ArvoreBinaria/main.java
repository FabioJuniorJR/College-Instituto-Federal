import java.util.Scanner;

public class main {
    
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        ArvoreBinaria a = new ArvoreBinaria();
        a.insere(1, 
                    a.insere(2,
                             null,
                             a.insere(4, null, null)
                             ),
                        a.insere(3,
                                 a.insere(5, null, null),
                                 a.insere(6, null, null)
                                 )
                        );
    System.out.println(a.toString());
    System.out.println();

    
    int num;
    System.out.print("Digite um numero para ver se ele pertence a Arvore ou  não: ");
    num = keyboard.nextInt();
    System.out.println("O numero " + num + " pertence a esta Arvore? " + a.pertence(num));
    System.out.print("Digite um numero para ver se ele pertence a Arvore ou  não: ");
    num = keyboard.nextInt();
    System.out.println("O numero " + num + " pertence a esta Arvore? " + a.pertence(num));
    System.out.println();

    a.imprimiPos(null);
    



    keyboard.close();

    }
}