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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author guoxi,16130120183,769747895@qq.com
 *
 * 
 */
public class operater {

	private JFrame frame;
	private JTextField marketnum;
	private JTextField employeenum;
	private JTextField department;
	private JTextField telphonenum;
	private JTextField salary;
	private JTextField marketname;
	private JTextField name;
	private JTextField job;

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
		
		JButton query = new JButton("\u67E5\u8BE2");//查询
		query.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		query.setBounds(92, 72, 97, 23);
		frame.getContentPane().add(query);
		
		JButton add = new JButton("\u6DFB\u52A0");//添加
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add.setBounds(245, 72, 97, 23);
		frame.getContentPane().add(add);
		
		JButton mod = new JButton("\u4FEE\u6539");//修改
		mod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mod.setBounds(396, 72, 97, 23);
		frame.getContentPane().add(mod);
		
		JButton quit = new JButton("\u9000\u51FA");//退出
		quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		quit.setBounds(539, 72, 97, 23);
		frame.getContentPane().add(quit);
		
		JLabel label = new JLabel("\u5546\u573A\uFF1A");
		label.setBounds(380, 167, 58, 15);
		frame.getContentPane().add(label);
		
		JLabel label_employeename = new JLabel("\u59D3\u540D\uFF1A");
		label_employeename.setBounds(380, 207, 58, 15);
		frame.getContentPane().add(label_employeename);
		
		JLabel label_depart = new JLabel("\u90E8\u95E8\uFF1A");
		label_depart.setBounds(70, 240, 58, 15);
		frame.getContentPane().add(label_depart);
		
		JLabel label_tel = new JLabel("\u8054\u7CFB\u7535\u8BDD\uFF1A");
		label_tel.setBounds(70, 280, 73, 15);
		frame.getContentPane().add(label_tel);
		
		JLabel label_employeenum = new JLabel("*\u5458\u5DE5\u7F16\u53F7\uFF1A");
		label_employeenum.setBounds(70, 207, 78, 15);
		frame.getContentPane().add(label_employeenum);
		
		JLabel label_salary = new JLabel("\u5DE5\u8D44\uFF1A");
		label_salary.setBounds(70, 327, 58, 15);
		frame.getContentPane().add(label_salary);
		
		JLabel label_job = new JLabel("\u5C97\u4F4D\uFF1A");
		label_job.setBounds(380, 240, 58, 15);
		frame.getContentPane().add(label_job);
		
		marketnum = new JTextField();
		marketnum.setBounds(150, 160, 100, 30);
		frame.getContentPane().add(marketnum);
		marketnum.setColumns(10);
		
		JLabel Label_mknum = new JLabel("*\u5546\u573A\u7F16\u53F7\uFF1A");
		Label_mknum.setBounds(70, 167, 86, 15);
		frame.getContentPane().add(Label_mknum);
		
		employeenum = new JTextField();
		employeenum.setBounds(150, 200, 100, 30);
		frame.getContentPane().add(employeenum);
		employeenum.setColumns(10);
		
		department = new JTextField();
		department.setBounds(150, 240, 100, 30);
		frame.getContentPane().add(department);
		department.setColumns(10);
		
		telphonenum = new JTextField();
		telphonenum.setBounds(150, 280, 100, 30);
		telphonenum.setColumns(10);
		frame.getContentPane().add(telphonenum);
		
		salary = new JTextField();
		salary.setBounds(150, 320, 100, 30);
		salary.setColumns(10);
		frame.getContentPane().add(salary);
		
		marketname = new JTextField();
		marketname.setBounds(460, 160, 100, 30);
		marketname.setColumns(10);
		frame.getContentPane().add(marketname);
		
		name = new JTextField();
		name.setBounds(460, 200, 100, 30);
		name.setColumns(10);
		frame.getContentPane().add(name);
		
		job = new JTextField();
		job.setBounds(460, 240, 100, 30);
		job.setColumns(10);
		frame.getContentPane().add(job);
		
		JLabel label_welcome = new JLabel("\u6B22\u8FCE\u4F7F\u7528\u5546\u573A\u7BA1\u7406\u7CFB\u7EDF");
		label_welcome.setHorizontalAlignment(SwingConstants.CENTER);
		label_welcome.setBounds(245, 28, 196, 23);
		label_welcome.setToolTipText("");
		label_welcome.setVerticalAlignment(SwingConstants.TOP);
		frame.getContentPane().add(label_welcome);
		
		JTextArea information = new JTextArea();
		information.setEditable(false);
		information.setBounds(334, 320, 446, 213);
		frame.getContentPane().add(information);
	}
}
