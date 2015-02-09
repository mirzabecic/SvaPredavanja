package XMLBase;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import Shared.Articles;

public class Test {
	
	private static boolean testArticleConstructor() throws MalformedURLException, SAXException, IOException, ParserConfigurationException{
		DocumentBuilder docReader = DocumentBuilderFactory.newInstance()
				.newDocumentBuilder();
		
		Document xmldoc = docReader.parse(new File("./XMLFolder/Articles.xml"));
		Node testItem = xmldoc.getElementsByTagName("item").item(0);
		Articles testArticle = new Articles(testItem);
		
		if(testArticle.getId() != 1){
			return false;
		}
		if(testArticle.getAuthorId() != 1){
			return false;
		}
		if (testArticle.getPubDate() !=0){
			return false;
		}
		return true;
		
	}
	public static void main(String[] args) {
		try {
			if (testArticleConstructor() == false){
				System.err.println("testArticleConstructor failed ");
			}else{
				System.out.println("Proslo");
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void test(){
		XmlConnection connection = new XmlConnection();
		NodeList xmlArticle = connection.query("Article", "//item");
		
		if( connection.query("Article", "//item")instanceof NodeList == false){
			return false;
		}
		
	}

}
