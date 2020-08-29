package inquiry;

class main {
	public static void main(String args[]) {
		Manager manager = new Manager();
		manager.setCounter("坂本");
		manager.setCounter("田中");
		manager.setCounter("山田");
		manager.freeCounter(4);
		manager.freeCounter(3);
		manager.freeCounter(2);
	}
}
