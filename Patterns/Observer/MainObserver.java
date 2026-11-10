package Observer;

public class MainObserver {
    public static void main(String[] args) {
        // WeatherStation
        WeatherStation station = new WeatherStation();

        // ConsoleDisplay e FanController
        ConsoleDisplay display = new ConsoleDisplay();
        FanController fan = new FanController();

        station.subscribe(display);
        station.subscribe(fan);

        // setTemperature(26) e setTemperature(30)
        station.setTemperature(26);
        station.setTemperature(30);

        station.unsubscribe(display);

        // setTemperature(27)
        station.setTemperature(27);
    }
}
