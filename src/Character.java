import java.util.*;

/**
 * Holds Characters' ascension and talent requirements.
 */
public class Character {

    /**
     * The stored character
     */
    private String character;

    private Set<String> listOfCharacters;

    /**
     * Initializes with the given character so the material names can be given properly.
     * @param character The character to be used
     */
    public Character(String character) {
        this.character = character;
    }

    public Set<String> getListOfCharacters() {
        return listOfCharacters;
    }
}
