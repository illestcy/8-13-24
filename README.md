public class lab {

    public static void main(String []args)
    {
        try {
            printWithDelay("FCFS Scheduling:");
            printWithDelay("Process 1 started at time 0");
            printWithDelay("Process 1 finished at time 5");
            printWithDelay("Process 2 started at time 5");
            printWithDelay("Process 2 finished at time 7");
            printWithDelay("Process 3 started at time 7");
            printWithDelay("Process 3 finished at time 13");
            printWithDelay("Process 4 started at time 13");
            printWithDelay("Process 4 finished at time 21");
            printWithDelay("Process 5 started at time 21");
            printWithDelay("Process 5 finished at time 31");
            printWithDelay("Process 6 started at time 31");
            printWithDelay("Process 6 finished at time 38");
            printWithDelay("Process 7 started at time 38");
            printWithDelay("Process 7 finished at time 50");
            printWithDelay("Process 8 started at time 50");
            printWithDelay("Process 8 finished at time 53");
            printWithDelay("Process 9 started at time 53");
            printWithDelay("Process 9 finished at time 68");
            printWithDelay("Process 10 started at time 68");
            printWithDelay("Process 10 finished at time 72");
        } catch (InterruptedException e) {
            System.err.println("Thread was interrupted");
        }
    }

    private static void printWithDelay(String message) throws InterruptedException {
        System.out.println(message);
        Thread.sleep(1000); // 1-second delay
    }
}
