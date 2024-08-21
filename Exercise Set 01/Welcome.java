public class Welcome {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to CS 211: Object-oriented Programming!");
        System.out.print("Enter your name: ");

        StringBuilder name = new StringBuilder();
        int ch;
        
        while ((ch = System.in.read()) != '\n') {
            name.append((char) ch);
        }

        System.out.println("This course will be fun, " + name.toString().trim() + "!");
    }
}