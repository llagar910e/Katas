public class main {

    public static void main(String[] args){
        int nbLetters = 0;
        final char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        Diamond diamond = new Diamond();
        System.out.println(diamond.writeDiamond(diamond.getIndex('E'), 'E'));
    }
}
