package Day5Functional;

public class WindChill {
	 public static void main(String[] args) {
	        double t = Double.parseDouble(args[0]);
	        double v = Double.parseDouble(args[1]);
	        double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
	        
	        if (isValid(t))
	        {
	        	System.out.println("Temperature = " + t + "Wind speed  = " + v + "Wind chill  = " + w);
	        }
	        else
	        	{
	        		System.out.println("Temperature is not valid");
	        	}
	        }

	        	private static boolean isValid(double t) {
		// TODO Auto-generated method stub
		return false;
	}

				private static boolean isValid(int t) {
	        		// TODO Auto-generated method stub
	        	if (t>=50)
	        	{
	        		return false;
	
	        	}
	        	return true;  
	        }
				
	        
				}

