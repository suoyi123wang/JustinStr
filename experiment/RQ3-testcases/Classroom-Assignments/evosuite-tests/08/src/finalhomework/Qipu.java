package finalhomework;

public class Qipu {
	int[][] qipuArray = new int[225][3];

	public void addStone(Stone stone, String info) {
		String s = info.split("-")[0];
		String s1 = info.split("-")[1];
		int i = Integer.parseInt(s);
		this.qipuArray[i][0] = stone.getX();
		this.qipuArray[i][1] = stone.getY();
		if (s1.equals("1")) {
			this.qipuArray[i][2] = 1;
		}
	}

	public void regret(int count) {
		qipuArray[count - 1][0] = 0;
		qipuArray[count - 1][1] = 0;
		qipuArray[count - 2][0] = 0;
		qipuArray[count - 2][1] = 0;
	}

	public int[][] lastStone(int count) {
		int[][] a = { { qipuArray[count - 1][0], qipuArray[count - 1][1] },
				{ qipuArray[count - 2][0], qipuArray[count - 2][1] } };
		return a;
	}

	public void cancel(int count){
		qipuArray[count - 1][0] = 0;
		qipuArray[count - 1][1] = 0;
		qipuArray[count - 1][2] = 0;
		
	}

}
