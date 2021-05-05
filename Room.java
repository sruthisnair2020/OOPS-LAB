class Room
{
	int room_no;
	int room_area;
	String room_type;
	Room(int r,String t,int a)
	{
		room_no=r_n;
		room_type=r_t;
		room_area=r_a;
	}
	Room()
	{
		room_no=111;
		room_type="square";
		room_area=500;
	}
	void dis()
	{
		System.out.println("Room_no:"+room_no+"   Room_type:"+room_type+"   Room_area:"+room_area);
	}
	public static void main(String args[])
	{
		Room ro_1=new Room(1,"Rectangle",100);
		ro_1.dis();
		
		Room ro_2=new Room();
		ro_2.dis();
	}
}
