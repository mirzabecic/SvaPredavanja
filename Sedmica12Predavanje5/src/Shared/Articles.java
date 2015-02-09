package Shared;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Articles {
	private int id;
	private String title;
	private String content;
	private int pubDate;
	private int authorId;

	/**
	 * 
	 * Constructor;
	 * 
	 * @param id
	 * 
	 * @param title
	 * 
	 * @param content
	 * 
	 * @param pubDate
	 * 
	 * @param authorId
	 */
	public Articles(int id, String title, String content, int pubDate,
			int authorId) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.pubDate = pubDate;
		this.authorId = authorId;
	}

	/**
	 * 
	 * Constructor;
	 */
	public Articles(Node node) {
		if (node instanceof Element) {
			Element nodeElement = (Element) node;
			this.id = Integer.parseInt(nodeElement.getAttribute("id"));
			NodeList childList = nodeElement.getChildNodes();
			for (int i = 0; i < childList.getLength(); i++) {
				Node childNode = childList.item(i);
				if (childNode instanceof Element) {
					Element childNodeElement = (Element) childNode;
					if (childNodeElement.getTagName().equals("title")) {
						this.title = childNodeElement.getTextContent();
					}
					if (childNodeElement.getTagName().equals("clanak")) {
						this.content = childNodeElement.getTextContent();
					}
					if (childNodeElement.getTagName().equals("pubDate")) {
						this.pubDate = Integer.parseInt(childNodeElement
								.getTextContent());
					}
					if (childNodeElement.getTagName().equals("autor")) {
						this.authorId = Integer.parseInt(childNodeElement
								.getAttribute("id"));
					}
				}
			}
		}else{
			System.err.println("Not instance of Element");
		}
	}

	// Getters for all the attributes;
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public int getPubDate() {
		return pubDate;
	}

	public int getAuthorId() {
		return authorId;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", content="
				+ content + ", pubDate=" + pubDate + ", authorId=" + authorId
				+ "]";

	}

}
