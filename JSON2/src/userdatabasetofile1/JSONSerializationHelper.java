/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userdatabasetofile1;
 import java.io.*;


/**
 *
 * @author use
 */

public class JSONSerializationHelper{

    public static void serialiseToFile(Object object,String filePath)throws IOException{
        ObjectMapper objectMapper = new ObjectMapper();

        FileOutputStream fos = new FileOutputStream("filePath");
        objectMapper.writeValue(fos, object);
        fos.flush();
        fos.close();
    }
}