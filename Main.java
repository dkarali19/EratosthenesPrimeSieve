import java.time.chrono.Era;

public class Main {
    public static void main(String[] args) {
        EratosthenesPrimeSieve era = new EratosthenesPrimeSieve(30);
        era.printPrimes();
        System.out.println();
        era.printEvenNumbers();
    }
}
