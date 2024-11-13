package com.mycompany.lab04exercise01;
import java.util.Scanner;
public class Lab04Exercise01 {
 private String name;
 private      String type;
   private    String processorSpecification;
  private     String RAM;
  private     String hardDiskDrive;
  private     String motherBoard;
  private     String opticalDrive;   
       public Lab04Exercise01(){
           name=null;
           type=null;
           processorSpecification=null;
           RAM=null;
           hardDiskDrive=null;
           motherBoard=null;
           opticalDrive=null;
       }
         public void getValues(){
           
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter name: ");
           name=sc.nextLine();
            System.out.println("Enter type: ");
            type=sc.nextLine();
             System.out.println("Enter processor: ");
             processorSpecification=sc.nextLine();
              System.out.println("Enter RAM: ");
              RAM=sc.nextLine();
                System.out.println("Enter hard disk drive: ");
                hardDiskDrive=sc.nextLine();
                  System.out.println("Enter mother board: ");
                  motherBoard=sc.nextLine();
                    System.out.println("Enter optical drive: ");
                    opticalDrive=sc.nextLine();
             System.out.println("--------------------------------------------\n");
       }
         public void changeInfo()
         {
              Scanner sc = new Scanner(System.in);
        System.out.println("\nWhich information do you want to change?");
        System.out.println("1. Name\n2. Type\n3. Processor Specification\n4. RAM\n5. Hard Disk Drive\n6. Motherboard\n7. Optical Drive\n8. Exit");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter new system name: ");
                name = sc.nextLine();
                break;
            case 2:
                System.out.print("Enter new system type (Desktop/Laptop): ");
                type = sc.nextLine();
                break;
            case 3:
                System.out.print("Enter new processor specification: ");
                processorSpecification = sc.nextLine();
                break;
            case 4:
                System.out.print("Enter new RAM size: ");
                RAM = sc.nextLine();
                break;
            case 5:
                System.out.print("Enter new Hard Disk Drive size: ");
                hardDiskDrive = sc.nextLine();
                break;
            case 6:
                System.out.print("Enter new motherboard specification: ");
                motherBoard = sc.nextLine();
                break;
            case 7:
                System.out.print("Enter new optical drive (or type 'None'): ");
                opticalDrive = sc.nextLine();
                break;
            case 8:
                System.out.println("No changes made.");
                break;
            default:
                System.out.println("Invalid choice.");
        }
         }
         public void display()
         {
             System.out.println("Name= "+ name+
"\nType= "+type +
"ProcessorSpecification= "+processorSpecification +
"\nRAM= "+RAM +
"\nHard Disk Drive= "+hardDiskDrive +
"\nMother Board= "+motherBoard +
"\nOptical Drive= "+opticalDrive);
             System.out.println("\n--------------------------------------\n");}
    public static void main(String[] args) {
      Lab04Exercise01 obj=new Lab04Exercise01();
      Scanner sc=new Scanner(System.in);
      obj.getValues();
      obj.display();
      boolean check=false;
      while(!check)
      {
          System.out.println("Do you want to change the Information of computer system?(if yes type 1 else type 0) ");
          int input=sc.nextInt();
          if (input==1)
          {
              obj.changeInfo();
            System.out.println("Information updated successfully!");
              obj.display();
          }
          else if (input==0){
              check=true;
          }
          else {
              System.out.println("Wrong input, enter again");
          }}}}
