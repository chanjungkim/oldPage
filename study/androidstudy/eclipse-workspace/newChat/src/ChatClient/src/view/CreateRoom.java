package view;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import common.MessageType;

public class CreateRoom extends JDialog implements MessageType{

	JLabel titleL, countL, mL;
	JTextField titleTF, pwTF;
	JComboBox<String> countCB;
	JCheckBox pwCB;
	JButton creatB, cancelB;

	GridBagConstraints gridBagConstraints;
	GridBagLayout gridBagLayout;

	MainClientUI ui;

	public CreateRoom() {
		this.setTitle("Create room");
		titleL = new JLabel("Title");
		countL = new JLabel("Max user");
		mL = new JLabel("   ");

		titleTF = new JTextField();
		pwTF = new JTextField();
		pwTF.setEditable(false);

		countCB = new JComboBox<String>();
		countCB.addItem("2");
		countCB.addItem("3");
		countCB.addItem("4");
		countCB.addItem("5");
		countCB.addItem("6");

		pwCB = new JCheckBox("secret words");

		creatB = new JButton(" Create ");
		cancelB = new JButton(" Cancel ");

		gridBagConstraints = new GridBagConstraints();
		gridBagLayout = new GridBagLayout();

		setComponents();
		eventRegist();

		setSize(500, 200);
		setVisible(true);
		ui = MainClientUI.getInstance();
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	}

	// setter
	public void setUi(MainClientUI ui) {
		this.ui = ui;
	}

	// view setting
	public void setComponents() {
		setLayout(gridBagLayout);
		gridBagConstraints.fill = gridBagConstraints.BOTH;
		gridBagConstraints.insets = new Insets(3, 3, 3, 3);

		add(titleL, 0, 0, 1, 1, 0.0, 0.0);
		add(countL, 0, 1, 1, 1, 0.0, 0.0);

		add(titleTF, 1, 0, 5, 1, 1.0, 0.0);

		add(countCB, 1, 1, 1, 1, 0.0, 0.0);
		add(mL, 2, 1, 1, 1, 0.0, 0.0);
		add(new JLabel(""), 3, 1, 1, 1, 0.0, 0.0);

		add(pwCB, 3, 1, 1, 1, 0.0, 0.0);
		add(pwTF, 4, 1, 2, 1, 0.5, 0.0);

		add(creatB, 4, 2, 1, 1, 0.1, 0.0);
		add(cancelB, 5, 2, 1, 1, 0.1, 0.0);
		add(new JLabel(""), 5, 2, 1, 1, 0.0, 0.0);

	}

	private void add(Component component, int gridx, int gridy, int gridwidth, int gridheight, double weightx,
			double weighty) {
		gridBagConstraints.gridx = gridx;
		gridBagConstraints.gridy = gridy;
		gridBagConstraints.gridwidth = gridwidth;
		gridBagConstraints.gridheight = gridheight;
		gridBagConstraints.weightx = weightx;
		gridBagConstraints.weighty = weighty;

		gridBagLayout.setConstraints(component, gridBagConstraints);
		add(component);
	}

	// normal chat creating request
	public void creatChatRoom() throws IOException {
		String roomName = titleTF.getText();
		String maxUser = countCB.getSelectedItem().toString();
		if (!pwCB.isSelected()) {
			ui.sendMessage(C_CREATE_ROOM + DELIMETER + roomName + DELIMETER + FALSE + DELIMETER + maxUser + DELIMETER + ui.getUsr().getId());
		} else {
			// 비밀대화방 생성 요청 212번
			String passWord = pwTF.getText();
			ui.sendMessage(C_CREATE_ROOM + DELIMETER + roomName + DELIMETER + TRUE + DELIMETER + passWord + DELIMETER + maxUser + DELIMETER + ui.getUsr().getId());
		}
	}

	/** activate when checkbox is checked */
	public void enabled() {
		if (pwCB.isSelected()) {
			pwTF.setEditable(true);
		} else {
			pwTF.setEditable(false);
			pwTF.setText("");
		}
	}

	public void exit() {
		this.setVisible(false);
		dispose();
	}

	public void eventRegist() {
		pwCB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				enabled();
			}
		});

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				exit();
			}
		});

		cancelB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				exit();
			}
		});

		creatB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					creatChatRoom();
					exit();
				} catch (IOException e1) {

				}

			}
		});

	}

	public static void main(String[] args) {
		CreateRoom cr = new CreateRoom();

	}

}
