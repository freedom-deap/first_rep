package marubatuGame;

import java.awt.event.MouseEvent;

import javax.swing.JLabel;


public class mouseMethod extends MouseAdapter{
	public void mouseClicked(MouseEvent e){
		Object obj = e.getSource();
		int i = marubatuMain.flug;
		if(obj == marubatuMain.icon1 && marubatuMain.flug1[0] == 0){
			marubatuMain.flug1[0] = marubatuMain.flug + 1;
			change(marubatuMain.icon1,i);
		}
		else if(obj == marubatuMain.icon2 && marubatuMain.flug1[1] == 0){
			marubatuMain.flug1[1] = marubatuMain.flug + 1;
			change(marubatuMain.icon2,i);
		}
		else if(obj == marubatuMain.icon3 && marubatuMain.flug1[2] == 0){
			marubatuMain.flug1[2] = marubatuMain.flug + 1;
			change(marubatuMain.icon3,i);
		}
		else if(obj == marubatuMain.icon4 && marubatuMain.flug1[3] == 0){
			marubatuMain.flug1[3] = marubatuMain.flug + 1;
			change(marubatuMain.icon4,i);
		}
		else if(obj == marubatuMain.icon5 && marubatuMain.flug1[4] == 0){
			marubatuMain.flug1[4] = marubatuMain.flug + 1;
			change(marubatuMain.icon5,i);
		}
		else if(obj == marubatuMain.icon6 && marubatuMain.flug1[5] == 0){
			marubatuMain.flug1[5] = marubatuMain.flug + 1;
			change(marubatuMain.icon6,i);
		}
		else if(obj == marubatuMain.icon7 && marubatuMain.flug1[6] == 0){
			marubatuMain.flug1[6] = marubatuMain.flug + 1;
			change(marubatuMain.icon7,i);
		}
		else if(obj == marubatuMain.icon8 && marubatuMain.flug1[7] == 0){
			marubatuMain.flug1[7] = marubatuMain.flug + 1;
			change(marubatuMain.icon8,i);
		}
		else if(obj == marubatuMain.icon9 && marubatuMain.flug1[8] == 0){
			marubatuMain.flug1[8] = marubatuMain.flug + 1;
			change(marubatuMain.icon9,i);
		}

	}

	public void change(JLabel e1,int i){
		if(i == 0){
			e1.setIcon(marubatuMain.img1);
			marubatuMain.flug++;
			winJadge.Jadge(marubatuMain.flug1);

		}
		else if(i == 1){
			e1.setIcon(marubatuMain.img2);
			marubatuMain.flug--;
			winJadge.Jadge(marubatuMain.flug1);

		}
	}

}
