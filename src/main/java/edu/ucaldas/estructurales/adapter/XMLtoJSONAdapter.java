package edu.ucaldas.estructurales.adapter;

public class XMLtoJSONAdapter implements JSONService {
    private XMLService xmlService;

    public XMLtoJSONAdapter(XMLService xmlService) {
        this.xmlService = xmlService;
    }

    public String getJSON() {
        String xml = xmlService.getData();
        // Simple XML -> JSON conversion for <tag>value</tag> format
        String result = xml.trim();
        result = result.replaceAll("<([^/][^>]*)>([^<]*)</[^>]+>", "{\"$1\":\"$2\"}");
        return result;
    }
}