import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Util {

    public String analiseStart() {
        Date calendar = new Date();
        String formatado = (new SimpleDateFormat("HH:mm:SS")).format(calendar.getTime());
        return formatado;
    }

    public void analiseEnd(Long initialTime) {

        System.out.println("Tempo de execução total --> "
                + (System.nanoTime() - initialTime));

        System.out.println("Memória total: "
                + Runtime.getRuntime().totalMemory());

        // Memória livre
        System.out.println("Memória livre: "
                + Runtime.getRuntime().freeMemory());
    }
}
