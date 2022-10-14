public class NewFile { 
    
    public int number;
        
    public NewFile() {
        this.number = 5; }

    public int getnumber(){
        return number;
    }

    public static void main(String[] args) {
        NewFile n = new NewFile();
        
        System.out.println(n.getnumber());
    }

}

