package Pekan8_2511531008;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class TugasAlproPekan8_2511531008 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ouput;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TugasAlproPekan8_2511531008 frame = new TugasAlproPekan8_2511531008();
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
	public TugasAlproPekan8_2511531008() {
		setResizable(false);
		setTitle("Operasi Logika");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 353, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPERASI LOGIKA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(103, 11, 111, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblOperand = new JLabel("Operand 1");
		lblOperand.setHorizontalAlignment(SwingConstants.LEFT);
		lblOperand.setBounds(10, 43, 111, 14);
		contentPane.add(lblOperand);
		
		JLabel lblOperand_1 = new JLabel("Operand 2");
		lblOperand_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblOperand_1.setBounds(10, 81, 86, 14);
		contentPane.add(lblOperand_1);
		
		JLabel lblPilihOperasiLogika = new JLabel("pilih operasi logika");
		lblPilihOperasiLogika.setHorizontalAlignment(SwingConstants.LEFT);
		lblPilihOperasiLogika.setBounds(10, 118, 111, 14);
		contentPane.add(lblPilihOperasiLogika);
		
		JLabel lblHasil = new JLabel("hasil");
		lblHasil.setHorizontalAlignment(SwingConstants.LEFT);
		lblHasil.setBounds(10, 157, 111, 14);
		contentPane.add(lblHasil);
		
		JComboBox input1 = new JComboBox();
		input1.setModel(new DefaultComboBoxModel(new String[] {"True", "False"}));
		input1.setBounds(133, 39, 57, 22);
		contentPane.add(input1);
		
		JComboBox input2 = new JComboBox();
		input2.setModel(new DefaultComboBoxModel(new String[] {"True", "False"}));
		input2.setBounds(133, 74, 57, 22);
		contentPane.add(input2);
		
		JComboBox Operator = new JComboBox();
		Operator.setModel(new DefaultComboBoxModel(new String[] {"AND", "OR", "XOR", "NAND", "NOR"}));
		Operator.setBounds(133, 111, 57, 22);
		contentPane.add(Operator);
		
		ouput = new JTextField();
		ouput.setEditable(false);
		ouput.setBounds(131, 151, 86, 20);
		contentPane.add(ouput);
		ouput.setColumns(10);
		
		JButton button = new JButton("click");
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
					int a, b , c;
					boolean d,e1,f;
					a =input1.getSelectedIndex();
					if(a == 0) d = true;
					else d = false;
					b =input2.getSelectedIndex();
					if(b == 0) e1 = true;
					else e1 = false;
					c =Operator.getSelectedIndex();
					
					if(c==0) {
						if(d && e1) f = true;
						else f = false;
					}else if ( c == 1) {
						if(d || e1) f = true;
						else f = false;
					}else if ( c== 2) {
						if( d == e1) f = true;
						else f = false;
					}else if ( c== 3){
						if(!(d && e1)) f = true;
						else f = false;
					}else {
						if(!(d || e1)) f = true;
						else f = false;
					}
					
					if(f) ouput.setText("True");
					else ouput.setText("False");
					
					
				
				
			}
			
		});
		button.setBounds(212, 111, 65, 23);
		contentPane.add(button);

	}

}
