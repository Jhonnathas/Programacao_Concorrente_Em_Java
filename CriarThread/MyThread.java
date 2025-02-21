package CriarThread;

public class MyThread extends Thread{
    int x;    
    public MyThread(int x){
        this.x = x;
    }

    @Override
    public void run(){
        this.x++;
        System.out.println("Banana " + this.getId() + " " + x);
        
    }
    
}
