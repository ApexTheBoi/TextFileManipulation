import java.io.*;
import java.util.*;

public class TextModifier {
    private final File file;
    private Scanner output;
    private Scanner input;

    public TextModifier(){
        file = new File("TextFile.txt");
        input = new Scanner(System.in);
    }

    public void readFile(File file){
        try {
            output = new Scanner(file);
            while (output.hasNextLine()){
                System.out.print(output.nextLine() + " ");
            }
            output.close();
            System.out.println("\nCode successfully executed.");
        } 
        catch (FileNotFoundException e) {
            System.out.println("Your file was not found. \nERROR: " + e );
        }
    }

    public void addText(String filePath) {
        //boolean stopped = false;
        System.out.println("If you wish to end this type : FINISHED");
        while(true){
            try {
                System.out.print("Text to Add : ");
                String uString = "";
                FileWriter writer = new FileWriter(filePath);
                uString = input.nextLine();
                if(uString.equals("FINISHED")){
                    System.out.println("Typing process aborted. Exiting now.");
                    break;
                }
                writer.write(uString); //the user's string...
                writer.close();
            } catch (IOException e) {
                System.out.println("Error writing to file: " + e.getMessage());
            }
        }
    }

    public void deleteText(String filePath){
        try {
            new FileWriter(filePath, false).close(); // false = overwrite mode
            System.out.println("File contents deleted.");
        } catch (IOException e) {
            System.out.println("Error clearing file: " + e.getMessage());
        }
    }
}
