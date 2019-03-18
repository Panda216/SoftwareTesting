package cn.tjuscs.st;

public class Lab1 {
	int money[] = {50, 20, 5, 1};
	int count[] = {1, 1, 2, 3};
	int most = 83;//最大金额
	public boolean sum(int amount) {
		if (amount > most || amount < 0) return false;
		
		//res[i][j] = n  用i种面值的纸币的凑j的方法有n种
		int[][] res = new int[money.length+1][amount+1];
		for (int i = 0; i < money.length; i++) res[i][0] = 1;
		for (int i = 1; i <= amount; i++) {
			if ((i%money[0] == 0) && (i/money[0] <= count[0])) {//只用第一种钱币就可以表示，并且数量够用
				res[1][i] = 1;
			} else {
				res[1][i] = 0;
			}
		}
		for (int i = 2; i <= money.length; i++) {//每种硬币
			for (int j = 1; j <= amount; j++) {//每种金额
				for(int k = 0; k <= count[i-1]; k++) {
					if (k*money[i-1] > j) break;
					res[i][j] += res[i-1][j-k*money[i-1]];
				}
				
			}
		}
		
		if (res[money.length][amount] > 0) {
			return true;
		} else {
			return false;
		}
	}

}
