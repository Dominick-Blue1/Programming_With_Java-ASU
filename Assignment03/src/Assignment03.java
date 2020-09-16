import java.util.*;

public class Assignment03 
{
	
	public static void main (String[] args)
	{
		//declare
		Scanner in = new Scanner(System.in);
	    
	    int cs = in.nextInt();

	    int pp = in.nextInt();

	    int mp = in.nextInt();

	    int af = in.nextInt();
	    in.close();

		int tf=10;
		int pssv=mp-pp;
		if((pp-mp)>0)

		{
		
			int nostb=(int)Math.floor((af-tf)/mp);
			int tbc=10+(mp*nostb);
			
			if(tbc==10)
			
			System.out.println("Hold Shares");
			
			else if(tbc==af||tbc!=10)
		
			{
			
			System.out.println("Buy "+ nostb + " shares");
			
			}
		}
		else if((pp-mp)<0)
		{
			
			int tsv=pssv*cs;
			
			int nosts=tsv-tf;
			
			if(nosts==0)
			
		{
			System.out.println("Hold Shares");
		}
			else
		{
			System.out.println("Sell "+ nosts+" shares");
		}
		}
	}
}