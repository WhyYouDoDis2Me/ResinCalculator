public class Material {

    /**
     * Returns the total amount of Hero's Wits, Adventurer's Experiences, and Wanderer's Advices necessary to get
     * from the current exp to the final exp, wasting as little exp as possible.
     * @param currExp The current exp of the character
     * @param endExp The intended final exp of the character
     * @return An Array of Hero's Wits, Adventurer's Experiences, and Wanderer's Advices (in that order)
     * @throws IllegalArgumentException if the current experience is higher than the final experience
     */
    public int[] experience(int currExp, int endExp) {
        if (currExp > endExp) {
            throw new IllegalArgumentException("Current exp cannot be higher than the final exp!");
        }
        // Calculate the total experience needed to get from current to end
        int totalExp = endExp - currExp;
        int[] books = new int[3];
        // Calculate how much exp is needed to get from currExp to the next ascension
        // Find optimal number of books
        // Add to return array
        // Repeat
        while (totalExp > 0) {

        }
        return books;
    }

    /**
     * Returns the total number of ascension crystals needed to get from the current ascension level to the final
     * ascension level
     * @param currAsc The current ascension level of the character
     * @param endAsc The intended final ascension level of the character
     * @return An Array of Crystal Slivers, Fragments, Chunks, and Gemstones of the character's element (in that order)
     * @exception IllegalArgumentException if current ascension level is higher than the final ascension level
     */
    public int[] crystals(int currAsc, int endAsc) {
        if (currAsc > endAsc) {
            throw new IllegalArgumentException("Current Ascension level cannot be higher than the final Ascension " +
                    "level!");
        }
        int[] crystals = new int[4];
        // While currAsc < endAsc
        // Add crystals corresponding to the ascension level
        return crystals;
    }

    // TODO: Figure out how to calculate this for levels, ascension, and talents
//    public int[] levelUpMaterial() {}

    /**
     *
     * @param currTalents
     * @param endTalents
     * @return
     */
//    public int[] talentBooks(int[] currTalents, int[] endTalents) {
//
//    }
}
