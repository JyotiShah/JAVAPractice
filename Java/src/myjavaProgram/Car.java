package myjavaProgram;

class Car {

	static int steering = 1;
	static int wheels = 4;
	static int seats= 5;
	@SuppressWarnings("static-access")
	public static void main(String[] args)
	{
	
	Car car=new Car();
	System.out.println(steering + " "+ wheels +" " +seats );
	System.out.println(car.wheels);
	System.out.println(car.seats);
	
	}
}
