package application;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Pessoa> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1 ; i <= n; i++) {
            System.out.println("Tax payer " + i + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);

            if (ch == 'i') {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add( new PessoaFisica(name, anualIncome, healthExpenditures));
            }else {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("Number of employees:");
                int numOfEmployees = sc.nextInt();
                list.add(new PessoaJuridica(name, anualIncome, numOfEmployees));
            }

        }
        System.out.println();
        System.out.println("TAXES PAID: ");
        double tottax = 0.0;

        for (Pessoa p : list) {
            System.out.println(p.getName() + ": " + "$ " + String.format("%.2f",p.tax()));
            tottax += p.tax();
        }
        System.out.print("TOTAL TAXES: " + "$ " + String.format("%.2f", tottax));
        sc.close();
    }
}
