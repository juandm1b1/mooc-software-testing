package tudelft.countletters;

public class CountLetters {

    public int count(String str) {
        int words = 0;
        char last = ' ';
        for(int i = 0; i < str.length(); i++) {
            if(!Character.isLetter(str.charAt(i)) &&
                    (last == 'r' || last == 's')) {
                words++;
            }

            last = str.charAt(i);
        }
// Se corrige bug last == 'x' por last == 'r', para alcanzar el 100% de condition coverage
        if(last == 'r' || last == 's')
            words++;

        return words;
    }

}