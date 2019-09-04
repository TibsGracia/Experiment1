/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment1;


import java.util.Scanner;

/**
 *
 * @author tiburilloma_sd2023
 */
public class Menu {
    
    public void action(){
        System.out.println("\nACTIONS:\nEnter '1' to ADD\nEnter '2' to RETRIEVE\n"
                    + "Enter '3' to UPDATE\nEnter '4' to DELETE\nEnter '5' to EXIT\n");
        System.out.print("Enter your action: ");
    }

    public void mainMenu() {
        OUTER:
        while (true) {
            System.out.println("\nOPTIONS:\nEnter '1' for ACCOUNTS(ArrayList)\nEnter '2' for "
                    + "SUBJECTS(Priority)\nEnter '3' for TEACHERS(SortedSet)\nEnter '4' to Exit\n");
            System.out.print("Enter your option: ");
            Scanner input = new Scanner(System.in);
            int option = input.nextInt();
            switch (option) {
                case 1:
                    listOption();
                    break;
                case 2:
                    queueOption();
                    break;
                case 3:
                    setOption();
                    break;
                case 4:
                    break OUTER;
                default:
                    System.out.println("Invalid Action!\n");
                    break;
            }
        }
    }
    

    public void listOption() {
        List list = new List();
        OUTER:
        while (true) {
            action();
            Scanner input = new Scanner(System.in);
            int option = input.nextInt();
            switch (option) {
                case 1:
                    list.add();
                    break;
                case 2:
                    list.display();
                    break;
                case 3:
                    list.update();
                    break;
                case 4:
                    list.delete();
                    break;
                case 5:
                    break OUTER;
                default:
                    System.out.println("INVALID ACTION!\n");
                    break;
            }
        }
    }
    
    public void setOption() {
        Set set = new Set();
        OUTER:
        while (true) {
            action();
            Scanner input = new Scanner(System.in);
            int option = input.nextInt();
            switch (option) {
                case 1:
                    set.add();
                    break;
                case 2:
                    set.display();
                    break;
                case 3:
                    set.update();
                    break;
                case 4:
                    set.delete();
                    break;
                case 5:
                    break OUTER;
                default:
                    System.out.println("Invalid Action!\n");
                    break;
            }
        }
    }
    
    public void queueOption() {
        Queue que = new Queue();
        OUTER:
        while (true) {
            action();
            Scanner input = new Scanner(System.in);
            int option = input.nextInt();
            switch (option) {
                case 1:
                    que.add();
                    break;
                case 2:
                    que.display();
                    break;
                case 3:
                    que.update();
                    break;
                case 4:
                    que.delete();
                    break;
                case 5:
                    break OUTER;
                default:
                    System.out.println("Invalid Action!\n");
                    break;
            }
        }
    }

}
