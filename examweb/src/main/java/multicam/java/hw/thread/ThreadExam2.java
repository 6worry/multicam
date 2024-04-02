package multicam.java.hw.thread;

public class ThreadExam2 {
	public static void main(String[] args) {
		odd o = new odd();
		even e = new even();
		
		o.start();
		e.start();
	}
}

class even extends Thread {
	private boolean flag = true;
	
	public even() {
		
	}

	@Override
	public void run() {
		int i = 2;
		
		while(flag && i <= 100) {
			try {
				System.out.print(i + ", ");
				Thread.sleep(100);
				i += 2;
				
				if(i > 50) {
					worse();
					System.out.println();
					System.out.println("end");
				}
			} catch (InterruptedException e) { 
				
			}
		}
	}

	private void worse() {
		flag = false;
	}
}

class odd extends Thread {
	public odd() {
		
	}

	@Override
	public void run() {
		int i = 1;
		
		try {
			while(!interrupted() && i <= 1000) {
				System.out.print(i + ", ");
				Thread.sleep(200);
				i += 2;
			
				if(i > 70) {
					interrupt();
				}
			}				
		} catch (InterruptedException e) {
			
		} finally {
			System.out.println("end");
		}
	}
}