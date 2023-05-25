import java.util.Arrays;




public class Anagram {
    public static void main(String [] args)
    {

    //  String str1="School Master";
    //  String str2="The Classroom java";
    String str1="keep";
    String str2="peek";

    //  str1=str1.replace(" ","");
    //  str2=str2.replace(" ","");

     //str1=str1.toLowerCase();
     //str2=str2.toLowerCase();

     char[] ar1=str1.toCharArray();
     char[] ar2=str2.toCharArray();

     Arrays.sort(ar1);
     Arrays.sort(ar2);

     if(Arrays.equals(ar1,ar2))
     {
        System.out.println("it is an anagram");

     }
     else
{
    System.out.println("it is not an anagram");
}
     }

    }



