package belajar.streamio;

public class TulisFile()throws Exception{
	public static void main(String[] args){
		FileWriter fw = new FileWriter("src\tulis");
		fw.write("aku \r\n");
		fw.write("pulang \r\n");
		fw.close();
	}
}