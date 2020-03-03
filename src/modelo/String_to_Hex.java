
package modelo;

import java.io.UnsupportedEncodingException;
import javax.xml.bind.DatatypeConverter;

/**


      __________        __                
______\______   \ _____/  |_  ___________ 
\_  __ \     ___// __ \   __\/ __ \_  __ \
 |  | \/    |   \  ___/|  | \  ___/|  | \/
 |__|  |____|    \___  >__|  \___  >__|   
                     \/          \/       


 */
public class String_to_Hex {
    public String_to_Hex(){}
    
    public  String toHexadecimal(String text) throws UnsupportedEncodingException
    {
        byte[] myBytes = text.getBytes("UTF-8");
        
        return DatatypeConverter.printHexBinary(myBytes);
    }
}
