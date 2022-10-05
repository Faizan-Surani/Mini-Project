import java.util.Scanner;
public class Calculator
{
	public static void main(String[] args)
	{
		System.out.println("--------Percentage Of 5 Subjects----------");
		int Sub1,Sub2,Sub3,Sub4,Sub5,Per,Total;
		Scanner marks = new Scanner(System.in);
		
		System.out.println("Enter Marks of Sub1:");
		Sub1 = marks.nextInt();
		System.out.println("Enter Marks of Sub2:");
		Sub2 = marks.nextInt();
		System.out.println("Enter Marks of Sub3:");
		Sub3 = marks.nextInt();
		System.out.println("Enter Marks of Sub4:");
		Sub4 = marks.nextInt();
		System.out.println("Enter Marks of Sub5:");
		Sub5 = marks.nextInt();
        
		Total = Sub1+Sub2+Sub3+Sub4+Sub5;

		Per = Total/5;
        System.out.println("Total Marks Of 5 Subject :"+Total);
		System.out.println("Percentage :"+Per+"%");
	}
}  
