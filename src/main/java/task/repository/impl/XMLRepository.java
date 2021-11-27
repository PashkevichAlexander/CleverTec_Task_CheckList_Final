package task.repository.impl;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import task.entity.DiscountsState;
import task.entity.Item;
import task.exception.XMLRepositoryException;
import task.repository.Repository;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.Optional;
import java.util.Set;

public class XMLRepository implements Repository {

    private final String filepath;

    public XMLRepository(String filepath) {
        this.filepath = filepath;
    }

    public Optional<Item> find(int id) {
        File xmlFile = new File(filepath);
        DocumentBuilderFactory factory = DocumentBuilderFactory.newNSInstance();
        DocumentBuilder builder;
        try {
            builder = factory.newDocumentBuilder();
            Document document = builder.parse(xmlFile);
            document.getDocumentElement().normalize();
            NodeList nodeList = document.getElementsByTagName("item");
            for (int i = 0; i < nodeList.getLength(); i++) {
                if (getItem(nodeList.item(i)).getId() == id) {
                    return Optional.of(getItem(nodeList.item(i)));
                }
            }
        } catch (Exception exc) {
            throw new XMLRepositoryException("This file does not exist ");
        }
        return Optional.empty();
    }


    private Item getItem(Node node) {
        try {
            Item item = new Item();
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                item.setId(Integer.parseInt(getStringByTag("id", element)));
                item.setName(getStringByTag("name", element));
                item.setCost(Integer.parseInt(getStringByTag("cost", element)));
                item.setDiscounts(Set.of(DiscountsState.valueOf(getStringByTag("discount", element))));
            }
            return item;
        } catch (Exception exc) {
            throw new XMLRepositoryException("This item is incorrect");
        }
    }

    private String getStringByTag(String tag, Element element) {
        return element.getElementsByTagName(tag).item(0).getTextContent();
    }
}
