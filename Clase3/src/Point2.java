public class Point2 {

    char[] abc = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public String decodify1(String text) {
        String textDecodify = "";
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < abc.length; j++) {
                if (text.charAt(i) == abc[j]) {
                    textDecodify += abc[j + 1];
                } else if (i == j && ' ' == text.charAt(i)) {
                    textDecodify += 'a';
                }
            }
        }
        return textDecodify;
    }
}
