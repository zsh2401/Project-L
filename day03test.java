class Hello//��ӡ��һ���Լ���˵�Ļ�
{
	public static void main(String[]args)
	{
		System.out.println("�����ҿ�ʼѧϰJAVA�ĵ�����,��һ�����Ҳ���");
	}
}


class DoWhile  //����1+2+3.....+100��ֵ
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
class While //��ѭ������1����1000
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
class ForNumCheck//1000�����м���10�ı���
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
		System.out.println(c+"��10�ı���,��1000��");
	}
}
class For4//��ӡ��һ������
{
	public static void main(String[]args)
	{
		for (int x=0;x<=4;x++ )//�ϰ벿��
		{
			for (int y=0;y<=x;y++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}

		for (int x=5;x>0 ;x-- )//�°벿��
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
/*��ӡ��
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
class IfTest //��else�жϼ���
{
	public static void main(String[]args)
	{
		int x=6;
		if (x>12 && x<1)
		{
			System.out.println(x+":����������ֵ");
		}
		else if (x>=3 && x<=5)
		{
			System.out.println(x+"���Ǵ���");
		}
		else if (x>=6 && x<=8)
		{
			System.out.println(x+"�����ļ�");
		}
		else if (x>=9 && x<=11)
		{
			System.out.println(x+"�����＾");
		}
		else 
		{
			System.out.println(x+"���Ƕ���");
		}
	}
}
class Switch//ͨ��Switch�ж��·�
{
	public static void main(String[]args)
	{
		int x=19;
		switch (x)
		{
			case 3:
			case 4:
			case 5:
				System.out.println(x+"�Ǵ���");
				break;

			case 6:
			case 7:
			case 8:
				System.out.println(x+"�����ļ�");
				break;

		
			case 9:
			case 10:
			case 11:
				System.out.println(x+"�����＾");
				break;

			case 12:
			case 1:
			case 2:
				System.out.println(x+"���Ƕ���");
				break;

			default :
				System.out.println(x+"���ǲ����ڵ�");
				break;

		}

	}
}