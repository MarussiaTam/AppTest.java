package lesson4;

public class Functions {
    public boolean isPolindrom(String word) {
        if (word.length() < 2) {
            return true;
        }
        if (word.charAt(0) == word.charAt(word.length() - 1)) {
            return false;
        }
        return isPolindrom(word.substring(1, word.length() - 1));
    }

   }