import java.util.*;

public class HashapFinal<K , V> {

    ArrayList<LinkedList<Entity>> list;

    private int size =0;

    private float lf = 0.5f;

    public HashapFinal(){
        list = new ArrayList<>();

        for(int i = 0; i <10 ; i++){
            list.add(new LinkedList<>());
        }
    }
    public void put(K key , V value){
        int hash = Math.abs(key.hashCode() % list.size());
        
        LinkedList<Entity> entities = list.get(hash);

        for (Entity entity : entities) {
            if(entity.key.equals(key)){
                entity.value = value;
                return;
            }
        }
        if((float)(size) / list.size() > lf){
            reHash();
        }

        entities.add(new Entity(key , value));

        size++;
    }
    public V get(K key){
        int hash = Math.abs(key.hashCode() % list.size());

        LinkedList<Entity> entities = list.get(hash);
        for (Entity entity : entities){
            if(entity.key.equals(key)){
                return entity.value;
            }
        }
        return null;
    }

    private void reHash(){
        System.out.println("We are now rehashing");

        ArrayList<LinkedList<Entity>> old = list;
        list = new ArrayList<>();

        size =  0;

        for (int i = 0; i < old.size()*2; i++) {
            list.add(new LinkedList<>());
        }

        for (LinkedList<Entity> entries : old){
            for (Entity entry : entries){
                put(entry.key , entry.value);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("{");

        for(LinkedList<Entity> entities : list){
            for(Entity entry : entities){
                builder.append(entry.key);
                builder.append(" = ");
                builder.append(entry.value);
                builder.append(" , ");
            }
        }
        builder.append("}");

        return builder.toString();
    }
    


    private class Entity{
        K key;
        V value;

        public Entity(K key , V value){
            this.key = key;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        HashapFinal<String , String> map = new HashapFinal<>();

        map.put("Mango" , "King of Fruit");
        map.put("Apple" , "red of Fruit");
        map.put("Grape" , "Green of Fruit");

        System.out.println(map.get("Apple"));

        System.out.println(map);
    }
}
