class EH9{
  public static void main(String args[]){
  String str="bitlabs";
    try{
    char c=str.charAt(20);
    System.out.println(c);
  }
    catch(StringIndexOutOfBoundsException e) {
      System.out.println(e);
      
    }
  }
}