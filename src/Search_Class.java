import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 * @author Mahtab
 *
 */
public class Search_Class extends JFrame implements ActionListener {

	private int maxHeight;
	private int maxWidth;
	JButton exit;
	JLabel titlllle;
	JLabel Dattte;
	JLabel AuthorNNName;
	JLabel keyWorddd;
	JLabel keyWorddd2;
	JLabel keyWorddd3;
	JLabel keyWorddd4;
	JLabel titleanddate;
	JLabel titleandkeyword1;
	JLabel authernameandkeyword1;
	String titleAndDate11;
	String titleandkeyword11;
	String authorandkeyword11;

	JTextField titllle1;
	JTextField Datttte1;
	JTextField authornammmmme1;
	JTextField keyworrrdddd1;
	JTextField keyworrrdddd2;
	JTextField keyworrrdddd3;
	JTextField keyworrrdddd4;
	JTextField titleAndDate;
	JTextField titleAndKeyword1;
	JTextField authornameAndKeyword1;

	JButton search1;
	JButton search2;
	JButton search3;
	JButton search4;
	JButton search5;
	JButton search6;
	JButton search7;
	JButton search8;
	JButton search9;
	JButton search10;

	String title5;
	String date5;
	String name5;
	String key5;
	String key52;
	String key53;
	String key54;

	Management_Panel m;

	public Search_Class(Management_Panel m) {
		this.m = m;
		exit = new JButton("EXIT");
		titlllle = new JLabel("Title:");
		Dattte = new JLabel("Date:");
		AuthorNNName = new JLabel("Author Name:");
		keyWorddd = new JLabel("Keyword1:");
		keyWorddd2 = new JLabel("Keyword2:");
		keyWorddd3 = new JLabel("Keyword3:");
		keyWorddd4 = new JLabel("Keyword4:");
		titleanddate = new JLabel("Title and Date:");
		titleandkeyword1 = new JLabel("Title and Keyword:");
		authernameandkeyword1 = new JLabel("Author & Keyword:");

		titllle1 = new JTextField();
		Datttte1 = new JTextField();
		authornammmmme1 = new JTextField();
		keyworrrdddd1 = new JTextField();
		keyworrrdddd2 = new JTextField();
		keyworrrdddd3 = new JTextField();
		keyworrrdddd4 = new JTextField();
		titleAndDate = new JTextField();
		titleAndKeyword1 = new JTextField();
		authornameAndKeyword1 = new JTextField();

		search1 = new JButton("Search");
		search2 = new JButton("Search");
		search3 = new JButton("Search");
		search4 = new JButton("Search");
		search5 = new JButton("Search");
		search6 = new JButton("Search");
		search7 = new JButton("Search");
		search8 = new JButton("search");
		search9 = new JButton("search");
		search10 = new JButton("search");

		// page features
		setLayout(null);
		maxHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
		maxWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
		setLocation(0, 0);
		setSize(maxWidth, maxHeight);
		setTitle("Welcome to ur search page!!! ");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		// title label
		titlllle.setSize(100, 30);
		titlllle.setLocation(50, 70);
		titlllle.setFont(new Font("Monospaced", Font.PLAIN, 18));
		titlllle.setForeground(Color.CYAN);
		titlllle.setBackground(Color.YELLOW);
		this.getContentPane().add(titlllle);

		// title textfield
		titllle1.setSize(110, 40);
		titllle1.setLocation(220, 70);
		titllle1.setBackground(Color.PINK);
		this.getContentPane().add(titllle1);
		titllle1.addActionListener(this);

		// the button of search
		search1.setSize(80, 40);
		search1.setLocation(390, 70);
		search1.setBackground(Color.green);
		this.getContentPane().add(search1);
		search1.addActionListener(this);

		// title and date label
		titleanddate.setSize(300, 30);
		titleanddate.setLocation(530, 70);
		titleanddate.setFont(new Font("Monospaced", Font.PLAIN, 18));
		titleanddate.setForeground(Color.CYAN);
		titleanddate.setBackground(Color.YELLOW);
		this.getContentPane().add(titleanddate);

		// titlea and date textfield
		titleAndDate.setSize(110, 40);
		titleAndDate.setLocation(800, 70);
		titleAndDate.setBackground(Color.PINK);
		this.getContentPane().add(titleAndDate);
		titleAndDate.addActionListener(this);

		// the button of search for title and date
		search8.setSize(80, 40);
		search8.setLocation(970, 70);
		search8.setBackground(Color.green);
		this.getContentPane().add(search8);
		search8.addActionListener(this);

		// date label
		Dattte.setSize(100, 30);
		Dattte.setLocation(50, 200);
		Dattte.setFont(new Font("Monospaced", Font.PLAIN, 18));
		Dattte.setForeground(Color.CYAN);
		Dattte.setBackground(Color.YELLOW);
		this.getContentPane().add(Dattte);

		// date textfield
		Datttte1.setSize(110, 40);
		Datttte1.setLocation(220, 200);
		Datttte1.setBackground(Color.PINK);
		this.getContentPane().add(Datttte1);
		Datttte1.addActionListener(this);

		// the button of search
		search2.setSize(80, 40);
		search2.setLocation(390, 200);
		search2.setBackground(Color.green);
		this.getContentPane().add(search2);
		search2.addActionListener(this);

		// date label
		titleandkeyword1.setSize(200, 30);
		titleandkeyword1.setLocation(530, 200);
		titleandkeyword1.setFont(new Font("Monospaced", Font.PLAIN, 18));
		titleandkeyword1.setForeground(Color.CYAN);
		titleandkeyword1.setBackground(Color.YELLOW);
		this.getContentPane().add(titleandkeyword1);

		// date textfield
		titleAndKeyword1.setSize(110, 40);
		titleAndKeyword1.setLocation(800, 200);
		titleAndKeyword1.setBackground(Color.PINK);
		this.getContentPane().add(titleAndKeyword1);
		titleAndKeyword1.addActionListener(this);

		// the button of search
		search9.setSize(80, 40);
		search9.setLocation(970, 200);
		search9.setBackground(Color.green);
		this.getContentPane().add(search9);
		search9.addActionListener(this);

		// AuthorName label
		AuthorNNName.setSize(150, 30);
		AuthorNNName.setLocation(50, 330);
		AuthorNNName.setFont(new Font("Monospaced", Font.PLAIN, 18));
		AuthorNNName.setForeground(Color.CYAN);
		AuthorNNName.setBackground(Color.YELLOW);
		this.getContentPane().add(AuthorNNName);

		// authorname textfield
		authornammmmme1.setSize(110, 40);
		authornammmmme1.setLocation(220, 330);
		authornammmmme1.setBackground(Color.PINK);
		this.getContentPane().add(authornammmmme1);
		authornammmmme1.addActionListener(this);

		// the button of search
		search3.setSize(80, 40);
		search3.setLocation(390, 330);
		search3.setBackground(Color.green);
		this.getContentPane().add(search3);
		search3.addActionListener(this);

		// AuthorName and keyword1 label
		authernameandkeyword1.setSize(220, 30);
		authernameandkeyword1.setLocation(530, 330);
		authernameandkeyword1.setFont(new Font("Monospaced", Font.PLAIN, 18));
		authernameandkeyword1.setForeground(Color.CYAN);
		authernameandkeyword1.setBackground(Color.YELLOW);
		this.getContentPane().add(authernameandkeyword1);

		// authorname and keyword1 textfield
		authornameAndKeyword1.setSize(110, 40);
		authornameAndKeyword1.setLocation(800, 330);
		authornameAndKeyword1.setBackground(Color.PINK);
		this.getContentPane().add(authornameAndKeyword1);
		authornameAndKeyword1.addActionListener(this);

		// the button of search10
		search10.setSize(80, 40);
		search10.setLocation(970, 330);
		search10.setBackground(Color.green);
		this.getContentPane().add(search10);
		search10.addActionListener(this);

		// Keyword label
		keyWorddd.setSize(100, 30);
		keyWorddd.setLocation(50, 460);
		keyWorddd.setFont(new Font("Monospaced", Font.PLAIN, 18));
		keyWorddd.setForeground(Color.CYAN);
		keyWorddd.setBackground(Color.YELLOW);
		this.getContentPane().add(keyWorddd);

		// keyword textfield
		keyworrrdddd1.setSize(110, 40);
		keyworrrdddd1.setLocation(220, 460);
		keyworrrdddd1.setBackground(Color.PINK);
		this.getContentPane().add(keyworrrdddd1);
		keyworrrdddd1.addActionListener(this);

		// the button of search
		search4.setSize(80, 40);
		search4.setLocation(390, 460);
		search4.setBackground(Color.green);
		this.getContentPane().add(search4);
		search4.addActionListener(this);

		// Keyword label
		keyWorddd2.setSize(100, 30);
		keyWorddd2.setLocation(570, 460);
		keyWorddd2.setFont(new Font("Monospaced", Font.PLAIN, 18));
		keyWorddd2.setForeground(Color.CYAN);
		keyWorddd2.setBackground(Color.YELLOW);
		this.getContentPane().add(keyWorddd2);

		// keyword textfield
		keyworrrdddd2.setSize(110, 40);
		keyworrrdddd2.setLocation(800, 460);
		keyworrrdddd2.setBackground(Color.PINK);
		this.getContentPane().add(keyworrrdddd2);
		keyworrrdddd2.addActionListener(this);

		// the button of search
		search5.setSize(80, 40);
		search5.setLocation(970, 460);
		search5.setBackground(Color.green);
		this.getContentPane().add(search5);
		search5.addActionListener(this);

		// Keyword label
		keyWorddd3.setSize(100, 30);
		keyWorddd3.setLocation(50, 590);
		keyWorddd3.setFont(new Font("Monospaced", Font.PLAIN, 18));
		keyWorddd3.setForeground(Color.CYAN);
		keyWorddd3.setBackground(Color.YELLOW);
		this.getContentPane().add(keyWorddd3);

		// keyword textfield
		keyworrrdddd3.setSize(110, 40);
		keyworrrdddd3.setLocation(220, 590);
		keyworrrdddd3.setBackground(Color.PINK);
		this.getContentPane().add(keyworrrdddd3);
		keyworrrdddd3.addActionListener(this);

		// the button of search
		search6.setSize(80, 40);
		search6.setLocation(390, 590);
		search6.setBackground(Color.green);
		this.getContentPane().add(search6);
		search6.addActionListener(this);

		// Keyword label
		keyWorddd4.setSize(100, 30);
		keyWorddd4.setLocation(570, 590);
		keyWorddd4.setFont(new Font("Monospaced", Font.PLAIN, 18));
		keyWorddd4.setForeground(Color.CYAN);
		keyWorddd4.setBackground(Color.YELLOW);
		this.getContentPane().add(keyWorddd4);

		// keyword textfield
		keyworrrdddd4.setSize(110, 40);
		keyworrrdddd4.setLocation(800, 590);
		keyworrrdddd4.setBackground(Color.PINK);
		this.getContentPane().add(keyworrrdddd4);
		keyworrrdddd4.addActionListener(this);

		// the button of search
		search7.setSize(80, 40);
		search7.setLocation(970, 590);
		search7.setBackground(Color.green);
		this.getContentPane().add(search7);
		search7.addActionListener(this);

		// exit of program
		exit.setSize(80, 40);
		exit.setLocation(1250, 20);
		exit.setBackground(Color.YELLOW.brighter().brighter());
		this.getContentPane().add(exit);
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int reply = JOptionPane
						.showConfirmDialog(
								null,
								"Are you sure you want to go back to ue management panel?",
								"EXIT-CONFIRM", JOptionPane.YES_NO_OPTION);
				if (reply == JOptionPane.YES_OPTION) {
					Management_Panel m = new Management_Panel();
					// dispose();
				}

			}
		});

		// image of background features
		JLabel r = new JLabel();
		ImageIcon i = new ImageIcon("456987.jpg");
		// this.setLayout(null);
		r.setSize(maxWidth, maxHeight);
		r.setLocation(0, 0);
		r.setIcon(i);
		this.getContentPane().add(r);
		setVisible(true);

	}

	/*
	 * actionperformed of search class
	 * 
	 * @see
	 * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		ArrayList<Integer> savetitleofsearch = new ArrayList<Integer>();
		ArrayList<Integer> savedateofsearch = new ArrayList<Integer>();
		ArrayList<Integer> saveauthornameofsearch = new ArrayList<Integer>();
		ArrayList<Integer> savekeywordofsearch = new ArrayList<Integer>();
		ArrayList<Integer> savekeyword2ofsearch = new ArrayList<Integer>();
		ArrayList<Integer> savekeyword3ofsearch = new ArrayList<Integer>();
		ArrayList<Integer> savekeyword4ofsearch = new ArrayList<Integer>();
		ArrayList<Integer> savetitleanddate = new ArrayList<Integer>();
		ArrayList<Integer> savetitleandkeyword = new ArrayList<Integer>();
		ArrayList<Integer> saveauthorandkeyword = new ArrayList<Integer>();

		if (arg0.getSource() == search1) {
			title5 = titllle1.getText();
			for (int gi = 0; gi < m.vb.size(); gi++) {
				if (Management_Panel.vb.get(gi).title.compareTo(title5) == 0) {
					savetitleofsearch.add(gi);

					JPanel panel11 = new JPanel();
					panel11.setLayout(null);
					this.getContentPane().add(panel11);

					Object rowData1234[][] = new Object[savetitleofsearch
							.size()][4];
					for (int yu = 0; yu < savetitleofsearch.size(); yu++) {
						rowData1234[yu][0] = yu;
						rowData1234[yu][1] = m.vb.get(gi).title;
						rowData1234[yu][2] = m.vb.get(gi).date;
						rowData1234[yu][3] = m.vb.get(gi).authorName;

					}

					Object columnNames1234[] = { "Number", "Title", "Date",
							"Author Name" };

					JTable table1234 = new JTable(rowData1234, columnNames1234);
					panel11.setLayout(null);
					JScrollPane scrollPane1234 = new JScrollPane(table1234);
					panel11.add(scrollPane1234, BorderLayout.CENTER);
					panel11.setLocation(500, 30);
					panel11.setSize(300, 100);
					scrollPane1234.setSize(300, 100);
					scrollPane1234.setLocation(0, 0);
					panel11.add(scrollPane1234);

				}

			}
			if (savetitleofsearch.size() == 0) {
				String messageforsearchtitle = "The title u entered is not found!!";
				int mc = JOptionPane.WARNING_MESSAGE;
				JOptionPane.showMessageDialog(null, messageforsearchtitle,
						"Info message", mc);

			}

		}

		else if (arg0.getSource() == search2) {
			date5 = Datttte1.getText();
			for (int gi = 0; gi < m.vb.size(); gi++) {
				if (Management_Panel.vb.get(gi).date.compareTo(date5) == 0) {
					savedateofsearch.add(gi);

					JPanel panel11 = new JPanel();
					panel11.setLayout(null);
					this.getContentPane().add(panel11);

					Object rowData1234[][] = new Object[savedateofsearch.size()][4];
					for (int yu = 0; yu < savedateofsearch.size(); yu++) {
						rowData1234[yu][0] = yu;
						rowData1234[yu][1] = m.vb.get(gi).title;
						rowData1234[yu][2] = m.vb.get(gi).date;
						rowData1234[yu][3] = m.vb.get(gi).authorName;

					}

					Object columnNames1234[] = { "Number", "Title", "Date",
							"Author Name" };

					JTable table1234 = new JTable(rowData1234, columnNames1234);
					panel11.setLayout(null);
					JScrollPane scrollPane1234 = new JScrollPane(table1234);
					panel11.add(scrollPane1234, BorderLayout.CENTER);
					panel11.setLocation(500, 30);
					panel11.setSize(300, 100);
					scrollPane1234.setSize(300, 100);
					scrollPane1234.setLocation(0, 0);
					panel11.add(scrollPane1234);

				}

			}
			if (savedateofsearch.size() == 0) {
				String messageforsearchtitle = "The date u entered is not found!!";
				int mc = JOptionPane.WARNING_MESSAGE;
				JOptionPane.showMessageDialog(null, messageforsearchtitle,
						"Info message", mc);

			}
		}

		else if (arg0.getSource() == search3) {
			name5 = authornammmmme1.getText();
			for (int gi = 0; gi < m.vb.size(); gi++) {
				if (Management_Panel.vb.get(gi).authorName.compareTo(name5) == 0) {
					saveauthornameofsearch.add(gi);

					JPanel panel11 = new JPanel();
					panel11.setLayout(null);
					this.getContentPane().add(panel11);

					Object rowData1234[][] = new Object[saveauthornameofsearch
							.size()][4];
					for (int yu = 0; yu < saveauthornameofsearch.size(); yu++) {
						rowData1234[yu][0] = yu;
						rowData1234[yu][1] = m.vb.get(gi).title;
						rowData1234[yu][2] = m.vb.get(gi).date;
						rowData1234[yu][3] = m.vb.get(gi).authorName;

					}

					Object columnNames1234[] = { "Number", "Title", "Date",
							"Author Name" };

					JTable table1234 = new JTable(rowData1234, columnNames1234);
					panel11.setLayout(null);
					JScrollPane scrollPane1234 = new JScrollPane(table1234);
					panel11.add(scrollPane1234, BorderLayout.CENTER);
					panel11.setLocation(500, 30);
					panel11.setSize(300, 100);
					scrollPane1234.setSize(300, 100);
					scrollPane1234.setLocation(0, 0);
					panel11.add(scrollPane1234);

				}

			}
			if (saveauthornameofsearch.size() == 0) {
				String messageforsearchtitle = "The author name u entered is not found!!";
				int mc = JOptionPane.WARNING_MESSAGE;
				JOptionPane.showMessageDialog(null, messageforsearchtitle,
						"Info message", mc);

			}
		}

		else if (arg0.getSource() == search4) {
			key5 = keyworrrdddd1.getText();
			for (int gi = 0; gi < m.vb.size(); gi++) {
				if (Management_Panel.vb.get(gi).keyword1.compareTo(key5) == 0) {
					savekeywordofsearch.add(gi);

					JPanel panel11 = new JPanel();
					panel11.setLayout(null);
					this.getContentPane().add(panel11);

					Object rowData1234[][] = new Object[savekeywordofsearch
							.size()][4];
					for (int yu = 0; yu < savekeywordofsearch.size(); yu++) {
						rowData1234[yu][0] = yu;
						rowData1234[yu][1] = m.vb.get(gi).title;
						rowData1234[yu][2] = m.vb.get(gi).date;
						rowData1234[yu][3] = m.vb.get(gi).authorName;

					}

					Object columnNames1234[] = { "Number", "Title", "Date",
							"Author Name" };

					JTable table1234 = new JTable(rowData1234, columnNames1234);
					panel11.setLayout(null);
					JScrollPane scrollPane1234 = new JScrollPane(table1234);
					panel11.add(scrollPane1234, BorderLayout.CENTER);
					panel11.setLocation(500, 30);
					panel11.setSize(300, 100);
					scrollPane1234.setSize(300, 100);
					scrollPane1234.setLocation(0, 0);
					panel11.add(scrollPane1234);

				}

			}
			if (savekeywordofsearch.size() == 0) {
				String messageforsearchtitle = "The keyword u entered is not found!!";
				int mc = JOptionPane.WARNING_MESSAGE;
				JOptionPane.showMessageDialog(null, messageforsearchtitle,
						"Info message", mc);

			}
		}

		else if (arg0.getSource() == search5) {
			key52 = keyworrrdddd2.getText();
			for (int gi = 0; gi < m.vb.size(); gi++) {
				if (Management_Panel.vb.get(gi).keyword2.compareTo(key52) == 0) {
					savekeyword2ofsearch.add(gi);

					JPanel panel11 = new JPanel();
					panel11.setLayout(null);
					this.getContentPane().add(panel11);

					Object rowData1234[][] = new Object[savekeyword2ofsearch
							.size()][4];
					for (int yu = 0; yu < savekeyword2ofsearch.size(); yu++) {
						rowData1234[yu][0] = yu;
						rowData1234[yu][1] = m.vb.get(gi).title;
						rowData1234[yu][2] = m.vb.get(gi).date;
						rowData1234[yu][3] = m.vb.get(gi).authorName;

					}

					Object columnNames1234[] = { "Number", "Title", "Date",
							"Author Name" };

					JTable table1234 = new JTable(rowData1234, columnNames1234);
					panel11.setLayout(null);
					JScrollPane scrollPane1234 = new JScrollPane(table1234);
					panel11.add(scrollPane1234, BorderLayout.CENTER);
					panel11.setLocation(500, 30);
					panel11.setSize(300, 100);
					scrollPane1234.setSize(300, 100);
					scrollPane1234.setLocation(0, 0);
					panel11.add(scrollPane1234);

				}

			}
			if (savekeyword2ofsearch.size() == 0) {
				String messageforsearchtitle = "The keyword2 u entered is not found!!";
				int mc = JOptionPane.WARNING_MESSAGE;
				JOptionPane.showMessageDialog(null, messageforsearchtitle,
						"Info message", mc);

			}
		}

		else if (arg0.getSource() == search6) {
			key53 = keyworrrdddd3.getText();
			for (int gi = 0; gi < m.vb.size(); gi++) {
				if (Management_Panel.vb.get(gi).keyword3.compareTo(key53) == 0) {
					savekeyword3ofsearch.add(gi);

					JPanel panel11 = new JPanel();
					panel11.setLayout(null);
					this.getContentPane().add(panel11);

					Object rowData1234[][] = new Object[savekeyword3ofsearch
							.size()][4];
					for (int yu = 0; yu < savekeyword3ofsearch.size(); yu++) {
						rowData1234[yu][0] = yu;
						rowData1234[yu][1] = m.vb.get(gi).title;
						rowData1234[yu][2] = m.vb.get(gi).date;
						rowData1234[yu][3] = m.vb.get(gi).authorName;

					}

					Object columnNames1234[] = { "Number", "Title", "Date",
							"Author Name" };

					JTable table1234 = new JTable(rowData1234, columnNames1234);
					panel11.setLayout(null);
					JScrollPane scrollPane1234 = new JScrollPane(table1234);
					panel11.add(scrollPane1234, BorderLayout.CENTER);
					panel11.setLocation(500, 30);
					panel11.setSize(300, 100);
					scrollPane1234.setSize(300, 100);
					scrollPane1234.setLocation(0, 0);
					panel11.add(scrollPane1234);

				}

			}
			if (savekeyword3ofsearch.size() == 0) {
				String messageforsearchtitle = "The keyword3 u entered is not found!!";
				int mc = JOptionPane.WARNING_MESSAGE;
				JOptionPane.showMessageDialog(null, messageforsearchtitle,
						"Info message", mc);

			}
		}

		else if (arg0.getSource() == search7) {
			key54 = keyworrrdddd4.getText();
			for (int gi = 0; gi < m.vb.size(); gi++) {
				if (Management_Panel.vb.get(gi).keyword4.compareTo(key54) == 0) {
					savekeyword4ofsearch.add(gi);

					JPanel panel11 = new JPanel();
					panel11.setLayout(null);
					this.getContentPane().add(panel11);

					Object rowData1234[][] = new Object[savekeyword4ofsearch
							.size()][4];
					for (int yu = 0; yu < savekeyword4ofsearch.size(); yu++) {
						rowData1234[yu][0] = yu;
						rowData1234[yu][1] = m.vb.get(gi).title;
						rowData1234[yu][2] = m.vb.get(gi).date;
						rowData1234[yu][3] = m.vb.get(gi).authorName;

					}

					Object columnNames1234[] = { "Number", "Title", "Date",
							"Author Name" };

					JTable table1234 = new JTable(rowData1234, columnNames1234);
					panel11.setLayout(null);
					JScrollPane scrollPane1234 = new JScrollPane(table1234);
					panel11.add(scrollPane1234, BorderLayout.CENTER);
					panel11.setLocation(500, 30);
					panel11.setSize(300, 100);
					scrollPane1234.setSize(300, 100);
					scrollPane1234.setLocation(0, 0);
					panel11.add(scrollPane1234);

				}

			}
			if (savekeyword4ofsearch.size() == 0) {
				String messageforsearchtitle = "The keyword4 u entered is not found!!";
				int mc = JOptionPane.WARNING_MESSAGE;
				JOptionPane.showMessageDialog(null, messageforsearchtitle,
						"Info message", mc);

			}
		}

		else if (arg0.getSource() == search8) {
			titleAndDate11 = titleAndDate.getText();
			for (int gi = 0; gi < m.vb.size(); gi++) {
				if (Management_Panel.vb.get(gi).date.compareTo(titleAndDate11) == 0
						|| Management_Panel.vb.get(gi).title
								.compareTo(titleAndDate11) == 0) {
					savetitleanddate.add(gi);

					JPanel panel11 = new JPanel();
					panel11.setLayout(null);
					this.getContentPane().add(panel11);

					Object rowData1234[][] = new Object[savetitleanddate.size()][4];
					for (int yu = 0; yu < savetitleanddate.size(); yu++) {
						rowData1234[yu][0] = yu;
						rowData1234[yu][1] = m.vb.get(gi).title;
						rowData1234[yu][2] = m.vb.get(gi).date;
						rowData1234[yu][3] = m.vb.get(gi).authorName;

					}

					Object columnNames1234[] = { "Number", "Title", "Date",
							"Author Name" };

					JTable table1234 = new JTable(rowData1234, columnNames1234);
					panel11.setLayout(null);
					JScrollPane scrollPane1234 = new JScrollPane(table1234);
					panel11.add(scrollPane1234, BorderLayout.CENTER);
					panel11.setLocation(500, 30);
					panel11.setSize(300, 100);
					scrollPane1234.setSize(300, 100);
					scrollPane1234.setLocation(0, 0);
					panel11.add(scrollPane1234);

				}

			}
			if (savetitleanddate.size() == 0) {
				String messageforsearchtitle = "The title or date u entered is not found!!";
				int mc = JOptionPane.WARNING_MESSAGE;
				JOptionPane.showMessageDialog(null, messageforsearchtitle,
						"Info message", mc);

			}

			else if (arg0.getSource() == search9) {
				titleandkeyword11 = titleAndKeyword1.getText();
				for (int gi = 0; gi < m.vb.size(); gi++) {
					if (Management_Panel.vb.get(gi).keyword1
							.compareTo(titleandkeyword11) == 0
							|| Management_Panel.vb.get(gi).title
									.compareTo(titleandkeyword11) == 0) {
						savetitleandkeyword.add(gi);

						JPanel panel11 = new JPanel();
						panel11.setLayout(null);
						this.getContentPane().add(panel11);

						Object rowData1234[][] = new Object[savetitleandkeyword
								.size()][4];
						for (int yu = 0; yu < savetitleandkeyword.size(); yu++) {
							rowData1234[yu][0] = yu;
							rowData1234[yu][1] = m.vb.get(gi).title;
							rowData1234[yu][2] = m.vb.get(gi).date;
							rowData1234[yu][3] = m.vb.get(gi).authorName;

						}

						Object columnNames1234[] = { "Number", "Title", "Date",
								"Author Name" };

						JTable table1234 = new JTable(rowData1234,
								columnNames1234);
						panel11.setLayout(null);
						JScrollPane scrollPane1234 = new JScrollPane(table1234);
						panel11.add(scrollPane1234, BorderLayout.CENTER);
						panel11.setLocation(500, 30);
						panel11.setSize(300, 100);
						scrollPane1234.setSize(300, 100);
						scrollPane1234.setLocation(0, 0);
						panel11.add(scrollPane1234);

					}

				}
				if (savetitleandkeyword.size() == 0) {
					String messageforsearchtitle = "The title or keyword u entered is not found!!";
					int mc = JOptionPane.WARNING_MESSAGE;
					JOptionPane.showMessageDialog(null, messageforsearchtitle,
							"Info message", mc);

				} else if (arg0.getSource() == search10) {
					authorandkeyword11 = authornameAndKeyword1.getText();
					for (int gi = 0; gi < m.vb.size(); gi++) {
						if (Management_Panel.vb.get(gi).authorName
								.compareTo(authorandkeyword11) == 0
								|| Management_Panel.vb.get(gi).keyword1
										.compareTo(authorandkeyword11) == 0) {
							saveauthorandkeyword.add(gi);

							JPanel panel11 = new JPanel();
							panel11.setLayout(null);
							this.getContentPane().add(panel11);

							Object rowData1234[][] = new Object[saveauthorandkeyword
									.size()][4];
							for (int yu = 0; yu < saveauthorandkeyword.size(); yu++) {
								rowData1234[yu][0] = yu;
								rowData1234[yu][1] = m.vb.get(gi).title;
								rowData1234[yu][2] = m.vb.get(gi).date;
								rowData1234[yu][3] = m.vb.get(gi).authorName;

							}

							Object columnNames1234[] = { "Number", "Title",
									"Date", "Author Name" };

							JTable table1234 = new JTable(rowData1234,
									columnNames1234);
							panel11.setLayout(null);
							JScrollPane scrollPane1234 = new JScrollPane(
									table1234);
							panel11.add(scrollPane1234, BorderLayout.CENTER);
							panel11.setLocation(500, 30);
							panel11.setSize(300, 100);
							scrollPane1234.setSize(300, 100);
							scrollPane1234.setLocation(0, 0);
							panel11.add(scrollPane1234);

						}

					}
					if (saveauthornameofsearch.size() == 0) {
						String messageforsearchtitle = "The author name or keyword u entered is not found!!";
						int mc = JOptionPane.WARNING_MESSAGE;
						JOptionPane.showMessageDialog(null,
								messageforsearchtitle, "Info message", mc);

					}

				}

			}

		}
	}
}