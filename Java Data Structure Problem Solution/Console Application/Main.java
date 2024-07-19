import java.util.*;
public class Main {
    static void menu()
    {
        System.out.println("............................................");
        System.out.print("1. Calculator.\t");
        System.out.println("2. Number Guessing Game.");
        System.out.println("3. Exit.");
        System.out.println("............................................");
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("............................................");
        System.out.println("Hiii...!!");
        System.out.println("Welcome to My Application");
        System.out.println();
        System.out.println("............................................");
        System.out.println();
        System.out.println("There are two choice this in My Application");
        int Choice=0;
        while(Choice!=3)
        {
            menu();
            System.out.print("Enter Your Choice : ");
            int choice=obj.nextInt();
            switch (choice) {
                case 1:
                    Calculate cal=new Calculate();
                    choice=cal.problem();
                    break;
                case 2:
                    Guessing gue=new Guessing();
                    choice=gue.game();
                    break;
                    
                case 3:
                    System.out.println("Thanks You And Welcome...!");
                    break;
            }
            Choice=choice;
        }
    }
}