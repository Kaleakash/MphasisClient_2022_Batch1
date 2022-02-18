import java.util.Scanner;
class Test {
	public static void main(String args[]) {
	Scanner obj = new Scanner(System.in);
	System.out.println("how many details you want to store");
	int n = obj.nextInt();
	int []id = new int[n];
	String []names=new String[n];
	System.out.println("Enter id and name one by one");
	for(int i=0;i<n;i++) {
		System.out.println("Enter the "+(i+1)+" Id ");
		id[i]=obj.nextInt();
		System.out.println("Enter the "+(i+1)+" Name ");
		names[i]=obj.next();
	}
	System.out.println("All details are ");
	for(int i=0;i<n;i++) {
	System.out.println("id is "+id[i]+" Name is "+names[i]);
	}
	}
}