package oops.concurrent;

public class ProducerConsumerDesignPattern implements Runnable{

	
	@Override
	public void run(){
		if(Thread.currentThread().getName().equals("producer")){
			addMoney(deductMoney);
		}else if(Thread.currentThread().getName().equals("consumer")){
			try {
				deductMoney(deductMoney);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	int total;
	int addMoney=0;
	int deductMoney=0;
	
	public void deductMoney(int l) throws InterruptedException{
		synchronized(this){
			if(l>total){
				System.out.println("sufficent money is not there, wating");
				this.wait();
			}else{
				total=total-l;
			}
		}
	}
	public void addMoney(int t){
		synchronized(this){
			total+=addMoney;
			this.notifyAll();
		}
	}
	public static void main(String[] args) throws InterruptedException {
		ProducerConsumerDesignPattern pt = new ProducerConsumerDesignPattern();
		pt.total=2000;
		Thread p = new Thread(pt, "producer");
		Thread c = new Thread(pt, "consumer");
        p.start();
        c.start();
        pt.deductMoney=3000;
        pt.deductMoney(pt.deductMoney);
        pt.addMoney=2000;
        pt.addMoney(pt.addMoney);
	}

}
