public class Primes {
    public static void main(String[] args) {
        final int N = Integer.parseInt(args[0]);
        boolean[] arrayOfPrimes = new boolean[N+1];
        arrayOfPrimes[0] = false;
        arrayOfPrimes[1] = false;
        for (int i = 2; i < arrayOfPrimes.length; i++) {
            arrayOfPrimes[i] = true;
        }
        int multiplesOfPrimes = 2;
        while (multiplesOfPrimes <= Math.sqrt(N)) {
            if (arrayOfPrimes[multiplesOfPrimes]) {
                for (int j = multiplesOfPrimes*multiplesOfPrimes; j < arrayOfPrimes.length;  j +=  multiplesOfPrimes) {
                    arrayOfPrimes[j] = false;
                }
            }
            multiplesOfPrimes++;
        }

        System.out.println("Prime numbers up to " + N + ":");
        int countPrime = 0;
        for (int i = 2; i < arrayOfPrimes.length; i++) {
            if (arrayOfPrimes[i]) {
                System.out.println(i);
                countPrime++;
            }
        }
        // Calculating int percent.
        int percent = (int)((countPrime / (double)N) * 100);
        System.out.println("There are " + countPrime + " primes between 2 and " + N + " (" + percent +"% are primes)");
    }
}
