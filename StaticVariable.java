public class StaticVariable{
	//salary variable is a private static variable
	private static double salary;

	//DEPARTMENT is a constant
	public static final String DEPARTMENT= "Development";

	public static void main(String args[])
	{
		salary=1000;
		System.out.print(DEPARTMENT + " average salary " + salary);
	}
}