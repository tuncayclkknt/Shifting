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

    public void sifrecoz(String message){

        char a = ' ';
        for (int j = 1; j<=26; j++){
            System.out.print("The message for shift is " + j + ": ");
            for (int i=0; i<message.length(); i++) {
                a = message.charAt(i);

                if (alphabet.contains(a)) {

                    if (message.charAt(i) == ' ') {
                        System.out.print(" ");
                    } else if ((alphabet.indexOf(a) + j) <= 25) {

                        a = alphabet.get(alphabet.indexOf(a) + j);
                        System.out.print(a);
                    } else {
                        a = alphabet.get(alphabet.indexOf(a) + j - 26);
                        System.out.print(a);
                    }
                } else {

                    if (message.charAt(i) == ' ') {
                        System.out.print(" ");
                    } else if ((ALPHABET.indexOf(a) + j) <= 25) {

                        a = ALPHABET.get(ALPHABET.indexOf(a) + j);
                        System.out.print(a);
                    } else {
                        a = ALPHABET.get(ALPHABET.indexOf(a) + j - 26);
                        System.out.print(a);
                    }
                }
            }
            System.out.println();
        }
    }

    public void sifrele(String message, int shifting){

        System.out.print("New message: ");

        for (int i=0; i<message.length(); i++){

            char yeniH = ' ';
            if (alphabet.contains(message.charAt(i))){
                int eskiHI = alphabet.indexOf(message.charAt(i));
                if (message.charAt(i) != ' '){

                    if ((eskiHI - shifting) >= 0 ){
                        yeniH = alphabet.get(eskiHI - shifting);
                    }
                    else{
                        yeniH = alphabet.get(26 + (eskiHI - shifting));
                    }
                }
            }else {

                int eskiHI = ALPHABET.indexOf(message.charAt(i));
                if (message.charAt(i) != ' '){

                    if ((eskiHI - shifting) >= 0 ){
                        yeniH = ALPHABET.get(eskiHI - shifting);
                    }
                    else{
                        yeniH = ALPHABET.get(26 + (eskiHI - shifting));
                    }
                }
            }
            System.out.print(yeniH);
        }
        System.out.println();
    }
}
