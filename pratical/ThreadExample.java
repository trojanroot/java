class NumberThread extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Child Thread: "+i);
        }
    }
}
public class ThreadExample {
    public static void main(String[] args) {
        NumberThread t1=new NumberThread();
        t1.start();
        for(int i=1;i<=5;i++){
            System.out.println("Main Thread: "+i);
        }
    }
}
