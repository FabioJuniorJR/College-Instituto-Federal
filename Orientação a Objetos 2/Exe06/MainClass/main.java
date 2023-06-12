package MainClass;

import Biblioteca.Pessoa;

import java.sql.Date;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int lengthVet = 5;
        ArrayList<Object> People = new ArrayList<>(lengthVet);

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = null;
        Pessoa newPessoa = new Pessoa();
        String namePeople;
        String cpf;
        String rg;
        String dataNascimento;
        String filiacaoPaterna;
        String filiacaoMaterna;

        do {
            System.out.print("Digite o cpf da pessoa: ");
            cpf = keyboard.nextLine();
        } while (!(cpf instanceof String));
        newPessoa.setCpf(cpf);

        do {
            System.out.print("Digite o nome da pessoa: ");
            namePeople = keyboard.nextLine();
        } while (!(namePeople instanceof String));
        newPessoa.setName(namePeople);

        do {
            System.out.print("Digite o rg da pessoa: ");
            rg = keyboard.nextLine();
        } while (!(rg instanceof String));
        newPessoa.setRg(rg);

        //do {
            System.out.print("Digite a data de nascimento da pessoa DD/MM/AAAAA: ");
            dataNascimento = keyboard.next();
        //} while (!(dataNascimento instanceof String));
        data = LocalDate.parse(dataNascimento, dateFormatter);
        newPessoa.setDataNascimento(data);

        do {
            System.out.print("Digite o nome da filiacao Paterna: ");
            filiacaoPaterna = keyboard.nextLine();
        } while (!(filiacaoPaterna instanceof String));
        newPessoa.setFiliacaoPaterna(filiacaoPaterna);

        do {
            System.out.print("Digite o nome da filiacao Paterna: ");
            filiacaoPaterna = keyboard.nextLine();
        } while (!(filiacaoPaterna instanceof String));
        newPessoa.setFiliacaoPaterna(filiacaoPaterna);

        do {
            System.out.print("Digite o nome da filiacao Materna: ");
            filiacaoMaterna = keyboard.nextLine();
        } while (!(filiacaoMaterna instanceof String));
        newPessoa.setFiliacaoMaterna(filiacaoMaterna);
    
        People.add(newPessoa);
        for(Object peopleObject : People){
            System.out.println(peopleObject);
        }
        

        keyboard.close();
    }
}