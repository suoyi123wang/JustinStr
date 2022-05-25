package renju.player;

import java.awt.Color;
import java.util.Arrays;

import renju.Board;
import renju.Direction;
import renju.QiZi;

public class AIplayer {
  private Color color ; 
  private int[] attack1 = new int[255] ;
  private int[] defense1 =new int[255];
public Color getColor() {
	return color;
}

public void setColor(Color color) {
	this.color = color;
}
public AIplayer(Color color){
	this.setColor(color);
}
public QiZi nextQiZi(QiZi[][] stone){
	  int[] attack = new int[225];
	  int[] defense = new int[225];
	QiZi qizi1 = null;
	QiZi qizi2 = null;
	for(int i = 0;i<15;i++){
		for(int j = 0;j<15;j++){
			if(stone[i][j] == null){
			attack[i*15+j]=thinkForAttack(i,j,stone);
			defense[i*15+j]=thinkForDefense(i,j,stone);			
		    }
			if(stone[i][j] != null){
				attack[i*15+j]=-1;
				defense[i*15+j]=-1;
			}			
			}
	}
	
	for(int i =0;i<225;i++){
	 attack1[i] = attack[i];
	}	
	for(int i =0;i<225;i++){
		defense1[i] = defense[i];
		}
	Arrays.sort(defense);
	Arrays.sort(attack);

	
	int ax = 0;
	for(int i = 0;i<225;i++){	
	if(attack1[i]==attack[224]){
		ax = i;
		break;
	}
	}
	int x1 = ax/15;
	int y1 = ax-x1*15;

	qizi1 = new QiZi(x1,y1,this.getColor());
	int dx = 0;
	for(int i = 0;i<225;i++){	
		if(defense1[i]==defense[224]){
			dx = i;
			break;
		}
		}
	int x2 = dx/15;
	int y2 = dx-x2*15;

	qizi2 = new QiZi(x2,y2,this.getColor());
	if( attack[224] >= defense[224]){
		return qizi1;
	}
	else{
		return qizi2;
	}
	
}
public int thinkForAttack(int currentX,int currentY, QiZi[][] stone) {
	int j = 0;
	int i = 0;
	int[] perAttack = new int[4];
	
	for (j = 0; j < 4; j++) {
		Direction direction = Direction.DIRECTIONS[j];
		i = 0;
		i = i + this.searchForAttack(currentX,currentY,direction,stone, true);
		i = i + this.searchForAttack(currentX,currentY,direction,stone,false);
		perAttack[j]=i;
	}
	Arrays.sort(perAttack);
	int a = perAttack[perAttack.length-1];
	return a;
}
private int searchForAttack(int currentX,int currentY, Direction direction,QiZi[][] stone,boolean flag) {
	int count = 0;	
	while (true) {
		if (flag) {
			currentX = currentX + direction.getDeltaX();
			currentY = currentY + direction.getDeltaY();
		} else {
			currentX = currentX - direction.getDeltaX();
			currentY = currentY - direction.getDeltaY();
		}
		if (currentX < 0 || currentX > Board.MAX_X-1 || currentY < 0
				|| currentY > Board.MAX_Y-1) {
			break;
		}
		QiZi qizi = stone[currentX][currentY];
		
		if (qizi == null || !(qizi.getColor()).equals(this.getColor())) {
			break;
		}
		count++;
	}
	return count;
}
public int thinkForDefense(int currentX,int currentY, QiZi[][] stone) {
	int j = 0;
	int i = 0;
	
	  int[] perDefense = new int[4];
	for (j = 0; j < 4; j++) {
		Direction direction = Direction.DIRECTIONS[j];
		i = 0;
		i = i + this.searchForDefense(currentX,currentY,direction,stone, true);
		i = i + this.searchForDefense(currentX,currentY,direction,stone,false);
		perDefense[j]=i;
	
	}
	Arrays.sort(perDefense);
	int a = perDefense[perDefense.length-1];
//	System.out.println(a);
	return a;
}
private int searchForDefense(int currentX,int currentY, Direction direction,QiZi[][] stone,boolean flag) {
	int count = 0;	
	while (true) {
		if (flag) {
			currentX = currentX + direction.getDeltaX();
			currentY = currentY + direction.getDeltaY();
		} else {
			currentX = currentX - direction.getDeltaX();
			currentY = currentY - direction.getDeltaY();
		}
		if (currentX < 0 || currentX > Board.MAX_X-1 || currentY < 0
				|| currentY > Board.MAX_Y-1) {
			break;
		}
		QiZi qizi = stone[currentX][currentY];
		if (qizi == null || (qizi.getColor()).equals(this.getColor())) {
			break;
		}
		
		if (qizi != null && !(qizi.getColor()).equals(this.getColor())) {
			count++;
		}
		
	}
	return count;
}
}
