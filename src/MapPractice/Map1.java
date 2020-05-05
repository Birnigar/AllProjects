package MapPractice;

import java.util.*;

public class Map1 {









    public Map<String, String> mapBully(Map<String, String> map) {

        if(map.containsKey("a")){
            map.put("b",map.get("a"));
            map.put("a","");
        }
      return map;
    }

}
