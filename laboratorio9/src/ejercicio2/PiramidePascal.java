package ejercicio2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PiramidePascal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private String texto = "";
	private int num = 0,fc = 0;
	private JTextField txtIngresarNumero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PiramidePascal frame = new PiramidePascal();
					frame.setVisible(true);
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PiramidePascal() {
		setTitle("TRIANGULO PASCAL- RUBIO PACHECO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		panel.setLayout(null);
		contentPane.add(panel, BorderLayout.CENTER);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 37, 414, 214);
		panel.add(scrollPane);
		
		JTable table = new JTable();
		table.setBackground(Color.CYAN);
		table.setModel(new DefaultTableModel(0,0));
		table.setVisible(true);
		scrollPane.setViewportView(table);
		
		txtIngresarNumero = new JTextField();
		txtIngresarNumero.setBackground(Color.WHITE);
		txtIngresarNumero.setBounds(22, 5, 128, 20);
		panel.add(txtIngresarNumero);
		txtIngresarNumero.setColumns(10);
		
		JButton btnNewButton = new JButton("generar tabla");
		btnNewButton.setBackground(Color.RED);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			texto=txtIngresarNumero.getText();
			num=Integer.parseInt(texto);
			fc=num;
			table.setModel(new DefaultTableModel(fc,2*fc-1));
			table.setValueAt(1,0 ,fc-1);
			for(int i=0;i<fc;i++) {
				for(int j=0;j<2*fc-1;j++) {
					if(table.getValueAt(i, j)==null)
					table.setValueAt(0, i, j);
					if(i>0) {
						if((j!=0) && (j!=2*fc-2)) { 
							table.setValueAt((int)table.getValueAt(i-1,j-1)+(int)table.getValueAt(i-1,j+1), i, j);
						}else if(j==0){
							table.setValueAt((int)table.getValueAt(i-1,j+1), i, j);
							}else {
								table.setValueAt((int)table.getValueAt(i-1,j-1),i,j);
						}
					}
			}
		}
			for(int a=0;a<fc;a++) {
				for(int b=0;b<2*fc-1;b++) {
					if((int)table.getValueAt(a, b)==0)
						table.setValueAt(null,a , b);
				}
			}
		}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(180, 4, 211, 23);
		panel.add(btnNewButton);
		

	}
	
}
