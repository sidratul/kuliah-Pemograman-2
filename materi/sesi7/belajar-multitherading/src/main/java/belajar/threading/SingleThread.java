package belajar.threading;

public class SingleThread{

	public void hitung(){
		try{
			for(int i=1;i<=10;i++){
				System.out.println("ini thread ke"+i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
	}
}