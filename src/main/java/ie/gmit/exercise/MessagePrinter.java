package ie.gmit.exercise;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {

	//Writes message to a file
	public void writeMessage(Message msg, Formatter formatter,PrintWriter writer) throws IOException
	{
		//creates print writer
		writer.println(formatter.format(msg)); //formats and writes message
		writer.flush();
		writer.close();
	}
}
