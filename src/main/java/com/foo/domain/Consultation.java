package com.foo.domain;
import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import io.springlets.format.EntityFormat;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import java.math.BigDecimal;

/**
 * = Consultation
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity
@RooEquals(isJpaEntity = true)
public class Consultation {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Version
    private Integer version;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @EntityFormat
    private Patient patient;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "CONSULTATION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Calendar consultationDate;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private BigDecimal bmi;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private BigDecimal diabetesPedigreeFunction;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private BigDecimal prediction;

    /**
     * Sets prediction value
     *
     * @param prediction
     * @return Consultation
     */
    public Consultation setPrediction(BigDecimal prediction) {
        this.prediction = prediction;
        return this;
    }

    /**
     * Gets age value
     *
     * @return BigDecimal
     */
    public BigDecimal getAge() {
        return this.age;
    }

    /**
     * Gets diabetesPedigreeFunction value
     *
     * @return BigDecimal
     */
    public BigDecimal getDiabetesPedigreeFunction() {
        return this.diabetesPedigreeFunction;
    }

    /**
     * Gets insulin value
     *
     * @return BigDecimal
     */
    public BigDecimal getInsulin() {
        return this.insulin;
    }

    /**
     * Gets skinThickness value
     *
     * @return BigDecimal
     */
    public BigDecimal getSkinThickness() {
        return this.skinThickness;
    }

    /**
     * Gets glucose value
     *
     * @return BigDecimal
     */
    public BigDecimal getGlucose() {
        return this.glucose;
    }

    /**
     * Gets pregnancies value
     *
     * @return BigDecimal
     */
    public BigDecimal getPregnancies() {
        return this.pregnancies;
    }

    /**
     * Gets bmi value
     *
     * @return BigDecimal
     */
    public BigDecimal getBmi() {
        return this.bmi;
    }

    /**
     * Gets bloodPressure value
     *
     * @return BigDecimal
     */
    public BigDecimal getBloodPressure() {
        return this.bloodPressure;
    }

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private BigDecimal pregnancies;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private BigDecimal glucose;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private BigDecimal bloodPressure;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private BigDecimal skinThickness;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private BigDecimal insulin;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private BigDecimal age;
}
