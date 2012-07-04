package belajar.streamio;

public class BacaFileDemo{
	public static void main(String[] args){
		FileReaders fr =  new FileReader("src\source\lagu.txt");
		try{
			BufferedReader buf = new BufferedReader(f);
			String data =in.readLine();
			while(data != null ){
				System.out.println(data);
				data = in.ReadLine();
			}
			buf.close(); 
		}catch(IOException ioe){
			lg.printStackTrace();
		}
	}
}