class complex
{
	int real,img;
	void read(int r,int i)
	{
		real=r;
		img=i;
	}
	void dis()
	{
		System.out.println("Sum="+real+"+i"+img);
	}
	complex sum(complex n)
	{
		complex tmp=new complex();
		tmp.real=this.real+n.real;
		tmp.img=this.img+n.img;
		return tmp;
	}
	public static void main(String[] args)
	{
		complex com_1=new complex();
		complex com_2=new complex();
		com_1.read(1,2);
		com_2.read(3,4);
		complex com_3=new complex();
		com_3=com_1.sum(com_2);
		com_3.dis();
	}
}
		
