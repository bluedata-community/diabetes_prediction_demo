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
    private Integer pregnancies;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private Integer glucose;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private Integer bloodPressure;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private Integer skinThickness;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private Integer insulin;

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
    private Integer age;

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
}
