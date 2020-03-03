package modelo;

/**


      __________        __                
______\______   \ _____/  |_  ___________ 
\_  __ \     ___// __ \   __\/ __ \_  __ \
 |  | \/    |   \  ___/|  | \  ___/|  | \/
 |__|  |____|    \___  >__|  \___  >__|   
                     \/          \/       


 */
public class StringCharCode {
    //método constructor de la clase
    public StringCharCode(){}
    
    //Método que recibe una cadena y la devuelve en formato Integer
    //Es el equivalente a String Char Code de javascript
    public String getStringCharCode(String entrada)
    {    String salida="",outline="";
    char arr2[]=entrada.toCharArray();
    for (int i=0;i<arr2.length;i++)
    {
        int ascii = (int) arr2[i];
        salida+=Integer.valueOf(ascii).toString().concat(", ");
        
    }
    outline=salida.substring(0, salida.lastIndexOf(",")) + "";
    
    return outline;
    }
    
    
    
    
}
