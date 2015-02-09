import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XPathDatabase {
	public static void main(String[] args) throws ParserConfigurationException,
			SAXException, IOException, XPathExpressionException {
		File xmlFile = new File("/Users/mirzabecic/Desktop/plakari.xml");
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();

		Document xmlDocument = db.parse(xmlFile);
		XPathFactory xpf = XPathFactory.newInstance();
		XPath xpath = xpf.newXPath();

		String productCountString = xpath.evaluate("count(/products/product)",
				xmlDocument);
		System.out.printf("Broj proizvoda; %s\n", productCountString);
		String firstProductUrl = xpath.evaluate("/products/product/@url",
				xmlDocument);
		System.out.printf("URL prvog proizvoda: %s\n", firstProductUrl);
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("Unesite XPath:");
			String xPathExpression = s.nextLine();
			if (xPathExpression.isEmpty()) {
				break;
			}
			NodeList result = (NodeList) xpath.evaluate(xPathExpression,
					xmlDocument,XPathConstants.NODESET);
			
			for(int i = 0; i< result.getLength(); i++){
				Node n = result.item(i);
				Element el = (Element)n;
				System.out.println(el.getAttribute("id"));
			}
		}
	}

}
