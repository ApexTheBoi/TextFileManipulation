The program uses a TextModifier object in order to tamper with "Textfile.txt".
TextModifier object has 3 key methods inside:

public void addText(String filePath) : Adds text from user's input into the text file. Typing "FINISHED" will end the input sequence.
public void readText(File file) : Reads all text from the text file and prints it to the console.
public void deleteText(String filePath) : Removes ALL text from the text file, returning it to a blank document. 

**Please note that if you are going to change the TextFile's name or address, you will need to go into the code and rewrite "TextFile.txt" and the filePaths.**
