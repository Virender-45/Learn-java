import java.util.Arrays;
import java.util.Scanner;   //For taking input

public class Main {

    public static void main(String[] args) {
        /*byte age = 20;
        int phone = 856523234;
        long phone2 = 85652323445353L;
        float pi = 3.14F;
        System.out.println(name);

        //Non premitive types
        String fname = "Virender";
        String lname = new String("Singh");

        String fullName = fname + " " + lname;

        System.out.println(fullName);
        System.out.println(fullName.charAt(4));

        String replaceName = fullName.replace('e', 'a');
        System.out.println(replaceName);

        //Sub String
        System.out.println(fullName.substring(0, 8));


        //Arrays

        int age = 20;

        int[] marks = new int[3];
        //int[] marks = {99, 91, 94};       Other way of declaring without 'new' keyword
        marks[0] = 99;
        marks[1] = 91;
        marks[2] = 94;

      for (int i = 0; i < 3; i++) {
          System.out.println(marks[i]);
      }
      System.out.println(marks.length);

      System.out.println(marks[0]);
      Arrays.sort(marks);
      System.out.println(marks[0]);
      for (int i = 0; i < 3; i++) {
          System.out.println(marks[i]);
      }
        //2D Arrays
        int[][] marks = {{97, 96, 92}, {87, 94, 99}};

        for(int i = 0; i < marks.length; i++){
            for(int j = 0; j < marks[i].length; j++){
                System.out.println(marks[i][j]);
            }
        }

        //Casting

        double price = 100.00;
        double finalPrice = price + 18;

        System.out.println(finalPrice);

        int p = 100;
        int fP = p + (int)18.0;

        System.out.println(fP);

        //Casting

        int age = 20;
        age = 21;
        age = 22;

        final float PI = 31.14F;


        //Operators

        int a = 10;
        int b = 3;
        int sum = a + b;
        int mul = a * b;
        int diff = a - b;
        System.out.println(sum);
        System.out.println(mul);
        System.out.println(diff);

        double a1 = 10;
        double b1 = 3;
        double div = a1 / b1;
        System.out.println(div);

        //Maths Class functions

        System.out.println(Math.max(10, 7));
        System.out.println(Math.min(10, 7));
        System.out.println((int)(Math.random()*100));   //casting

        //Taking input

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        //System.out.println(age);
        if(age >= 18)
            System.out.println("You are an adult now because your age is : " + age);
        else
            System.out.println("You are not an adult because your age is : " + age);

        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.print(name);


        //Switch Statement

        int day;
        System.out.print("Enter number of the day : ");
        Scanner sc = new Scanner(System.in);
        day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thrusday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invaild Input");
        }

        //Loops, for
        for (int i = 0; i <= 100; i++)
            System.out.println(i);

        for (int i = 100; i >= 1; i--)
            System.out.println(i);

        //While loop
        int i = 0;

        while (i <= 100){
            System.out.println(i);
            i++;
        }

        //Do while loop
        int j = 100;
        do {
            System.out.println(j);
            j++;
        }while(j <= 1000);*/


        //Break and continue

        int i = 0;
        while(true){
            if(i == 3) {
                i++;
                continue;
            }
            System.out.println(i);
            if(i >= 10){
                break;
            }

            i++;
        }

    }
}
