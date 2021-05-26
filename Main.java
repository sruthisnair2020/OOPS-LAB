class CPU
{
	int price=23000;
	class Processor
	{
		int no_core=4;
		String manufacture="intel";
		public void dis()
		{
			System.out.println("------Processor----------");
			System.out.println("NO_core="+no_core+"\n"+"Processor Manufacturer="+manufacture);
		}
	}
	static class Ram
	{
		static int memory=4;
		static String manufacturer="IBM";
		void disp()
		{
			System.out.println("-----------Ram-----------");
			System.out.println("Memory="+memory+"\n"+"Ram manufacturer="+manufacturer);
		}
	}
		
		
}
class Main
{
	public static void main(String[] args)
	{
		CPU ob1=new CPU();
		System.out.println("-----CPU------");
		System.out.println("cpu price="+ob1.price);
		CPU.Processor ob2=ob1.new Processor();
		ob2.dis();
		CPU.Ram ob3=new CPU.Ram();
		ob3.disp();
	}
}
