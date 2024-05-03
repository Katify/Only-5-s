import java.io.*;

public class nemm {
    public static <ff> void main(String[] args) {
        String s;
        try(BufferedReader br = new BufferedReader(new FileReader("students.txt"));
         FileWriter ff = new FileWriter("Newfile.txt")){

            while((s = br.readLine()) != null ){
                String[] words = s.split("\\s+");
                String Surname = words[0].trim();
                String name = words[1].trim();
                String grade = words[2].trim();
                if(grade.equals("5")) {
                    ff.write(Surname + "\s" + name+ "\s" +grade + "\n");
            }
        }
        } catch (IOException e) {
            System.out.println("Error");;
        }


    }
}
