package hw4;

public class TestPerformance {
	public static void main(String []args) {
		
		int[][]score = {
			{1, 2, 3, 4, 5, 6, 7, 8,} ,
			{10, 35, 40, 100, 90, 85, 75, 70},
			{37, 75, 77, 89, 64, 75, 70, 95} ,
			{100, 70, 79, 90, 75, 70, 79, 90},
			{77, 95, 70, 89, 60, 75, 85, 89} ,
			{98, 70, 89, 90, 75, 90, 89, 90},
			{90, 80, 100, 75, 50, 20, 99, 75}};
		
		int[] count = new int[8];
		for(int q = 0; q < count.length; q++) {
			count[q] = 0;
		}
		
		
		int student = 0;
		for(int i= 1; i < score.length; i++ ) {
			int maxScore = score[i][0]; 
			for(int j = 0; j < score[i].length; j++) {
				if(j == 0) {
					student = j;
					continue;
				}
				else if(maxScore < score[i][j]) {
					maxScore = score[i][j];
					student = j;
				}
			}
			count[student]++;
		}
		
		
		for(int r = 0; r < count.length; r++) {
			System.out.println(r+1+"號同學考最高分的次數為"+count[r]+"次");
		}
		
	}

}
