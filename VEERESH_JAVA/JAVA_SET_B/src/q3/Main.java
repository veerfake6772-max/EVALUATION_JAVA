package q3;

class Timer extends Thread {
	@Override
	public void run() {
		try {
			System.out.println("Loading...");
			Thread.sleep(5000);
			System.out.println("Loaded after 5 seconds");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

class Thread1 {

}

public class Main {
	public static void main(String[] args) {
		Timer timer = new Timer();
		Thread thread = new Thread(timer);
		

		Thread1 thread1 = new Thread1();
		new Thread(new Runnable() {

			@Override
			public void run() {

				synchronized (thread1) {
					System.out.println("Line 1 is Printed");
					try {
						thread1.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					thread.run();
					System.out.println("Line 2 is Printed");

				}
			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (thread1) {
					System.out.println("Line 3 is Printed");
					thread1.notify();

					
				}
			}
		}).start();

	}
}
