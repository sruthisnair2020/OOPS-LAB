class Employee
{
	int sallary,empid;
  String name;
	void read(int id,String n,int s)
	{
		empid=id;
		name=n;
		salary=s;
	}
	void dis()
	{
		System.out.println(empid+" "+name+" "+12*salary);
	}
	public static void main(String arg[])
	{
		Employee emp_1=new Employee();
		emp_1.read(1,"Sruthi",10000);
		ob1.dis();
		Employee emp_2=new Employee();
		emp_2.read(2,"Usha",30000);
		ob2.dis();
	}
}
