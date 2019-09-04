/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment1;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author tiburilloma_sd2023
 */
public class Queue {

    private PriorityQueue<String> subjects = new PriorityQueue<String>();

    Scanner input = new Scanner(System.in);

    public void add() {
        System.out.print("\nPlease input name of subject: ");
        String subject = input.nextLine();
        subjects.add(subject);
        System.out.println("NEW SUBJECT IS SUCCESSFULLY ADDED!\n");
    }

    public void display() {
        System.out.println("\n\tALL SUBJECTS:");
        Iterator itr = subjects.iterator();
        while (itr.hasNext()) {
            System.out.println("\t" + itr.next());
        }
        System.out.println();
    }

    public void update() {
        System.out.println("\nPriority subject: " + subjects.peek());
        subjects.poll();
        System.out.print("edit: ");
        String edit = input.nextLine();
        subjects.add(edit);
        System.out.println("PRIORITY IS SUCCESSFULLY UPDATED!\n");

    }
    
    public void delete() {
        OUTER:
        while (true) {
            System.out.println("\nEnter '1' to delete specific subject\nEnter '2' to "
                    + "delete priority subject\nEnter '3' to exit\n");
            int op = input.nextInt();
            input.nextLine();
            switch (op) {
                case 1:
                    System.out.print("Please input the subject you want to delete: ");
                    String name = input.nextLine();
                    if (subjects.contains(name)) {
                        subjects.remove(name);
                        System.out.println("SUBJECT IS SUCCESSFULLY DELETED!\n");
                    } else {
                        System.out.println("FOUND NO RESULT!\n");
                    }   
                    break;
                case 2:
                    subjects.poll();
                    System.out.println("PRIORITY IS SUCCESSFULLY DELETED!\n");
                    break;
                case 3:
                    break OUTER;
                default:
                    System.out.println("INVALID ACTION!\n");
                    break;
            }
        }
    }

}
