import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class multirequest{ 
    public static void main(String [] args){
        String urlString = "http://www.google.com";
        int num = Integer.parseInt(args[0]);
        int successNum = 0;

        long startTime = System.nanoTime();
        for(int i = 0; i< num; i++){
                try{
                    URL url = new URL(urlString);
                    HttpURLConnection con = (HttpURLConnection) url.openConnection();
                    con.setRequestMethod("GET");
                    if(con.getResponseCode() == 200){
                        successNum += 1;
                    }
                }catch(Exception e){
                    System.out.println("ignored");    
                }
        }
        long endTime = System.nanoTime();
        System.out.println("There were " + successNum + " successful requests!");
        System.out.println("This took: " + ((endTime - startTime)/1000000) + " milliseconds");
    }
}
