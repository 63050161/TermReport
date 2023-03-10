
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="week_case" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findData", propOrder = {
    "weekCase"
})
public class FindData {

    @XmlElement(name = "week_case")
    protected int weekCase;

    /**
     * Gets the value of the weekCase property.
     * 
     */
    public int getWeekCase() {
        return weekCase;
    }

    /**
     * Sets the value of the weekCase property.
     * 
     */
    public void setWeekCase(int value) {
        this.weekCase = value;
    }

}
