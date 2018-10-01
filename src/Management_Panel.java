import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * @author Mahtab
 *
 */
public class Management_Panel extends JFrame implements ActionListener ,Serializable{

	private int maxHeight;
	private int maxWidth;
	JButton exit;
	JLabel welcomesentence;
	JButton add;
	JButton manage;
	JButton search;
	ImageIcon notebookpicture;
	static ArrayList<Class_B> vb = new ArrayList<Class_B>();

	public Management_Panel() {

		exit = new JButton("EXIT");
		add = new JButton("Add");
		manage = new JButton("Manage");
		search = new JButton("Search");
		notebookpicture = new ImageIcon("poi.png");
		welcomesentence = new JLabel(
				"Welcome 2 ur management panel!!Enjoy my JNote!!");

		// page features
		setLayout(null);
		maxHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
		maxWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
		setLocation(0, 0);
		setSize(maxWidth, maxHeight);
		setTitle(" My Managment Panel!!! ");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		// welcome sentence
		welcomesentence.setSize(670, 30);
		welcomesentence.setLocation(300, 20);
		welcomesentence.setFont(new Font("Monospaced", Font.PLAIN, 24));
		welcomesentence.setForeground(Color.WHITE);
		this.getContentPane().add(welcomesentence);

		// Add button
		add.setSize(100, 40);
		add.setLocation(330, 150);
		add.setBackground(Color.ORANGE.brighter().brighter());
		this.getContentPane().add(add);
		add.addActionListener(this);

		// manage button
		manage.setSize(100, 40);
		manage.setLocation(330, 330);
		manage.setBackground(Color.ORANGE.brighter().brighter());
		this.getContentPane().add(manage);
		manage.addActionListener(this);

		// search button
		search.setSize(100, 40);
		search.setLocation(330, 535);
		search.setBackground(Color.ORANGE.brighter().brighter());
		this.getContentPane().add(search);
		search.addActionListener(this);

		// exit of program
		exit.setSize(80, 40);
		exit.setLocation(1250, 20);
		exit.setBackground(Color.WHITE);
		this.getContentPane().add(exit);
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int reply = JOptionPane.showConfirmDialog(null,
						"Are you sure you want to go back to the first page?",
						"EXIT-CONFIRM", JOptionPane.YES_NO_OPTION);
				if (reply == JOptionPane.YES_OPTION) {
					dispose();
					First_Page f = new First_Page();
				}

			}
		});

		// image of background features
		JLabel r = new JLabel();
		ImageIcon i = new ImageIcon("639.png");
		// this.setLayout(null);
		r.setSize(maxWidth, maxHeight);
		r.setLocation(0, 0);
		r.setIcon(i);
		this.getContentPane().add(r);
		setVisible(true);

	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(notebookpicture.getImage(), 480, 200, 400, 400, null);

	}

	/* actionperformed method
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == add) {
			Add_Class a = new Add_Class();

		}

		else if (arg0.getSource() == manage) {
			Management_Class management_Class = new Management_Class(this);
		}

		else if (arg0.getSource() == search) {
			Search_Class serach = new Search_Class(this);
		}

	}

	public void add() {
		Add_Class add_Class = new Add_Class();

	}

	public void manage() {

		Management_Class m1 = new Management_Class(this);

	}

	public void search() {
		Search_Class se = new Search_Class(this);

	}

	// public static void main(String[] args) {
	// Management_Panel management_Panel = new Management_Panel();
	// }

	public static void saveText() {
		try {
			FileOutputStream out = new FileOutputStream("text.ser");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
			objectOutputStream.writeObject(vb);
			objectOutputStream.close();
			out.close();
			System.out.println("serialized the text arraylist");
		} catch (IOException e) {
			System.err.println("error in saving text");
			e.printStackTrace();
		}
	}

	public static void saveUsers() {
		try {
			FileOutputStream out = new FileOutputStream("users.ser");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
			objectOutputStream.writeObject(Main.arr_Class);
			objectOutputStream.close();
			out.close();
			System.out.println("serialized the text arraylist");
		} catch (IOException e) {
			System.err.println("could not save users");
			e.printStackTrace();
		}
	}

	public static void loadText() {
		try {
			FileInputStream fileIn = new FileInputStream("text.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			vb = (ArrayList<Class_B>) in.readObject();
			in.close();
			fileIn.close();
			System.out.println("deserialized the text arraylist");
		} catch (IOException e) {
			System.err.println("error in loading text");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void loadUsers() {
		try {
			FileInputStream fileIn = new FileInputStream("users.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			Main.arr_Class = (Arr_Class) in.readObject();
			in.close();
			fileIn.close();
			System.out.println("deserialized the users arraylist");
		} catch (IOException e) {
			System.err.println("error in loading users");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
