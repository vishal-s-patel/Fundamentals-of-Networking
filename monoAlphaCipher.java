import java.util.*;
class monoAlphaCipher
{
	public static void main(String[] args)
	{
		while(true)
		{
			String text="";
			char[] plainText = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
			char[] cipherText = {'Q','W','E','R','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','Z','X','C','V','B','N','M'};
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Text : ");
			text = sc.nextLine();
			String line = text.toUpperCase();
			System.out.println("1.Encryption\n2.Decryption\n3.Exit");
			int ch = sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Encrypt Message : "+encrypt(plainText,cipherText,line));
					break;
				case 2:
					System.out.println("Decrypt Message : "+decrypt(plainText,cipherText,line));
					break;
				case 3:
					System.exit(1);
					break;
				default:
					System.out.println("Invalid choice!");
			}
		}
	}
	public static String encrypt(char[] pText,char[] cText,String msg)
	{
		String cipherText="";
		int[] pos=new int[100];
		int i;
		for(i=0;i<msg.length();i++)
		{
			for(int j=0;j<26;j++)
			{
				char op = pText[j];
				if(msg.charAt(i)==op)
				{
					cipherText+=cText[j];
				}
			}
		}
		return cipherText;
	}
	public static String decrypt(char[] pText,char[] cText,String msg)
	{
		String plainText="";
		int[] pos=new int[100];
		int i;
		for(i=0;i<msg.length();i++)
		{
			for(int j=0;j<26;j++)
			{
				char op = cText[j];
				if(msg.charAt(i)==op)
				{
					plainText+=pText[j];
				}
			}
		}
		return plainText;
	}
}