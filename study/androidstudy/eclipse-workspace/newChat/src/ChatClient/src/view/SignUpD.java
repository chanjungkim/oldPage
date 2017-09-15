package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import common.MessageType;
import model.User;

public class SignUpD extends JDialog implements MessageType {

	JLabel id, passwd, name, sex;
	JTextField idTF, nameTF, passTF;
	JComboBox<String> sexCB;
	JButton submit;
	MainClientUI ui;

	public SignUpD() {
		this.setTitle("Sign up");
		sexCB = new JComboBox<String>();
		sexCB.addItem("man");
		sexCB.addItem("woman");

		id = new JLabel("ID");
		passwd = new JLabel("Pass Word");
		name = new JLabel("Name");
		sex = new JLabel("Sex");

		idTF = new JTextField(15);
		nameTF = new JTextField(15);
		passTF = new JTextField(15);

		submit = new JButton("submit");

		this.setLayout(new GridLayout(5, 2));
		this.add(id);
		this.add(idTF);
		this.add(passwd);
		this.add(passTF);
		this.add(name);
		this.add(nameTF);
		this.add(sex);
		this.add(sexCB);
		this.add(new JLabel(""));
		this.add(submit);

		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		this.pack();
		
		submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				getInfo();
				dispose();
			}
		});
	}

	public void setUi(MainClientUI ui) {
		this.ui = ui;
	}

	public void getInfo() {
		ui.sendMessage(C_SIGN_UP + DELIMETER + idTF.getText() + DELIMETER + String.valueOf(passTF.getText()) + DELIMETER
				+ nameTF.getText() + DELIMETER + (String) sexCB.getSelectedItem());

	}

	public static void main(String[] args) {
		SignUpD su = new SignUpD();
		su.setVisible(true);
		su.pack();

	}

}
