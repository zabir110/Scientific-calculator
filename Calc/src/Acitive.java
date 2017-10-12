import java.util.Scanner;

public class Acitive {
	Scanner scc=new Scanner(System.in);
	Scanner m=new Scanner(System.in);
	public  double cal() {
		System.out.println("Give numbers:");
		double a,sum=0.0;
		String s;
		a=scc.nextDouble();
		s=m.nextLine();
	
		while(true){	
		
			//if("=".equals(s)) return;
		switch (s) {
		case "+":
			
			sum=sum+a;
			System.out.print(sum);
			s=m.nextLine();
			a=scc.nextDouble();
			break;
			
		case "-":	
			sum=sum-a;
			System.out.print(sum);
			s=m.nextLine();
			a=scc.nextDouble();
			break;
			
		case "*":
			sum=sum*a;
			System.out.print(sum);
			 s=m.nextLine();
			a=scc.nextDouble();
			break;
			
		case "/":
	
			sum=sum/a;
			System.out.print(sum);
			 s=m.nextLine();
			a=scc.nextDouble();
			break;
		case "=":
			return 0;
		default:
			break;
		}
		
		
		}
	}
}
