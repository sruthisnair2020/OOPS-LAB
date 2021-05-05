class Rectangle
{
	double width,length,area;
	String color;
	Rectangle(double w,double l,String c)
	{
		width=w;
		length=l;
		color=c;
	}
	void Area()
	{
		area=width*length;
	}
	void dis()
	{
		System.out.println("width="+width+"  length="+length+"  area="+area+"  color="+color);
	}
	public static void main(String[] args)
	{
		Rectangle ob1=new Rectangle(10.0,1.1,"black");
		ob1.Area();
		ob1.dis();
		
		Rectangle ob2=new Rectangle(1.1,10.0,"blue");
		ob2.Area();
		ob2.dis();

		if(ob1.color==ob2.color && ob1.area==ob2.area)
		{
				System.out.println("Matching Rectangles");
		}
		else
		{
			System.out.println("Non-Matching Rectangles");
		}
		
	}
}
