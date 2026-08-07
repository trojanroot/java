class DownloadTask implements Runnable{
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Downloading..."+(i*20)+"%");
        }
    }
}
public class RunnableExample {
    public static void main(String[] args) {
        DownloadTask task=new DownloadTask();
        Thread t1=new Thread(task);
        t1.start();
        System.out.println("user can continue working...");
    }
}
