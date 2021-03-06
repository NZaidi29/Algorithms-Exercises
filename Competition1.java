import java.util.HashMap;

public class Competition1 {
    public static String ciphertext = "ETEVHTWGSAHGWYVPNKQOEGWYVPNKPDEPHWAOVWPFWNHANEVWXAVOAEAJEUXTAOWBTEVHTWGSAHGWYVPNQAOQVGTYHAVAXETOANFQEOIQPLANTEVHFYNSQVEBEOWSKNCKLOPEVTYJAUFWYNCOTWZESQEPERQSQOPEVYCEVHEGDEHEVHEYOPNQEEHWYFTKTEVHTWGSAHGWYVPNKQOWVAPDEPWVTKFWNHANOTEVHTWGSAHGWYVPNQAOPDANAENAWVTKPIWHWYFTKTEVHTWGSAHGWYVPNQAOQVPDAIWNTHWVAWBPDAUQOYLFASQOPEVIDEPQOPDAWPDANWVA";
    public static String phrase = "NEPALSERBIASWITZERLANDBURKINAFASOKYRGYZSTANLUXEMBOURGSLOVAKIATAJIKISTANUGANDACHADANDAUSTRIA";
    public static String alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main( String[] args ) {
        System.out.println( "Ciphertext: " + ciphertext );
        System.out.println( "Hint phrase: " + phrase );
        HashMap<String, String> cipher = new HashMap<String, String>();
        char[] result=new char[332];
        for( int i=0; i<ciphertext.length()-91; i++){//to find the known phrase within the ciphertext and obtain the cipher
          if (ciphertext.charAt(i)==ciphertext.charAt(i+20)){//pos 0 and 20 are N
            if(ciphertext.charAt(i+20)==ciphertext.charAt(i+27)){//pos 20 and 27 are N
              if(ciphertext.charAt(i+1)==ciphertext.charAt(i+6)){//pos 1 and 6 are E
                String cipherstring= ciphertext.substring(i,i+phrase.length());//creates cipher text of known phrase
                for( int j=0; j<cipherstring.length(); j++){//for actually obtaining a cipher key
                  cipher.put(Character.toString(cipherstring.charAt(j)),Character.toString(phrase.charAt(j)));
                }
              }
            }
          }
        }
        cipher.put("M","Q");
        for( int i=0; i<ciphertext.length(); i++){
          String temp=cipher.get(Character.toString(ciphertext.charAt(i)));
          result[i]=temp.charAt(0);
        }
        System.out.println(cipher);
        System.out.println(result);
    }
}
