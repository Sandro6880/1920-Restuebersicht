package at.htl.restprimer.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

@Path("time")
public class TimeServerResource {

    @GET
    public String time() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        String formatDateTime = now.format(formatter);

       /*
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd,yyyy HH:mm:ss");
        String formatDateTime;
        if (now.getHour() > 12){
            formatDateTime = now.format(formatter) + "PM";
        }else  formatDateTime = now.format(formatter) + "AM";


        */
        return "Time : " + formatDateTime;
    }
}
