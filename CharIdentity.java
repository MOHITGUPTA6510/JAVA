public class CharIdentity{
    public static void main(String[] args){
        // Char should be always in single quotes
        char letter = 'A';
        
        int asciiCode = letter;
        System.out.println("the charecter is : " + letter);
        System.out.println("the ASCII code is : " + asciiCode);
        
        char nextletter = (char) (letter + 1);
        System.out.println("A + 1 = " + nextletter);
    }
}