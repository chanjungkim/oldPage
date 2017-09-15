package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

import model.BalloonValue;

public class MessageP extends JPanel {

	int currentY = 30;
	int screenY;
	int[] xx;
	int[] yy;
	BalloonValue balloon;
	BufferedImage bufImg = new BufferedImage(450, 500, BufferedImage.TYPE_INT_RGB);
	MainClientUI ui;
	JScrollPane scrollP;
	Graphics2D bufGrp = bufImg.createGraphics();
	Image image;
	
	List<BalloonValue> balloonList;
	FontMetrics ftmt = this.getFontMetrics(getFont());

	public MessageP() {
		this.setSize(450, 500);
		this.setBackground(new Color(202, 255, 255));
		screenY = this.getHeight();
		setLayout(new WrapLayout(WrapLayout.LEADING));
		balloonList = new ArrayList<BalloonValue>();
	}

	public void setUi(MainClientUI ui) {
		this.ui = ui;
	}

	public void setScroll(JScrollPane scroll) {
		this.scrollP = scroll;
	}

	public List<BalloonValue> getBalloonList() {
		return balloonList;
	}

	public void insertMessage(String msg, String name) {

		xx = new int[] { 4, 10, 11, 14, 17, 19, 21, 21, 19, 17, 14, 12, 10, 10, 4 };
		yy = new int[] { 30, 26, 23, 21, 21, 22, 25, 45, 48, 49, 49, 48, 45, 34, 30 };

		int msgWidth = ftmt.stringWidth(msg);
		for (int i = 4; i < 10; i++) {
			xx[i] += msgWidth;
		}

		balloon = new BalloonValue();
		balloon.setMessage(msg);
		balloon.setNickName(name);
		
		for (int i = 0; i < 15; i++) {
			yy[i] += currentY;
		}
		if (name.equals(ui.getUsr().getName())) {
			balloon.setMe(true);
			for (int i = 0; i < 15; i++) {
				xx[i] = 450 - xx[i];
			}

		} else {
			balloon.setMe(false);
		}
		
		balloon.setX(xx);
		balloon.setY(yy);
		balloonList.add(balloon);
		currentY = currentY + 47;

		drawingAndScroll();
	}
	
	public void insertEmoticon(String emoticon, String name){
		xx = new int[] { 4, 10, 11, 14, 17, 19, 21, 21, 19, 17, 14, 12, 10, 10, 4 };
		yy = new int[] { 30, 26, 23, 21, 21, 22, 25, 45, 48, 49, 49, 48, 45, 34, 30 };
		
		balloon = new BalloonValue();
		balloon.setX(xx);
		for (int i = 0; i < 15; i++) {
			yy[i] += currentY;
		}
		if (name.equals(ui.getUsr().getName())) {
			balloon.setMe(true);
			for (int i = 0; i < 15; i++) {
				xx[i] = 450 - xx[i];
			}

		} else {
			balloon.setMe(false);
		}
		
		balloon.setX(xx);
		balloon.setY(yy);
		String url = "/image/" + emoticon;
		System.out.println("url = " + url);
		URL absolutePath = getClass().getResource(url);
		System.out.println("url = " + absolutePath.toString());
		balloon.setImageURL(absolutePath);
		balloon.setNickName(name);
		balloonList.add(balloon);
		currentY = currentY + 150;
		drawingAndScroll();
	}
	

	public void drawBufImg(Graphics2D g) {
		g.setBackground(new Color(202, 255, 255));
		g.clearRect(0, 0, 450, screenY);
		g.setColor(Color.BLACK);
		for (BalloonValue balloonValue : balloonList) {
			if (balloonValue.getImageURL() != null) {
				image = Toolkit.getDefaultToolkit().getImage(balloonValue.getImageURL());
				if (balloonValue.isMe()) {
					g.setPaint(Color.BLACK);
					g.drawString(balloonValue.getNickName(),
							balloonValue.getX()[10] - ftmt.stringWidth(balloonValue.getNickName()),
							balloonValue.getY()[0] - 12);
					g.drawImage(image, 315, balloonValue.getY()[3], getBackground(), this);
				} else {
					g.setPaint(Color.BLACK);
					g.drawString(balloonValue.getNickName(), balloonValue.getX()[3], balloonValue.getY()[0] - 12);
					g.drawImage(image, 15, balloonValue.getY()[3], getBackground(), this);
				}
				
				continue;
			}
			
			if (balloonValue.isMe()) {
				g.setPaint(Color.WHITE);
				g.fillPolygon(balloonValue.getX(), balloonValue.getY(), 15);
				g.setPaint(Color.BLACK);
				g.drawString(balloonValue.getNickName(),
						balloonValue.getX()[10] - ftmt.stringWidth(balloonValue.getNickName()),
						balloonValue.getY()[0] - 12);
				g.drawString(balloonValue.getMessage(),
						balloonValue.getX()[3] - ftmt.stringWidth(balloonValue.getMessage()),
						balloonValue.getY()[0] + 8);

			} else {
				g.setPaint(Color.YELLOW);
				g.fillPolygon(balloonValue.getX(), balloonValue.getY(), 15);
				g.setPaint(Color.BLACK);
				g.drawString(balloonValue.getNickName(), balloonValue.getX()[3], balloonValue.getY()[0] - 12);
				g.drawString(balloonValue.getMessage(), balloonValue.getX()[3], balloonValue.getY()[0] + 8);

			}
		}
	}
	
	public void drawingAndScroll(){
		if (screenY < currentY) {
			screenY = currentY;
			this.setPreferredSize(new Dimension(450, screenY));
			bufImg = new BufferedImage(450, screenY, BufferedImage.TYPE_INT_RGB);
			bufGrp = bufImg.createGraphics();
			bufImg.flush();
		}
		revalidate();
		repaint();

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				scrollP.getVerticalScrollBar().setValue(scrollP.getVerticalScrollBar().getMaximum());

			}
		});
	}

	public void cleanRoom(){
		balloonList.clear();
		currentY = 30;
		screenY = 500;
		drawingAndScroll();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		drawBufImg(bufGrp);
		g.drawImage(bufImg, 0, 0, this);

	}

	public static void main(String[] args) {
		JFrame frm = new JFrame();
		MessageP ms = new MessageP();
		// ms.insertMessage();
		ms.insertMessage("안녕하세요.", "test");
		ms.insertEmoticon("e1.png", "asdf");
		// ms.insertMessage("Good monring");
		JScrollPane scroll = new JScrollPane(ms);
		scroll.setPreferredSize(new Dimension(450, 300));
		frm.add(scroll);
		frm.pack();
		frm.setVisible(true);
	}
}
