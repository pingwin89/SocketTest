package pl.pawc;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client{
	
    public static void main(String[] args){
        try {
			Socket socket = new Socket(args[0], Integer.parseInt(args[1]));
			System.out.println("connected: "+socket.isConnected());
			socket.close();
		}
        catch (NumberFormatException e){
			e.printStackTrace();
		}
        catch (UnknownHostException e){
			e.printStackTrace();
		}
        catch (IOException e){
			e.printStackTrace();
		}
    }
    
}