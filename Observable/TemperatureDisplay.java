package Observable;

public class TemperatureDisplay implements Observer{
    private float temperature;
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
    }

    public void display(){
        System.out.println("Current Temperature is: "+temperature+"C");
    }
}
