/**
 * 
 */
package marketimage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JList;
import java.awt.Choice;
import javax.swing.JTree;

/**
 * @author guoxi,16130120183,769747895@qq.com
 *
 * 
 */
public class employee {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					employee window = new employee();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public employee() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u5546\u573A\u4FE1\u606F\u7BA1\u7406\u7CFB\u7EDF");
		frame.setBounds(100, 100, 846, 579);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u6B22\u8FCE\u4F7F\u7528\u4FE1\u606F\u67E5\u8BE2");
		label.setBounds(229, 51, 266, 38);
		frame.getContentPane().add(label);
		
		JButton button = new JButton("\u4E2A\u4EBA\u4FE1\u606F\u67E5\u8BE2");
		button.setBounds(393, 193, 156, 38);
		frame.getContentPane().add(button);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(198, 386, 48, -14);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u5546\u573A\u4FE1\u606F\u67E5\u8BE2");
		btnNewButton_1.setBounds(122, 193, 170, 38);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel label_1 = new JLabel("\u5546\u573A\u540D\u79F0\uFF1A");
		label_1.setBounds(68, 130, 92, 15);
		frame.getContentPane().add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(170, 130, 100, 30);
		frame.getContentPane().add(textField);
		
		JTextArea txtrhelp = new JTextArea();
		txtrhelp.setEditable(false);
		txtrhelp.setText("                   =====help=====\r\n\u8F93\u5165\u5546\u573A\u540D\u79F0\u67E5\u8BE2\u5546\u573A\u4FE1\u606F\u3002");
		txtrhelp.setBounds(99, 267, 484, 265);
		frame.getContentPane().add(txtrhelp);
	}
}
