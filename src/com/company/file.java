//Owen Riske

package com.company;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.channels.FileChannel;


public class file {
    //make a file
    public static void makeFile(String fileName) {
        try {
            File myObj = new File(fileName + ".txt");
            if (myObj.createNewFile()) {
                System.out.println("Movie added: " + myObj.getName().replace(".txt",""));
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }
    //write in file
    public static void writeFile(String fileName, String text){
        try {
            FileWriter myWriter = new FileWriter(fileName+".txt");
            myWriter.write(text);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    //read file
    public static String fileRead(String fileName){
        try {
            File myObj = new File(fileName+".txt");
            Scanner myReader = new Scanner(myObj);
            ArrayList total = new ArrayList();
            while (myReader.hasNextLine()) {

                String data = myReader.nextLine();
                total.add(data);
            }
            myReader.close();
            return String.join(", ", total);
        } catch (FileNotFoundException e) {
            System.out.println("The movie you are trying to find has yet to be added.");
            return "";
        }
    }
    public static void removeFile(String fileName){
        try
        {
            File f= new File("E:\\"+fileName+".txt");           //file to be delete
            if(f.delete())                      //returns Boolean value
            {
                System.out.println(fileName + " was succesfully deleted");   //getting and printing the file name
            }
            else
            {
                System.out.println("There was an issue with deleting "+fileName);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }


    public static void clearFile(String fileName){
        writeFile(fileName,"");
    }

//https://www.educative.io/answers/how-to-create-a-directory-using-java
}
