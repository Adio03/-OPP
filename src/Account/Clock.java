package Account;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Clock {
    public static void main(String[] args) {
        clockShow();

    }
    public static String clockShow(){
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = time.format(formatter);
        System.out.println(format);
        return format;
    }
}
