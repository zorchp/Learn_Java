import java.io.File;

public class TestFileClass {
    public static void main(String[] args) {
        File file = new File("/opt/homebrew/.git");
        System.out.println("Does it exist? " + file.exists());
        System.out.println("The file has " + file.length() + " bytes");
        System.out.println("Can it be read? " + file.canRead());
        System.out.println("Can it be written? " + file.canWrite());
        System.out.println("Is it a directory? " + file.isDirectory());
        System.out.println("Is it a file? " + file.isFile());
        System.out.println("Is it absolute? " + file.isAbsolute());
        System.out.println("Is it hidden? " + file.isHidden());
        System.out.println("Absolute path is " + file.getAbsolutePath());
        System.out.println(
            "Last modified on " + new java.util.Date(file.lastModified()));
    }
}
/*
 * Does it exist? true
 * The file has 207 bytes
 * Can it be read? true
 * Can it be written? true
 * Is i t a directory? false
 * Is it a file? true
 * Is it absolute? true
 * Is i t hidden? false
 * Absolute path is /opt/homebrew/CHANGELOG.md
 * Last modified on Wed May 24 10:49:11 CST 2023
 *
 */
