package marubatuGame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class resultMain extends JFrame /*implements ActionListener*/{
	JButton reset = new JButton("再戦する");
	JPanel result = new JPanel();
	public resultMain(String title){

		setTitle(title);
		setBounds(600,200,500,500);
		//this.result.add(this.reset);
		//this.result.add(this.resultText);
		//getContentPane().add(this.result,BorderLayout.CENTER);
	}

	public void setMethod(int flug){
		//setBounds(600,200,500,500);
		JPanel panel = new JPanel();
		JLabel resultText = new JLabel();
		String str = "が勝利しました";
		JButton button = new JButton("再戦する");
		panel.setLayout(null);
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				marubatuMain.changeDisp();
				panel.setVisible(false);
				marubatuMain.main.setVisible(true);
			}
		});
		JButton exit = new JButton("終了する");
		exit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(1);
			}
		});
		button.setBounds(150,180, 100, 30);
		resultText.setBounds(150,0,150,30);
		exit.setBounds(150,250,100,30);
		panel.add(button);
		panel.add(exit);
		this.setTitle(marubatuMain.matchCount +"戦目結果");
		if(flug == 1) str = "〇側"+str;
		else if(flug == 2) str = "×側" + str;
		resultText.setText(str);
		panel.add(resultText);
		//getContentPane().add(this.result,BorderLayout.CENTER);
		getContentPane().add(panel,BorderLayout.CENTER);
	}

}
