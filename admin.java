/**
 * 
 */
package marketimage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPasswordField;

/**
 * @author guoxi,16130120183,769747895@qq.com
 *
 * 
 */
public class admin extends JFrame {

	private JPanel submit;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin frame = new admin();
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
	public admin() {
		setTitle("\u8FDE\u9501\u5546\u573A\u7BA1\u7406\u7CFB\u7EDF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 733, 470);
		submit = new JPanel();
		submit.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		submit.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(submit);
		submit.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(241, 128, 122, 37);
		submit.add(textField);
		
		JLabel label = new JLabel("    \u7528\u6237");
		label.setBounds(143, 128, 89, 37);
		submit.add(label);
		
		JLabel label_1 = new JLabel("   \u5BC6\u7801");
		label_1.setBounds(153, 209, 58, 15);
		submit.add(label_1);
		
		JLabel lblNewLabel = new JLabel("    \u6B22\u8FCE\u4F7F\u7528\u5546\u573A\u7BA1\u7406\u7CFB\u7EDF");
		lblNewLabel.setBounds(174, 76, 189, 37);
		submit.add(lblNewLabel);
		
		JButton button = new JButton(" \u767B\u5F55");
		button.setBounds(230, 280, 97, 23);
		submit.add(button);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(241, 209, 122, 37);
		submit.add(passwordField);
	}
}
