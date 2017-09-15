package view;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import common.MessageType;

public class LoginP extends JPanel implements MessageType {

	JButton loginB, signUp;
	JTextField idTF;
	JPasswordField passTF;
	GridBagConstraints gbConst;
	ImageIcon imgcon;
	JLabel bgImg;
	URL url;
	MainClientUI ui;

	public LoginP() {
		loginB = new JButton("Login");
		signUp = new JButton("Sign Up");
		idTF = new JTextField(15);
		passTF = new JPasswordField(15);
		gbConst = new GridBagConstraints();
		url = getClass().getResource("/image/LoginLogo.jpg");
		imgcon = new ImageIcon(url);
		bgImg = new JLabel(imgcon);
		eventReg();
		setComp();
	}
	
	public void setUi(MainClientUI ui) {
		this.ui = ui;
	}

	@Override
	public void paintComponents(Graphics g) {
		super.paintComponents(g);
		g.drawImage(imgcon.getImage(), 0, 0, this);
		setOpaque(false);
	}

	public void setComp() {
		bgImg.setHorizontalAlignment(JLabel.CENTER);
		gbConst.fill = GridBagConstraints.BOTH;
		this.setLayout(new GridBagLayout());
		gridSet(bgImg, 0, 0, 4, 3);
		gridSet(idTF, 1, 3, 1, 1);
		gridSet(loginB, 3, 3, 1, 1);
		gridSet(signUp, 3, 4, 1, 1);
		gridSet(passTF, 1, 4, 1, 1);
		
	}

	public void gridSet(Component cmp, int x, int y, int width, int height) {
		gbConst.gridx = x;
		gbConst.gridy = y;
		gbConst.gridwidth = width;
		gbConst.gridheight = height;
		add(cmp, gbConst);
	}

	public void eventReg(){
		
		loginB.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ui.sendMessage(C_LOGIN + DELIMETER + idTF.getText() + DELIMETER + String.valueOf(passTF.getPassword()));
				
			}
		});
		signUp.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				SignUpD signD = new SignUpD();
				signD.setLocationRelativeTo(null);
				signD.setVisible(true);
				signD.setUi(ui);
			}
		});
		
	}
	
	public static void main(String[] args) {
		JFrame frm = new JFrame();
		frm.add(new LoginP());
		frm.pack();
		System.out.println(frm.getSize().toString());
		frm.setVisible(true);
	}

}
