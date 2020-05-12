DESIGNING A TIC-TAC-TOE GAME IN JAVA TO PROVIDE SOME REFRESHMENT DURING THIS PERIOD

SOLUTION-
import java.util.*;
public class TicToe
{
public static void main(String args[])
{
int i,j,pos1,pos2,c,t=0;
char choice1,choice2;

Scanner sc=new Scanner(System.in);
char gameboard[][]={{' ','|',' ','|',' '},
					{'-','-','-','-','-'},
					{' ','|',' ','|',' '},
					{'-','-','-','-','-'},
					{' ','|',' ','|',' '}};

System.out.println("-----------------------");
print(gameboard);
System.out.println("-----------------------");
System.out.println("Player 1 enter your choice('X' or '0')");
choice1=sc.next().charAt(0);
System.out.println("Player 1 chooses: "+choice1);
if(choice1=='X')
	choice2='0';
else
	choice2='X';

System.out.println("Player 2 chooses: "+choice2);
for(c=1;c<=5;c++)
{
	
if((choice1=='X'||choice1=='0')&&(choice2=='X'||choice2=='0'))
{
 System.out.println("Player 1 enter your position(1 to 9)");
  pos1=sc.nextInt();
 placePlayer1(pos1,choice1,gameboard);
if(checkRow(gameboard,choice1)==1||checkColumn(gameboard,choice1)==1||checkDiagnol1(gameboard,choice1)==3||checkDiagnol2(gameboard,choice1)==3)
{
 System.out.println("Player 1 wins");
 break;
}
else
{
	if(c==5)
	{
		System.out.println("its a tie");
		break;
	}
 System.out.println("Player 2 enter your position(1 to 9)");
  pos2=sc.nextInt();
  placePlayer2(pos2,choice2,gameboard);
  //checkDiagnol1(gameboard,choice2);
  if(checkRow(gameboard,choice2)==1||checkColumn(gameboard,choice2)==1||checkDiagnol1(gameboard,choice2)==3||checkDiagnol2(gameboard,choice2)==3)
{
	System.out.println("Player 2 wins");
			break;
}
}
//System.out.println(c);
}
}

}
public static void print(char gameboard[][])
{
	int i,j;
	for(i=0;i<5;i++)
	{
		for(j=0;j<5;j++)
		{
			System.out.print(" "+gameboard[i][j]);
		}
		System.out.println();
	}
}
public static char[][] placePlayer1(int pos1,char choice1,char gameboard[][])
{
	
	
	switch(pos1)
	{
		case 1:
			if(gameboard[0][0]==' ')
			{
			gameboard[0][0]=choice1;
			break;
			}
		case 2:
		if(gameboard[0][2]==' ')
			{
			gameboard[0][2]=choice1;
			break;
			}
		case 3:
		if(gameboard[0][4]==' ')
			{
			gameboard[0][4]=choice1;
			break;
			}
		case 4:
		if(gameboard[2][0]==' ')
			{
			gameboard[2][0]=choice1;
			}
			break;
		case 5:
		if(gameboard[2][2]==' ')
			{
			gameboard[2][2]=choice1;
			}
			break;
			
		case 6:
		if(gameboard[2][4]==' ')
			{
			gameboard[2][4]=choice1;
			}
			break;
			
		case 7:
		if(gameboard[4][0]==' ')
			{
			gameboard[4][0]=choice1;
			}
			break;
			
		case 8:
		if(gameboard[4][2]==' ')
			{
			gameboard[4][2]=choice1;
			}
			break;
			
		case 9:
		if(gameboard[4][4]==' ')
			{
			gameboard[4][4]=choice1;
			}
			break;
			
	}
	print(gameboard);
	return(gameboard);
	
}
public static char[][] placePlayer2(int pos2,char choice2,char gameboard[][])
{
	
	
	switch(pos2)
	{
		case 1:
			if(gameboard[0][0]==' ')
			{
			gameboard[0][0]=choice2;
			}
			break;
			
		case 2:
		if(gameboard[0][2]==' ')
			{
			gameboard[0][2]=choice2;
			}
			break;
			
		case 3:
		if(gameboard[0][4]==' ')
			{
			gameboard[0][4]=choice2;
			}
			break;
			
		case 4:
		if(gameboard[2][0]==' ')
			{
			gameboard[2][0]=choice2;
			}
			break;
			
		case 5:
		if(gameboard[2][2]==' ')
			{
			gameboard[2][2]=choice2;
			}
			break;
			
		case 6:
		if(gameboard[2][4]==' ')
			{
			gameboard[2][4]=choice2;
			}
			break;
			
		case 7:
		if(gameboard[4][0]==' ')
			{
			gameboard[4][0]=choice2;
			}
			break;
			
		case 8:
		if(gameboard[4][2]==' ')
			{
			gameboard[4][2]=choice2;
			}
			break;
			
		case 9:
		if(gameboard[4][4]==' ')
			{
			gameboard[4][4]=choice2;
			}
			break;
			
	}
	print(gameboard);
	  return(gameboard);
	
}
public static int checkRow(char gameboard[][],char choice)
{
	int i,j=0,p=0,p2=0;
	for(i=0;i<5;i=i+2)
	{
	 
			if(gameboard[i][j]==choice&&gameboard[i][j+2]==choice&&gameboard[i][j+4]==choice)
				//System.out.println("Player 1 wins");
					p++;
			//else 
				//if(gameboard[i][0]==choice2&&gameboard[i][2]==choice2&&gameboard[i][4]==choice2)
				//System.out.println("Player 2 wins");
					//return(2);
					//p2++;
		}
		return(p);
	}
	

public static int checkColumn(char gameboard[][],char choice)
{
	int j,i=0,p=0,p2=0;
	for(j=0;j<5;j=j+2)
		{
			if(gameboard[i][j]==choice&&gameboard[i+2][j]==choice&&gameboard[i+4][j]==choice)
				//System.out.println("Player 1 wins");
					 p++;
		}
			return (p);
	}
	

public static int checkDiagnol1(char gameboard[][],char choice)
{
	int i=0,j=0,k1=0;
	for(i=0;i<5;i++)
	{
		for(j=0;j<5;j++)
		{
		if(i==j)
		{
			if(gameboard[i][j]==choice)
				//System.out.println("Player 1 wins");
					k1++;
		}
		}
	}
		//System.out.println(k);
		//System.out.println(choice);
	return(k1);
}

public static int checkDiagnol2(char gameboard[][],char choice)
{
	int i=0,j=0,k2=0;
	//k=0;
	for(i=0;i<5;i++)
	{
		for(j=0;j<5;j++)
		{
		if((i+j)==4)
		{
			if(gameboard[i][j]==choice)
				//System.out.println("Player 1 wins");
					k2++;
		}
	}
	}
	
		//System.out.println(k);
		//System.out.println(choice);
	return(k2);
}
	
	
}