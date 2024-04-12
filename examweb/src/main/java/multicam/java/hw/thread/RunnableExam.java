package multicam.java.hw.thread;

public class RunnableExam {
	public static void main(String[] args) {
		AlphaRunnable ar = new AlphaRunnable();
		DightRunnable dr = new DightRunnable();
		Thread t1 = new Thread(ar);
		Thread t2 = new Thread(dr);
		
		t1.start();
		t2.start();
	}
}

class AlphaRunnable extends AlphaThread implements Runnable {
	public AlphaRunnable() {
		
	}
	
	@Override
	public void run() {
		super.run();
	}
}

class DightRunnable extends DightThread implements Runnable {
	public DightRunnable() {
		
	} 
	
	@Override
	public void run() {
		super.run();
	}
}