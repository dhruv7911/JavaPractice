import java.nio.file.*;

public class Index{
    public static void main(String[] args) throws Exception{
	byte[] file = Files.readAllBytes(Paths.get("sample.txt"));
	System.out.println("File size: "+file.length+" Bytes");
	
    }
}


