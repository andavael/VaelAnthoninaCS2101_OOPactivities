public class Tempconvert {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter a Celsius value: ");
        StringBuilder input = new StringBuilder();
        int ch;
        while ((ch = System.in.read()) != '\n') {
            input.append((char) ch);
        }
        
        double celsius = Double.parseDouble(input.toString().trim());
        double fahrenheit = (celsius * 9/5) + 32;
        
        System.out.printf("%.2f Celsius is %.2f Fahrenheit\n", celsius, fahrenheit);
    }
}