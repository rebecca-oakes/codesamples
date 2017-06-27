
public class Map {
	int[] keys;
	Object[] values;
	int pos;
	
	public void createMap(int index){
		keys = new int[index];
		values = new Object[index];
		pos = 0;
	}
	
	public void add(int key, Object value){
		boolean exists = false;
		
		for(int i = 0; i < keys.length; i++){
			if(keys[i] == key){
				exists = true; 
				System.out.println("Key already exists");
				break;
			}
		}
		
		if(exists == false){
			keys[pos] = key;
			values[pos] = value;
			pos++;
		}
	}
	
	public void find(int key){
		for(int i = 0; i < keys.length; i++){
			if (keys[i] == key){
				System.out.println(values[i]);
				break;
			}
		}
	}
	
	public void mapKey(int key, Object value){
		boolean exists = false; 
		
		for(int i = 0; i < keys.length; i++){
			if(keys[i] == key){
				values[i] = value;
				exists = true;
			}
		}
		if(exists == false)
			System.out.println("Key doesn't exist in map");
	}
	
	public void containsValue(Object value){
		int count = 0;
		
		for(int i = 0; i < values.length; i++){
			if(values[i] == value){
				count++;
			}
		}
		System.out.println("This map contains the value " + value + " " + count + " time(s).");
	}
}
