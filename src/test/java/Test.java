import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test {

	public static void main(String[] args) {
		String a = "1470TOUR";
		Integer.parseInt(a.substring(0, a.length() - 4));
		System.out.println(Integer.parseInt(a) - 12);
	}

}
