package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import model.User;
/*
 * This class manage user login, sign up
 */
public class RWUserInfo {

	String fileUrl;
	BufferedReader in;
	BufferedWriter out;
	public RWUserInfo() {

		fileUrl = getClass().getResource("/UserInfo/UserInfo.txt").getPath();
	}

	public User isUser(String id, String passwd) {
		File file = new File(fileUrl);
		try {
			in = new BufferedReader(new FileReader(fileUrl));
			while (true) {
				String userRecord = in.readLine();
				if (userRecord == null) {
					break;
				}
				String[] userInfo = userRecord.split(",");
				if (userInfo[0].equalsIgnoreCase(id)) {
					if (userInfo[1].equalsIgnoreCase(passwd)) {
						return new User(userInfo[0], userInfo[1], userInfo[2], userInfo[3]);
					}
					continue;
				}
			}

		} catch (IOException e) {
			System.out.println("file does not exist");
		}

		try {
			if (in != null)
				in.close();
		} catch (IOException e) {
		}

		return null;
	}

	public void signUp(String id, String passwd, String name, String sex) {
		try {
			out = new BufferedWriter(new FileWriter(fileUrl, true));
			out.write(id + "," + passwd + "," + name + "," + sex);
			out.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (out != null)
					out.close();
			} catch (IOException e) {
			}
		}
	}
	
	public User isUser(String id) {
		File file = new File(fileUrl);
		try {
			in = new BufferedReader(new FileReader(fileUrl));
			while (true) {
				String userRecord = in.readLine();
				if (userRecord == null) {
					break;
				}
				String[] userInfo = userRecord.split(",");
				if (userInfo[0].equals(id)) {
					return new User(userInfo[0], userInfo[1], userInfo[2], userInfo[3]);
				}
			}

		} catch (IOException e) {
			System.out.println("file does not exist");
		}

		try {
			if (in != null)
				in.close();
		} catch (IOException e) {
		}

		return null;
	}
	

	public static void main(String args[]) {
		RWUserInfo rw = new RWUserInfo();
		rw.isUser("krkr7878", "1234");
		rw.signUp("krkr", "7878", "woman", "sam");
		rw.signUp("asd", "asd", "woman", "sam1");
	}
}
