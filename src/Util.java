import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {

    public String getTime() {
        Date calendar = new Date();
        String formatado = (new SimpleDateFormat("HH:mm:ss:SS")).format(calendar.getTime());
        return formatado;
    }

    public void getLogStart(String typeTest, String action){
        System.out.println("Time Start: " + this.getTime());
        System.out.println("Test for "+ action + " ->  " + typeTest +"  (STARTED)");
    }

    public void getLogEnd(String typeTest, String action){
        System.out.println("Test for "+ action + " ->  " + typeTest +"  (ENDED)");
        System.out.println("Time End: " + this.getTime());
    }
}
