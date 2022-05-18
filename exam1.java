class RaceTrack{

public static void main(String[] args){
 Car c = new Car(2010,"Porsche",25.0);
     System.out.println("Year is "+c.getYear());
     System.out.println ("Model is "+c.getMake());
     System.out.println ("Speed is "+c.getSpeed());
	 c.accelerate();
	 System.out.println ("Speed after accelerate is "+c.getSpeed());
}



}