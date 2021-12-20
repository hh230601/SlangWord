import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

    static HashMap<String,String> hashMap = new HashMap<String,String>();
    static ArrayList<Slang> reset = new ArrayList<Slang>();
    static ArrayList<Slang> list = new ArrayList<Slang>();
    static ArrayList<String> history = new ArrayList<String>();
    static Scanner scan = new Scanner(System.in);

    // Read Slang Word from file
    public static void ReadSlang(String filename) throws IOException{
        list.clear();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = null;
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
                if(set.getKey()==slangword){
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

    // Store History
    public static void StoreSlang(String slang){
        history.add(slang);
    }

    // Edit Slang
    public static void EditSlang(Slang edit){
        if(hashMap.containsKey(edit.getSlang()))
            hashMap.replace(edit.getSlang(),edit.getMeaning());
        for(Slang i : list)
            if(i.getSlang() == edit.getSlang()) {
                i.setMeaning(edit.getMeaning());
                break;
            }
    }

    // Add Slang
    public static void AddSlang(Slang add){
        for (Map.Entry<String, String> set :
                hashMap.entrySet()) {
            if(set.getKey() == add.getSlang()){
                System.out.print("This slang has been in file, do you want to duplicate or new ");
                String s = scan.nextLine();
                if(s == "d"){
                    String slang = add.getSlang() + "_1";
                    add.setSlang(slang);
                }
                else
                    EditSlang(add);
                break;
            }
            else{
                hashMap.put(add.getSlang(), add.getMeaning());
                list.add(add);
            }
        }

    }

    // Remove
    public static void RemoveSlang(Slang remove){
        list.remove(remove);
        hashMap.remove(remove.getSlang(),remove.getMeaning());
    }

    // Reset
    public static void ResetSlang(){
        list.clear();
        list = new ArrayList<Slang>(reset);
    }

    // Random
    public static String RandomSlang(){
        int index = new Random().nextInt(list.size());
        return list.get(index).getSlang();
    }

    //public static void main(String[] args) throws IOException {

      //  ReadSlang("D:\\slang.txt");
        //System.out.print("Enter slang word: ");
        //String slangword = scan.nextLine();
        //String result = SearchSlangWord(list,slangword);
        //if(result == null)
        //    System.out.println("Slang word doesn't exist !");
        //else
        //    System.out.println("Meaning of "+ slangword + " is " + result);
      //  System.out.print("Enter meaning: ");
      //  String meaning = scan.nextLine();
      //  ArrayList<String> slanglist = SearchMeaning(meaning);
      //  if(slanglist.size() == 0)
      //      System.out.println("Meaning doesn't exist !");
      //  else{
      //      System.out.println("Slang word");
      //      for(String i : slanglist)
      //          System.out.println(i);
      //  }
   // }
}
