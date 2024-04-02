package multicam.java.hw.thread;

public class ThreadExam {
	public static void main(String[] args) {
		AlphaThread a = new AlphaThread();
		DightThread d = new DightThread();
		
		a.start();
		
		d.start();
	}
}

class AlphaThread extends Thread {
	public AlphaThread() {
		
	}
	
	@Override
	public void run() {
		for(char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}
		}
		
		System.out.println();
	}
	
}

class DightThread extends Thread {
	public DightThread() {
		
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= 100; i++) {
			System.out.print(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(i % 10 == 0) {
				System.out.println();
			}
		}
	}
}