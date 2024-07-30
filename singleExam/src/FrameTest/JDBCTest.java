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

public class JDBCTest extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tb_select;

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
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("조회");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Host = "jdbc:mysql://127.0.0.1:3306/studydb";
				String user = "root";
				String pass = "1234";
				
				
				List<User2VO> user2s = new ArrayList<>();
				
				
				
				
				try {
					//1단계 - 데이터베이스 접속
					Connection conn = DriverManager.getConnection(Host,user,pass);
					//2단계 - sql 실행 객체 생성
					
					String sql = "select * from `user2`";
					PreparedStatement psmt = conn.prepareStatement(sql);
								
					//3단계 sql 실행
					ResultSet rs = psmt.executeQuery();
					
					
					//4단계 ResultSet 결과처리
					while(rs.next()) {
						String uid = rs.getString(1);
						String name = rs.getString(2);
						String birth = rs.getString(3);
						String addr = rs.getString(4);
						
						
						User2VO vo = new User2VO();
						
						
						
						vo.setUid(rs.getString(1));
						vo.setName(rs.getString(2));
						vo.setBirth(rs.getString(3));
						vo.setAddr(rs.getString(4));
						
						user2s.add(vo);
						
					}
					
					//5단계 접속종료
					rs.close();
					psmt.close();
					conn.close();
					
				} catch (Exception e1) {
					e1.getMessage();
				}
				
				DefaultTableModel model = new DefaultTableModel();
                model.addColumn("UID");
                model.addColumn("Name");
                model.addColumn("Birth");
                model.addColumn("Addr");

                for (User2VO vo : user2s) {
                	
                    model.addRow(new Object[]{vo.getUid(), vo.getName(), vo.getBirth(), vo.getAddr()});
                }

                tb_select.setModel(model);

                System.out.println("출력 완료");
				
				
			}
		});
		btnNewButton.setBounds(399, 10, 97, 23);
		contentPane.add(btnNewButton);
		
		tb_select = new JTable();
		tb_select.setBounds(12, 87, 691, 364);
		contentPane.add(tb_select);
	}
}
