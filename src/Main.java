import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

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

    public static void main(String[] args) throws IOException {
        ArrayList<Slang> list  = new ArrayList<Slang>();
        ReadSlang("D:\\slang.txt",list);
        for(Slang i : list){
            System.out.println(i.getSlang()  + " " + i.getMeaning());
        }
    }
}
