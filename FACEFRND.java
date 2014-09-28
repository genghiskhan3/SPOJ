import java.util.*;

class FACEFRND{
    
    public static void main (String [] args){
        
        Scanner in = new Scanner (System.in);
        ArrayList<String> friends = new ArrayList<String>();
        ArrayList<String> FOF = new ArrayList<String>();
        
        int realFriends = Integer.parseInt(in.next());
        
        
        for (int k = 0; k < realFriends; k++){
            
            String friend = (in.next());
            
            friends.add(friend);
            
            if (FOF.contains(friend)){
                FOF.remove(friend);
            }
            
            int hisFriends = Integer.parseInt(in.next());
            
            for (int n = 0; n < hisFriends; n++){
                
                String fof = (in.next());
                if (!FOF.contains(fof) && !friends.contains(fof))
                    FOF.add(fof);
                
            }
        }
        
        System.out.println(FOF.size());
        
    }
}
