public class Cadena{
  private String cadena="";

  public Cadena(String cadena){
    this.cadena=cadena;
  }
  public int ordinal(char c){
    return ((int)c);
  }
  public char ascii(int i){
    return ((char)i);
  }
  public void invierteCadena(){
    String cadena2="";
    for(int i=cadena.length()-1;i>=0;i--){
      cadena2=cadena2+cadena.charAt(i);
    }
    cadena=cadena2;
  }
  public void encriptaCadena(){
    String cadena2="";
    char c;
    for(int i=0;i<cadena.length();i++){
      c=cadena.charAt(i);
      cadena2=cadena2+ascii(ordinal(c)+3);
    }
    cadena=cadena2;
  }
  public void desencriptaCadena(){
    String cadena2="";
    char c;
    for(int i=0;i<cadena.length();i++){
      c=cadena.charAt(i);
      cadena2=cadena2+ascii(ordinal(c)-3);
    }
    cadena=cadena2;
  }
  public void visualizaCadena(){
    System.out.println(cadena);
  }
}
