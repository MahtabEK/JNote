import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author Mahtab
 *
 */

public class Add_Class extends JFrame implements ActionListener {

	private int maxHeight;
	private int maxWidth;
	int fontNumber = 1;

	JButton exit;
	JLabel title;
	JLabel keyword1;
	JLabel keyword2;
	JLabel keyword3;
	JLabel keyword4;
	JLabel authorName;
	JLabel content;
	JTextField title1;
	JTextField keyword11;
	JTextField keyword21;
	JTextField keyword31;
	JTextField keyword41;
	JTextField authorName1;
	JTextField content1;
	JButton enter;
	JButton font1;
	JButton font2;
	JButton font3;
	JButton font4;
	JButton font5;
	JButton font6;
	JButton font7;
	JButton font8;
	JButton font9;

	Font fonttt1;
	Font fonttt2;
	Font fonttt3;
	Font fonttt4;
	Font fonttt5;
	Font fonttt6;
	Font fonttt7;
	Font fonttt8;
	Font fonttt9;

	int day;
	int month;
	int year;
	int second;
	int minute;
	int hour;
	GregorianCalendar date1;
	String day1;
	String month1;
	String year1;
	String second1;
	String minute1;
	String hour1;

	// all the information we need in add class
	String time;
	String date;
	String saveTheTitle;
	String saveTheKeyword1;
	String saveTheKeyword2;
	String saveTheKeyword3;
	String saveTheKeyword4;
	String saveTheNote;
	String saveTheAuthorName;
	

	/**
	 * constructor
	 */
	public Add_Class() {
		fonttt1 = new Font("Courier", Font.BOLD, 12);
		fonttt2 = new Font("Arial", Font.ITALIC, 30);
		fonttt3 = new Font("Monospaced", Font.HANGING_BASELINE, 50);
		fonttt4 = new Font("Courier", Font.ITALIC, 20);
		fonttt5 = new Font("Courier", Font.HANGING_BASELINE,22);
		fonttt6 = new Font("Arial", Font.BOLD, 15);
		fonttt7 = new Font("Arial", Font.HANGING_BASELINE, 40);
		fonttt8 = new Font("Monospaced", Font.ITALIC,20);
		fonttt9 = new Font("Monospaced", Font.BOLD,25);

		
		exit = new JButton("EXIT");
		title = new JLabel("Title:");
		keyword1 = new JLabel("Keyword1:");
		keyword2 = new JLabel("Keyword2:");
		keyword3 = new JLabel("Keyword3:");
		keyword4 = new JLabel("Keyword4:");
		authorName = new JLabel("Author:");

		content = new JLabel("Note:");
		title1 = new JTextField("  Enter ur Title here");
		keyword11 = new JTextField("  Enter Key word1");
		keyword21 = new JTextField("  Enter Key word2");
		keyword31 = new JTextField("  Enter Key word3");
		keyword41 = new JTextField("  Enter Key word4");
		authorName1 = new JTextField("  Enter ur name here");

		content1 = new JTextField("   Write ur Note here   ");
		enter = new JButton("Enter");
		font1 = new JButton("Font1");
		font2 = new JButton("Font2");
		font3 = new JButton("Font3");
		font4 = new JButton("Font4");
		font5 = new JButton("Font5");
		font6 = new JButton("Font6");
		font7 = new JButton("Font7");
		font8 = new JButton("Font8");
		font9 = new JButton("Font9");

		// // date and time
		// date1 = new GregorianCalendar();
		// day = date1.get(Calendar.DAY_OF_MONTH);
		// month = date1.get(Calendar.MONTH);
		// year = date1.get(Calendar.YEAR);
		// second = date1.get(Calendar.SECOND);
		// minute = date1.get(Calendar.MINUTE);
		// hour = date1.get(Calendar.HOUR);

		// // change the date and time int to string
		// day1 = Integer.toString(day);
		// month1 = Integer.toString(month);
		// year1 = Integer.toString(year);
		// second1 = Integer.toString(second);
		// minute1 = Integer.toString(minute);
		// hour1 = Integer.toString(hour);
		//
		// // date and time the last zone
		// date = day1 + "/" + month1 + "/" + year1;
		// time = second1 + "/" + minute1 + "/" + hour1;

		// page features
		setLayout(null);
		maxHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
		maxWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
		setLocation(0, 0);
		setSize(maxWidth, maxHeight);
		setTitle("Welcome to ur add page!!! ");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		// title label
		title.setSize(100, 30);
		title.setLocation(300, 90);
		title.setFont(new Font("Monospaced", Font.PLAIN, 18));
		title.setForeground(Color.blue);
		title.setBackground(Color.YELLOW);
		this.getContentPane().add(title);

		// title textfield
		title1.setSize(110, 40);
		title1.setLocation(430, 90);
		title1.setBackground(Color.PINK);
		this.getContentPane().add(title1);
		title1.addActionListener(this);

		// keyword label
		keyword1.setSize(100, 30);
		keyword1.setLocation(300, 150);
		keyword1.setFont(new Font("Monospaced", Font.PLAIN, 18));
		keyword1.setForeground(Color.blue);
		keyword1.setBackground(Color.YELLOW);
		this.getContentPane().add(keyword1);

		// keyword textfield
		keyword11.setSize(110, 40);
		keyword11.setLocation(430, 150);
		keyword11.setBackground(Color.PINK);
		this.getContentPane().add(keyword11);
		keyword11.addActionListener(this);

		// keyword2 label
		keyword2.setSize(100, 30);
		keyword2.setLocation(300, 210);
		keyword2.setFont(new Font("Monospaced", Font.PLAIN, 18));
		keyword2.setForeground(Color.blue);
		keyword2.setBackground(Color.YELLOW);
		this.getContentPane().add(keyword2);

		// keyword2 textfield
		keyword21.setSize(110, 40);
		keyword21.setLocation(430, 210);
		keyword21.setBackground(Color.PINK);
		this.getContentPane().add(keyword21);
		keyword21.addActionListener(this);

		// keyword3 label
		keyword3.setSize(100, 30);
		keyword3.setLocation(300, 270);
		keyword3.setFont(new Font("Monospaced", Font.PLAIN, 18));
		keyword3.setForeground(Color.blue);
		keyword3.setBackground(Color.YELLOW);
		this.getContentPane().add(keyword3);

		// keyword3 textfield
		keyword31.setSize(110, 40);
		keyword31.setLocation(430, 270);
		keyword31.setBackground(Color.PINK);
		this.getContentPane().add(keyword31);
		keyword31.addActionListener(this);

		// keyword4 label
		keyword4.setSize(100, 30);
		keyword4.setLocation(300, 330);
		keyword4.setFont(new Font("Monospaced", Font.PLAIN, 18));
		keyword4.setForeground(Color.blue);
		keyword4.setBackground(Color.YELLOW);
		this.getContentPane().add(keyword4);

		// keyword4 textfield
		keyword41.setSize(110, 40);
		keyword41.setLocation(430, 330);
		keyword41.setBackground(Color.PINK);
		this.getContentPane().add(keyword41);
		keyword41.addActionListener(this);

		// author name label
		authorName.setSize(100, 30);
		authorName.setLocation(300, 390);
		authorName.setFont(new Font("Monospaced", Font.PLAIN, 18));
		authorName.setForeground(Color.blue);
		authorName.setBackground(Color.YELLOW);
		this.getContentPane().add(authorName);

		// author name textfield
		authorName1.setSize(110, 40);
		authorName1.setLocation(430, 390);
		authorName1.setBackground(Color.PINK);
		this.getContentPane().add(authorName1);
		authorName1.addActionListener(this);

		// the button of font1
		font1.setSize(80, 40);
		font1.setLocation(350, 20);
		font1.setBackground(Color.ORANGE);
		this.getContentPane().add(font1);
		font1.addActionListener(this);
		// the button of font2
		font2.setSize(80, 40);
		font2.setLocation(450, 20);
		font2.setBackground(Color.ORANGE);
		this.getContentPane().add(font2);
		font2.addActionListener(this);

		// the button of font3
		font3.setSize(80, 40);
		font3.setLocation(550, 20);
		font3.setBackground(Color.ORANGE);
		this.getContentPane().add(font3);
		font3.addActionListener(this);
		// the button of font4
		font4.setSize(80, 40);
		font4.setLocation(650, 20);
		font4.setBackground(Color.ORANGE);
		this.getContentPane().add(font4);
		font4.addActionListener(this);

		// the button of font5
		font5.setSize(80, 40);
		font5.setLocation(750, 20);
		font5.setBackground(Color.ORANGE);
		this.getContentPane().add(font5);
		font5.addActionListener(this);

		// the button of font6
		font6.setSize(80, 40);
		font6.setLocation(850, 20);
		font6.setBackground(Color.ORANGE);
		this.getContentPane().add(font6);
		font6.addActionListener(this);

		// the button of font7
		font7.setSize(80, 40);
		font7.setLocation(950, 20);
		font7.setBackground(Color.ORANGE);
		this.getContentPane().add(font7);
		font7.addActionListener(this);

		// the button of font8
		font8.setSize(80, 40);
		font8.setLocation(1050, 20);
		font8.setBackground(Color.ORANGE);
		this.getContentPane().add(font8);
		font8.addActionListener(this);
		// the button of font9
		font9.setSize(80, 40);
		font9.setLocation(1150, 20);
		font9.setBackground(Color.ORANGE);
		this.getContentPane().add(font9);
		font9.addActionListener(this);

		// content label
		content.setSize(100, 30);
		content.setLocation(620, 400);
		content.setFont(new Font("Monospaced", Font.PLAIN, 18));
		content.setForeground(Color.blue);
		content.setBackground(Color.YELLOW);
		this.getContentPane().add(content);

		// content textfield
		content1.setSize(500, 150);
		content1.setLocation(700, 400);
		content1.setBackground(Color.PINK);
		if (fontNumber == 1) {
			content1.setFont(fonttt1);
			content1.setForeground(Color.BLACK);

		}

		else if (fontNumber == 2) {
			content1.setFont(fonttt2);
			content1.setForeground(Color.BLUE);

		}

		else if (fontNumber == 3) {
			content1.setFont(fonttt3);
			content1.setForeground(Color.RED);
		}
		
		else if(fontNumber == 4){
			content1.setFont(fonttt4);
			content1.setForeground(Color.ORANGE);
		}
		
		else if(fontNumber == 5){
			content1.setFont(fonttt5);
			content1.setForeground(Color.CYAN);
		}
		
		else if(fontNumber == 6){
			content1.setFont(fonttt6);
			content1.setForeground(Color.GREEN);
		}
		
		else if(fontNumber == 7){
			content1.setFont(fonttt7);
			content1.setForeground(Color.MAGENTA);
		}
		
		else if(fontNumber == 8){
			content1.setFont(fonttt8);
			content1.setForeground(Color.WHITE);
		}
		
		else if(fontNumber == 9){
			content1.setFont(fonttt9);
			content1.setForeground(Color.YELLOW);
		}
		
		
		
		
		this.getContentPane().add(content1);
		content1.addActionListener(this);

		// the button of enter
		enter.setSize(80, 40);
		enter.setLocation(1250, 600);
		enter.setBackground(Color.ORANGE);
		this.getContentPane().add(enter);
		enter.addActionListener(this);

		// exit of program
		exit.setSize(80, 40);
		exit.setLocation(1250, 20);
		exit.setBackground(Color.ORANGE);
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
					Management_Panel.vb = Management_Panel.vb;
					// System.out.println(m.vb.size());
					// dispose();
				}

			}
		});

		// image of background features
		JLabel r = new JLabel();
		ImageIcon i = new ImageIcon("NotePaper.png");
		// this.setLayout(null);
		r.setSize(maxWidth, maxHeight);
		r.setLocation(0, 0);
		r.setIcon(i);
		this.getContentPane().add(r);
		setVisible(true);

	}

	/* action performed
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == font1) {
			fontNumber = 1;
		}

		else if (arg0.getSource() == font2) {
			fontNumber = 2;
		}

		else if (arg0.getSource() == font3) {
			fontNumber = 3;

		}
		
		else if (arg0.getSource() == font4) {
			fontNumber = 4;

		}
		
		else if (arg0.getSource() == font5) {
			fontNumber = 5;

		}
		
		else if (arg0.getSource() == font6) {
			fontNumber = 6;

		}
		
		else if (arg0.getSource() == font7) {
			fontNumber = 7;

		}
		
		else if (arg0.getSource() == font8) {
			fontNumber = 8;

		}
		
		else if (arg0.getSource() == font9) {
			fontNumber = 9;

		}

		// content textfield
		content1.setSize(500, 150);
		content1.setLocation(700, 400);
		content1.setBackground(Color.PINK);
		if (fontNumber == 1) {
			content1.setFont(fonttt1);
			content1.setForeground(Color.BLACK);

		}

		else if (fontNumber == 2) {
			content1.setFont(fonttt2);
			content1.setForeground(Color.BLUE);

		}

		else if (fontNumber == 3) {
			content1.setFont(fonttt3);
			content1.setForeground(Color.RED);
		}
		
		else if(fontNumber == 4){
			content1.setFont(fonttt4);
			content1.setForeground(Color.ORANGE);
		}
		
		else if(fontNumber == 5){
			content1.setFont(fonttt5);
			content1.setForeground(Color.CYAN);
		}
		
		else if(fontNumber == 6){
			content1.setFont(fonttt6);
			content1.setForeground(Color.GREEN);
		}
		
		else if(fontNumber == 7){
			content1.setFont(fonttt7);
			content1.setForeground(Color.MAGENTA);
		}
		
		else if(fontNumber == 8){
			content1.setFont(fonttt8);
			content1.setForeground(Color.WHITE);
		}
		
		else if(fontNumber == 9){
			content1.setFont(fonttt9);
			content1.setForeground(Color.YELLOW);
		}
		this.getContentPane().add(content1);
		content1.addActionListener(this);

		if (arg0.getSource() == enter) {
			// all the information
			saveTheTitle = title1.getText();
			saveTheKeyword1 = keyword11.getText();
			saveTheKeyword2 = keyword21.getText();
			saveTheKeyword3 = keyword31.getText();
			saveTheKeyword4 = keyword41.getText();
			saveTheNote = content1.getText();
			saveTheAuthorName = authorName.getText();
			// date and time
			date1 = new GregorianCalendar();
			day = date1.get(Calendar.DAY_OF_MONTH);
			month = date1.get(Calendar.MONTH);
			year = date1.get(Calendar.YEAR);
			second = date1.get(Calendar.SECOND);
			minute = date1.get(Calendar.MINUTE);
			hour = date1.get(Calendar.HOUR);
			// change the date and time int to string
			day1 = Integer.toString(day);
			month1 = Integer.toString(month);
			year1 = Integer.toString(year);
			second1 = Integer.toString(second);
			minute1 = Integer.toString(minute);
			hour1 = Integer.toString(hour);

			// date and time the last zone
			date = day1 + "/" + month1 + "/" + year1;
			time = second1 + "/" + minute1 + "/" + hour1;

			// System.out.println(saveTheTitle+"\n"+saveTheAuthorName+"\n"+saveTheNote);
			Class_B classBB = new Class_B(saveTheTitle, saveTheKeyword1,
					saveTheKeyword2, saveTheKeyword3, saveTheKeyword4,
					saveTheNote, time, date, saveTheAuthorName);

			// System.out.println(classBB);
			Management_Panel.vb.add(classBB);
			// System.out.println(Management_Panel.vb.size());

		}

	}

	// public static void main(String[] args) {
	// Add_Class add_Class = new Add_Class();
	// }

}
