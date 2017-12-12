package com.company.ElementImplementation.Builder;

import com.company.ElementImplementation.Composite.Element;
import com.company.ElementImplementation.Paragraph;
import com.company.ElementImplementation.Proxy.Image;
import com.company.ElementImplementation.Proxy.ImageProxy;
import com.company.ElementImplementation.Section;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;

public class JSONBuilder implements IBuilder {

    private String filName;
    private Element result;
    public JSONBuilder(String fileName)
    {
        this.filName = fileName;
    }

    @Override
    public IBuilder buildPart() {
        JSONParser parser = new JSONParser();
        try {
            JSONObject jsonObject = (JSONObject) parser.parse(new FileReader(filName));;
            result = GetElement(jsonObject);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    private Element GetElement(JSONObject jsonObject) {
        String type = (String) jsonObject.get("class");
        switch (type)
        {
            case "Section":
            {
                String title = (String) jsonObject.get("title");
                Section section = new Section(title);
                JSONArray childrensAsJson = (JSONArray)jsonObject.get("children");
                for(int i = 0;i<childrensAsJson.size();i++)
                    section.addElement(GetElement((JSONObject) childrensAsJson.get(i)));
                return section;
            }
            case "Paragraph":
            {
                String text =(String)jsonObject.get("text");
                return new Paragraph().setText(text);
            }
            case "ImageProxy":
            {
                String url =(String)jsonObject.get("url");
                return new ImageProxy(url);
            }
            case "Image": {
                String url =(String)jsonObject.get("url");
                return new Image(url);
            }
            default: return null;
        }
    }

    @Override
    public Element getResult() {
        return result;
    }
}
