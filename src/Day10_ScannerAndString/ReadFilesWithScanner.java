package Day10_ScannerAndString;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadFilesWithScanner {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(Path.of("src/Day10_ScannerContd/Test.txt"));
        System.out.println(scan.next()); //this prints first WORD of text file
        System.out.println(scan.nextLine());//prints first LINE of text file
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
        System.out.println(scan.hasNextLine()); //returns a true or false statement.


        scan.close();

    }
}
