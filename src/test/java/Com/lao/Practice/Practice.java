package Com.lao.Practice;

import io.basc.framework.env.Sys;

import java.util.*;

public class Practice {

    public static String Name = "Haripriya";
    public static int NameLength = Name.length();

    public static String Reversestring() {
        System.out.println(Practice.NameLength);

        String Reversename = "";

        char ch[] = Name.toCharArray();

        for (int i = ch.length - 1; i >= 0; i--) {

            Reversename = Reversename + ch[i];

        }
        System.out.println(Reversename);
       // return Reversename;

        char a[] = "Haripriya".toCharArray();
        String Revsting ="";

        for(int i= a.length-1; i>=0;i--){

            Revsting += a[i];

        }
        System.out.println("Reversedname:"+Revsting);
        return Revsting;

    }

public static void Reversesentence(){
        String Reversesentence="";
        String RSentence = "Today is Saturday";
        String RSentence1[]= RSentence.split(" ");
        for(int i=RSentence1.length-1; i>=0;i--){

            Reversesentence += RSentence1[i] + " ";
        }
      System.out.println("ReversedString:"+Reversesentence);
}


public static void Reverseeachword(){
        String Reverse = "Today is Saturday";
        String Rv[] = Reverse.split(" ");
       String Reverseeachword ="";

        for(int i=Rv.length-1; i>=0;i--){

            char ch[] = Rv[i].toCharArray();
            for(int j=ch.length-1;j>=0;j--){
                Reverseeachword +=ch[j];
            }
        }
        System.out.println(" "+Reverseeachword);
}

public static void reverse(){
        String Reverse1 = "Today is Saturday";
        String Sh[] = Reverse1.split(" ");

        String reversedString1 ="";
        for(int i = 0;i<Sh.length; i++)
        {
            String Words = Sh[i];
            String Word="";
            for(int j = Words.length()-1;j>=0;j--)
            {
                    Word = Word+ Words.charAt(j);
            }
            reversedString1 = reversedString1 + Word + " ";
        }
        System.out.println("word:"+reversedString1);
    }


    public static void reverseWordInMyString()
    {


        String str = "Welcome to BeginnersBook";
        String[] words = str.split(" ");
        String reversedString = "";
        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length()-1; j >= 0; j--)
            {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        System.out.println(str);
        System.out.println(reversedString);
    }


    public static void Inbuiltstringreverse(){
        String Name = "Haripriya";
        StringBuilder Str = new StringBuilder(Name);
        Str.reverse();
        System.out.println(Str);
    }

    public static void reverseeachword(){
        String Words ="My name is Hari";
        String word1 ="";
        String Sh[] = Words.split(" ");
        for( int i= 0; i<=Sh.length-1;i++){
           String Word = Sh[i];
            StringBuilder Str1 = new StringBuilder(Word);
            Str1.reverse();
            word1 +=Str1 + " ";

        }
        System.out.println(word1);
    }

    public static void swaptwonumbers(){
        Scanner in = new Scanner(System.in);
        int x ,y,temp;
        x = in.nextInt();
        y = in.nextInt();
        temp = x;
        x= y ;
        y = temp;
        System.out.println("x:"+x);
        System.out.println("y:"+y);

        int a =10, b=24;
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a:"+a);
        System.out.println("b:"+b);

    }

    public static void countthewords(){
        String words = "This this is is done by Saket Saket";
        String word[]= words.split(" ");
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0; i<= word.length-1;i++){
            if(map.containsKey(word[i])){
                int count = map.get(word[i]);
                map.put(word[i], count+1);
            }else{
                map.put(word[i], 1);
            }

        }
        System.out.println(map);
    }

    public static void primenumber(){

        for(int j=2;j<200;j++)
        {
            int count=0;
            for(int i=1;i<=j;i++)
            {
                if(j%i==0)
                {
                    count++;
                }
            }
            if(count==2)
                System.out.print(j+"  ");
        }
    }

public static void prime(){

        for (int j =2;j<=100; j++){
             int count =0;
             for(int i= 1; i<=j; i++){

                 if(j%i==0){
                     count++;
                 }
             }
             if (count==2){
                 System.out.println(j);
             }



        }
    }

public static void givennumber(){
        int num = 3  ;
        int count =0;
        for(int j=2;j<num/2;j++) {
            if (num % j == 0) {
                System.out.println("no rpint");
                count = 1;
                break;
            }
        }
            if (count==0){
                System.out.println("prime");

        }


}

public static void fibanacci(){
        int a=0,b=0,c=1;
        int num =10;
        for(int i=0;i<=num;i++){
            a=b;
            b=c;
            c=a+b;
            System.out.println(a);

        }
}


public static void list(){

    ArrayList<String> list = new ArrayList<>();
    list.add("Hari");
    list.add("Priya");
    list.add("Corol");

    Iterator it = list.iterator();  {
       while(it.hasNext()){
           System.out.println(it.next());
        }

   }
    for(Object ob : list ){
        System.out.println(ob);
    }

    for (int i=0;i<= list.size()-1; i++){
        System.out.println(list.get(i));
    }
    }

    public static void String(){
        String Str = "Haripriya";
        String stw = new String("dfs");
        char ch = Str.charAt(4);
        char ss = stw.charAt(4);
        System.out.println(ss);


    }

    public static void main(String arg[]){
      //Reversestring();
      //Reversesentence();
      //Reverseeachword();
      //reverse();
      //reverseWordInMyString();
        // Inbuiltstringreverse();
        //reverseeachword();
        //swaptwonumbers();
        //countthewords();
        //prime();

       // givennumber();
       // fibanacci();
       // list();
        String();
    }
}
