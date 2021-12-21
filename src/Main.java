import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

    static HashMap<String,String> hashMap = new HashMap<String,String>();
    static ArrayList<Slang> reset = new ArrayList<Slang>();
    static ArrayList<Slang> list = new ArrayList<Slang>();
    static Scanner scan = new Scanner(System.in);

    // Read Slang Word from file
    public static void ReadSlang(String filename) throws IOException{
        list.clear();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = reader.readLine();
        // Read line from input.txt file
        while ((line = reader.readLine()) != null) {
            // Solve the string
            String[] info = line.split("`");
            Slang a = new Slang(info[0], info[1]);
            hashMap.put(info[0],info[1]);
            list.add(a);
            reset.add(a);
        }
        reader.close();
    }

    // Search Slang word
    public static String SearchSlangWord(String slangword) {
        for (Map.Entry<String, String> set :
                hashMap.entrySet()) {
                if(set.getKey().equalsIgnoreCase(slangword)){
                    return set.getValue();
                }
        }
        return null;
    }

    // Search Meaning
    public static ArrayList<String> SearchMeaning(String input){
       ArrayList<String> slang = new ArrayList<String>();
        for (Map.Entry<String, String> set :
                hashMap.entrySet()) {
            if(set.getValue().contains(input)){
               slang.add(set.getKey());
            }
        }
        return slang;
    }

    // Edit Slang
    public static void EditSlang(Slang edit){
        if(hashMap.containsKey(edit.getSlang()))
            hashMap.replace(edit.getSlang(),edit.getMeaning());
        for(Slang i : list)
            if(i.getSlang().equalsIgnoreCase(edit.getSlang())) {
                i.setMeaning(edit.getMeaning());
                break;
            }
    }

    // Check exist
    public static boolean CheckSlang(Slang a)
    {
        for (Map.Entry<String, String> set : hashMap.entrySet()) {
            if (set.getKey().equalsIgnoreCase(a.getSlang()))
                return true;
        }
        return false;
    }
    // Add Slang
    public static void AddSlang(Slang add){
        list.add(add);
        hashMap.put(add.getSlang(),add.getMeaning());
    }

    // Remove
    public static void RemoveSlang(Slang remove){
        if(CheckSlang(remove) == false)
            return;
        int i = 0;
        while(i < list.size()){
            if(list.get(i).getSlang().equalsIgnoreCase(remove.getSlang()))
                break;
            else
                i++;
        }
        list.remove(i);
        hashMap.remove(remove.getSlang(),remove.getMeaning());
    }

    // Reset
    public static void ResetSlang() throws  IOException{
        ReadSlang("D:\\slang.txt");
    }

    // Random
    public static String RandomSlang(){
        int index = new Random().nextInt(list.size());
        return list.get(index).getSlang();
    }

    public static ArrayList<Slang> GetSlangList(){
        return list;
    }
    public static void main(String[] args) throws IOException {

        ReadSlang("D:\\slang.txt");
        System.out.print("Enter slang word: ");
        String slangword = scan.nextLine();
        //String result = SearchSlangWord(list,slangword);
        //if(result == null)
        //    System.out.println("Slang word doesn't exist !");
        //else
        //    System.out.println("Meaning of "+ slangword + " is " + result);
        System.out.print("Enter meaning: ");
        String meaning = scan.nextLine();
      //  ArrayList<String> slanglist = SearchMeaning(meaning);
      //  if(slanglist.size() == 0)
      //      System.out.println("Meaning doesn't exist !");
      //  else{
      //      System.out.println("Slang word");
      //      for(String i : slanglist)
      //          System.out.println(i);
      //  }
        Slang a = new Slang(slangword,meaning);
        AddSlang(a);
        System.out.println(list.get(0).getMeaning());
    }
}
