
public class ConvertNumberToWord {

	private static final String[] strWords= {"","one","two","three","four","five","six","seven","eight","nine","ten"};
	private static final String[] strTwoDigitWords= {"","ten","twenty","thirty","fourty","fifty",
			"sixty","seventy","eighty","ninty","hundred"};	

	
	/*
	 * Below method will print the word of any of the number up to 10 into British english word
	 */
	private static String CovertToWord(long number) {
		String word="";
		try {
			int num = (int)(number % 1000);
			if(num != 0) {
				int numb = num %100;
				word = strWords[numb];
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return word;
	}
	
	/*
	 *  Below method will print any of the number from 20 to 30 British english word
	 */
	private static String ConvertTwoDigitNumberToWord(long number) {
		
		String strTwodigiWord ="";
		try {
			int num = (int)(number % 100);
			if(num != 0) {
				if(num > 10 && num < 31) {
					String strNum = String.valueOf(num);
					int firstNum = Integer.parseInt(strNum.substring(0,1));
					int secondNum = Integer.parseInt(strNum.substring(1,2));
					String strFirstNum=strTwoDigitWords[firstNum];
					String strSecondNum= strWords[secondNum];
					strTwodigiWord = strFirstNum+" "+strSecondNum;
				}
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return strTwodigiWord;
	}
	
	/*
	 * Below method will print any of the number from 101 to 999 into British english word
	 */
	
	private static String ConvertThreeDigitNumberToWord(long number) {
			
			String strThreedigiWord ="";
			try {
				int num = (int)(number % 1000);				
				if(num != 0) {
					if(num > 100 && num < 1000) {
						String strNum = String.valueOf(num);
						int firstNum = Integer.parseInt(strNum.substring(0,1));
						int secondNum = Integer.parseInt(strNum.substring(1,2));
						int thirdNum = Integer.parseInt(strNum.substring(2,3));
						String strFirstNum=strWords[firstNum];
						String strSecondNum= strTwoDigitWords[secondNum];
						String strThirdNum= strWords[thirdNum];
						strThreedigiWord = strFirstNum+" hundred and "+strSecondNum+" "+strThirdNum;
					}
					
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			return strThreedigiWord;
		}
		
	public static void main(String[] args) {
		System.out.println("Number to Word Print::> "+CovertToWord(1));
		System.out.println("Two Digit Number to Word Print::> "+ConvertTwoDigitNumberToWord(21));
		System.out.println("Three Digit Number to Word Print::> "+ConvertThreeDigitNumberToWord(105));

	}

}
