import java.util.Random;

class NumberGenerator extends Thread {
    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            int number = random.nextInt(100); // Generate a random integer between 0 and 99
            System.out.println("Generated number: " + number);
            if (number % 2 == 0) {
                SquareThread squareThread = new SquareThread(number);
                squareThread.start();
            } else {
                CubeThread cubeThread = new CubeThread(number);
                cubeThread.start();
            }

            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SquareThread extends Thread {
    private int number;

    public SquareThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int square = number * number;
        System.out.println("Square of " + number + " is " + square);
    }
}

class CubeThread extends Thread {
    private int number;

    public CubeThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int cube = number * number * number;
        System.out.println("Cube of " + number + " is " + cube);
    }
}

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        numberGenerator.start();
    }
}
