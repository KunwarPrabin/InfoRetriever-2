/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kunwarprabin.fileio.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author OWNER
 */
public class Grabber {

    public static String get(String link) throws IOException {
        URL url = new URL(link);
        URLConnection conn = url.openConnection();
        return getContent(conn.getInputStream());

    }

    public static String getContent(InputStream is) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        String line = "";
        StringBuilder content = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            content.append(line);
        }
        reader.close();
        return content.toString();
    }

    public static String post(String link, String data) throws IOException {
        URL url = new URL(link);
        URLConnection conn = url.openConnection();
        conn.setDoOutput(true);
        OutputStream output = conn.getOutputStream();
        output.write(data.getBytes());
        return getContent(conn.getInputStream());  
    }
}
