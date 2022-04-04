import java.util.*;

class IsPalindrome{
	public static void main(String[] args) {
		Scanner number=new Scanner(System.in);//this scans the entered number
		binaria bnobj=new binaria();

		int num;//variable declaration
		String bin;
		System.out.println("Please!, enter any decimal number to check?."); // output message to enter new number
		num=number.nextInt();//accepting the number enterd
		bin=bnobj.binator(num);
		String reversed=bnobj.reversor(bin); 
      System.out.println(" The number "+num+" to binary is "+bin);
      System.out.println(" The reversed value is "+reversed);
      // we are going to check if it is the palindrom or not
		if (bin.equals(reversed)) {
			
		System.out.println(" The reversed binary value of  "+num+" is a Palindrome");
		}
		else{
			System.out.println(" The reversed binary value of  "+num+" is not a Palindrome");


	}
}
}
 
 class binaria{
 	public String binator(int number1){
 		return Integer.toBinaryString(number1);
 	}
 	public String reversor(String rev){

		StringBuilder stb=new StringBuilder(rev);
		stb.reverse();
		return stb.toString();
 	}                                                                                                         
 }