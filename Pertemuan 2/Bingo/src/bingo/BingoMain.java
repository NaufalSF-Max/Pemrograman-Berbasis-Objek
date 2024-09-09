package bingo;

public class BingoMain {
    public static void main(String[] args) {
        Bingo bingo1 = new Bingo("B", "I", "N", "G", "O");
        Bingo bingo2 = new Bingo("(clap)", "I", "N", "G", "O");
        Bingo bingo3 = new Bingo("(clap)", "(clap)", "N", "G", "O");
        Bingo bingo4 = new Bingo("(clap)", "(clap)", "(clap)", "G", "O");
        Bingo bingo5 = new Bingo("(clap)", "(clap)", "(clap)", "(clap)", "O");
        Bingo bingo6 = new Bingo("(clap)", "(clap)", "(clap)", "(clap)", "(clap)");
            
        bingo1.lirik();
        bingo2.lirik();
        bingo3.lirik();
        bingo4.lirik();
        bingo5.lirik();
        bingo6.lirik();        
    }
}
