import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Random;
import java.util.Set;


public class Hash_JCollections {
	




    public static void main(String[] args) {
    	
        final java.util.Random rand = new java.util.Random();
        final String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345674890";
        final Set<String> identifiers = new HashSet<String>();
        
    	HashMap<String, String> vidHash = new HashMap<String, String>();
    	Queue<String> vidQue = new ArrayDeque<String>();
    	ArrayList<String> vidArray = new ArrayList<String>;
    	
    	//Generate objects
    	for (int i = 0; i < 100; i++) {
    		
    		StringBuilder builder = new StringBuilder();
            while(builder.toString().length() == 0) {
                int length = rand.nextInt(5)+5;
                for(int i1 = 0; i1 < 100; i1++) {
                    builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));
                }
                if(identifiers.contains(builder.toString())) {
                    builder = new StringBuilder();
                }
            }
            vidHash.put( builder.toString(), builder.toString());
            vidQue.add(builder.toString());
            
            
            //here 
    		

    		
    		
		}
        
    }
	
}
