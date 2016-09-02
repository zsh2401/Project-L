class Hello//打印出一段自己想说的话
{
	public static void main(String[]args)
	{
		System.out.println("这是我开始学习JAVA的第三天,第一次自我测试");
	}
}


class DoWhile  //计算1+2+3.....+100的值
{
	public static void main(String[]args)
	{
		int x=0,y=1 ;
		do
		{
			x=x+y;
			y++;
		}
		while (y<=100);
		System.out.println("x="+x);
	}
}
class While //用循环语句从1数到1000
{
	public static void main(String[]args)
	{
		int x=0;
		while (x<=1000)
		{
			System.out.println("x="+x);
			x++;
		}

	}

}
class ForNumCheck//1000以内有几个10的倍数
{
	public static void main(String[]args)
	{
		int c=0;
		for (int x=1;x<=1000 ;x++ )
		{
			if (x%10==0)
			{
				c++;
			}
						
		}
		System.out.println(c+"个10的倍数,在1000内");
	}
}
class For4//打印出一个菱形
{
	public static void main(String[]args)
	{
		for (int x=0;x<=4;x++ )//上半部分
		{
			for (int y=0;y<=x;y++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}

		for (int x=5;x>0 ;x-- )//下半部分
		{
			for (int y=x;y>0 ;y-- )
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
class ForNum
/*打印出
1
1 2
1 2 3
........
1 2 3 4 5 6 7 8 9
*/
{
	public static void main(String[]args)
	{
		for (int x=1;x<=9 ;x++ )
		{
			for (int y=1;y<=x;y++ )
			{
				System.out.print(y+" ");
			}
		System.out.println();
		}
	}
}
class IfTest //用else判断季节
{
	public static void main(String[]args)
	{
		int x=6;
		if (x>12 && x<1)
		{
			System.out.println(x+":不是正常数值");
		}
		else if (x>=3 && x<=5)
		{
			System.out.println(x+"月是春季");
		}
		else if (x>=6 && x<=8)
		{
			System.out.println(x+"月是夏季");
		}
		else if (x>=9 && x<=11)
		{
			System.out.println(x+"月是秋季");
		}
		else 
		{
			System.out.println(x+"月是冬季");
		}
	}
}
class Switch//通过Switch判断月份
{
	public static void main(String[]args)
	{
		int x=19;
		switch (x)
		{
			case 3:
			case 4:
			case 5:
				System.out.println(x+"是春季");
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

			default :
				System.out.println(x+"月是不存在的");
				break;

		}

	}
}