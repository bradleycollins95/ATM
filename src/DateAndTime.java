import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * The DateAndTime class provides a method to get the current timestamp.
 */
public class DateAndTime {
    /**
     * Returns the current timestamp in the format "yyyy-MM-dd HH:mm:ss".
     *
     * @return the current timestamp
     */
    public String timeStamp() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(date);
    }
}

