/**
 * 
 */
package marketimage;
import javax.swing.*;

import marketimage.JdbcUtil;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
/**
 * @author guoxi,16130120183,769747895@qq.com
 *
 * 
 */
public class MarketSys extends JFrame implements ActionListener {
	Connection con;
	Statement stmt;
	String sql;
	ResultSet rs;
	StringBuffer sb = new StringBuffer();
	JTextField jtf2 = new JTextField(10);
	JTextField jtf3 = new JTextField(10);
	JTextField jtf4 = new JTextField(10);
	JTextField jtf7 = new JTextField(10);
	JTextField jtf5 = new JTextField(10);
	JTextField jtf6 = new JTextField(10);
	JTextField jtf8 = new JTextField(10);
	JTextField jtf9 = new JTextField(10);
	JTextArea jta10 = new JTextArea(50, 40);/* ���� Javadoc��
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO �Զ����ɵķ������
		String str = e.getActionCommand();
		if ("��ѯ".equals(str)) {
		//if check the button of ��ѯ��then go to method of searchEmp()
		searchsql();
		} else if ("����".equals(str)) {
		//if check the button of ���ӣ�then go to method of addEmp()
		addsql();
		} else if ("�޸�".equals(str)) {
		//if check the button of �޸ģ�then go to method of alterEmp()
		altersql();
		} else if ("����".equals(str)) {
		//if check the button of ������then go to method of deleteEmp()
		deletesql();
		}
	}
	public void createGUI() {
		JFrame jf = new JFrame("�����̳���Ϣ����ϵͳ");
		jf.setLayout(new GridLayout(2, 1));
		// jf.setLayout(new GridLayout(10,2));
		JPanel jp00 = new JPanel(new GridLayout(5, 4));
		JPanel jp1 = new JPanel();
		JButton jb11 = new JButton("��ѯ");
		jb11.addActionListener(this);
		JButton jb12 = new JButton("����");
		jb12.addActionListener(this);
		jp1.add(jb11);
		jp1.add(jb12);
		jp00.add(jp1);
		JPanel jp11 = new JPanel();
		JButton jb111 = new JButton("�޸�");
		jb111.addActionListener(this);
		JButton jb112 = new JButton("����");
		jb112.addActionListener(this);
		jp11.add(jb111);
		jp11.add(jb112);
		jp00.add(jp11);
		JPanel jp2 = new JPanel();
		JLabel jl2 = new JLabel("�̳�");
		jp2.add(jl2);
		jp2.add(jtf2);
		jp00.add(jp2);
		JPanel jp3 = new JPanel();
		JLabel jl3 = new JLabel("���� ");
		jp3.add(jl3);
		jp3.add(jtf3);
		jp00.add(jp3);
		JPanel jp4 = new JPanel();
		JLabel jl4 = new JLabel("Ա������");
		jp4.add(jl4);
		jp4.add(jtf4);
		jp00.add(jp4);
		JPanel jp5 = new JPanel();
		JLabel jl5 = new JLabel("Ա�����");
		jp5.add(jl5);
		jp5.add(jtf5);
		jp00.add(jp5);
		JPanel jp6 = new JPanel();
		JLabel jl6 = new JLabel("��ϵ�绰");
		jp6.add(jl6);
		jp6.add(jtf6);
		jp00.add(jp6);
		JPanel jp7 = new JPanel();
		JLabel jl7 = new JLabel("Phone* ");
		jp7.add(jl7);
		jp7.add(jtf7);
		jp00.add(jp7);
		JPanel jp8 = new JPanel();
		JLabel jl8 = new JLabel("���� ");
		jp8.add(jl8);
		jp8.add(jtf8);
		jp00.add(jp8);
		JPanel jp9 = new JPanel();
		JLabel jl9 = new JLabel("����վ ");
		jp9.add(jl9);
		jp9.add(jtf9);
		jp00.add(jp9);
		jf.add(jp00);
		JPanel jp01 = new JPanel();
		jta10.setText("--�û�ʹ���ֲ�-- \n1����ѯ��ѡ��һ���ֶΣ��� EngName ���ı�����������Ӧ���ݣ������ѯ\n2�����ӣ��ڸ����ı�����������Ӧ���ݺ󣬵�����ӡ�\n3���޸ģ��Ȳ�ѯ����Ҫ�ļ�¼���ڸ�����Ӧ���ݣ�����޸ġ�\n4���������������޸Ĳ���");
		jp01.add(jta10);
		jf.add(jp01);
		jf.setSize(700, 500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		}
	public static void main(String[] args) {
		new M();
	}
}

