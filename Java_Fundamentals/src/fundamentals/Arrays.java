package fundamentals;

public class Arrays {

	public static void main(String[] args) {
		
		//browser url username password
		
		/*
		String browserName = "Chrome";
		String url = "https://www.youtube.com";
		String userName = "smartclassroom111201@gmail.com";
		String password = "**********";
		*/
		
		String[] youtubeData = new String[4];
		youtubeData[0]="Chrome";
		youtubeData[1]="https://www.youtube.com";
		youtubeData[2]="smartclassroom111201@gmail.com";
		youtubeData[3]="*********";
		
		System.out.println("First Value of Array:"+youtubeData[0]);
		
		// arrayname.length
		System.out.println(youtubeData.length);
		
		//printing array elements using for loop
		for(int i=0;i<youtubeData.length;i++) {
			System.out.println(youtubeData[i]);
		}
		
		System.out.println("---------------------------");
		//printing array elements using for each loop
		
		for(String element:youtubeData) {
			System.out.println(element);
		}
		
	}

}
