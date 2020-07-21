package mavendemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging 
{	  
	   public int Caluclation(String Material_Standard, double Area, String Fully_Auto_Home)
	   {
		   if(Material_Standard.contentEquals("High Standard Materials")&& Fully_Auto_Home.contentEquals("Fully Automated Home"))
		           return(int)(2500*Area);
		   else if(Material_Standard.equals("Standard Materials"))
			   return(int)(Area*1200);
		   else if(Material_Standard.equals("Above Standard Materials"))
			   return(int)(Area*1500);
		   else if(Material_Standard.equals("High Standard Materials"))
			   return(int)(Area*1800);
		   return 0;
	   }
	   
	   public double Simple(double x, double y,double z,double p)
	   {
		    p = p + x * (y/100) * z;
		    return p;
	   }
	   public double Compound(double x, double y,double z,double q)
	   {
		   q = q + (x*(Math.pow((1+(z/100)),y)))-x;
		   return q;
	   }
	   private static final Logger LOGGER = LogManager.getLogger(Logging.class);
	   
	   public static void main(String[] args)
	   {
		   int p=0,q=0;
		   LOGGER.debug(p+" "+q);
		   
	   }
}

