import java.util.ArrayList;
import java.util.Scanner;

public class ShowGrade
{
	public ShowGrade(){
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] grade = {"A","B+","B","C+","C","D+","D","F"};
		String numgrade[] = new String [8];
		for(int i=0;i<8;i++){
			System.out.print(grade[i]+" : ");
			numgrade[i]=sc.nextLine();
		}
		
		for(int i=0;i<8;i++){
			System.out.println(grade[i]+" : "+numgrade[i]);
		}
		/*for (int i = 0; i < grade.length; i++)
		{
			System.out.print(grade[i] +" ");
			String
		}*/
		
		
	}

}
