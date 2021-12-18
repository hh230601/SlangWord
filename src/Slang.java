

public class Slang {
    String slang;
    String meaning;

    public Slang(){
        this.slang = null;
        this.meaning = null;
    }

    public Slang(String slang, String meaning) {
        this.slang = slang;
        this.meaning = meaning;
    }

    public Slang(Slang a){
        this.slang = a.slang;
        this.meaning = a.meaning;
    }

    public String getSlang() {
        return slang;
    }

    public void setSlang(String slang) {
        this.slang = slang;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }
}
