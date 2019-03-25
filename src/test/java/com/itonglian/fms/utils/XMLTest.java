package com.itonglian.fms.utils;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.assertj.core.util.Lists;

import java.util.List;

public class XMLTest {

    public static void main(String[] args){

        XStream xstream = new XStream();
        xstream.autodetectAnnotations(true);
        List<Enumeration> enumerations = Lists.list(new Enumeration("特急"),new Enumeration("紧急"));
        SimpleType simpleType = new SimpleType("紧急程度类型",new Restriction("xs:string",enumerations));

        String result = xstream.toXML(simpleType);
        System.out.println(result);
        StringBuffer stringBuffer = new StringBuffer();
    }

}


@Data
@AllArgsConstructor
@NoArgsConstructor
@XStreamAlias("xs:simpleType")
class SimpleType {
    @XStreamAsAttribute
    private String name;
    private Restriction restriction;
}
@Data
@AllArgsConstructor
@NoArgsConstructor
@XStreamAlias("xs:restriction")
class Restriction{
    @XStreamAsAttribute
    private String base;
    @XStreamImplicit(itemFieldName = "xs:enumeration")
    private List<Enumeration> enumerationList;
}
@Data
@AllArgsConstructor
@NoArgsConstructor
@XStreamAlias("xs:enumeration")
class Enumeration{
    @XStreamAsAttribute
    private String value;
}



