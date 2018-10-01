import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * @author Mahtab
 *
 */
/**
 * @author Mahtab
 *
 */
public class Management_Class extends JFrame implements ActionListener {
	

	private int maxHeight;
	private int maxWidth;
	JButton exit;
	JButton show;
	JButton delet;
	JTable table;
	JTable table1;
	Management_Panel m;

	public Management_Class(Management_Panel m) {
		this.m = m;
		exit = new JButton("EXIT");
		show = new JButton("Show");
		delet = new JButton("Delet");

		// jtable thing
		Object rowData[][] = new Object[m.vb.size()][13];
		for (int i = 0; i < m.vb.size(); i++) {
			for (int j = 2; j <= 11; j++) {
				rowData[i][j] = m.vb.get(i).content.charAt(j);

			}
			rowData[i][0] = i;
			// System.out.println(rowData[i][0]);
			rowData[i][1] = m.vb.get(i).title;
			rowData[i][12] = m.vb.get(i).date;

		};
		Object columnNames[] = { "Number", "Title", "ch1", "ch2", "ch3", "ch4",
				"ch5", "ch6", "ch7", "ch8", "ch9", "ch10", "Date" };
		table = new JTable(rowData, columnNames);

		JScrollPane scrollPane = new JScrollPane(table);
		this.add(scrollPane, BorderLayout.CENTER);
		this.setLocation(0, 0);
		this.setSize(700, 300);
		this.setVisible(true);

		// the button of show
		show.setSize(80, 40);
		show.setLocation(1250, 300);
		show.setBackground(Color.ORANGE);
		this.getContentPane().add(show);
		show.addActionListener(this);

		// the button of delet
		delet.setSize(80, 40);
		delet.setLocation(1250, 600);
		delet.setBackground(Color.ORANGE);
		this.getContentPane().add(delet);
		delet.addActionListener(this);

		// page features
		setLayout(null);
		maxHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
		maxWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
		setLocation(0, 0);
		setSize(maxWidth, maxHeight);
		setTitle("Welcome to ur management page!!! ");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

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
					Management_Panel m1 = new Management_Panel();
					// dispose();
				}

			}
		});

		// image of background features
		JLabel r = new JLabel();
		ImageIcon i = new ImageIcon(
				"old-paper-floral-parchment-background-texture.jpg");
		// this.setLayout(null);
		r.setSize(maxWidth, maxHeight);
		r.setLocation(0, 0);
		r.setIcon(i);
		this.getContentPane().add(r);
		setVisible(true);

	}

	/* actionperformed method
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == show) {
			JPanel panel = new JPanel();
			panel.setLayout(null);
			this.getContentPane().add(panel);

			int selectedRowInJTable = table.getSelectedRow();
			int selectedObject = selectedRowInJTable;

			Object rowData1[][] = new Object[1][9];
			rowData1[0][0] = Management_Panel.vb.get(selectedObject).title;
			rowData1[0][1] = Management_Panel.vb.get(selectedObject).keyword1;
			rowData1[0][2] = Management_Panel.vb.get(selectedObject).keyword2;
			rowData1[0][3] = Management_Panel.vb.get(selectedObject).keyword3;
			rowData1[0][4] = Management_Panel.vb.get(selectedObject).keyword4;
			rowData1[0][5] = Management_Panel.vb.get(selectedObject).time;
			rowData1[0][6] = Management_Panel.vb.get(selectedObject).date;
			rowData1[0][7] = Management_Panel.vb.get(selectedObject).authorName;
			rowData1[0][8] = Management_Panel.vb.get(selectedObject).content;

			Object columnNames1[] = { "title", "keyword1", "keyword2",
					"keyword3", "keyword4", "time", "date", "authorname",
					"content" };
			JTable table3 = new JTable(rowData1, columnNames1);
			// panel.setLayout(null);
			JScrollPane scrollPane1 = new JScrollPane(table3);
			panel.add(scrollPane1, BorderLayout.CENTER);
			panel.setLocation(0, 350);
			panel.setSize(1000, 100);
			scrollPane1.setSize(1000, 100);
			scrollPane1.setLocation(0, 0);

			panel.add(scrollPane1);

		}
		

		// delet option

		else if (arg0.getSource() == delet) {

			int selectedRowInJTable1 = table.getSelectedRow();
			int selectedObject1 = selectedRowInJTable1;
			Management_Panel.vb.remove(selectedObject1);

		}

	}

	// public static void main(String[] args) {
	// Management_Class management_Class = new Management_Class();
	// }

}
