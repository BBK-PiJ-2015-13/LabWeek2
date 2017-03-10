/**
 * Created by Tom on 07/03/2017.
 */
public class SmokeSensor implements Sensor {
    private int battery = 100;
    @Override
    public boolean isTriggered() {
        return false;
    }

    @Override
    public String getLocation() {
        return null;
    }

    @Override
    public String getSensorType() {
        return null;
    }

    @Override
    public int getBatteryPercentage() {
        battery -= 20;
        return battery;
    }
}
