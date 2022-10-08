package bar;

public class Bill 
{
    public char gender;
    public int beer;
    public int barbecue;
    public int softDrink;
    
    public static double cover()
    {
        double cover = 4.00;
        return cover;
    }
    
    public double feeding() 
    {
    	double consumo = (beer * 5.00) + (softDrink * 3.00)
    			          + (barbecue * 7.00);
    	return consumo;
    }
    
    public double ticket()
    {
    	double ingresso = 0;
    	if(gender == 'F')
		    ingresso = 8.00;
		else if(gender == 'M')
			ingresso = 10.00;
    	return ingresso;
    }
    
    public double total()
    {
    	double conta = 0;
    	if(feeding() > 30.00)
    	   conta = feeding() + ticket();
    	else 
    	   conta = feeding() + cover() + ticket();
    	return conta;
    }
}
