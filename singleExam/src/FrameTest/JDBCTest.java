package FrameTest;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import FrameTest.User2VO;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.Dialog.ModalExclusionType;

public class JDBCTest extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel selectPane;
	private JTable tbl_List;
	private JButton btn_insert;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JDBCTest frame = new JDBCTest();
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
	public JDBCTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 731, 500);
		selectPane = new JPanel();
		selectPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(selectPane);
		selectPane.setLayout(null);
		
		
		tbl_List = new JTable();
		tbl_List.setBounds(12, 87, 691, 364);
		selectPane.add(tbl_List);
		
		//컬럼 설정
		String[] colunmNames = {"아이디","이름","생년월일","휴대폰","나이"};
		DefaultTableModel model = new DefaultTableModel(colunmNames,0);
		model.setColumnCount(0);
		tbl_List.setModel(model);
		
		JButton btn_select = new JButton("조회");
		btn_select.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
				UserDAO dao = UserDAO.getInstance();
				
				List<User1VO> users = dao.selectUsers();
															
				DefaultTableModel model = new DefaultTableModel();
                model.addColumn("UID");
                model.addColumn("Name");
                model.addColumn("Birth");
                model.addColumn("Hp");
                model.addColumn("Addr");

                for (User1VO vo : users) {
                	
                    model.addRow(new Object[]{vo.getUid(), vo.getName(), vo.getBirth(), vo.getHp(), vo.getAge() });
                }

                tbl_List.setModel(model);

                System.out.println("출력 완료");
				
				
			}
		});
		btn_select.setBounds(497, 10, 97, 23);
		selectPane.add(btn_select);
		
		btn_insert = new JButton("등록");
		btn_insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btn_insert.setBounds(606, 10, 97, 23);
		selectPane.add(btn_insert);
		
		
	
	}
}
