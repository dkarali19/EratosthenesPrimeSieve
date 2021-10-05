public class EratosthenesPrimeSieve implements PrimeSieve{

    int number;

    public EratosthenesPrimeSieve(int number){
        this.number = number;
    }

    public boolean[] getPrimeNumbers(){
        boolean[] primeNumbers = new boolean[number];

        for (int i = 2; i < primeNumbers.length; i++) {
            primeNumbers[i] = true;
        }

        for (int i = 2; i < primeNumbers.length; i++) {
            if (primeNumbers[i] == false){
            } else{
                for (int j = i * i; j < primeNumbers.length; j += i) {
                    primeNumbers[j] = false;
                }
            }
        }
        return primeNumbers;
    }


    @Override
    public boolean isPrime(int p) {
        /*if(p <= 1){
            return false;
        }

        for (int i = 2; i < Math.sqrt(p); i++) {
            if(p % i == 0){
                return false;
            }
        }
        return true;*/

        boolean[] getPrimeNums = getPrimeNumbers();

        if (getPrimeNums[p] == true){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void printPrimes(){
        /*int counter = 0;
        for (int i = 2; i <= number; i++) {
            counter = 0;
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    counter++;
                }
            }
            if(counter == 0){
                System.out.println(i);
            }
        }*/

        boolean[] getPrimeNums = getPrimeNumbers();

        for (int i = 0; i < getPrimeNums.length; i++) {
            if (getPrimeNums[i] == true){
                System.out.println(i);
            }
        }
    }

    public void printEvenNumbers(){
        /*for (int i = 2; i < number; i++) {
            for (int j = 2; j <= number; j++) {
                if(((i+j) % 2) == 0){
                    System.out.println(i + j + " summe: " + (i+j) + " = " + i + " + " + j);

                }
            }
            break;
        }*/
        boolean[] getPrimeNums = getPrimeNumbers();

        for (int i = 2; i < number; i++) {
            if (getPrimeNums[i] == true){
                for (int j = 2; j < number; j++) {
                    if (getPrimeNums[j] == true && ((i+j) % 2) == 0){
                        System.out.println(i+j + " summe: " + (i+j) + " = " + i + " + " + j);
                        break;
                    }
                }
            }
        }
    }
}

