import java.net.*;
import java.io.*;
import java.util.*;

public class URLReader {
    public static void main(String[] args) throws Exception {

        URL spaceWeather = new URL("http://spaceweather.com/");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(spaceWeather.openStream()));
        
        String inputLine;
		ArrayList<String> array = new ArrayList<String>();

		while ((inputLine = in.readLine()) != null) {
    		array.add(inputLine);
		}
		
		System.out.println("Planetary K-index");
		
		int i; 
		for (i = 0; i < array.size(); i++) {
			if(array.get(i).contains("quiet") && array.get(i).contains("1") && !array.get(i).contains("24"))
				System.out.println("Now: KP=1 quiet");
			else if (array.get(i).contains("quiet") && array.get(i).contains("1") && array.get(i).contains("24"))
				System.out.println("24-hr max: KP=1 quiet");
			if(array.get(i).contains("quiet") && array.get(i).contains("2") && !array.get(i).contains("24"))
				System.out.println("Now: KP=2 quiet");
			else if (array.get(i).contains("quiet") && array.get(i).contains("2") && array.get(i).contains("24"))
				System.out.println("24-hr max: KP=2 quiet");
		} 
    }
}
