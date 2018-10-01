import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * 
 */

/**
 * @author Mahtab
 *
 */
public class Sign_Up_Page extends JFrame implements ActionListener {

	private int maxHeight;
	private int maxWidth;
	JButton exit;
	JLabel welcomesentence;
	JLabel signup;
	JLabel username;
	JLabel password;
	JLabel firstname;
	JLabel lastname;
	JLabel degree;
	JLabel birthday;
	JTextField username1;
	JPasswordField password1;
	JTextField firstname1;
	JTextField lastname1;
	JTextField degree1;
	JTextField birthday1;
	JLabel usernamesentence;
	JLabel passwordsentence;
	JButton signupme;
	// Arr_Class arr_ClassAsFieldOfThisClass;
	String savetheusername;// to save textfield Username the string and add it
							// to the array
	String savethepassword;// to save textfield password the string and add it
							// to the array

	/**
	 * constructor of sign up page
	 */
	public Sign_Up_Page() {
		
		//combo box for degree
		String[] degreelist = new String[] { "diploma", "BA", "MA", "PHP" };

		JComboBox<String> degrees = new JComboBox<>(degreelist);

		add(degrees);
		degrees.setSize(100,40);
		degrees.setLocation(210,440);
		 degrees.setBackground(Color.MAGENTA);
		 degrees.setForeground(Color.BLACK);
		 degrees.addActionListener(this);
		 getContentPane().add(degrees);
		 //combo box for birthday day
		 
		 String[] degreelist1 = new String[] { "1", "2", "3", "4","5","6", "7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};

			JComboBox<String> degrees1 = new JComboBox<>(degreelist1);

			// add to the parent container (e.g. a JFrame):
			add(degrees1);
			degrees1.setSize(100,40);
			degrees1.setLocation(210,500);
			 degrees1.setBackground(Color.MAGENTA);
			 degrees1.setForeground(Color.BLACK);
			 degrees1.addActionListener(this);
			 getContentPane().add(degrees1);
			 
			//combo box for birthday month
			 
			 String[] degreelist2 = new String[] { "January", "February", "March", "April","May","June", "July","August","September","October","November","December"};

				JComboBox<String> degrees2 = new JComboBox<>(degreelist2);

				// add to the parent container (e.g. a JFrame):
				add(degrees2);
				degrees2.setSize(100,40);
				degrees2.setLocation(330,500);
				 degrees2.setBackground(Color.MAGENTA);
				 degrees2.setForeground(Color.BLACK);
				 degrees2.addActionListener(this);
				 getContentPane().add(degrees2);
				 
				//combo box for birthday  year
				 
				 String[] degreelist3 = new String[] { "1991", "1992", "1993", "1994","1995","1996", "1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2100","2011","2012","2013","2014","2015"};

					JComboBox<String> degrees3 = new JComboBox<>(degreelist3);

					// add to the parent container (e.g. a JFrame):
					add(degrees3);
					degrees3.setSize(100,40);
					degrees3.setLocation(450,500);
					 degrees3.setBackground(Color.MAGENTA);
					 degrees3.setForeground(Color.BLACK);
					 degrees3.addActionListener(this);
					 getContentPane().add(degrees3);


		// arr_ClassAsFieldOfThisClass = arr;
		exit = new JButton("EXIT");
		welcomesentence = new JLabel("Welcome 2 my jnote!!Hope u have fun!!");
		signup = new JLabel("Sign up:");
		username = new JLabel("User Name:");
		password = new JLabel("Password:");
		firstname = new JLabel("First Name:");
		lastname = new JLabel("Last Name:");
		degree = new JLabel("Degree:");
		birthday = new JLabel("Birth Date:");
		username1 = new JTextField();
		password1 = new JPasswordField();
		firstname1 = new JTextField();
		lastname1 = new JTextField();
		degree1 = new JTextField();
		birthday1 = new JTextField();
		usernamesentence = new JLabel(
				"*Please enter ur e_mail as ur username!!");
		passwordsentence = new JLabel(
				"*Please enter ur password.UR password has to be 10 characters!!");
		signupme = new JButton("Sign up me:)");

		// page features
		setLayout(null);
		maxHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
		maxWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
		setLocation(0, 0);
		setSize(maxWidth, maxHeight);
		setTitle("Welcome to sign up page!!! ");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		// welcome sentence
		welcomesentence.setSize(520, 30);
		welcomesentence.setLocation(450, 50);
		welcomesentence.setFont(new Font("Monospaced", Font.PLAIN, 24));
		welcomesentence.setForeground(Color.WHITE);
		this.getContentPane().add(welcomesentence);

		// sign up word
		signup.setSize(120, 30);
		signup.setLocation(80, 100);
		signup.setFont(new Font("Monospaced", Font.PLAIN, 24));
		signup.setForeground(Color.BLACK);
		this.getContentPane().add(signup);

		// sign up_Username_JLable
		username.setSize(100, 30);
		username.setLocation(80, 200);
		username.setFont(new Font("Monospaced", Font.PLAIN, 16));
		username.setForeground(Color.blue);
		this.getContentPane().add(username);

		// sign up:Username
		username1.setSize(100, 40);
		username1.setLocation(210, 200);
		username1.setBackground(Color.magenta.brighter().brighter());
		this.getContentPane().add(username1);
		username1.addActionListener(this);

		// sign up:Uername:Sentence
		usernamesentence.setSize(500, 30);
		usernamesentence.setLocation(360, 200);
		usernamesentence.setFont(new Font("Monospaced", Font.PLAIN, 18));
		usernamesentence.setForeground(Color.BLACK);
		this.getContentPane().add(usernamesentence);

		// sign up_Password_JLable
		password.setSize(100, 30);
		password.setLocation(80, 260);
		password.setFont(new Font("Monospaced", Font.PLAIN, 16));
		password.setForeground(Color.blue);
		this.getContentPane().add(password);

		// sign up:password
		password1.setSize(100, 40);
		password1.setLocation(210, 260);
		password1.setBackground(Color.magenta.brighter().brighter());
		this.getContentPane().add(password1);
		password1.addActionListener(this);

		// sign up:Password:Sentence
		passwordsentence.setSize(750, 30);
		passwordsentence.setLocation(360, 260);
		passwordsentence.setFont(new Font("Monospaced", Font.PLAIN, 18));
		passwordsentence.setForeground(Color.BLACK);
		this.getContentPane().add(passwordsentence);

		// sign up_firstname_JLable
		firstname.setSize(110, 30);
		firstname.setLocation(80, 320);
		firstname.setFont(new Font("Monospaced", Font.PLAIN, 16));
		firstname.setForeground(Color.blue);
		this.getContentPane().add(firstname);

		// sign up:firstname
		firstname1.setSize(100, 40);
		firstname1.setLocation(210, 320);
		firstname1.setBackground(Color.magenta.brighter().brighter());
		this.getContentPane().add(firstname1);
		firstname1.addActionListener(this);

		// // sign up:Uername:Sentence
		// usernamesentence.setSize(500, 30);
		// usernamesentence.setLocation(370, 130);
		// usernamesentence.setFont(new Font("Monospaced", Font.PLAIN, 18));
		// usernamesentence.setForeground(Color.red);
		// this.getContentPane().add(usernamesentence);

		// sign up_lastname_JLable
		lastname.setSize(110, 30);
		lastname.setLocation(80, 380);
		lastname.setFont(new Font("Monospaced", Font.PLAIN, 16));
		lastname.setForeground(Color.blue);
		this.getContentPane().add(lastname);

		// sign up:lastname
		lastname1.setSize(100, 40);
		lastname1.setLocation(210, 380);
		lastname1.setBackground(Color.magenta.brighter().brighter());
		this.getContentPane().add(lastname1);
		lastname1.addActionListener(this);

		

		// sign up_degree_JLable
		degree.setSize(110, 30);
		degree.setLocation(80, 440);
		degree.setFont(new Font("Monospaced", Font.PLAIN, 16));
		degree.setForeground(Color.blue);
		this.getContentPane().add(degree);

//		// sign up:degree
//		degree1.setSize(100, 40);
//		degree1.setLocation(210, 440);
//		degree1.setBackground(Color.magenta.brighter().brighter());
//		this.getContentPane().add(degree1);
//		degree1.addActionListener(this);


		// sign up_birthday_JLable
		birthday.setSize(110, 30);
		birthday.setLocation(80, 500);
		birthday.setFont(new Font("Monospaced", Font.PLAIN, 16));
		birthday.setForeground(Color.blue);
		this.getContentPane().add(birthday);

//		// sign up:birthday
//		birthday1.setSize(100, 40);
//		birthday1.setLocation(210, 500);
//		birthday1.setBackground(Color.magenta.brighter().brighter());
//		this.getContentPane().add(birthday1);
//		birthday1.addActionListener(this);

	

		// sign up me button;
		signupme.setSize(120, 40);
		signupme.setLocation(100, 600);
		signupme.setBackground(Color.WHITE.brighter().brighter());
		this.getContentPane().add(signupme);
		signupme.addActionListener(this);

		// exit of program
		exit.setSize(80, 40);
		exit.setLocation(1250, 20);
		exit.setBackground(Color.YELLOW);
		this.getContentPane().add(exit);
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int reply = JOptionPane.showConfirmDialog(null,
						"Are you sure you want to exit?", "EXIT-CONFIRM",
						JOptionPane.YES_NO_OPTION);
				if (reply == JOptionPane.YES_OPTION) {
					dispose();
					System.exit(0);
				}

			}
		});

		// image of background features
		JLabel r = new JLabel();
		ImageIcon i = new ImageIcon("4122.png");
		// this.setLayout(null);
		r.setSize(maxWidth, maxHeight);
		r.setLocation(0, 0);
		r.setIcon(i);
		this.getContentPane().add(r);
		setVisible(true);

	}

	/*
	 * actionperformed of sign up
	 * 
	 * @see
	 * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == signupme) {
			savetheusername = username1.getText();
			savethepassword = password1.getText();
			boolean checkToFindTheUsername = Main.arr_Class.userName
					.contains(savetheusername);
			if (checkToFindTheUsername == false) {
				System.out.println("hi");

				Main.arr_Class.userName.add(savetheusername);
				Main.arr_Class.passWord.add(savethepassword);
				System.out.println("&&&&" + Main.arr_Class.userName.size());
				Management_Panel mk = new Management_Panel();
				this.dispose();
			}

			else if (checkToFindTheUsername == true) {
				String message = "The Email u entered is existed.Please try another username";
				JOptionPane.showMessageDialog(new JFrame(), message, "Error",
						JOptionPane.ERROR_MESSAGE);
			}

		}
	}

}
