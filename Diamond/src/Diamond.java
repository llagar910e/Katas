public class Diamond {
    private int nbLetters = 0;
    private final char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public int getIndex(char letter) {
        int indexAlphabetReel = 0;
        while (Character.toUpperCase(letter) != alphabet[indexAlphabetReel]) indexAlphabetReel++;
        indexAlphabetReel += 1;
        return indexAlphabetReel;
    }

    public String writeDiamond(int indexAlphabetReel, char letter) {
        int nbSpaceBefore = 0;
        int nbSpaceMiddle = 0;
        String diamondUp = "";
        String diamondDown = "";
        String diamondFull = "";

        if (letter == 'A') diamondFull += letter;
        else {
            nbSpaceBefore = indexAlphabetReel - 1;
            nbSpaceMiddle = 1;
            for (int j = 0; j < nbSpaceBefore; j++) {
                diamondUp += ' ';
                diamondDown += ' ';
            }
            diamondUp += 'A' + "\n";
            diamondDown += 'A';

            for (int i = 1; i < indexAlphabetReel; i++) {
                if (alphabet[i] != letter) diamondDown = "\n" + diamondDown;

                //ESPACES AVANT HAUT
                for (int j = 0; j < nbSpaceBefore - 1; j++) {
                    diamondUp += ' ';
                }

                //LETTRE HAUT BAS
                diamondUp += alphabet[i];
                if (alphabet[i] != letter) diamondDown = alphabet[i] + diamondDown;

                //ESPACES MILIEU
                for (int j = 0; j < nbSpaceMiddle; j++) {
                    diamondUp += ' ';
                    if (alphabet[i] != letter) diamondDown = ' ' + diamondDown;
                }

                //LETTRE HAUT BAS
                diamondUp += alphabet[i] + "\n";
                if (alphabet[i] != letter) diamondDown = alphabet[i] + diamondDown;

                //ESPACE AVANT BAS
                for (int j = 0; j < nbSpaceBefore - 1; j++) {
                    if (alphabet[i] != letter) diamondDown = ' ' + diamondDown;
                }

                nbSpaceBefore--;
                nbSpaceMiddle += 2;
            }
            diamondFull = diamondUp + diamondDown;
        }

        return (diamondFull);
    }

}
