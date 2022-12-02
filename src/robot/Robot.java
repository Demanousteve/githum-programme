package robot;

public class Robot {
	
	private static final int getPt_de_vie = 0;

	protected String nom;
	
	protected int pt_de_vie;
	
	public void affiche() {
		
		System.out.println("je suis robot bob");
	}
	public void setNom (String nom)
	{
		this.nom = nom;
	}

	public void setPt_de_vie (int pt_de_vie)
	{
		this.pt_de_vie = pt_de_vie;
	}


	public int getPt_de_vie() 
	{
		return pt_de_vie;
	}

	public  String getNom() 
	{
		return nom;
	}
	
	public Robot() 
	{
		pt_de_vie=10;
		nom="";
	}
	public Robot(String nom) 
	{
		this.nom = nom;
		this.pt_de_vie = 10;
	}
	
	public Robot(Robot R) {
		
		nom = R.nom;
		pt_de_vie = R.pt_de_vie;
		
	}
	
	
	public void fire( Robot R2) 
	{
		R2.setPt_de_vie(R2.getPt_de_vie()- 2);
	    System.out.println(R2.getNom()+"\ta été toucher par\t"+this.getNom() + "\t :" + R2.getPt_de_vie());	  
	}
	

	public void isDead(Robot R2) {
	
	{
		if (R2.getPt_de_vie()<=0)
		{
		System.out.println(R2.getNom()+"\test mort");
		}
		
		
	}
	
	 
		}}
		   

		
		
		

	
		
		
