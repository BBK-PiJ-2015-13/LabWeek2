/**
 * Created by Tom on 07/03/2017.
 */
public class FireSensor implements Sensor {
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
        battery -= 10;
        return battery;
    }
}
