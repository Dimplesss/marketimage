/**
 * 
 */
package marketimage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * @author guoxi,16130120183,769747895@qq.com
 *
 * 
 */
public class operater {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					operater window = new operater();
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
	public operater() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u8FDE\u9501\u5546\u573A\u7BA1\u7406\u7CFB\u7EDF");
		frame.setBounds(100, 100, 897, 594);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("\u67E5\u8BE2");
		button.setBounds(92, 72, 97, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u6DFB\u52A0");
		button_1.setBounds(245, 72, 97, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("\u4FEE\u6539");
		button_2.setBounds(396, 72, 97, 23);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("\u9000\u51FA");
		button_3.setBounds(539, 72, 97, 23);
		frame.getContentPane().add(button_3);
		
		JLabel label = new JLabel("\u5546\u573A\uFF1A");
		label.setBounds(70, 160, 58, 15);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u59D3\u540D\uFF1A");
		label_1.setBounds(70, 200, 58, 15);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\u90E8\u95E8\uFF1A");
		label_2.setBounds(70, 240, 58, 15);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("\u8054\u7CFB\u7535\u8BDD\uFF1A");
		label_3.setBounds(70, 280, 73, 15);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("\u5458\u5DE5\u7F16\u53F7\uFF1A");
		label_4.setBounds(70, 320, 78, 15);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("\u5DE5\u8D44\uFF1A");
		label_5.setBounds(380, 200, 58, 15);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("\u5C97\u4F4D\uFF1A");
		label_6.setBounds(380, 240, 58, 15);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("\u5546\u573A\u4F4D\u7F6E\uFF1A");
		label_7.setBounds(380, 280, 73, 15);
		frame.getContentPane().add(label_7);
		
		textField = new JTextField();
		textField.setBounds(150, 160, 100, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u5546\u573A\u7F16\u53F7\uFF1A");
		lblNewLabel.setBounds(380, 160, 86, 15);
		frame.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(150, 200, 100, 30);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(150, 240, 100, 30);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(150, 280, 100, 30);
		textField_3.setColumns(10);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(150, 320, 100, 30);
		textField_4.setColumns(10);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(460, 160, 100, 30);
		textField_5.setColumns(10);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBounds(460, 200, 100, 30);
		textField_6.setColumns(10);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setBounds(460, 240, 100, 30);
		textField_7.setColumns(10);
		frame.getContentPane().add(textField_7);
		
		JCheckBox checkBox = new JCheckBox("\u7ECF\u7406");
		checkBox.setBounds(70, 357, 49, 44);
		frame.getContentPane().add(checkBox);
		
		textField_8 = new JTextField();
		textField_8.setBounds(460, 280, 142, 30);
		textField_8.setColumns(10);
		frame.getContentPane().add(textField_8);
		
		JLabel label_8 = new JLabel("\u6B22\u8FCE\u4F7F\u7528\u5546\u573A\u7BA1\u7406\u7CFB\u7EDF");
		label_8.setBounds(245, 28, 196, 23);
		label_8.setToolTipText("");
		label_8.setVerticalAlignment(SwingConstants.TOP);
		frame.getContentPane().add(label_8);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(334, 320, 446, 213);
		frame.getContentPane().add(textArea);
	}
}
