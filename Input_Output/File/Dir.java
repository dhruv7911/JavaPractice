import java.io.File;

class Dir {
    public static void main(String[] args) {
        String dir_name = "directory";
        File f1 = new File(dir_name);
        if (f1.isDirectory()) {
            System.out.println("Directory of: " + dir_name);
            String s[] = f1.list();
            for (int i = 0; i < s.length; i++) {
                File f = new File(dir_name + "/" + s[i]);
                if (f.isDirectory()) {

                    System.out.println(s[i] + " is directory");
                } else {
                    System.out.println(s[i] + " is file");

                }
            }
        } else {
            System.out.println(dir_name + " is not directory");
        }
    }
}