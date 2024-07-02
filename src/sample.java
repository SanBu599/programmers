import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class sample implements Runnable {
    static boolean autoSave = false;
    public static void main(String[] args) {
        Thread th1 = new tr1();
        Thread th2 = new tr2();
        Thread th3 = new Thread(new sample());
        th3.setDaemon(true);
        th3.start();
        for (int i = 1; i<=10;i++){
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){}
            System.out.println(i);
            if(i==5) autoSave = true;
        }
        System.out.println("프로그램 종료");
        th1.setPriority(1);
        th2.setPriority(9);
        System.out.println("th1: " + th1.getPriority());
        System.out.println("th2: " + th2.getPriority());
        th1.start();
        th2.start();
    }
    public void run(){
        while (true){
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){}

            if (autoSave) {
                autoSave();
            }
        }
    }

    private void autoSave() {
        System.out.println("자동저장완료");
    }
}
class tr1 extends Thread{
    public void run(){
        for (int i = 0 ; i < 300; i++){
            System.out.print("-");
            for (int x = 0; x<5000000;x++);
        }
    }
}

class tr2 extends Thread{
    public void run(){
        for (int i = 0 ; i < 300; i++){
            System.out.print("|");
            for (int x = 0; x<5000000;x++);
        }
    }
}

