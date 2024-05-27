
public class Main {
    public static void main(String[] args) {

        Encrypt e1 = new Encrypt();

        e1.initializeAlphabet();
//
//        e1.shiftCipher("Tuncay",16);
//        e1.encShiftCipher("Jkdsqo");
//
//        System.out.println(modInverse(5));
//
        e1.affineCipher("rv");
        e1.encAffineCipher("pj", 5, 8);

        e1.findKeysForAffine("ug","em");

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
