/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment1;

import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author tiburilloma_sd2023
 */
public class Set {

    private SortedSet<String> teachers = new TreeSet<String>();

    Scanner input = new Scanner(System.in);

    public void add() {
        System.out.println("\nPlease input name of teacher...");
        System.out.print("Name: ");
        String name = input.nextLine();
        teachers.add(name);
        System.out.println("NEW TEACHER IS SUCCESSFULLY ADDED!\n");

    }

    public void display() {
        System.out.println("\n\tALL TEACHERS:");
        Iterator itr = teachers.iterator();
        while (itr.hasNext()) {
            System.out.println("\t" + itr.next());
        }
        System.out.println();
    }

    public void update() {
        System.out.println("\nPlease input teacher's name you want to update...");
        System.out.print("Name: ");
        String name = input.nextLine();
        if (teachers.contains(name)) {
            teachers.remove(name);
            System.out.print("Edit name: ");
            String edit = input.nextLine();
            teachers.add(edit);
            System.out.println("TEACHER IS SUCCESSFULLY UPDATED!\n");
        } else {
            System.out.println("FOUND NO RESULT!\n");
        }

    }

    public void delete() {
        System.out.println("\nPlease input teacher's name you want to delete...");
        System.out.print("Name: ");
        String name = input.nextLine();
        if (teachers.contains(name)) {
            teachers.remove(name);
            System.out.println("TEACHER IS SUCCESSFULLY DELETED!\n");
        } else {
            System.out.println("FOUND NO RESULT!\n");
        }
    }
}
