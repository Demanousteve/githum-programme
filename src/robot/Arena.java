package robot;

public class Arena extends Robot{
	
	public Arena() 
	{
		
	}
public void fight(Robot R1, Robot R2) 
{
	

		do {
		 
		 R1.fire(R2);
		 R2.isDead(R2);
		 
		if(R1.getPt_de_vie()>0)
		{
			R2.fire(R1);
			R1.isDead( R2);
		}
	
	       }while(R1.getPt_de_vie()>0 || R2.getPt_de_vie()>0);
		
	                }	
	}
                            

	
	
