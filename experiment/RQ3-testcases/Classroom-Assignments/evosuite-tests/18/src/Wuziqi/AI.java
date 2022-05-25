package Wuziqi;

public class AI extends Player {
	
	public AI(){
	}
	
	public AI(int id, int color) {
		this.setId(id);
		this.setColor(color);
	}

	public static int maxScores(int scores1 , int scores2 , int scores3 , int scores4 ){
		int max = scores1;
		if (scores2 > max) max = scores2;
		if (scores3 > max) max = scores3;
		if (scores4 > max) max = scores4;
		return max;	
	}
	
	public int[][] scoresAI(QiPan qiPan,AI AI){
		int scores[][] = new int[16][16];
		int scores1[][] = new int[16][16];
		int scores2[][] =  new int[16][16];
		int scores3[][] =  new int[16][16];
		int scores4[][] = new int[16][16];
		int[][] qiPan2 = qiPan.getQiPan();
		  for (int i = 1; i < 16 ; i ++){
			  for (int j = 1 ; j < 16 ; j ++){	
				int k = j + 1;
				if(k < 16){
					while (qiPan2[i][k] == AI.getColor() && k< 16){
						scores1[i][j]++;
						k++;
					}	
				}
				
				int m = j - 1;
                if(m > 0){
                	while (qiPan2[i][m] == AI.getColor() && m > 0){
    					scores1[i][j]++;
    					m--;
    				}	
				}
		    }	
		}
		  for (int i = 1; i < 16 ; i ++){
			  for (int j = 1 ; j < 16 ; j ++){	
				int k = i + 1;
				if(k < 16){
					while (qiPan2[k][j] == AI.getColor() && k< 16){
						scores2[i][j]++;
						k++;
					}
					
				}
				
				int m = i - 1;
				if (m > 0){
					while (qiPan2[m][j] == AI.getColor() && m > 0){
						scores2[i][j]++;
						m--;
					}	
				}
		    }
		}
		  for (int i = 1; i < 16 ; i ++){
			  for (int j = 1 ; j < 16 ; j ++){	
				int k = i + 1;int m = j + 1;
				if(k < 16 && m < 16){
					while (qiPan2[k][m] == AI.getColor() && k< 16 && j < 16){
						scores3[i][j]++;
						k++;
						m++;
					}	
				}
				k = i -1 ; m = j - 1;
				if(k > 0 && m > 0 ){
					while (qiPan2[k][m] == AI.getColor() && m > 0 && j > 0){
						scores3[i][j]++;
						m--;
						k--;
					}
				}	
		    }	
		}
		  for (int i = 1; i < 16 ; i ++){
			  for (int j = 1 ; j < 16 ; j ++){	
				int k = i + 1;int m = j - 1;
				if(k < 16 && m> 0){
					while (qiPan2[k][m] == AI.getColor() && k< 16 && j > 0){
						scores4[i][j]++;
						k++;
						m--;
					}
				}
				
				k = i -1 ; m = j + 1;
				if (k > 0 && m< 16){
					while (qiPan2[k][m] ==AI.getColor() && m > 0 && j < 16){
						scores4[i][j]++;
						m++;
						k--;
					}	
				}
				
		    }
		}
		  for (int i = 1; i < 16 ; i ++){
			  for (int j = 1 ; j < 16 ; j ++){	
				  scores[i][j] = maxScores(scores1[i][j] , scores2[i][j] ,scores3[i][j] ,scores4[i][j]);
			  }
			  }
		  for (int i = 1; i < 16 ; i ++){
			  for (int j = 1 ; j < 16 ; j ++){	
				  if(!qiPan.unOccupied(QiZi.NewQiZi(i, j, AI.getColor()))){scores[i][j] = 0;}
			  }
			 }
		return scores;
	}
 	public int[][] scoresPlayer(QiPan qiPan, Player player){
		int scores[][] = new int[16][16];
		int scores1[][] = new int[16][16];
		int scores2[][] =  new int[16][16];
		int scores3[][] =  new int[16][16];
		int scores4[][] = new int[16][16];
		int[][] qiPan2 = qiPan.getQiPan();
		  for (int i = 1; i < 16 ; i ++){
			  for (int j = 1 ; j < 16 ; j ++){	
				int k = j +1 ;
				if(k < 16){
					while (qiPan2[i][k] == player.getColor() && k < 16){
						scores1[i][j]++;
						k++;
					}	
				}		
				int m = j - 1;
                if(m > 0){
                	while (qiPan2[i][m] == player.getColor() && m > 0){
    					scores1[i][j]++;
    					m--;
    				}	
				}
		    }	
		}
		  for (int i = 1; i < 16 ; i ++){
			  for (int j = 1 ; j < 16 ; j ++){	
				int k = i + 1;
				if(k < 16){
					while (qiPan2[k][j] == player.getColor() && k< 16){
						scores2[i][j]++;
						k++;
					}
					
				}
				
				int m = i - 1;
				if (m > 0){
					while (qiPan2[m][j] == player.getColor() && m > 0){
						scores2[i][j]++;
						m--;
					}	
				}
		    }
		}
		  for (int i = 1; i < 16 ; i ++){
			  for (int j = 1 ; j < 16 ; j ++){	
				int k = i + 1;int m = j + 1;
				if(k < 16 && m < 16){
					while (qiPan2[k][m] == player.getColor() && k< 16 && j < 16){
						scores3[i][j]++;
						k++;
						m++;
					}	
				}
				k = i -1 ; m = j - 1;
				if(k > 0 && m > 0 ){
					while (qiPan2[k][m] == player.getColor() && m > 0 && j > 0){
						scores3[i][j]++;
						m--;
						k--;
					}
				}	
		    }	
		}
		  for (int i = 1; i < 16 ; i ++){
			  for (int j = 1 ; j < 16 ; j ++){	
				int k = i + 1;int m = j - 1;
				if(k < 16 && m> 0){
					while (qiPan2[k][m] == player.getColor() && k< 16 && j > 0){
						scores4[i][j]++;
						k++;
						m--;
					}
				}
				
				k = i -1 ; m = j + 1;
				if (k > 0 && m< 16){
					while (qiPan2[k][m] == player.getColor() && m > 0 && j < 16){
						scores4[i][j]++;
						m++;
						k--;
					}	
				}
				
		    }
		}
		  for (int i = 1; i < 16 ; i ++){
			  for (int j = 1 ; j < 16 ; j ++){	
				  scores[i][j] = maxScores(scores1[i][j] , scores2[i][j] ,scores3[i][j] ,scores4[i][j]);
			  }
			  }
		  for (int i = 1; i < 16 ; i ++){
			  for (int j = 1 ; j < 16 ; j ++){	
				  if(!qiPan.unOccupied(QiZi.NewQiZi(i, j, player.getColor()))){scores[i][j] = 0;}
			  }
			 }
		
		return scores;
	}
	public int[][] scores(QiPan qiPan, AI AI, Player player){
		int[][] scores = new int[16][16];
		for (int i = 1 ;i < 16; i ++){
			for (int j = 1 ; j< 16 ; j ++){
				scores[i][j] = AI.scoresAI(qiPan, AI)[i][j] + AI.scoresPlayer(qiPan, player)[i][j];
			}
		}
		
		return scores;
	}
	
	public String creatOrder(QiPan qiPan, AI AI, Player player){
		int [][] scores = AI.scores(qiPan, AI, player);
		int max = scores[1][1];
		int [][] defend  = AI.scores(qiPan, AI, player);
		java.util.ArrayList order1 = new java.util.ArrayList();
		java.util.ArrayList order2 = new java.util.ArrayList();
		java.util.ArrayList order3 = new java.util.ArrayList();
		for(int i = 1 ; i < 16 ; i ++){
			for (int j = 1 ; j < 16 ; j ++){
				if (scores[i][j] > max)
					max = scores[i][j];
			}
		}
		for(int i = 1 ; i < 16 ; i ++){
			for (int j = 1 ; j < 16 ; j ++){
				if (defend[i][j] == 4){
					order1.add(AI.convertOrder(i, j));
				}
				if (defend[i][j] == 3){
					order2.add(AI.convertOrder(i, j));
				}
				if(scores[i][j] == max){
						order3.add(AI.convertOrder(i, j));
				}
			}
		}
		if(order1.size()!= 0)return String.valueOf(order1.get((int)(order1.size()*Math.random())));
		else if(order2.size()!= 0)return String.valueOf(order2.get((int)(order2.size()*Math.random())));
		else{return String.valueOf(order3.get((int)(order3.size()*Math.random())));	}
	}
	
	public  String convertOrder(int i ,int j){
		String order;
		order = String.valueOf(i) + String.valueOf((char)('A'+ j -1));
		return order;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
