package Observable;

public class HumidityDisplay implements Observer{
    private float humidity;
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.humidity = humidity;
    }

    public void display(){
        System.out.println("Current Humidity is: "+humidity);
    }
}

