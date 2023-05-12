import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class ChatbotSwing extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JTextField textField;
	private JTextArea textArea;
	private JScrollPane scrollPane;
	
	public ChatbotSwing () {
		setTitle("Chatbot");
		setSize(400,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel ();
		panel.setLayout(null);
		
		JLabel name = new JLabel ("Welome to Chatbot");
		name.setBounds(20, 0, 290, 25);
		name.setForeground(Color.BLACK);
		name.setFont(new Font ("SAN_SERIF", Font.BOLD, 14));
		panel.add(name);
		
		textField = new JTextField ();
		textField.setBounds(20, 430, 290, 25);
		textField.addActionListener(this);
		
		JButton send = new JButton("Send");
		send.setBounds(310, 430, 60, 25);
		send.setForeground(Color.BLACK);
		send.setBackground(new Color(165, 243, 249));
		send.addActionListener(this);
		send.setFont(new Font("SEN_SERIF", Font.BOLD, 10));
		panel.add(send);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		
		scrollPane = new JScrollPane (textArea);
		scrollPane.setBounds(20, 20, 340, 400);
		
		panel.add(scrollPane);
		panel.add(textField);
		
		setContentPane(panel);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		String input = textField.getText ();
		textArea.append("You: "+ input + "\n");
		
		
		if (input.equalsIgnoreCase("hello")) {
            textArea.append("Chatbot: Hi there!\n");
        } else if (input.equalsIgnoreCase("how are you?")) {
            textArea.append("Chatbot: I'm doing well, thanks for asking!, How are you?\n");
        }else if (input.equalsIgnoreCase("I am aldo fine")) {
            textArea.append("Chatbot: Nice to here this\n");
        } else if (input.equalsIgnoreCase("what's your name?")) {
            textArea.append("Chatbot: My name is Chatbot.\n");
        } else if (input.equalsIgnoreCase("bye")) {
            textArea.append("Chatbot: Goodbye! Have a great day!\n");
            textField.setEditable(false);
        } else {
            textArea.append("Chatbot: I'm sorry, I don't understand. Can you please rephrase your question?\n");
        }
		
		textField.setText("");
				
	}
	public static void main (String[] args) {
		new ChatbotSwing();
	}
}
