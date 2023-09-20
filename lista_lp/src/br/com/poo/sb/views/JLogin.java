package br.com.poo.sb.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;

public class JLogin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCPF;
	private JPasswordField textSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JLogin frame = new JLogin();
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
	public JLogin() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(177, 11, 68, 33);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 25));
		contentPane.add(lblNewLabel);
		
		textCPF = new JTextField();
		textCPF.setColumns(10);
		textCPF.setBounds(110, 107, 200, 20);
		contentPane.add(textCPF);
		
		JLabel lblNewLabel_1 = new JLabel("CPF");
		lblNewLabel_1.setBounds(110, 89, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Senha");
		lblNewLabel_1_1.setBounds(110, 159, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setBounds(166, 208, 89, 23);
		contentPane.add(btnNewButton);
		
		textSenha = new JPasswordField();
		textSenha.setBounds(110, 177, 200, 20);
		contentPane.add(textSenha);
	}
}
