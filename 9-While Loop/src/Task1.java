
public class Task1 {


	public static void main(String[] args) {
		
		System.out.println(sumDigits(123));
		System.out.println(sumDigits(-125));
		System.out.println(sumDigits(32125));
		System.out.println(sumDigits(3780));
		System.out.println(sumDigits(7));
		
	}
	
	public static int sumDigits(int number) {
		
		if(number<10) {
			return -1;
		}
		int sum=0;
		while(number>0) {
			int digit=number%10;  //125%10 = 5    //12%10=2    //1%10=1
			sum=sum+digit;        //0+5=5         //5+2=7      //7+1=8
			number=number/10;     //125/10=12     //12/10=1    //1/10=0
		}
		return sum;
	}

}