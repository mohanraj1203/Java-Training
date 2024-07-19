import java.util.*;
import javax.sound.midi.Soundbank;
interface Display1
{
    void dis_menu();
}
public class Guessing implements Display1{
    Guessing()
    {
        System.out.println("............................................");
        System.out.println("Thank You!...You Choosed Guessing Game");
    }
    public void dis_menu()
    {
        System.out.println("............................................");
        System.out.println("Continues with Guessing Game Enter 5");
        System.out.println("Exit from the Application Enter 3");
        System.out.println("If You are Going to the Main Menu Enter 6");
    }
    public int game()
    {
        Scanner obj=new Scanner(System.in);
        dis_menu();
        int Choice=obj.nextInt();
        while(Choice!=3 && Choice!=6){
            System.out.println("You Have three chance...");
            System.out.print("Enter the Guessing Number : ");
            int num=obj.nextInt();
            int count=0;
            Random random = new Random();
            int r_num=random.nextInt(10);
            if(num<-1 && num>11)
            {
                System.out.println("Enter valid input : ");
                num=obj.nextInt();
            }
            while(true)
            {
                if(num==r_num){
                    System.out.println("Congratulation!.. Your Win the Game!!!");
                    break;
                }
                else if(num<r_num){
                    System.out.println("The number is too low");
                    System.out.println("Enter again");
                    num=obj.nextInt();
                }
                else{
                    System.out.println("The Number is too high");
                    System.out.println("Enter again");
                    num=obj.nextInt();
                }
                count++;
                if(count==3)
                {
                    System.out.println("You loss the game");
                    break;
                }
            }
            dis_menu();
            Choice=obj.nextInt();
        }
        return Choice;
    }
}
