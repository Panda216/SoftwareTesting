package cn.tjuscs.st;

public class Lab1 {
	int money[] = {50, 20, 5, 1};
	int count[] = {1, 1, 2, 3};
	int most = 83;//�����
	public boolean sum(int amount) {
		if (amount > most || amount < 0) return false;
		
		//res[i][j] = n  ��i����ֵ��ֽ�ҵĴ�j�ķ�����n��
		int[][] res = new int[money.length+1][amount+1];
		for (int i = 0; i < money.length; i++) res[i][0] = 1;
		for (int i = 1; i <= amount; i++) {
			if ((i%money[0] == 0) && (i/money[0] <= count[0])) {//ֻ�õ�һ��Ǯ�ҾͿ��Ա�ʾ��������������
				res[1][i] = 1;
			} else {
				res[1][i] = 0;
			}
		}
		for (int i = 2; i <= money.length; i++) {//ÿ��Ӳ��
			for (int j = 1; j <= amount; j++) {//ÿ�ֽ��
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
