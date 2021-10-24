package taskPackage;

public class Holiday {
	

    String name;
	int day;
	String month;
	
	public static void main(String[] args) {
		
	
	Holiday h1=new Holiday("diwali",5,"nov");
	Holiday h2=new Holiday("independence",15,"aug");
	Holiday h3=new Holiday("dusshera",15,"Oct");
	
    }
    Holiday(String name,int day,String month){
		
    	String a=name;
    	int b=day;
    	String c=month;
    	
    	System.out.println("day will be"+b+"name of festival"+name+"month is"+c);
    	
	}
	
    String[] nam= {"diwali","independence","dusshera"};
    int[] d= {2,15,13};
    String[] mon={"nov","mar","jan"};
    
    public void inSameMonth() {
    	
    	for(int i=0;i<=nam.length;i++)
    	{
    		
    	}
    	
    }
	
}	
