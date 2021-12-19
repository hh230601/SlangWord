import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {



    // Read Slang Word from file
    public static void ReadSlang(String filename, ArrayList<Slang> list) throws IOException{
        list.clear();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = null;
        // Read line from input.txt file
        while ((line = reader.readLine()) != null) {
            // Solve the string
            String[] info = line.split("`");
            Slang a = new Slang(info[0], info[1]);
            list.add(a);
        }
        reader.close();
    }

    // Search slang word
    public static String SearchSlangWord(ArrayList<Slang> list, String slangword) {
        for (Slang i : list) {
            if (i.getSlang().equalsIgnoreCase(slangword))
                return i.getMeaning();
        }
        return null;
    }

    // Search meaning
    public static ArrayList<String> SearchMeaning(ArrayList<Slang> list, String meaning){
       ArrayList<String> slang = new ArrayList<String>();
        for (Slang i : list) {
            if (i.getMeaning().contains(meaning))
                slang.add(i.getSlang());
        }
        return slang;
    }

    //
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        ArrayList<Slang> list  = new ArrayList<Slang>();
        ReadSlang("D:\\slang.txt",list);
        //System.out.print("Enter slang word: ");
        //String slangword = scan.nextLine();
        //String result = SearchSlangWord(list,slangword);
        //if(result == null)
        //    System.out.println("Slang word doesn't exist !");
        //else
        //    System.out.println("Meaning of "+ slangword + " is " + result);
        System.out.print("Enter meaning: ");
        String meaning = scan.nextLine();
        ArrayList<String> slanglist = SearchMeaning(list,meaning);
        if(slanglist.size() == 0)
            System.out.println("Meaning doesn't exist !");
        else{
            System.out.println("Slang word");
            for(String i : slanglist)
                System.out.println(i);
        }
    }
}
