package homework5;

public class TestStopWatch {
	 public static void main(String[] args) {
		 	StopWatch stopWatch = new StopWatch();
		 	stopWatch.start();
	        Hanoi hanoi = new Hanoi();
	        hanoi.hanoi(20, 'A', 'B', 'C');
	        stopWatch.stop();
	        System.out.println(stopWatch.getElapsedTime());
	    }
}

class Hanoi {
   /**
   * 
   * @param n ���ӵ���Ŀ
   * @param origin Դ��
   * @param assist ������
   * @param destination Ŀ����
   */
   public void hanoi(int n, char origin, char assist, char destination) {
       if (n == 1) {
           move(origin, destination);
       } else {
           hanoi(n - 1, origin, destination, assist);
           move(origin, destination);
           hanoi(n - 1, assist, origin, destination);
       }
   }
   // Print the route of the movement
   private void move(char origin, char destination) {
       System.out.println("Direction:" + origin + "--->" + destination);
   }
}