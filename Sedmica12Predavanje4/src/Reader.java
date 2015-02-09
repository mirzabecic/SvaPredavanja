import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class Reader {

	public static void main(String[] args) throws ParserConfigurationException,	MalformedURLException, SAXException, IOException {
		DocumentBuilder docRead = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document xmldoc = docRead.parse(new URL("http://www.klix.ba/rss/svevijesti").openStream());

		NodeList klixXML = xmldoc.getElementsByTagName("item");			
		LinkedList<Article> articles = new LinkedList<Article>();
		LinkedList<Element> items = new LinkedList<Element>();			
		
		
		for (int i = 0; i < klixXML.getLength(); i++) {
			Node current = klixXML.item(i);			
			if (current instanceof Element) {      
				Element currentElement = (Element) current;		
				items.add(currentElement);									

				if (current.hasChildNodes()) { 		
					addArticle(articles, currentElement);
				}
			}
		}		
		startRSS(articles);				
	}	
	
	public static void startRSS(LinkedList<Article> articles){
		System.out.println("List of titles at klix.ba: \n");
		for(int i=0; i<articles.size();i++){
			System.out.println(i +": " +articles.get(i).getTittle() );
		}
			int choice = -1;
			while(choice <0 || choice >= articles.size()){
				System.out.println("Choose which article you want to read: ");
				choice = TextIO.getInt();			
			}	
			System.out.println(articles.get(choice).printArticle());	
	}
	
	
	private static void addArticle(LinkedList<Article> articles, Element current){
		NodeList titleList = ((Element) current).getElementsByTagName("title");		
		NodeList contentList = ((Element) current).getElementsByTagName("clanak");	
		for (int j = 0; j < titleList.getLength(); j++) {			
			Node currentTitle = titleList.item(j);
			Node currentContent = contentList.item(j);

			if (currentTitle instanceof Element) {
				Element titleElement = (Element) currentTitle;
				Element contentElement = (Element) currentContent;
				String title = titleElement.getTextContent();		
				String content = contentElement.getTextContent();	
				articles.add(new Article(title, content));		
			}

		}
	}
}