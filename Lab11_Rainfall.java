
public class Lab11_Rainfall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] amountOfRain ={117.1 ,552.4 ,88.8 ,16.0 ,137.3 ,54.3 ,158.8 ,101.1 ,97.6 ,82.5 ,139.3 ,402.2};
		String[] months ={"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		double averageRainFall=0;
		int wettestMonth =0;
		
		String monthName ="";
		for(int index =0; index < amountOfRain.length; index ++)
		{
			displayRainfall(months[index],amountOfRain[index]);
		}
		averageRainFall=getAverageRainfall(amountOfRain);
		
		System.out.println("Average rainfall over the year is : "+averageRainFall);	
		
		wettestMonth = getIndexOfWettestMonth(amountOfRain);
		
		int wettestMonthAdjusted = wettestMonth +1;
		System.out.println("The wettest month is month "+wettestMonthAdjusted);
		
		monthName = months[wettestMonth];
		
		System.out.println("The month is "+monthName);
		
		
	
	}
	
	public static void displayRainfall(String months, double amountOfRain)
	{
		
		System.out.println(months +" "+amountOfRain);
		
	}
	public static double getAverageRainfall(double[] amountOfRain)
	{
		double TotalRainFall =0;
		double averageRainFall =0;
		for(int index=0; index < amountOfRain.length; index++)
		{
			TotalRainFall = TotalRainFall + amountOfRain[index];		
			
		}
		averageRainFall = TotalRainFall / 12;
		
		return averageRainFall;
	}
	public static int getIndexOfWettestMonth(double[] amountOfRain)
	{
		int wettestMonth = 0;
		double rainAmount = amountOfRain[0];
		for(int index =0; index < amountOfRain.length; index++)
		{
			if (amountOfRain[index] > rainAmount)
			{
				wettestMonth = index;
				rainAmount = amountOfRain[index];
			}
		}
		
		
		return wettestMonth;
	}
	

}
