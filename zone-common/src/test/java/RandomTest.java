import org.junit.Test;
import org.lyg.common.util.MD5Util;
import org.lyg.common.util.PropertiesFileUtil;

public class RandomTest {
	@Test
	public void test1() {
		PropertiesFileUtil p = PropertiesFileUtil.getInstance();
		String s = p.get("sakura");
		System.out.println(s);
	}

}
