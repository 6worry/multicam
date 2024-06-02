package multicam.java.hw.thread;

import java.awt.Toolkit;

public class BeepPrintExam {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // 기본 시스템 TOOlkit
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 1; i <= 5; i++) {
					toolkit.beep(); // 비프음 재생
					
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 1; i <= 5; i++) {
					System.out.println("땡");
					
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
}