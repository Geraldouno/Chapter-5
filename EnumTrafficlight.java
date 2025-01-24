public class EnumTrafficlight
{
	public enum TrafficLight 
	{
        RED, YELLOW, GREEN;
       
        public boolean isRed()
		{
            return this == RED;
        }
    }

    public static void main(String[] args) 
	{
        TrafficLight light = TrafficLight.RED;
        
        if (light.isRed())
		{
            System.out.println("Stop! The light is red.");
        } 
		else
		{
            System.out.println("You can proceed. The light is not red.");
        }
    }
}