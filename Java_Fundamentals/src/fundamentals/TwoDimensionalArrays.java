package fundamentals;

public class TwoDimensionalArrays {

	public static void main(String[] args) {
		Object[][] info = new Object[2][4];
		
		//first set of data
		info[0][0]="Chrome";
		info[0][1]="https://www.youtube.com";
		info[0][2]="smartclassroom111201@gmail.com";
		info[0][3]="Test";
		
		//second set of data
		info[1][0]="Mozilla";
		info[1][1]="https://www.youtube.com";
		info[1][2]="roshan.pattnaik9@gmail.com";
		info[1][3]="Test";
		
		int rowNum=info.length;
		int colNum=info[0].length;
		
		//retrieve the data
		
		for(int row=0;row<rowNum;row++) {
			for(int col=0;col<colNum;col++) {
				System.out.println(info[row][col]);
			}
			System.out.println("--------------------");
		}
		
		
		
	}

}
