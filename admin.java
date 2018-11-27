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

	private JPanel admin;
	private JTextField user;
	private JPasswordField password;

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
		admin = new JPanel();
		admin.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		admin.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(admin);
		admin.setLayout(null);
		
		user = new JTextField();
		user.setColumns(10);
		user.setBounds(241, 128, 122, 37);
		admin.add(user);
		
		JLabel label_user = new JLabel("    \u7528\u6237");
		label_user.setBounds(143, 128, 89, 37);
		admin.add(label_user);
		
		JLabel label_password = new JLabel("   \u5BC6\u7801");
		label_password.setBounds(153, 209, 58, 15);
		admin.add(label_password);
		
		JLabel lblNewLabel = new JLabel("    \u6B22\u8FCE\u4F7F\u7528\u5546\u573A\u7BA1\u7406\u7CFB\u7EDF");
		lblNewLabel.setBounds(174, 76, 189, 37);
		admin.add(lblNewLabel);
		
		JButton login = new JButton(" \u767B\u5F55");//µÇÂ¼
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=user.getText();
				String loginpwd=password.getSelectedText();
				
			}
		});
		login.setBounds(189, 280, 97, 23);
		admin.add(login);
		
		password = new JPasswordField();
		password.setBounds(241, 209, 122, 37);
		admin.add(password);
		
		JButton quit = new JButton("\u9000\u51FA");
		quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		quit.setBounds(349, 280, 97, 23);
		admin.add(quit);
	}
}
