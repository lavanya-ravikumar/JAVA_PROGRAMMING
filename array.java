import java.util.Scanner;
import java.util.Arrays;
public class array
{
	public static void main(String[] args) {
	    Scanner scanner=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=scanner.nextInt();
		int[]a=new int[n];
		System.out.println("Enter Array Elements");
		for(int i=0;i<n;i++){
		    a[i]=scanner.nextInt();
		}
		for(int i=0;i<n;i++){
		    System.out.println("The Elements of the Array are "+a[i]);
		}
		scanner.close();
		
	}
}
