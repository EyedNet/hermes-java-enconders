package modelo;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.util.Base64;
import javax.swing.JOptionPane;

/**


      __________        __                
______\______   \ _____/  |_  ___________ 
\_  __ \     ___// __ \   __\/ __ \_  __ \
 |  | \/    |   \  ___/|  | \  ___/|  | \/
 |__|  |____|    \___  >__|  \___  >__|   
                     \/          \/       


 */

public class Base64_Encoder {
    private File fl=null;
    private String html="";
    
    
    public String makeBase64Encode (String inpath)
            
    {
        fl = new File (inpath);
        
        try {
                
                
            FileInputStream imageInFile = new FileInputStream(fl);
            String base64Image = "";
            // Reading a Image file from file system
            byte imageData[] = new byte[(int) fl.length()];
            imageInFile.read(imageData);
            base64Image = Base64.getEncoder().encodeToString(imageData);
            
            StringBuilder htmlBuilder = new StringBuilder();
            htmlBuilder.append("<html>");
            htmlBuilder.append("<head><title>rPeter</title></head>");
            htmlBuilder.append("<body><img src=\"data:image/png;base64,"+base64Image
                    +"\"></body>");
            htmlBuilder.append("</html>");
            html = htmlBuilder.toString();
            byte htmlbytes[]=html.getBytes();
            File fileout = new File (System.getenv("TEMP")+"Base64.html");
            RandomAccessFile rndout = new RandomAccessFile(fileout,"rw");
            
            for (int i=0;i<htmlbytes.length;i++)
            {
                rndout.writeByte(htmlbytes[i]);
                
            }
            
            rndout.close();
            JOptionPane.showMessageDialog
                        (null,"La Imagen ha sido parseada a base64 con éxito... \n"
                                + "Image has been parsed to base 64 with ...\n"
                                ,"Información",JOptionPane.INFORMATION_MESSAGE);
            Desktop.getDesktop().browse(fileout.toURI());
            
            
            
        } catch (Exception e) {
            System.out.println("Image not found" + e);
        }
        return html;
    }
    
}
