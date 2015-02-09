package ClientPackage;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import GUIPackage.ChatGui;

public class GUILogin {
	private JTextField username;
	private JPasswordField password;
	private String host;
	private int port;

	public GUILogin(String host, int port) {
		this.host = host;
		this.port = port;
		JFrame frame = new JFrame("Welcome");
		JPanel panel = new JPanel();
		JButton login = new JButton("Login");
		JButton quit = new JButton("Quit");
		JLabel wusername = new JLabel();
		JLabel wpassword = new JLabel();
		username = new JTextField();
		username.setLocation(100, 100);
		username.setPreferredSize(new Dimension(250, 25));
		password = new JPasswordField();
		password.setPreferredSize(new Dimension(250, 25));
		login.addActionListener(new ButtonHandler());
		login.setPreferredSize(new Dimension(100, 25));
		quit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});
		quit.setPreferredSize(new Dimension(100, 25));
		wusername.setText("Username");
		wpassword.setText("Password");
		panel.add(wusername);
		panel.add(username);
		panel.add(wpassword);
		panel.add(password);
		panel.add(login);
		panel.add(quit);
		frame.add(panel);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(250, 250);
		frame.setLocation(800, 350);
		frame.setVisible(true);
	}

	private class ButtonHandler extends KeyAdapter implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			String usname = username.getText();
			String pass = new String(password.getPassword());
			usname = usname.replaceAll(" ", "");
			pass = pass.replaceAll(" ", "");
			System.out.println(usname);
			System.out.println(pass);
			if (usname.equals("") || pass.equals("")) {
				showError("Unesite password i username!");
				return;
			}
			Socket client;
			try {
				client = new Socket(host, port);
				ChatGui gui = new ChatGui(client);
				new Thread(gui).start();
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}

	}

	private void showError(String message) {
		JOptionPane.showMessageDialog(null, message, "ERROR",
				JOptionPane.WARNING_MESSAGE);

	}

}
