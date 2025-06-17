import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

class MapUsingHash{
    private Entity[] entities;

    public MapUsingHash(){
        entities = new Entity[100];
    }

    public void put(String key , String value){
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key , value);
    }

    public String get(String key){
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key)){
            return entities[hash].value;
        }
        return null;
    }

    private class Entity{
        String key;
        String value;

        public Entity(String key , String value){
            this.key = key;
            this.value = value;
        }
    }


}

public class Main {
    public static void main(String[] args) {
       hashDemo();

        MapUsingHash map = new MapUsingHash();

        map.put("Mango" , "King of Fruit");
        map.put("Apple" , "red of Fruit");
        map.put("Grape" , "Green of Fruit");

        System.out.println(map.get("Apple"));

    }

    public static void hashDemo(){
//        String name = "Deepak" ;
//
//        int hash = name.hashCode();
//        System.out.println(hash);

        HashMap<String , Integer> map = new HashMap<>();

        map.put("Deepak" , 89);
        map.put("Kumar" , 90);
        map.put("Shekhar" , 99);

        System.out.println(map.get("Deepak"));
        System.out.println(map.getOrDefault("D" , null));

        System.out.println(map.containsKey("Deepak"));

        HashSet<Integer> mane= new HashSet<>();

        mane.add(48);
        mane.add(98);
        mane.add(56);
        mane.add(44);
        mane.add(49);
        mane.add(48);

        System.out.println(mane.toString());
    }
}