package homework5;
import java.util.Date;

public class exercise9_3 {
	 
		public static void main(String[] args){
			Date date = new Date();
			for(int i = 0; i < 8; i++){
				long time = 10000 * (long)(Math.pow(10, i));
				date.setTime(time);
				System.out.println(date.toString());
			}
		}
	}


