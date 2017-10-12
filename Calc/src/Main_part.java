import java.util.Scanner;


public class Main_part extends Acitive{
	
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to our Calculator:");   
        System.out.println("Press A for arithmatic operation");
       // System.out.println("Press L for Logarithomic operation");
    //    System.out.println("Press T for Trigonometry operation");
        
       
        String s=sc.nextLine();
        
        if("A".toUpperCase().equals(s)) {
        	
        	
        	Acitive obj=new Acitive();
        	double c=obj.cal();
        }
	}

}
