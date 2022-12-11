import java.util.Scanner;
public class allAlphabetChecker {
	public static void main(String[] args) {
		int i,j;
		char alpha;
		Scanner s1=new Scanner(System.in);
		System.out.println(" enter the alphabet Capital latter:\n ");
		alpha=s1.next().charAt(0);
		switch(alpha)
		{
			case 'A':
		for(i=1; i<=6; i++)
		{
			for(j=1; j<=4; j++)
			{
				if((i==1&&j>1&&j<4) || (j==1&&i>1) || (i==4) || (j==4&&i>1))
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.print("\n");
}
			break;
			case 'B':
			for(i=1; i<=7; i++)
			{
				for(j=1; j<=4; j++)
			{
				if((j==1) || (i==1&&j<4) || (i==4&&j<4) || (i==7&&j<4) || (j==4&&i>1&&i<4) || (j==4&&i>4&&i<7))
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.print("\n");
		}
			break;
			case 'C':
				for(i=1; i<=6; i++)
		{
			for(j=1; j<=5; j++)
			{
				if ((j==1&&i>1&&i<6) || (i==1&&j>1&&j<5) || (i==6&&j>1&&j<5) || (j==5&&i>1&&i<3)|| (j==5&&i>4&&i<6))
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		break;
		case 'D':
			for(i=1; i<=6; i++)
		{
			for(j=1; j<=6; j++)
			{
				if ((i==1&&j<6) || (j==1) || (i==6&&j<6) || (j==6&&i>1&&i<6))
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		break;
		case 'E':
				for(i=1; i<=5; i++)
		{
			for(j=1; j<=4; j++)
			{
				if((i==1) || (i==3) || (i==5) || (j==1))
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		break;
		case 'F':
				for(i=1; i<=5; i++)
		{
			for(j=1; j<=5; j++)
			{
				if((i==1) || (i==3) || (j==1))
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		break;
		case 'G':
				for(i=1; i<=6; i++)
		{
			for(j=1; j<=6; j++)
			{
				if ((i==1&&j>1&&j<5) || (j==1&&i>1&&i<6) || (i==6&&j>1&&j<4) || (i==5&&j>3&&j<5)|| (i==4&&j>3) ||(j==5&&i>1&&i<3)|| (i==5&&j>1&&j>5) || (j==5&&i<2&&i>3) || (j==4&&i<2&&i>3) ||(j==6&&i>3))
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		break;
		case 'H':
			for(i=1; i<=5; i++)
		{
			for(j=1; j<=4; j++)
			{
				if(j==1 || i==3 || j==4)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		break;
		case 'I':
			for(i=1; i<=5; i++)
		{
			for(j=1; j<=5; j++)
			{
				if(i==1 || j==3 || i==5)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		break;
		case 'J':
		for(i=1; i<=6; i++)
		{
			for(j=1; j<=5; j++)
			{
				if((i==1) || (j==3&&i<6) || (i==6&&j<3) || (j==1&&i>4))
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		break;
		case 'K':
			for(i=1; i<=9; i++)
		{
			for(j=1; j<=6; j++)
			{
				if((j==1) || (j==7-i) || (j==i-3))
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		break;
		case 'L':
				for(i=1; i<=5; i++)
		{
			for(j=1; j<=5; j++)
			{
				if((j==1) || (i==5))
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		break;
		case 'M':
			for(i=1; i<=4; i++)
		{
			for(j=1; j<=7; j++)
			{
				if((j==1) || (j==i&&i<4) || (j==6-i&&j>2) || (j==5))
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		break;
		case 'N':
			for(i=1; i<=5; i++)
		{
			for(j=1; j<=5; j++)
			{
				if ((j==1) || (j==i) || (j==5))
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		break;
		case 'O':
			for(i=1; i<=5; i++)
		{
			for(j=1; j<=5; j++)
			{
				if ((j==1&&i>1&&i<5) || (i==1&&j>1&&j<5) || (i==5&&j>1&&j<5) || (j==5&&i>1&&i<5))
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		break;
		case 'P':
		for(i=1; i<=7; i++)
		{
			for(j=1; j<=5; j++)
			{
				if ((j==1) || (i==1&&j<5) || (i==4&&j<5) || (j==5&&i>1&&i<4))
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		break;
		case 'Q':
			for(i=1; i<=6; i++)
		{
			for(j=1; j<=5; j++)
			{
				if ((j==1&&i>1&&i<5) || (i==1&&j>1&&j<5) || (i==5&&j>1&&j<4) || (j==5&&i>1&&i<5) || (i==6&&j>5)|| (j==i&&i>2))
				System.out.print("*");
				else
			System.out.print(" ");
			}
			System.out.print("\n");
		}
		break;
		case 'R':
			for(i=1; i<=7; i++)
		{
			for(j=1; j<=4; j++)
			{
				if((j==1) || (i==1&&j<4) || (i==4&&j<4) || (j==4&&i>1&&i<4) || (j==i-3))
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		break;
		case 'S':
			for(i=1; i<=7; i++)
		{
			for(j=1; j<=5; j++)
			{
				           if((i==1&& j>1 && j<5) || (j==1 && i>1 && i<4)||(j==1&&i>5&&i<7) ||(i==4&& j>1 && j<5) ||(j==5 && i>1 && i<3) ||(j==5 && i>4 && i<7)||(i==7&& j>1 && j<5))                
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		break;
		case 'T':
			for(i=1; i<=6; i++)
		{
			for(j=1; j<=6; j++)
			{
				if (i==1 || j==3)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		break;
		case 'U':
			for(i=1; i<=6; i++)
		{
			for(j=1; j<=6; j++)
			{
				if ((j==1&&i<5) || (j==5&&i<5) || (i==5&&j>1&&j<5))
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		break;
		case 'V':
		for(i=1; i<=4; i++)
		{
			for(j=1; j<=7; j++)
			{
				if (j==i || j==8-i)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		break;
		case 'W':
			for(i=1; i<=4; i++)
		{
			for(j=1; j<=7; j++)
			{
				if((j==1) || (j==5-i) || (j==3+i) || (j==7))
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		break;
		case 'X':
			for(i=1; i<=5; i++)
		{
			for(j=1; j<=5; j++)
			{
				if(j==i || j==6-i)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		break;
		case 'Y':
			for(i=1; i<=5; i++)
		{
			for(j=1; j<=5; j++)
			{
				if((j==i&&i<4) || (j==6-i&&i<3) || (j==3&&i>2))
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		break;
		case 'Z':
			for(i=1; i<=5; i++)
		{
			for(j=1; j<=5; j++)
			{
				if ((i==1) || (j==6-i) || (i==5))
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		break;
		default:
		System.out.println("not valid alphabet");
		break;
		}
	}
}