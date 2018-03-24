package com.stepp.dennis;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XLSTReader {

    public void transformXML(StreamSource source, StreamSource styleSource) throws Exception {

        TransformerFactory factory = TransformerFactory.newInstance();
        Transformer transformer = factory.newTransformer(styleSource);

        StreamResult result = new StreamResult(System.out);
        transformer.transform(source, result);
    }
}
