class Product
{
	int pcode,price;
	String pname;
	void read(int p_c,int p_r,String p_n)
	{
		pcode=p_c;
		price=p_r;
		pname=p_n;
	}
	void dis()
	{
		System.out.println(pcode+" "+price+" "+pname);
	}
	public static void main(String arg[])
	{
		Product pr_1=new Product();
		pr_1.read(1,9999,"Poco M2 Pro");
		pr_1.dis();
		Product pr_2=new Product();
		pr_2.read(2,59999,"Apple");
		pr_2.dis();
		Product pr_3=new Product();
		pr_3.read(3,1000,"Nokia");
		pr_3.dis();
		if(pr_1.price<pr_2.price && pr_1.price<pr_3.price)
		{
			System.out.println("Poco M2 Pro has lowest price");
		}
		else if(pr_2.price<pr_3.price)
		{
			System.out.println("Apple has lowest cost");
		}
		else
		{
			System.out.println("Nokia has lowest cost");
		}
	}
}
