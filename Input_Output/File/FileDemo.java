import java.io.File;
public class FileDemo{
    public static void main(String[] args){
        File f1 = new File("COPYRIGHT");
        System.out.println("File name: "+f1.getName());
        System.out.println("Abs path: "+f1.getAbsolutePath());
        System.out.println("Parents: "+f1.getParent());
        System.out.println(f1.exists()?"Exists":"does not exists");
        System.out.println(f1.canWrite()?"is writable":"is not writable");
        System.out.println(f1.canRead()?"is readable":"is not readable");
        System.out.println(f1.isDirectory()?" is dir":"not dire");
        System.out.println("File Size: "+f1.length()+" Bytes");
    }
}