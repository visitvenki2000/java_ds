import java.util.Scanner;

public class ArrayMissing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int a[]=new int[n-1];
		    for(int i=0;i<n-1;i++) {
		    	a[i]=sc.nextInt();
		    	
		        System.out.println("i value"+1);
		    }
		    int sum=0;
		    for(int i=0;i<n-1;i++) sum+=a[i];
		    System.out.println((n*(n+1)/2)-sum);
		}

	}

}
