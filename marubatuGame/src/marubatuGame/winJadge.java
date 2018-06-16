package marubatuGame;

public class winJadge {
	public static void Jadge(int[] flug){
			if(flug[0] == 1 && flug[1] == 1 && flug[2] == 1){
				//丸側勝利パターン1
				marubatuMain.res.setMethod(1);
				marubatuMain.res.setVisible(true);

			}
			else if(flug[3] == 1 && flug[4] == 1 && flug[5] == 1){
				marubatuMain.res.setMethod(1);
				marubatuMain.res.setVisible(true);
			}
			else if(flug[6] == 1 && flug[7] == 1 && flug[8] == 1){
				marubatuMain.res.setMethod(1);
				marubatuMain.res.setVisible(true);
			}
			else if(flug[0] == 1 && flug[3] == 1 && flug[6] == 1){
				marubatuMain.res.setMethod(1);
				marubatuMain.res.setVisible(true);
			}
			else if(flug[1] == 1 && flug[4] == 1 && flug[7] == 1){
				marubatuMain.res.setMethod(1);
				marubatuMain.res.setVisible(true);
			}
			else if(flug[2] == 1 && flug[5] == 1 && flug[8] == 1){
				marubatuMain.res.setMethod(1);
				marubatuMain.res.setVisible(true);
			}
			else if(flug[0] == 1 && flug[4] == 1 && flug[8] == 1){
				marubatuMain.res.setMethod(1);
				marubatuMain.res.setVisible(true);			}
			else if(flug[2] == 1 && flug[4] == 1 && flug[6] == 1){
				marubatuMain.res.setMethod(1);
				marubatuMain.res.setVisible(true);
			}
			else if(flug[0] == 2 && flug[1] == 2 && flug[2] == 2){
				//バツ側勝利パターン
				marubatuMain.res.setMethod(2);
				marubatuMain.res.setVisible(true);
			}
			else if(flug[3] == 2 && flug[4] == 2 && flug[5] == 2){
				marubatuMain.res.setMethod(2);
				marubatuMain.res.setVisible(true);
			}
			else if(flug[6] == 2 && flug[7] == 2 && flug[8] == 2){
				marubatuMain.res.setMethod(2);
				marubatuMain.res.setVisible(true);
			}
			else if(flug[0] == 2 && flug[3] == 2 && flug[6] == 2){

				marubatuMain.res.setVisible(true);
			}
			else if(flug[1] == 2 && flug[4] == 2 && flug[7] == 2){
				marubatuMain.res.setMethod(2);
				marubatuMain.res.setVisible(true);
			}
			else if(flug[2] == 2 && flug[5] == 2 && flug[8] == 2){
				marubatuMain.res.setMethod(2);
				marubatuMain.res.setVisible(true);
			}
			else if(flug[0] == 2 && flug[4] == 2 && flug[8] == 2){
				marubatuMain.res.setMethod(2);
				marubatuMain.res.setVisible(true);
			}
			else if(flug[2] == 2 && flug[4] == 2 && flug[6] == 2){
				marubatuMain.res.setMethod(2);
				marubatuMain.res.setVisible(true);
			}

	}
}
