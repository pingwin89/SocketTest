package pl.pawc;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server{
    public static void main(String[] args){
        
    	try {
			ServerSocket server = new ServerSocket(Integer.parseInt(args[0]));
			Socket socket = server.accept();
			System.out.println("Incoming connection from "+socket.getInetAddress().toString());
			socket.close();
			server.close();			
		} 
    	catch (NumberFormatException e){
			e.printStackTrace();
		}
    	catch (IOException e){
			e.printStackTrace();
		}
    	
    }
}