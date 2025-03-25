import java.util.*;
import java.time.*;

//Class intended for countdown events
public class CountdownEvent {
    private String countdownName;
    private LocalDate startDate;
    private LocalTime startTime;

    CountdownEvent(String name, LocalDate startDate, LocalTime startTime) {
        countdownName = name;
        this.startDate = startDate;
        this.startTime = startTime;
    }
    //determine if time is am or pm
    public void setStartDate( LocalDate startDate ) {
        this.startDate = startDate;
    }
    public void setStartTime( LocalTime startTime ) {
        this.startTime = startTime;
    }
    public void setCountdownName(String countdownName) {
        this.countdownName = countdownName;
        }
    public String getCountdownName() {
        return countdownName;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public LocalTime getStartTime() {
        return startTime;
    }
    }


