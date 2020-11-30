package L_1;


import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        PC firstPC = new PC();
        System.out.print("Введите частоту процессора:");
        Scanner sc=new Scanner(System.in);
         int z=sc.nextInt();
         if (z>3000) {
             firstPC.setCpu(z);
             firstPC.printPCttx();
         }
         else {
             firstPC.setCpu(z);
             System.out.println("Это калькулятор, а не комп");
             System.out.println("Лучше возьми вот такой ноут");

             Notebook firstNote = new Notebook(3500, "Lenovo", 15);
             firstNote.printPCttx();

             int a = firstPC.getCpu();
             int b = firstNote.getCpu();
             System.out.println();
             System.out.println(a + "- МГц это твой запрашиваемый проц");
             System.out.println(b + "- МГц это предлагаемый нами проц");

         }

         }

    }
