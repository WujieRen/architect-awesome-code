package com.architectawesome.cornerstone.parsexml.lemontest.model;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Created by renwujie on 2018/07/03 at 12:30
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "algrithm")
public class Algrithm  extends AlgrithmPackge{

    private static final long serialVersionUID = -4788516572800346983L;

    @XmlElementWrapper(name = "inputPropertys")
    @XmlElement(name = "property")
    private List<AlgrithmInputProperty> inputProperties;
    @XmlElementWrapper(name = "outputPropertys")
    @XmlElement(name = "property")
    private List<AlgrithmOutputProperty> outputProperties;
    //private List<AlgrithmoutputPropertyRole> outputProperties;
    @XmlElementWrapper(name = "relationAlgs")
    @XmlElement(name = "relationAlg")
    private List<AlgrithmPackgePropertyRelation> relationAlgProperties;

    public Algrithm() {
    }

    public List<AlgrithmInputProperty> getInputProperties() {
        return inputProperties;
    }

    public void setInputProperties(List<AlgrithmInputProperty> inputProperties) {
        this.inputProperties = inputProperties;
    }

    public List<AlgrithmOutputProperty> getOutputProperties() {
        return outputProperties;
    }

    public void setOutputProperties(List<AlgrithmOutputProperty> outputProperties) {
        this.outputProperties = outputProperties;
    }

    public List<AlgrithmPackgePropertyRelation> getRelationAlgProperties() {
        return relationAlgProperties;
    }

    public void setRelationAlgProperties(List<AlgrithmPackgePropertyRelation> relationAlgProperties) {
        this.relationAlgProperties = relationAlgProperties;
    }

    @Override
    public String toString() {
        return "Algrithm{" +
                "inputProperties=" + inputProperties +
                ", outputProperties=" + outputProperties +
                ", relationAlgProperties=" + relationAlgProperties +
                '}';
    }
}
