import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("Start Code Here.");
        boolean shouldContinue = true;
        TextModifier T = new TextModifier();
        File file = new File("TextFile.txt");
        String filePath = "TextFile.txt";
        Scanner input = new Scanner(System.in);
        while(shouldContinue == true){
            System.out.println("Options For File Modification Are As Follows:");
            System.out.println("1 : Add Text To File\n2 : Read Text From File\n3 : Delete Text From File\n4 : Abort Program");
            System.out.print("Please choose an option : ");
            int choice;
            try {
                
                choice = input.nextInt();
                switch(choice) {
                    case 1 -> T.addText(filePath);
                    case 2 -> T.readFile(file);
                    case 3 -> T.deleteText(filePath);
                    default -> {
                    }
                }
            } 
            catch (Exception e) {
                throw(e);
            }
            
            System.out.println("Process Completed. Continue?");
            System.out.println("1 : Yes || 0 : No");
            choice = input.nextInt();
            switch(choice){
                case 0 -> shouldContinue = false;
                case 1 -> System.out.println("Process Continuing.");
                default -> shouldContinue = false;
            }


        }
        input.close();
        System.out.println("Process Aborted.");
    }
}
