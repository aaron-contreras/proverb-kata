class Proverb {

    private String bodyPhrase = "For want of a %s the %s was lost.\n";
    private String conclusion = "And all for the want of a %s.";
    
    private String proverb;

    Proverb(String[] words) {

        proverb = (words.length == 0) ? "" : buildProverb(words);
        
    }

    String recite() {
        
        return proverb;

    }

    String buildProverb(String[] words) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < words.length-1; i++) {

            builder.append(String.format(bodyPhrase, words[i], words[i+1]));

        }

        builder.append(String.format(conclusion, words[0]));

        return builder.toString();
    }
}