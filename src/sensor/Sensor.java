package sensor;

import java.util.ArrayList;
import java.util.Date;

public interface Sensor {

    public Integer id = 0;
    public String typeSensor = null;
    public ArrayList<Date> dateOn = null;
    public ArrayList<Date> dateOff = null;
    public String sensorLocation = null;
    public String sensorCondition = null;

}
