package Java.dsa;

import java.io.IOException;
import java.io.*;
import java.util.Arrays;

public class fileHandling implements Serializable{
    public static void main(String[] args) {

        /*try (InputStream inputStream = new FileInputStream("src/Java/dsa/input.txt");
             OutputStream outputStream = new FileOutputStream("src/Java/dsa/output.txt")) {

            // Buffer for data transfer
            int bytesRead;

            // Read from InputStream and write to OutputStream
            while ((bytesRead = inputStream.read()) != -1) {
                outputStream.write(bytesRead);
            }
            System.out.println("Data has been successfully copied from "+inputStream +" to "+outputStream );
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());}
        try (InputStreamReader isr=new InputStreamReader(System.in)){
            int letter= isr.read();
            while (isr.ready()){
                System.out.print((char) letter);
                letter=isr.read();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }*/
       /*try (FileReader fr=new FileReader("src/Java/dsa/input.txt");
             FileWriter fw=new FileWriter("src/Java/dsa/output.txt")){
            int letter;
            while ((letter= fr.read())!=-1){
                fw.write(letter);
                System.out.print((char) letter);
            }
            System.out.println("file successfully copied from input.txt to output.txt");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }*/
        /* int unicode= 0x1F636;
         int code2= 0x200D;
        int code3=0x1F32B;
        int code4= 0xFE0F;
        String em=new String(new int[]{unicode,code2,code3,code4},0,4);
        System.out.println(em);
        try {
            File f=new File("file.txt");
            File fake=new File("src/Java/dsa/input.txt");
        try (FileReader fr=new FileReader("src/Java/dsa/input.txt");
             FileWriter fw=new FileWriter(f,true)) {
            int letter;
            while ((letter = fr.read()) != -1) {
                fw.write((char) letter);
            }
        }
    }catch (IOException e){
            System.out.println(e.getMessage());
        }
        try {
            File file=new File("file2.txt");
            file.createNewFile();
            try (BufferedWriter bw=new BufferedWriter(new FileWriter(file));
                 BufferedReader br=new BufferedReader(new FileReader(file));
                 BufferedWriter bw2=new BufferedWriter(new FileWriter("file.txt",true));
                 BufferedReader br2=new BufferedReader(new FileReader("file.txt"))){
                bw.write("just a normal file\n");
                bw.write("trying to do better\n");
                bw.append("just append\n");
                bw.write("hii\n");
                bw.write(0x1F603);
                bw.write(em);
                bw.flush();
                bw2.append(em);
                bw2.flush();
                String l;
                while ((l= br.readLine())!=null){
                    System.out.println(l);
                }
                while ((l= br2.readLine())!=null){
                    System.out.println(l);
                }
            }
            // file.delete();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }*/
        File f=new File("file3.txt");
        try (FileInputStream ois=new FileInputStream("file.txt");
             ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("file3.txt"));){
            byte[] bytes=new byte[1024];
            int byteRead;
            while ((byteRead=ois.read(bytes))!=-1){
                oos.write(bytes,0,byteRead);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
