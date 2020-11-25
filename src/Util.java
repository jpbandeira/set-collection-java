public class Util {

    public long analiseStart() {
        System.out.println("Memória total: "
                + Runtime.getRuntime().totalMemory());

        // Memória livre
        System.out.println("Memória livre: "
                + Runtime.getRuntime().freeMemory());

        return System.nanoTime();

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
