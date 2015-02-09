import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;


public class Test {
	public static void main(String[] args) {
		DocumentBuilder docReader = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		NewFile = docReader.parse(NewFile.xml);
	}

}
