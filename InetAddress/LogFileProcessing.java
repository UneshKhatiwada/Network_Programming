import java.io.*;
public class LogFileProcessing{
	public static void main(String[] args) {
		String logFile="./serverLog.txt";
		try(BufferedReader br=new BufferedReader(new FileReader(logFile))){
			String line;
			while((line=br.readLine())!=null){
				if(line.contains("200")){
					System.out.println(line);
				}
			}

		}
		catch(Exception e){
			System.out.println("Error processing logile"+e.getMessage());
		}
	}
}