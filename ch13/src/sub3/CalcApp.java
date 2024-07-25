package sub3;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class CalcApp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField inputSpace;
	private String num = "";
	private String prev_operation = "";
	private ArrayList<String> cal = new ArrayList<String>();
	private String text = "0으로 나눌 수 없습니다.";
	
	/**
	 * Create the frame.
	 */
	public CalcApp() {
				getContentPane().setLayout(null);
				
				inputSpace = new JTextField();
				inputSpace.setText("0");
				inputSpace.setEditable(false);
				inputSpace.setBackground(Color.WHITE);
				inputSpace.setHorizontalAlignment(JTextField.RIGHT);
				inputSpace.setFont(new Font("Arial", Font.BOLD, 50));
				inputSpace.setBounds(8, 10, 270, 70);
				
				JPanel buttonPanel = new JPanel();
				buttonPanel.setLayout(new GridLayout(4, 4, 10, 10));
				buttonPanel.setBounds(8, 90, 270, 235);
				
				
				String button_names[] = { "7", "8", "9", "/", "4", "5", "6", "×", "1", "2", "3", "-", "C", "0", "=", "+" };
				JButton buttons[] = new JButton[button_names.length];
				
				for (int i = 0; i < button_names.length; i++) {
					buttons[i] = new JButton(button_names[i]);
				
					buttons[i].addActionListener(new PadActionListener());
					buttonPanel.add(buttons[i]);
				}
				
				getContentPane().add(inputSpace);
				getContentPane().add(buttonPanel);
				
				setTitle("계산기");
				setVisible(true);
				setSize(300,370);
				setLocationRelativeTo(null); 
				setResizable(false);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcApp frame = new CalcApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	
	private void fullTextParsing(String inputText) {
		cal.clear();
		
		for (int i = 0; i < inputText.length(); i++) {
			char ch = inputText.charAt(i);
			
			if (ch == '-' || ch == '+' || ch == '×' || ch == '/') {
				cal.add(num);
				num = "";
				cal.add(ch + "");
			} else {
				num = num + ch;
			}
		}
		cal.add(num);
		cal.remove("");
	}
	
	
	public double calculate(String inputText) {
		fullTextParsing(inputText);
		
		
		double prev = 0;
		double current = 0;
		String mode = "";
		
		
		for (int i = 0; i < cal.size(); i++) {
			String s = cal.get(i);
			if (s.equals("+")) {
				mode = "add";
			} else if (s.equals("-")) {
				mode = "sub";
			} else if (s.equals("×")) {
				mode = "mul";
			} else if (s.equals("/")) {
				mode = "div";
			} else {
				if ((mode.equals("mul") || mode.equals("div")) && !s.equals("+") && !s.equals("-") && !s.equals("×") && !s.equals("/")) {
					Double one = Double.parseDouble(cal.get(i - 2));
					Double two = Double.parseDouble(cal.get(i));
					String result = "";
					
					 if (mode.equals("mul")) {
			                result = String.valueOf(one * two);
			            } else if (mode.equals("div")) {
			                if (two == 0) {
			                	inputSpace.setText("0은 나눌 수 없습니다.");
			                } else {
			                    result = String.valueOf(one / two);
			                }
			            }
			            cal.add(i + 1, result);
					
					for (int j = 0; j < 3; j++) {
						cal.remove(i - 2);
					}
					
					i -= 2;	
				}
			}
		}	
		

		for (String s : cal) {
			if (s.equals("+")) {
				mode = "add";
			} else if (s.equals("-")) {
				mode = "sub";
			
			
			}  else {
			
				current = Double.parseDouble(s);
				
			
				if (mode.equals("add")) {
					prev += current;
				} else if (mode.equals("sub")) {
					prev -= current;
				} else {
					prev = current;
				}
			}
			
			prev = prev * 1;
		}
		
		return prev;
	}
	
	class PadActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String operation = e.getActionCommand();

            if (operation.equals("C")) {
                inputSpace.setText("0");
            } else if (operation.equals("=")) {
                double result = calculate(inputSpace.getText());
                if (Double.isInfinite(result)) {
                	inputSpace.setText(text);
                } else {
                    inputSpace.setText(Double.toString(result));
                }
                num = "";
            } else if (operation.equals("+") || operation.equals("-") || operation.equals("×") || operation.equals("/")) {
                if (inputSpace.getText().equals("") && operation.equals("-")) {
                    inputSpace.setText(inputSpace.getText() + e.getActionCommand());
                } else if (!inputSpace.getText().equals("") && !prev_operation.equals("+") && !prev_operation.equals("-") && !prev_operation.equals("×") && !prev_operation.equals("/")) {
                    inputSpace.setText(inputSpace.getText() + e.getActionCommand());
                }
            } else {
                inputSpace.setText(inputSpace.getText() + e.getActionCommand());
            }
            prev_operation = e.getActionCommand();
        }
    }

	

}
