
//Find the smallest and longest palindrome of word in a given string?

public class smallestAndBiggestPalin {
    static  boolean checkPalin(String word)
    {
        int n=word.length();
        word=word.toLowerCase();
        for(int i=0;i<n;i++,n--)
        {
            if(word.charAt(i)!=word.charAt(n-1))
                return false;
        }
        return true;
    }
    static void palinDrome(String word[])
    {
        int count=0;
        String smallest="",longest="";
        for(int i=0;i<word.length;i++)
        {
            if(checkPalin(word[i]))
            {
                count++;
                if(count==1)
                    smallest=longest=word[i];

                else
                    if(word[i].length()<smallest.length())
                        smallest=word[i];

                    if(word[i].length()>longest.length())
                        longest=word[i];
            }
        }
        if(count==0)
            System.out.println("No palindrome found");
        else
        {
            System.out.println("Smallest palindrome= " + smallest);
            System.out.println("Longest Palindrome= " +longest);
        }
    }
    public static void main(String[] args) {
        String s="Wow Madam is driving racecar";
        String word[]=s.split(" ");
        palinDrome(word);
    }

}
