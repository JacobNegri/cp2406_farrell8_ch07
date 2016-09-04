package DebuggingExercises;

/**
 * Created by jc319816 on 4/09/16.
 */
public class CountMovieSpaces
{
    public static void main(String[] args)
    {
        String aString =
                "May the Force be with you";
        int numSpaces = 0;
        int stringLength = aString.length();

        for(int i = 0; i < stringLength; i++)
        {
            char ch = aString.charAt(i);
            if(ch == ' ')
                numSpaces++;
        }
        System.out.println("The number of spaces is " + numSpaces);
    }
}