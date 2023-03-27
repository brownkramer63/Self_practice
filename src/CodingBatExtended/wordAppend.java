package CodingBatExtended;

import java.util.HashMap;
import java.util.Map;

public class wordAppend {
    public static void main(String[] args) {

    }
    public String wordAppend(String[] strings) {
        HashMap<String,Integer> hash1 = new HashMap<>();
        for (String each:strings
             ) {
            if (!hash1.containsKey(each)){
                hash1.put(each,1);
            }else {
                hash1.put(each,hash1.get(each)+1);
            }
        }
        String answer="";
        for (Map.Entry<String,Integer> ss:hash1.entrySet()
             ) {
            if (!(ss.getValue()%2==0)){
            int G= (ss.getValue()-1)/2;
            for (int i = 0; i <G ; i++) {
                answer=answer+ss.getKey();
            }}
            if (ss.getValue()%2==0){
                int K =ss.getValue()/2;
                for (int i=0; i <K ; i++) {
                    answer=answer+ss.getKey();
                }
            }

            }

        return answer;
    }
}
