package exam1.three;

import java.util.Map;

public interface SourceReader {

	
	Map<String, BeanInfo> loadBeans(String filePath);
	
}
