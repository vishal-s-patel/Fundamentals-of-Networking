import java.util.Scanner;

/**
 *
 * @author nrs
 */
public class caesarcipher 
{
    public static void main(String[] args)
    {
        
        int choice;
        System.out.println("Enter Message : ");
        Scanner msg = new Scanner(System.in);
        String line = msg.nextLine();
        System.out.println("Enter Shift : ");
        int key = msg.nextInt();
        for(;;)
        {
            System.out.println("--------------------");
	    System.out.println("1.Encryption\n2.Decryption\n3.Exit");
	    System.out.println("enter choice : ");
            choice=msg.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Encrypted message : "+encrypt(line,key));
                    break;
                case 2:
                    System.out.println("Decrypted message : "+decrypt(line,key));
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        }
        
    }
    public static String encrypt(String msg,int key)
    {
        String encrypted="";
        char[] msgToarray = msg.toCharArray();
        for(int i=0;i<msgToarray.length;i++)
        {
			char x=msg.charAt(i);
			if(x >= 'A' && x <= 'Z')
			{
				x=(char)(x+key);
				if(x>'Z')
					x=(char)(x - 'Z' + 'A' - 1);
				encrypted+=x;
			}
			else if(x >= 'a' && x <= 'z')
			{
				x=(char)(x+key);
				if(x>'z')
					x=(char)(x - 'z' + 'a' - 1);
				encrypted+=x;
			}
        }
        return encrypted;
    }
    public static String decrypt(String msg,int key)
    {
        String decrypted="";
		char[] msgToarr = msg.toCharArray();
		for(int i=0;i<msgToarr.length;i++)
		{
			char x=msg.charAt(i);
			if(x >='A' && x <='Z')
			{
				x=(char)(x-key);
				if(x<'A')
					x=(char)(x + 'Z' - 'A' + 1);
				decrypted+=x;
			}
			else if(x >='a' && x <= 'z')
			{
				x=(char)(x-key);
				if(x<'a')
					x=(char)(x + 'z' - 'a' + 1);
				decrypted+=x;
			}
		}
        return decrypted;
    }
}
