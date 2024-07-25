package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JTable;




public class ComponentTest extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_Uid;
	private JTextField txt_Name;
	private JTextField txt_Tel;
	private JTextField txt_x;
	private JTextField txt_y;
	private JTextField txt_Result;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTable table;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentTest frame = new ComponentTest();
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
	public ComponentTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 779);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Component 실습");
		lblNewLabel.setBounds(12, 10, 104, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("버튼실습");
		lblNewLabel_1.setBounds(12, 23, 90, 15);
		contentPane.add(lblNewLabel_1);
		
		JButton btn1 = new JButton("확인1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("확인 1 버튼 클릭");
				
			}
		});
		btn1.setBounds(12, 38, 90, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("확인2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼 2 클릭");
			}
		});
		btn2.setBounds(162, 38, 96, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("확인3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(null, "종료 버튼 클릭", "확인대화 상자", JOptionPane.YES_NO_OPTION);
				
				if(answer == 0) {
					System.out.println("Yes 클릭");
					System.exit(EXIT_ON_CLOSE);
				}else {
					System.out.println("NO 클릭");
					System.exit(EXIT_ON_CLOSE);
				}
			}
		});
		btn3.setBounds(313, 38, 79, 23);
		contentPane.add(btn3);
		
		JLabel lblNewLabel_2 = new JLabel("텍스트박스 실습");
		lblNewLabel_2.setBounds(12, 71, 104, 15);
		contentPane.add(lblNewLabel_2);
		
		txt_Uid = new JTextField();
		txt_Uid.setBounds(52, 96, 116, 21);
		contentPane.add(txt_Uid);
		txt_Uid.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("아이디");
		lblNewLabel_3.setBounds(12, 100, 57, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lbResultUid = new JLabel("결과 :");
		lbResultUid.setBounds(260, 99, 132, 15);
		contentPane.add(lbResultUid);
		
		JButton btn_Uid = new JButton("확인1");
		btn_Uid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Uid = txt_Uid.getText();
				lbResultUid.setText("결과 : " + Uid); 
				
			}
		});
		btn_Uid.setBounds(180, 95, 68, 23);
		contentPane.add(btn_Uid);
		
		JLabel lblNewLabel_3_2 = new JLabel("이름");
		lblNewLabel_3_2.setBounds(12, 132, 57, 15);
		contentPane.add(lblNewLabel_3_2);
		
		txt_Name = new JTextField();
		txt_Name.setColumns(10);
		txt_Name.setBounds(52, 128, 116, 21);
		contentPane.add(txt_Name);
		
		
		JLabel lbResultName = new JLabel("결과 :");
		lbResultName.setBounds(260, 131, 132, 15);
		contentPane.add(lbResultName);
		
		JButton btn_Name = new JButton("확인1");
		btn_Name.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Name = txt_Name.getText();
				lbResultName.setText("결과 : " + Name); 
				
			}
		});
		btn_Name.setBounds(180, 127, 68, 23);
		contentPane.add(btn_Name);
		
		
		
		JLabel lblNewLabel_3_2_1 = new JLabel("휴대폰");
		lblNewLabel_3_2_1.setBounds(12, 162, 57, 15);
		contentPane.add(lblNewLabel_3_2_1);
		
		txt_Tel = new JTextField();
		txt_Tel.setColumns(10);
		txt_Tel.setBounds(52, 158, 116, 21);
		contentPane.add(txt_Tel);
		
		JLabel lbResultTel = new JLabel("결과 :");
		lbResultTel.setBounds(260, 161, 132, 15);
		contentPane.add(lbResultTel);
		
		
		JButton btn_Tel = new JButton("확인1");
		btn_Tel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Tel = txt_Tel.getText();
				lbResultTel.setText("결과 : " + Tel); 
			}
		});
		btn_Tel.setBounds(180, 157, 68, 23);
		contentPane.add(btn_Tel);
		
		JLabel lblNewLabel_2_1 = new JLabel("덧셈");
		lblNewLabel_2_1.setBounds(12, 201, 46, 15);
		contentPane.add(lblNewLabel_2_1);
		
		txt_x = new JTextField();
		txt_x.setColumns(10);
		txt_x.setBounds(52, 198, 46, 21);
		contentPane.add(txt_x);
		
		txt_y = new JTextField();
		txt_y.setColumns(10);
		txt_y.setBounds(122, 198, 46, 21);
		contentPane.add(txt_y);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("+");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setBounds(105, 201, 15, 15);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("=");
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1.setBounds(172, 201, 15, 15);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		txt_Result = new JTextField();
		txt_Result.setColumns(10);
		txt_Result.setBounds(189, 198, 46, 21);
		contentPane.add(txt_Result);
		
		JButton btn_Plus = new JButton("확인");
		btn_Plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int plus = Integer.parseInt(txt_x.getText())+ Integer.parseInt(txt_y.getText()) ;
				txt_Result.setText(""+plus); 
			}
		});
		btn_Plus.setBounds(247, 197, 68, 23);
		contentPane.add(btn_Plus);
		
		JButton btn_Tel_1_1 = new JButton("확인");
		btn_Tel_1_1.setBounds(247, 226, 68, 23);
		contentPane.add(btn_Tel_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(189, 227, 46, 21);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("=");
		lblNewLabel_2_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_1.setBounds(172, 230, 15, 15);
		contentPane.add(lblNewLabel_2_1_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(122, 227, 46, 21);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("-");
		lblNewLabel_2_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_2.setBounds(105, 230, 15, 15);
		contentPane.add(lblNewLabel_2_1_1_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(52, 227, 46, 21);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("뺄셈");
		lblNewLabel_2_1_2.setBounds(12, 230, 46, 15);
		contentPane.add(lblNewLabel_2_1_2);
		
		JButton btn_Tel_1_1_1 = new JButton("확인");
		btn_Tel_1_1_1.setBounds(247, 259, 68, 23);
		contentPane.add(btn_Tel_1_1_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(189, 260, 46, 21);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("=");
		lblNewLabel_2_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_1_1.setBounds(172, 263, 15, 15);
		contentPane.add(lblNewLabel_2_1_1_1_1_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(122, 260, 46, 21);
		contentPane.add(textField_7);
		
		JLabel lblNewLabel_2_1_1_2_1 = new JLabel("*");
		lblNewLabel_2_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_2_1.setBounds(105, 263, 15, 15);
		contentPane.add(lblNewLabel_2_1_1_2_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(52, 260, 46, 21);
		contentPane.add(textField_8);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("곱셈");
		lblNewLabel_2_1_2_1.setBounds(12, 263, 46, 15);
		contentPane.add(lblNewLabel_2_1_2_1);
		
		JButton btn_Tel_1_1_1_1 = new JButton("확인");
		btn_Tel_1_1_1_1.setBounds(247, 292, 68, 23);
		contentPane.add(btn_Tel_1_1_1_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(189, 293, 46, 21);
		contentPane.add(textField_9);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1 = new JLabel("=");
		lblNewLabel_2_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_1_1_1.setBounds(172, 296, 15, 15);
		contentPane.add(lblNewLabel_2_1_1_1_1_1_1);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(122, 293, 46, 21);
		contentPane.add(textField_10);
		
		JLabel lblNewLabel_2_1_1_2_1_1 = new JLabel("/");
		lblNewLabel_2_1_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_2_1_1.setBounds(105, 296, 15, 15);
		contentPane.add(lblNewLabel_2_1_1_2_1_1);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(52, 293, 46, 21);
		contentPane.add(textField_11);
		
		JLabel lblNewLabel_2_1_2_1_1 = new JLabel("나눗셈");
		lblNewLabel_2_1_2_1_1.setBounds(12, 296, 46, 15);
		contentPane.add(lblNewLabel_2_1_2_1_1);
		
		JLabel lblNewLabel_3_2_1_1 = new JLabel("체크박스 실습");
		lblNewLabel_3_2_1_1.setBounds(12, 338, 104, 15);
		contentPane.add(lblNewLabel_3_2_1_1);
		
		JCheckBox cb1 = new JCheckBox("서울");
		cb1.setBounds(12, 364, 57, 23);
		contentPane.add(cb1);
		
		JCheckBox cb2 = new JCheckBox("대전");
		cb2.setBounds(73, 364, 57, 23);
		contentPane.add(cb2);
		
		JCheckBox cb3 = new JCheckBox("대구");
		cb3.setBounds(134, 364, 57, 23);
		contentPane.add(cb3);
		
		JCheckBox cb4 = new JCheckBox("부산");
		cb4.setBounds(195, 364, 57, 23);
		contentPane.add(cb4);
		
		JCheckBox cb5 = new JCheckBox("광주");
		cb5.setBounds(258, 364, 57, 23);
		contentPane.add(cb5);
		
		JLabel lbResultChk = new JLabel("결과 :");
		lbResultChk.setBounds(12, 393, 380, 15);
		contentPane.add(lbResultChk);
		
		
		
		JButton btn_Chk = new JButton("확인");
		btn_Chk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<String> cities = new ArrayList<>();
				
				if(cb1.isSelected()) {
					cities.add(cb1.getText());
				}
				if(cb2.isSelected()) {
					cities.add(cb2.getText());
				}
				if(cb3.isSelected()) {
					cities.add(cb3.getText());
				}
				if(cb4.isSelected()) {
					cities.add(cb4.getText());
				}
				if(cb5.isSelected()) {
					cities.add(cb5.getText());
				}
				
				lbResultChk.setText("결과 : " + cities);
			}
		});
		btn_Chk.setBounds(323, 364, 68, 23);
		contentPane.add(btn_Chk);
		
		JLabel lblNewLabel_3_2_1_1_1 = new JLabel("테이블 실습");
		lblNewLabel_3_2_1_1_1.setBounds(12, 446, 104, 15);
		contentPane.add(lblNewLabel_3_2_1_1_1);
		
		table = new JTable();
		table.setBounds(12, 471, 380, 144);
		contentPane.add(table);
		
		
		
		
		//테이블 설정
				String[] columnNames = {"아이디", "이름", "휴대폰", "나이"};
				
				DefaultTableModel model = new DefaultTableModel(columnNames, 0);
				model.setRowCount(0);
				table.setModel(model);
				
				//model.setColumnIdentifiers(columnNames);
		
		JButton btn_Table = new JButton("출력");
		btn_Table.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<Person> persons = new ArrayList<>();
				persons.add(new Person("a101","김유신","010-1234-1001",23));
				persons.add(new Person("a102","김춘추","010-1234-1002",21));
				persons.add(new Person("a103","장보고","010-1234-1003",33));
				persons.add(new Person("a104","강감찬","010-1234-1004",43));
				persons.add(new Person("a105","이순신","010-1234-1005",53));
				
				for(Person person : persons) {
					Object[] rowData = {person.getId(), person.getName(), person.getHp(), person.getAge()}; 
					model.addRow(rowData);
					
				}
				
			}
		});
		btn_Table.setBounds(12, 625, 97, 23);
		contentPane.add(btn_Table);
		
		
		
		
		
		
	}
}
