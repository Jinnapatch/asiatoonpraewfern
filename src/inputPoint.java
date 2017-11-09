import java.util.Scanner;

public class inputPoint
{
	public static void main(String[] args)
	{
		String quiz;
		int student=5;
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Please input the number of Quiz : ");
		quiz=sc.nextLine();
		//String enter=sc.nextLine();
		String numgrade[][] = new String [Integer.parseInt(quiz)][student];
		for(int i=0;i<Integer.parseInt(quiz);i++){
			i=i+1;
			System.out.println("Quiz :"+ i);
			i=i-1;
			for(int j=0;j<student;j++){
				j=j+1;
				System.out.print("input point student "+" "+j+" :");
				j=j-1;
				numgrade[i][j]=sc.nextLine();
				
			}
		}
		for(int i=0;i<Integer.parseInt(quiz);i++){
			i=i+1;
			System.out.println("Quiz :"+i);
			i=i-1;
			for(int j=0;j<student;j++){
				System.out.println("input point student "+(j+1)+" :"+" "+numgrade[i][j]);
			}
		}
	}
}
