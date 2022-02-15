
public class Application {
	public static void main(String[] args) {
		int [] values= {1,2,3};
		System.out.println(values[1]);
		
		int[][] table= {
				{4,5,6,7},
				{8,9},
				{100,30,50}
				
		};
		
		System.out.println(table[1][1]);
		System.out.println(table[2][1]);
		
		
		String[][] texts= new String [2][3];
		texts[0][1]="My name is Mohamed Lamin jalloh";
		
		System.out.println(texts[0][1]);
		
		for (int row=0; row<table.length;row++){
			for (int col=0;col<table[row].length;col++) {
				System.out.print(table[row][col]+"\t");
			}
			System.out.println();
		}
	}

}
