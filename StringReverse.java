
import java.io.*;                                                                             	//need this library for the input of the given string

public class StringReverse
{
    public static void main(String[] args) throws IOException
    {
    	int len;                                                                              	//variable to save the length of the string

        BufferedReader ConsoleInput = new BufferedReader(new InputStreamReader(System.in));   	//new element for reading the given input string
        System.out.println("Please write the input string:");                                 	//output in the console
        String inputString = ConsoleInput.readLine();                                         	//read the written sentence and save it in a string
        len = inputString.length();                                                           	//get the length of the given string
        char[] ReverseChar = new char[len];                                                   	//create a character array with the same length as the given string

        for (int i = len - 1, j = len , m = 0 ; i >= 0 ; i--)                              		//loop to check each character if it is a space
        {                                                                                   	//i is the index to go backwards through the input string
                                                                                     			//j is the index to know the last character of the actual word (the last space or the end of the string)
                                                                                				//m is the index to go forward through the reverse string
                                                                                                                                                                             
            char c = inputString.charAt(i);                                            			//get a single character from the string
            if (c == ' ')                                                                       //check if a word is over by checking if c is a space
            {
                for(int k = i + 1; k < j ; k++) 	                                            //loop from the recognized space to the next space or to the end
                {                                                                                                                                                                                                                         
                    ReverseChar[m] = inputString.charAt(k);                                     //write the recognized word character by character in the reverse string
                    m++;
                }
                ReverseChar[m] = ' ';                                                         	//need a space between the words in the reverse string
                m++;
                j = i;                                                                          //save the last space to know how long the next word is
            }
            else if (i == 0)                                                                    //check if it is the first letter of the string
            {                                                                                   //so the last word for the reverse string is over
                for(int k = i; k < j ; k++)                                                     //loop from the first character to the next space or to the end
                {
                    ReverseChar[m] = inputString.charAt(k);                                     //write the recognized word character by character in the reverse string
                    m++;
                }
            }
        }
        String ReverseString = new String(ReverseChar);                                         //convert the character array to a string
        System.out.println("Original string: " + inputString);                                  //print the original and the input string
        System.out.println("Reverse string: " + ReverseString);                                      
    }
}

 