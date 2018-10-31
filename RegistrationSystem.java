import java.util.*;
public class RegistrationSystem {
	public static void main(String[] args) throws Exception{
	      Scanner sc =new Scanner(System.in);
	        HashMap<String,Integer> hm =new HashMap<>();
	         int n =sc.nextInt();
	            while( n-->0){
	                String s =sc.next();
	                if( !hm.containsKey(s) ){
	                     hm.put(s,0);
	                  System.out.println(s);
	                }
	                else{
	                    int temp =hm.get(s);
	                     String str =s+temp;
	                      while(hm.containsKey(str)){
	                          temp++;
	                          str =s+temp;
	                      }
	                      hm.put(str,0);
	                      System.out.println(str);
	                      hm.put(s,temp+1);
	                }
	            }
	    }
}
