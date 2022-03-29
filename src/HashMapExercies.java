import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapExercies {

    public static void main(String[] agrs){
        Map<String, String> map = new HashMap();

        map.put("key1", "Value1");
        map.put("key2", "Value2");
        map.put("key3", "Value3");

        Iterator<String> itrMap = map.keySet().iterator();
        while(itrMap.hasNext()){
            System.out.println(map.get(itrMap.next()));

            map.put("key4", "value4");
        }
//        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
//
//        map.put("key1", "Value1");
//        map.put("key2", "Value2");
//        map.put("key3", "Value3");
//
//        Iterator<String> itrMap = map.keySet().iterator();
//        while(itrMap.hasNext()){
//            System.out.println(map.get(itrMap.next()));
//
//            map.put("key4", "value4");
//        }
    }
}
