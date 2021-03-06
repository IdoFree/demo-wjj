package com.weijiajiao.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DOMParser {
	private Document document;

	DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();

	// Load and parse XML file into DOM
	public Document parse(InputStream ins) {
		try {
			// DOM parser instance
			DocumentBuilder builder = builderFactory.newDocumentBuilder();
			// parse an XML file into a DOM tree
			document = builder.parse(ins);
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return document;
	}

	public NodeList getElementsByTagName(String tagName) {
		// get root element
		Element rootElement = document.getDocumentElement();
		return rootElement.getElementsByTagName(tagName);
	}

	protected Element getRootElement() {
		return document.getDocumentElement();
	}

	public void printContent() {
		printContent(document);
	}
	
	public static void printContent(Document doc) {
		Element rootElement = doc.getDocumentElement();

		// traverse child elements
		NodeList nodes = rootElement.getChildNodes();
		for (int i = 0; i < nodes.getLength(); i++) {
			Node node = nodes.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element child = (Element) node;
				// process child element
				System.out.println(
						"<" + child.getTagName() + ">" + node.getTextContent() + "</" + child.getTagName() + ">");
			}
		}
	}

	public Document makeDocument() throws ParserConfigurationException {
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		// root elements
		Document doc = builder.newDocument();
		Element rootElement = doc.createElement("cars");
        doc.appendChild(rootElement);

        //  supercars element
        Element supercar = doc.createElement("supercars");
        rootElement.appendChild(supercar);

        // setting attribute to element
        Attr attr = doc.createAttribute("company");
        attr.setValue("Ferrari");
        supercar.setAttributeNode(attr);

        // carname element
        Element carname = doc.createElement("carname");
        Attr attrType = doc.createAttribute("type");
        attrType.setValue("formula one");
        carname.setAttributeNode(attrType);
        carname.appendChild(
        doc.createTextNode("Ferrari 101"));
        supercar.appendChild(carname);

        Element carname1 = doc.createElement("carname");
        Attr attrType1 = doc.createAttribute("type");
        attrType1.setValue("sports");
        carname1.setAttributeNode(attrType1);
        carname1.appendChild(
        doc.createTextNode("Ferrari 202"));
        supercar.appendChild(carname1);
		
		return doc;

	}

}