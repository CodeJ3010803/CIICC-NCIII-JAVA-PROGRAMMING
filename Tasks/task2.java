package Tasks;

public class task2 { // Changed 'Task2' to 'task2' to match the filename
    public static void main(String[] args) {
        char h = 'H';
        int three = 3;
        char l = 'l';
        byte zero = 0;       
        short spaceChar = 32; 
        char space = (char) spaceChar;
        char w = 'w';
        char r = 'r';
        char d = 'd';
        float version = 2.0f;
        boolean flag = true;
     
        String output = "" + h + three + l + l + zero + space 
                           + w + zero + r + l + d + space 
                           + version + space + flag;

        System.out.println(output);
        // Prints: H3ll0 w0rld 2.0 true
    }
}
