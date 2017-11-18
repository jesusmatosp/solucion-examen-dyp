package pregunta5;

import java.util.HashMap;
import java.util.Map;

public class LoggerFlyweight {
	
	Map<String, Logger> map = new HashMap<String, Logger>();
	
	public Logger getFlyweight(String name){
		if(map.get(name) == null){
			map.put(name, new Logger(name));
		}
		return map.get(name);
	}
	
}
