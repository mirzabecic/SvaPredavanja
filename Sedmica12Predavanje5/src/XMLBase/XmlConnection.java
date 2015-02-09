package XMLBase;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlConnection {
	private DocumentBuilder docReader;
	private Document xmldoc;

	public void setDocument(String tableName)
			throws ParserConfigurationException, SAXException, IOException {
		String path = "./XMLFolder/" + tableName + ".XMLFolder";

		xmldoc = docReader.parse(new File(path));

	}

	public XmlConnection() throws ParserConfigurationException {
		docReader = DocumentBuilderFactory.newInstance().newDocumentBuilder();

	}

	public NodeList query(String query, String tableName)
			throws XPathExpressionException, ParserConfigurationException,
			SAXException, IOException {
		setDocument(tableName);
		query = "//item";
		XPath xPath = XPathFactory.newInstance().newXPath();
		NodeList xmlNodeList = (NodeList) xPath.compile(query).evaluate(xmldoc,
				XPathConstants.NODESET);
		return xmlNodeList;

	}

	

	public static void main(String[] args) {

	}

}
