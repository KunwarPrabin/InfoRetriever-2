/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kunwarprabin.fileio;

import com.kunwarprabin.fileio.util.Grabber;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 *
 * @author OWNER
 */
public class UrlConnection {

    public static void main(String[] args) {

        //Read URL------>
        /*
         try {
         URL url=new URL("http:www.jobsnepal.com");
         URLConnection conn =url.openConnection();
         BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
         String line = "";
         StringBuilder content = new StringBuilder();
         while ((line = reader.readLine())!= null) {
         System.out.println(line);
         content.append(line + "\r\n");
         }
         reader.close();
            
         //Bring URL index to your directory----->
         FileWriter writer=new FileWriter("e://HelloWorld/lfa.html");
         writer.write(content.toString());
         writer.close();
         } catch (IOException ioe) {
         System.out.println(ioe.getMessage());
         }*/
        try {
            while (true) {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter Keyword to search?");
                String keyword = input.next();
                String data=Grabber.post("http://www.jobsnepal.com/simple-job-search", "keyword=" + keyword);
                System.out.println(data);
            }

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
