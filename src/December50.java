import java.io.*;

public class December50 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameOne = reader.readLine();
        String nameTwo = reader.readLine();
        FileInputStream in = new FileInputStream(nameOne);
        FileOutputStream out = new FileOutputStream(nameTwo);

        String s ="";
        char ch;
        while (in.available()>0){
            ch = (char) in.read();
            s += ch;
        }
        String f = s.replace(".", "!");
        byte[] buff = f.getBytes();
        for (int i = 0; i <buff.length ; i++) {
            out.write(buff[i]);
        }
        reader.close();
        in.close();
        out.close();
    }
}
