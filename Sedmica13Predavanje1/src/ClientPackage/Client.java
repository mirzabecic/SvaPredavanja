package ClientPackage;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

import GUIPackage.ChatGui;

public class Client {
	public static final int port = 1717;
	public static final String host = "localhost";
	
	
	public static void main(String[] args) {
		GUILogin log = new GUILogin(host, port);
	}
}