/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kunwarprabin.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.FileSystems;

/**
 *
 * @author OWNER
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         //Creating and Removing Directory------>
         File file=new File("e:/HelloWorld");
         if(!file.isDirectory()){
         file.mkdir();
         System.out.println("Directory Created");
         }else{
         file.delete();
         System.out.println("Directory Removed");
         }
        /*Creating new file in the directory------>
         File file=new File("e:/HelloWorld/hello.txt");
         try{
         System.out.println(file.createNewFile());
         }catch(IOException ioe){
         System.out.println(ioe.getMessage());
         }*/
        /* File Writer------>
         try {
         FileWriter writer = new FileWriter("e:/GITHUB/FileIO/src/com/kunwarprabin/fileio/HelloWorld/hello.txt");
         writer.write("welcome to file writer\r\n");
         writer.close();
         } catch (IOException ioe) {
         System.out.println(ioe.getMessage());
         }*/
        /* FileReader------>
         try{
         FileReader reader=new FileReader("e:/GITHUB/FileIO/src/com/kunwarprabin/fileio/HelloWorld/hello.txt");
         int i=0;
         while((i=reader.read()) !=-1){
         System.out.print((char)i);
         }
         reader.close();
         }catch(IOException ioe){
         System.out.println(ioe.getMessage());
         }*/
        /* BufferedReader------>
         try {
         BufferedReader reader = new BufferedReader(new FileReader("e:/GITHUB/FileIO/src/com/kunwarprabin/fileio/HelloWorld/hello.txt"));
         String line = "";
         while ((line = reader.readLine()) != null) {
         System.out.println(line);
         }
         reader.close();
         } catch (IOException ioe) {
         System.out.println(ioe.getMessage());
         }*/
       

    }

}
