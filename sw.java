class sw
{
	public static void main(String[]args)
	{
		int x=9;
		switch(x)
		{
		case 3:
		case 4:
		case 5:
			System.out.println(x+"月是春季");
			break;

		case 6:
		case 7:
		case 8:
			System.out.println(x+"月是夏季");
			break;

		case 9:
		case 10:
		case 11:
			System.out.println(x+"月是秋季");
			break;

		case 12:
		case 1:
		case 2:
			System.out.println(x+"月是冬季");
			break;
		default:
			System.out.println(x+"是错误的数值请检查");
	    
		}

		
	}
}