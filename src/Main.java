
public class Main {
    public static void main(String[] args) {

        Encrypt e1 = new Encrypt();

        e1.initializeAlphabet();

        e1.shiftCipher("Tunc ay",16);
//        e1.encShiftCipher("Jkdsqo");

        e1.affineCipher("Tuncay Celikkanat");
        e1.encAffineCipher("Zevsiy Sclwggiviz", 5, 8);

    }
    public static int modInverse(int num) {

        num = num % 26;
        for (int i = 1; i < 26; i++) {

            if ((num * i) % 26 == 1) {
                return i;
            }
        }
        return 1;
    }
}
