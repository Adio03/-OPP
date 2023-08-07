package Account;

public class Threads {
    public static void main(String[] args) {
        try {
             threads();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
    public static void  threads() throws InterruptedException {
        for (int i = 0; i < 5;i++)
            System.out.println("\r.");
       Thread.sleep(1000);



    }
}
