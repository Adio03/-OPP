package myUnCompletedProjects;

public class Clock {

    private int hour;
    private int minute;
    private int seconds;

    public Clock(int hour, int minute, int seconds) {
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public void setHour(int hour) {
        if (hour > 23) this.hour = 0;
        else if (hour < 0) this.hour = 0;
        else this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
        if (minute > 59) this.hour = 0;
        else if (minute < 0) this.minute = 0;
        else this.minute = minute;
    }

    public int getMinute() {
        return minute;
    }

    public void setSeconds(int seconds) {
        int secondsCounter = 1;
        for (; secondsCounter < 59; ) {
            if (seconds > 59 || seconds < 0) {
                this.seconds = 0;
            } else this.seconds = seconds;
            secondsCounter++;
            seconds = this.seconds;
        }
    }
    public int getSeconds() {
        return seconds;
    }
}
