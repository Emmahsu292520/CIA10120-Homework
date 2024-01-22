package hw1;

public class hw1_1 {
	public static void main(String[] args){
		//第一題
		int num1=12;
		int num2=6;
		System.out.println(num1*num2);
		
		//第二題
		int num4=200;
		int num5=12;
		System.out.println(num4/num5+"打"+num4%num5+"顆");
		//第三題
		int all=256559;
		int sec=all%60;
		int min=(all-sec)/60%60;
		int hr=(all-sec)/60/60%24;
		int day=(all-sec)/60/60/24;
		System.out.println(day+"天"+hr+"小時"+min+"分"+sec+"秒");
		
		//第4題
		final double P1=3.1415;
		System.out.println(P1*5*5);
		
		//第5題
		int savings=1500000;
		double num10=1+0.02;
		int num11=10;
		double num12=Math.pow(num10, num11);
		double num13=savings*num12;
		//期末本利和＝期初本金×（1＋利率）期數次方
		System.out.println(num13+"元");
		//第6題
		char text1='5';
		String s1="5";
		System.out.println(5+5);
		System.out.println(5+text1);
		System.out.println(5+s1);
		
		//5-1  5+5=10
		/*5-2 text1在ecllipse上顯示為53，而這53是java預設的十進位結果，使用工程計算機換算16進位的話
		 * ，變成35就可以對應到的unicode字元對應unitable表上的數值為"5" */
		//5-3 5加上字串"5"，所以等於55
		
	}
}
