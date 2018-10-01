import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.StyledEditorKit.BoldAction;



import java.util.Vector;

/**
 * @author Mahtab
 *
 */
public class First_Page extends JFrame implements ActionListener {

	String saveTheUsernameOfSignin;
	String saveThePasswordOfSignin;
	private int maxHeight;
	private int maxWidth;
	JButton exit;
	JButton signIn;
	JButton signUp;
	JTextField userName;
	JPasswordField passWord;
	JLabel userNameLabel;
	JLabel passWordLabel;
	JLabel usernamesentence;
	JLabel passwordsentence;
	//MP3 mp;


	/**
	 * constructor of first page
	 */
	
	public First_Page() {
		signIn = new JButton("Sign in");
		signUp = new JButton("Sign up");
		exit = new JButton("EXIT");
		userName = new JTextField();
		passWord = new JPasswordField(10);
		userNameLabel = new JLabel("UserName:");
		passWordLabel = new JLabel("Password:");
		usernamesentence = new JLabel("Please enter ur e_mail as ur username!!");
		passwordsentence = new JLabel(
				"Please enter ur password.UR password has to be 10 characters!!");

		// page features
		setLayout(null);
		maxHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
		maxWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
		setLocation(0, 0);
		setSize(maxWidth, maxHeight);
		setTitle("Welcome to my JNote!!! ");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		// sign in button;
		signIn.setSize(80, 40);
		signIn.setLocation(50, 20);
		signIn.setBackground(Color.BLUE.brighter().brighter());
		this.getContentPane().add(signIn);
		signIn.addActionListener(this);

		// sign in_Username_JLable
		userNameLabel.setSize(100, 30);
		userNameLabel.setLocation(50, 130);
		userNameLabel.setFont(new Font("Monospaced", Font.PLAIN, 18));
		userNameLabel.setForeground(Color.blue);
		this.getContentPane().add(userNameLabel);

		// sign in:Username
		userName.setSize(100, 40);
		userName.setLocation(200, 130);
		userName.setBackground(Color.magenta.brighter().brighter());
		this.getContentPane().add(userName);
		userName.addActionListener(this);

		// sign in:Uername:Sentence
		usernamesentence.setSize(500, 30);
		usernamesentence.setLocation(370, 130);
		usernamesentence.setFont(new Font("Monospaced", Font.PLAIN, 18));
		usernamesentence.setForeground(Color.red);
		this.getContentPane().add(usernamesentence);

		// sign in_Password_JLable
		passWordLabel.setSize(200, 30);
		passWordLabel.setLocation(50, 210);
		passWordLabel.setFont(new Font("Monospaced", Font.PLAIN, 18));
		passWordLabel.setForeground(Color.blue);
		this.getContentPane().add(passWordLabel);

		// sign in:password
		passWord.addActionListener(this);
		passWord.setSize(100, 40);
		passWord.setLocation(200, 210);
		passWord.setBackground(Color.magenta.brighter().brighter());
		this.getContentPane().add(passWord);
		passWord.addActionListener(this);

		// sign in:Password:Sentence
		passwordsentence.setSize(690, 30);
		passwordsentence.setLocation(370, 210);
		passwordsentence.setFont(new Font("Monospaced", Font.PLAIN, 18));
		passwordsentence.setForeground(Color.red);
		this.getContentPane().add(passwordsentence);

		// sign up button
		signUp.setSize(80, 40);
		signUp.setLocation(50, 350);
		signUp.setBackground(Color.BLUE.brighter().brighter());
		this.getContentPane().add(signUp);
		signUp.addActionListener(this);
		
		/////music
	//	mp = new MP3("bhg.mp3");
		//mp.play();


		// exit of program
		exit.setSize(80, 40);
		exit.setLocation(1250, 20);
		exit.setBackground(Color.RED.brighter().brighter());
		this.getContentPane().add(exit);
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int reply = JOptionPane.showConfirmDialog(null,
						"Are you sure you want to exit?", "EXIT-CONFIRM",
						JOptionPane.YES_NO_OPTION);
				if (reply == JOptionPane.YES_OPTION) {
					Management_Panel.saveText();
					Management_Panel.saveUsers();
					dispose();
					System.exit(0);
				}

			}
		});

		// image of background features
		JLabel r = new JLabel();
		ImageIcon i = new ImageIcon("564.png");
		// this.setLayout(null);
		r.setSize(maxWidth, maxHeight);
		r.setLocation(0, 0);
		r.setIcon(i);
		this.getContentPane().add(r);
		setVisible(true);
		this.addWindowListener(new WindowListener() {

			/* not used
			 * @see java.awt.event.WindowListener#windowOpened(java.awt.event.WindowEvent)
			 */
			@Override
			public void windowOpened(WindowEvent arg0) {
			}

			/* not used
			 * @see java.awt.event.WindowListener#windowIconified(java.awt.event.WindowEvent)
			 */
			@Override
			public void windowIconified(WindowEvent arg0) {
				// TODO Auto-generated method stub

			}

			/* not used
			 * @see java.awt.event.WindowListener#windowDeiconified(java.awt.event.WindowEvent)
			 */
			@Override
			public void windowDeiconified(WindowEvent arg0) {
				// TODO Auto-generated method stub

			}

			/* not used
			 * @see java.awt.event.WindowListener#windowDeactivated(java.awt.event.WindowEvent)
			 */
			/* (non-Javadoc)
			 * @see java.awt.event.WindowListener#windowDeactivated(java.awt.event.WindowEvent)
			 */
			@Override
			public void windowDeactivated(WindowEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowClosing(WindowEvent arg0) {
				Management_Panel.saveText();
				Management_Panel.saveUsers();
				System.exit(0);

			}

			@Override
			public void windowClosed(WindowEvent arg0) {
				// TODO Auto-generated method stub

			}

			/* not used
			 * @see java.awt.event.WindowListener#windowActivated(java.awt.event.WindowEvent)
			 */
			@Override
			public void windowActivated(WindowEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
	}

	/* actionperformed in condtructor
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == signUp) {
			Sign_Up_Page s = new Sign_Up_Page();
			this.dispose();
		}

		else if (e.getSource() == signIn) {
			saveTheUsernameOfSignin = userName.getText();
			saveThePasswordOfSignin = passWord.getText();
			boolean checker = Main.arr_Class.userName
					.contains(saveTheUsernameOfSignin);
			if (checker == false) {
				String message = "ur usernamr does not exit!!";
				JOptionPane.showMessageDialog(new JFrame(), message, "Error",
						JOptionPane.ERROR_MESSAGE);
			}

			else if (checker == true) {

				int index = Main.arr_Class.userName
						.indexOf(saveTheUsernameOfSignin);
				if ((Main.arr_Class.passWord.get(index))
						.compareTo(saveThePasswordOfSignin) == 0) {
					// System.out.println("**********"+arr_Class.getUsername().size());

					Management_Panel management_Panel = new Management_Panel();
					this.dispose();
				}

				else if ((Main.arr_Class.passWord.get(index))
						.compareTo(saveThePasswordOfSignin) != 0) {
					String message = "ur password is not correct!!";
					JOptionPane.showMessageDialog(new JFrame(), message,
							"Error", JOptionPane.ERROR_MESSAGE);

				}

			}

		}

	}

	public void userAndPassKepper() {

	}
	public static void main(String[] args) {
		First_Page first_Page_SQL = new First_Page();
	}
	
}
