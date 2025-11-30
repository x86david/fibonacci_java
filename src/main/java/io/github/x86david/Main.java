import static java.lang.IO.println;

void main(String[] args) {
    int sequenceLength = 0;
    List<Integer> fibonacciSequence = new ArrayList<>();
    if (args.length != 1) {
        System.err.println("Arguments length should be 1");
        System.exit(-1);
    }

    try {
        sequenceLength = Integer.parseInt(args[0]);
    } catch (NumberFormatException e) {
        System.err.println("The argument is not a positive integer");
        System.exit(-1);
    }

    if (sequenceLength <= 0) {
        System.err.println("The argument is not a positive integer");
        System.exit(-1);
    }

    if (sequenceLength == 1) {
        fibonacciSequence.add(0);
    }

    if (sequenceLength > 1) {
        fibonacciSequence.addAll(0, List.of(0, 1));

        for (int i = 2; i < sequenceLength; i++) {
            int newNumber = fibonacciSequence.get(i - 1) + fibonacciSequence.get(i - 2);
            fibonacciSequence.add(newNumber);
        }

    }


    println("Sequence length: " + sequenceLength);
    for (int i = 0; i < sequenceLength; i++) {
        println(fibonacciSequence.get(i));
    }
}
