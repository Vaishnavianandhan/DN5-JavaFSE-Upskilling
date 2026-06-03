class MessageThread extends Thread {

    String msg;

    MessageThread(String msg) {
        this.msg = msg;
    }

    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(msg + " : " + i);
        }
    }
}

public class ThreadDemo {

    public static void main(String[] args) {

        MessageThread t1 = new MessageThread("Thread One");
        MessageThread t2 = new MessageThread("Thread Two");

        t1.start();
        t2.start();
    }
}