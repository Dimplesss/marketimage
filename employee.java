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
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author guoxi,16130120183,769747895@qq.com
 *
 * 
 */
public class employee {

	private JFrame frame;
	private JTextField markname;

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
		
		JLabel label_welcome = new JLabel("\u6B22\u8FCE\u4F7F\u7528\u4FE1\u606F\u67E5\u8BE2");
		label_welcome.setHorizontalAlignment(SwingConstants.CENTER);
		label_welcome.setBounds(227, 52, 266, 38);
		frame.getContentPane().add(label_welcome);
		
		JButton personinfo = new JButton("\u4E2A\u4EBA\u4FE1\u606F\u67E5\u8BE2");//个人信息查询
		personinfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		personinfo.setBounds(332, 194, 156, 38);
		frame.getContentPane().add(personinfo);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(198, 386, 48, -14);
		frame.getContentPane().add(btnNewButton);
		
		JButton marketinfo = new JButton("\u5546\u573A\u4FE1\u606F\u67E5\u8BE2");//商场信息查询
		marketinfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		marketinfo.setBounds(120, 194, 170, 38);
		frame.getContentPane().add(marketinfo);
		
		JLabel label_marketname = new JLabel("\u5546\u573A\u540D\u79F0\uFF1A");
		label_marketname.setBounds(68, 130, 92, 15);
		frame.getContentPane().add(label_marketname);
		
		markname = new JTextField();
		markname.setColumns(10);
		markname.setBounds(168, 131, 100, 30);
		frame.getContentPane().add(markname);
		
		JTextArea information = new JTextArea();
		information.setEditable(false);
		information.setText("                   =====help=====\r\n\u8F93\u5165\u5546\u573A\u540D\u79F0\u67E5\u8BE2\u5546\u573A\u4FE1\u606F\u3002\r\n\u70B9\u51FB\u4E2A\u4EBA\u4FE1\u606F\u67E5\u8BE2\u53EF\u67E5\u8BE2\u4E2A\u4EBA\u4FE1\u606F\u3002");
		information.setBounds(105, 267, 583, 156);
		frame.getContentPane().add(information);
		
		JButton quit = new JButton("\u9000\u51FA");//退出
		quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		quit.setBounds(541, 194, 125, 38);
		frame.getContentPane().add(quit);
	}
}
