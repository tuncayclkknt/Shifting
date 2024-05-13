import java.util.ArrayList;

public class Encrypt {

    public ArrayList<Character> alphabet = new ArrayList<>();
    public ArrayList<Character> ALPHABET = new ArrayList<>();

    public void initializeAlphabet() {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            alphabet.add(ch);
        }
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            ALPHABET.add(ch);
        }
    }

    public void encShiftCipher(String message) {

        char a;
        for (int j = 1; j < 26; j++) {
            System.out.print("The message for shift is " + j + ": ");
            for (int i = 0; i < message.length(); i++) {
                a = message.charAt(i);

                if (alphabet.contains(a)) {
                    a = alphabet.get(((alphabet.indexOf(a) - j) + 26) % 26);
                    System.out.print(a);

                } else {

                    if (message.charAt(i) == ' ')
                        System.out.print(" ");
                    a = ALPHABET.get(((ALPHABET.indexOf(a) - j) + 26) % 26);
                    System.out.print(a);
                }
            }
            System.out.println();
        }
    }


    public void shiftCipher(String message,int shifting){

        System.out.print("Shift cipher enc. message: ");

        for (int i = 0; i < message.length(); i++) {

            char yeniH = ' ';
            if (alphabet.contains(message.charAt(i))) {
                int eskiHI = alphabet.indexOf(message.charAt(i));
                yeniH = alphabet.get(((eskiHI + shifting) + 26) % 26);

            } else {
                int eskiHI = ALPHABET.indexOf(message.charAt(i));
                if (message.charAt(i) != ' ') {
                    yeniH = ALPHABET.get(((eskiHI + shifting) + 26) % 26);
                }
            }
            System.out.print(yeniH);
        }
        System.out.println();
    }

    public void affineCipher(String message){
        // E(x) = (ax + b) mod m
        // m=26, a=5(key1), b=8(key2)
        System.out.print("Affine cipher enc. message: ");
        for (int i = 0; i < message.length(); i++) {
            char yeniH = ' ';

            if (alphabet.contains(message.charAt(i))) {

                int eskiHI = alphabet.indexOf(message.charAt(i));
                yeniH = alphabet.get(((eskiHI * 5 + 8) + 26) % 26);

            }else{
                int eskiHI = ALPHABET.indexOf(message.charAt(i));
                if (message.charAt(i) != ' ') {
                    yeniH = ALPHABET.get(((eskiHI * 5 + 8) + 26) % 26);
                }
            }
            System.out.print(yeniH);
        }
        System.out.println();
    }

    public void encAffineCipher(String message, int key1, int key2){

        System.out.print("Çözümlenmii affice cipher message: ");
        for (int i = 0; i < message.length(); i++) {
            char yeniH;
            if (alphabet.contains(message.charAt(i))) {
                int eskiHI = alphabet.indexOf(message.charAt(i));
                yeniH = alphabet.get((Main.modInverse(key1) * ((eskiHI - key2) + 26)) % 26);
                System.out.print(yeniH);
            }else{
                if (message.charAt(i) == ' ')
                    System.out.print(" ");
                else {
                    int eskiHI = ALPHABET.indexOf(message.charAt(i));
                    yeniH = ALPHABET.get((Main.modInverse(key1) * ((eskiHI - key2) + 26)) % 26);
                    System.out.print(yeniH);
                }
            }
        }
    }
}
