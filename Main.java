import java.time.chrono.Era;

public class Main {
    public static void main(String[] args) {
        EratosthenesPrimeSieve era = new EratosthenesPrimeSieve(50);
        era.printPrimes();
        System.out.println();
        era.printEvenNumbers();
    }
}
