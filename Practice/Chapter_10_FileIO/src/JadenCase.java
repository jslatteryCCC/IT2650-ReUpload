public class JadenCase {
    public static String toJadenCase(String phrase) {

        // TODO put your code below this comment
        if (phrase == null || phrase.isEmpty()) {
            return null;
        }
        String[] words = phrase.split("\\s");
        StringBuilder capWord = new StringBuilder();
        for(String w : words){
            String first = w.substring(0,1);
            String afterFirst= w.substring(1);
            capWord.append(first.toUpperCase()).append(afterFirst).append(" ");
        }
        System.out.println(capWord.toString().trim());
        return capWord.toString().trim();

    }
}
