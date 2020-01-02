import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
import java.util.Map.Entry;
class Test1
{
       public static void main(String[] args)
       {
             HashMap<String,String> map = new HashMap<>();
             map.put("abc@gmail.com","abc@123");
             map.put("xyz@yahoo.com","xyz@321");
             map.put("bbc@rediff.com","redbbc");
             map.put("someuser2xyz.com","somexyz");
             Set<Entry<String,String>> set = map.entrySet();
             for(Entry<String,String> s : set)
                 System.out.println(s.getKey()+"   "+s.getValue());
            //System.out.println(map.size());
             //System.out.println(map.get("xyz@yahoo.com"));
             //Set<String> keys = map.keySet();
             //for(String k : keys)
                //  System.out.println(k+"  "+map.get(k));
             //Collection<String> values = map.values();
             //for(String v : values)
             //     System.out.println(v);
        }
}