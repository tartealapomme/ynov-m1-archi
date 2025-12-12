package org.example.structural.tp.adapter;

public class XmlDataAdapter implements DataFormat {
    private XmlData xmlData;

    public XmlDataAdapter(XmlData xmlData) {
        this.xmlData = xmlData;
    }

    @Override
    public void displayData(String data) {
        xmlData.displayXmlData(data);
    }
}

