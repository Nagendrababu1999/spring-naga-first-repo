public class ReverseString{
public static void main(String [] args){
String str= "mam";
//String str= "suresh";

String rev="";
for(int i=str.length()-1;i>=0;i--){

rev=rev+str.charAt(i);
}
if(str.equals(rev)){
	System.out.println("palindrom is true ");
}else{
	System.out.println("palindrom is false ");
}


System.out.println("String reverse :"+rev);

}

}