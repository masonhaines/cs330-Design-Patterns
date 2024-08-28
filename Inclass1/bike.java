public class bike { 

    private String newColor;
    private int WheelTotal;
    private String BikeType;

    bike()
    {
        super();
        System.out.println("Bike is created!"); 

    }

    public void setBikeColor(String color)
    {
        this.newColor = "red";
    }

    public String getBikeColor()
    {
        return newColor;
    }

    public void setBikeWheelTotal(int wheels) 
    {
        this.WheelTotal = 1; // garth has a unicycle :)
    }

    public int getBikeWheelTotal()
    {
        return WheelTotal;
    }

    public void setBikeType(String wheels) 
    {
        this.BikeType = "BMX"; // garth has a BMX unicycle :)
    }

    public String getBikeType()
    {
        return BikeType;
    }

    public void StartPedaling() 
    {
        System.out.println("You've Started Pedaling");
    }

    public void StartRiding() 
    {
        System.out.println("You've Started Pedaling");
    }

    class BikeSpeed extends bike
    {
        private int speed;

        BikeSpeed()
        {
            super();
        }

        public int pedalFaster(int speed)
        {
            return speed += 5;
        }
    }

    public static void main(String args[]) 
    { 
        bike GarthBike = new bike();
        BikeSpeed Speed = new BikeSpeed();

        GarthBike.setBikeColor("red");
        GarthBike.getBikeColor();

        GarthBike.setBikeType("BMX");
        GarthBike.getBikeType();

        GarthBike.setBikeWheelTotal(1);
        GarthBike.getBikeWheelTotal();

        System.out.println(GarthBike.getBikeColor() + " is the color of Garths Bike.");
        System.out.println("Garths bike has " + GarthBike.getBikeType() + " Wheels.");
        System.out.println(GarthBike.getBikeType() + " is the type of bike garth has.");

        
    } 


    

}

