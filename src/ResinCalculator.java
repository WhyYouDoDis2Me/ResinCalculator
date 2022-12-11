import java.io.*;
import java.util.*;
import org.json.simple.JSONObject;
public class ResinCalculator {
    private static final PrintStream output = System.out;

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        save();

        output.println("Welcome to the Resin Calculator by WhyYouDoDis2Me!");
        output.println("Do you have a save file containing your previous session that you would like to use? (y/n)");
        output.print("If this is your first time using this program, say \"n\": ");
        String saved = input.next();

        // If the user has a save file already
        if (saved.toLowerCase().charAt(0) == 'y') {
            output.print("Please input the file name of the save you want to load (should end in .json): ");
            String filename = input.next();
            // Check that the file ends in .json and that the file exists
            // Retrieve data from file
            // Ask for current material numbers

        } else { // If the user doesn't have a save file
            // Ask the user if they want resin, materials, or both
            output.print("Would you like to calculate the resin (r) or materials (m) needed, or both (b)? ");
            String type = input.next();
            char typeChar = type.toLowerCase().charAt(0);
            while (typeChar != 'm' && typeChar != 'r' && typeChar != 'b') {
                output.println("Sorry, that's not a valid input. Please try again (r/m/b)");
                type = input.next();
                typeChar = type.toLowerCase().charAt(0);
            }
            if (typeChar == 'r') type = "resin";
            else if (typeChar == 'm') type = "materials";
            else type = "resin and materials";

            // Ask the user if they want to calculate for character or weapon
            output.print("Would you like to calculate the " + type + " needed for a character (c) or weapon (w)? ");
            String thing = input.next();
            char thingChar = thing.toLowerCase().charAt(0);
            while (thingChar != 'c' && thingChar != 'w') {
                output.println("Sorry, that's not a valid input. Please try again (c/w)");
                thing = input.next();
                thingChar = thing.toLowerCase().charAt(0);
            }
            if (thingChar == 'c') thing = "character";
            else thing = "weapon";

            output.print("What is the name of the " + thing + " you would like to calculate for? ");
            String name = input.next();
            output.print(thing + ": " + name);
        }
    }

    private static void save() {
        output.print("File name: ");
        JSONObject JSONObject = new JSONObject();
        JSONObject.put("Character", "Wanderer");
        String filename = input.next();
        try {
            PrintStream fileWriter = new PrintStream("saves\\" + filename + ".json");
            fileWriter.print(JSONObject.toJSONString());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        output.println("JSON File created: " + JSONObject);
    }
}
