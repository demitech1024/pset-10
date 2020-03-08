package data;

public class Definition {
    private String definition;
    private String partOfSpeech;

    public Definition(String definition, String partOfSpeech) {
        this.definition = definition;
        this.partOfSpeech = partOfSpeech;
    }

    public String getDefinition() {
        return definition;
    }

    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public void setPartOfSpeech(String partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }
}