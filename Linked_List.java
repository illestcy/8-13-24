// package com.demo.Linked_List;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Linked_List {

        public static void main(String[] args) throws NumberFormatException, IOException {

            LinkedList <String> lls = new LinkedList<>();

            lls.add("Element 1");
            lls.add("Element 2");
            lls.add("Element 3");

            System.out.println("Original List" + lls);

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String element;
            int position,choice = 0;

            while(choice < 4) {
                System.out.println("\n LINKEDLIST OPERATOR");
                System.out.println("1. Add Element");
                System.out.println("2. Remove Element");
                System.out.println("3. Change Element");
                System.out.println("4. Display");
                System.out.println("5. Exit");

                System.out.println("Enter your Choice");
                choice = Integer.parseInt(br.readLine());

                switch(choice){
                    case 1 :
                        System.out.println("Enter Element : ");
                        element = br.readLine();

                        System.out.println("Enter Position : ");
                        position = Integer.parseInt(br.readLine());
                        lls.add(position-1,element);

                        break;
                    case 2 :
                    System.out.println("Enter Position you want to remove");
                    position = Integer.parseInt(br.readLine());
                    lls.remove(position-1);
                    
                        break;
                    case 3 :
                        System.out.println("Enter Position : ");
                        position = Integer.parseInt(br.readLine());

                        System.out.println("Change Element : ");
                        element = br.readLine();
                        lls.set(position-1, element);

                        break;
                    case 4 :
                        Iterator it = lls.iterator();
                        while (it.hasNext()) {
                            System.out.println("List = " + it.next());
                        }

                }

            }



            // Scanner sc = new Scanner(System.in);

            // int sum = 0, count = 0;

            // while (sc.hasNextInt()) {
            //     int num = sc.nextInt();
            //     sum += num;
            //     count++;
                
            // }
            // if (count > 0) {
            //     int mean = sum / count;
            //     System.out.println("Mean = " + mean);
            // }
            // else{
            //     System.out.println("Invalid");
            // }

            // Scanner sc = new Scanner(System.in);

            // System.out.println("Enter your Name : ");
            // String name = sc.nextLine();
            // System.out.println("Enter your Gender");
            // char gender = sc.next().charAt(0);
            // System.out.println("Enter your Age ");
            // int age = sc.nextInt();
            // System.out.println("Enter your GWA");
            // double gwa = sc.nextDouble();

            // System.out.println("Name = " + name);
            // System.out.println("Gender = " + gender);
            // System.out.println("Age = " + age);
            // System.out.println("GWA = " + gwa);


            // LinkedList <String> lls = new LinkedList<>();

            // lls.add("Element1");
            // lls.add("Element2");
            // lls.addFirst("Element0");
            // lls.addLast("Element4");

            // System.out.println("==============================");
            // for (int i = 0; i < lls.size(); i++){
            //     System.out.println("Get List = " + lls.get(i));
            // } 
            
            //     System.out.println("THISISIT");
            //     for (String str : lls){
            //         System.out.println("Each List = " + str);
            //     }
            //     System.out.println("PANG HARANG");
            //     Iterator it = lls.iterator();
            //     while(it.hasNext()) {
            //         System.out.println(("Iterator List = " + it.next()));
            //     }
            //     System.out.println("PANG HARANG");
            //     Object [] arr = lls.toArray();

            //     for(Object arr1 : arr){
            //         System.out.println("Array List = " + arr1);
            //     }
            // // System.out.println("List = " + lls);

            // // lls.remove("Element1");
            // // lls.removeFirst();
            // // lls.removeLast();
            // // lls.remove(0);

            // // System.out.println("List =");
            
        }

}


