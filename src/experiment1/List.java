/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author tiburilloma_sd2023
 */
public class List {

    private ArrayList<ArrayList<String>> accounts = new ArrayList<ArrayList<String>>();

    Scanner input = new Scanner(System.in);

    public void add() {
        ArrayList<String> account = new ArrayList<String>();
        System.out.println("\nPlease input the student's info... ");
        System.out.print("ID number: ");
        account.add(input.nextLine());
        System.out.print("Name: ");
        account.add(input.nextLine());
        System.out.print("Course: ");
        account.add(input.nextLine());
        accounts.add(account);
        System.out.println("ACCOUNT IS SUCCESSFULLY ADDED!\n");
    }

    public void display() {
        System.out.println("\n\tACCOUNTS OF STUDENTS:");
        Iterator itr = accounts.iterator();
        while (itr.hasNext()) {
            System.out.println("\t" + itr.next());
        }
        System.out.println();
    }

    public void update() {
        boolean found = false;
        System.out.println("\nPlease input the student's ID number you want to update...");
        System.out.print("ID number: ");
        String id = input.nextLine();
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).get(0).equals(id)) {
                found = true;
                System.out.println(accounts.get(i));
                System.out.print("Edit Name: ");
                String username = input.nextLine();
                System.out.print("Edit Course: ");
                String passw = input.nextLine();
                accounts.get(i).set(1, username);
                accounts.get(i).set(2, passw);
                break;
            }
        }
        if (found) {
            System.out.println("ACCOUNT IS SUCCESSFULLY UPDATED!\n");
        } else {
            System.out.println("FOUND NO RESULT!\n");
        }

    }

    public void delete() {
        boolean found = false;
        System.out.println("\nPlease input the student's ID number you want to delete...");
        System.out.print("ID number: ");
        String id = input.nextLine();
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).get(0).equals(id)) {
                found = true;
                accounts.remove(i);
                break;
            }
        }
        if (found) {
            System.out.println("ACCOUNT IS SUCCESSFULLY DELETED!\n");

        } else {
            System.out.println("FOUND NO RESULT!\n");
        }
    }

}
