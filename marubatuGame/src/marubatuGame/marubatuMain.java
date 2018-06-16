package marubatuGame;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class marubatuMain extends JFrame{
	public static ImageIcon img1 = new ImageIcon("./img/maru.png");
	public static ImageIcon img2 = new ImageIcon("./img/batu.png");
	public static ImageIcon img3 = new ImageIcon("./img/blank.png");
	public static JLabel icon1 = new JLabel(img3);
	public static JLabel icon2 = new JLabel(img3);
	public static JLabel icon3 = new JLabel(img3);
	public static JLabel icon4 = new JLabel(img3);
	public static JLabel icon5 = new JLabel(img3);
	public static JLabel icon6 = new JLabel(img3);
	public static JLabel icon7 = new JLabel(img3);
	public static JLabel icon8 = new JLabel(img3);
	public static JLabel icon9 = new JLabel(img3);
	public static int flug = 0;//現在どちら側の番かを表す
	public static int flug1[] = {0,0,0,0,0,0,0,0,0};//どの場所が既に選択されたかを表す
	public static int matchCount = 1;
	//public static int winner;
	public static marubatuMain main = new marubatuMain("〇×ゲーム");
	public static resultMain res = new resultMain("リザルト画面");

	public static void main(String[] args){
		main.setVisible(true);
	}

	/**
	 * @param title
	 */
	marubatuMain(String title){

		setTitle(title);
		setBounds(600,200,500,500);
		JPanel p = new JPanel();
		p.setLayout(null);

		icon1.setBounds(10,10,130,130);
		icon2.setBounds(160,10,130,130);
		icon3.setBounds(310,10,130,130);
		icon4.setBounds(10,160,130,130);
		icon5.setBounds(160,160,130,130);
		icon6.setBounds(310,160,130,130);
		icon7.setBounds(10,310,130,130);
		icon8.setBounds(160,310,130,130);
		icon9.setBounds(310,310,130,130);

		p.add(icon1);
		p.add(icon2);
		p.add(icon3);
		p.add(icon4);
		p.add(icon5);
		p.add(icon6);
		p.add(icon7);
		p.add(icon8);
		p.add(icon9);

		icon1.addMouseListener(new mouseMethod());
		icon2.addMouseListener(new mouseMethod());
		icon3.addMouseListener(new mouseMethod());
		icon4.addMouseListener(new mouseMethod());
		icon5.addMouseListener(new mouseMethod());
		icon6.addMouseListener(new mouseMethod());
		icon7.addMouseListener(new mouseMethod());
		icon8.addMouseListener(new mouseMethod());
		icon9.addMouseListener(new mouseMethod());


		getContentPane().add(p,BorderLayout.CENTER);
	}

	public static void changeDisp(){
		icon1.setIcon(img3);
		icon2.setIcon(img3);
		icon3.setIcon(img3);
		icon4.setIcon(img3);
		icon5.setIcon(img3);
		icon6.setIcon(img3);
		icon7.setIcon(img3);
		icon8.setIcon(img3);
		icon9.setIcon(img3);
		flug = 0;
		for(int i=0;i<9;i++) flug1[i] = 0;
		matchCount++;

	}

}


