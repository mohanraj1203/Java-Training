import java.util.*;
interface Display
{
    void dis_menu();
}
class Operation implements Display
{
    public void dis_menu()
    {
        System.out.println("............................................");
        System.out.println("Continues with calculator Enter 5");
        System.out.println("Exit from the Application Enter 3");
        System.out.println("If You are Going to the Main Menu Enter 6");
    }
    public static double solution(int num1,int num2,char op)
    {
        double result=0;
        switch (op) {
            case '*':
                result=num1*num2;
                break;

            case '+':
                result=num1+num2;
                break;
            
            case '-':
                result=num1-num2;
                break;
            
            case '/':
                result=num1/num2;
                break;
        }
        return result;
    }
}
public class Calculate extends Operation {
    int num1;
    int num2;
    int result;
    Calculate()
    {
        System.out.println("............................................");
        System.out.println("Thank You!...You Choosed Calculator");
    }
    public int problem()
    {
        Scanner obj=new Scanner(System.in);
        dis_menu();
        int Choice=obj.nextInt();
        while(Choice!=3 && Choice!=6){
            System.out.println("............................................");
            System.out.print("Enter Operation Like (*,+,-,/) : ");
            char op=obj.next().charAt(0);
            if(op=='/')
            System.out.println("Don't Enter Number 2 as '0'");
            System.out.print("Enter Number 1 : ");
            this.num1=obj.nextInt();
            System.out.print("Enter Number 2 : ");
            this.num2=obj.nextInt();
            System.out.println("The solution of "+ num1 +" "+op+" "+num2+"="+(int)solution(num1, num2, op));
            System.out.println("............................................");
            dis_menu();
            Choice=obj.nextInt();
        }
        return Choice;
    }
}