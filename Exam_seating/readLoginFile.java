package Exam_seating;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readLoginFile {

        public static void main(String[] args) {
            try {
                FileReader reader = new FileReader("credentials.csv");
                BufferedReader bufferedReader = new BufferedReader(reader);

                String line;

                while ((line = bufferedReader.readLine()) != null) {            //go through each line of the file
                /*    System.out.println(line);
                    //if email and password in line, log in complete
                    //if email in a line and wrong password, give one more trial
                    //if email not in file, go to login */
                    
                    System.out.println(line); //for debugging
                }

                reader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }