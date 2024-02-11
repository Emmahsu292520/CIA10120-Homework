package hw4;

public class EightPlanet {
	public static void main(String []args) {
		String []planet = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus","neptune"};
		int count = 0;

		for(int i =0; i<planet.length; i++) {
			for(int sindex = 0;sindex<planet[i].length();sindex++) {
				if(planet[i].charAt(sindex) == 'a'|| planet[i].charAt(sindex) == 'e' || planet[i].charAt(sindex) == 'i'
				   || planet[i].charAt(sindex) == 'o' || planet[i].charAt(sindex) == 'u') {
					count+= 1;	
				}
			}
		}
		System.out.println("陣列裡共有母音總數"+count);
	
		
		
		
		
	}

}
