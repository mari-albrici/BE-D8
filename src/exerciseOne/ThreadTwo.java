package exerciseOne;

public class ThreadTwo extends Thread {

	@Override
	public void run() { 
		for (int i = 0; i < 10; i++) {
			Main.logger.info("#" + (i + 1));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				Main.logger.error(getName());
			}
		}
	}
}
