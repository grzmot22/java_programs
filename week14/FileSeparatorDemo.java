import java.io.File;

/**
 * Demonstrates File.separator. Try this under Windows and Unix (Linux, MacOS) to get
 * different results
 * @author Ingo Frommholz 
 */
public class FileSeparatorDemo
{
    public static void main (String[] args) {
        // Which operating system are we using?
        String osName= System.getProperty("os.name");
        
        // Set up the file path
        String myFilePath = "path" + File.separator + "to" + File.separator
            + "file";
            
        System.out.println("We are running under " + osName
            + " and the file path is '" + myFilePath + "'.");
    }
}
