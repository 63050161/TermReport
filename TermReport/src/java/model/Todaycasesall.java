/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "TODAYCASESALL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Todaycasesall.findAll", query = "SELECT t FROM Todaycasesall t"),
    @NamedQuery(name = "Todaycasesall.findByYearCase", query = "SELECT t FROM Todaycasesall t WHERE t.yearCase = :yearCase"),
    @NamedQuery(name = "Todaycasesall.findByWeeknumCase", query = "SELECT t FROM Todaycasesall t WHERE t.weeknumCase = :weeknumCase"),
    @NamedQuery(name = "Todaycasesall.findByNewCase", query = "SELECT t FROM Todaycasesall t WHERE t.newCase = :newCase"),
    @NamedQuery(name = "Todaycasesall.findByTotalCase", query = "SELECT t FROM Todaycasesall t WHERE t.totalCase = :totalCase"),
    @NamedQuery(name = "Todaycasesall.findByNewCaseExcludeabroad", query = "SELECT t FROM Todaycasesall t WHERE t.newCaseExcludeabroad = :newCaseExcludeabroad"),
    @NamedQuery(name = "Todaycasesall.findByTotalCaseExcludeabroad", query = "SELECT t FROM Todaycasesall t WHERE t.totalCaseExcludeabroad = :totalCaseExcludeabroad"),
    @NamedQuery(name = "Todaycasesall.findByNewRecovered", query = "SELECT t FROM Todaycasesall t WHERE t.newRecovered = :newRecovered"),
    @NamedQuery(name = "Todaycasesall.findByTotalRecovered", query = "SELECT t FROM Todaycasesall t WHERE t.totalRecovered = :totalRecovered"),
    @NamedQuery(name = "Todaycasesall.findByNewDeath", query = "SELECT t FROM Todaycasesall t WHERE t.newDeath = :newDeath"),
    @NamedQuery(name = "Todaycasesall.findByTotalDeath", query = "SELECT t FROM Todaycasesall t WHERE t.totalDeath = :totalDeath"),
    @NamedQuery(name = "Todaycasesall.findByCaseForeign", query = "SELECT t FROM Todaycasesall t WHERE t.caseForeign = :caseForeign"),
    @NamedQuery(name = "Todaycasesall.findByCasePrison", query = "SELECT t FROM Todaycasesall t WHERE t.casePrison = :casePrison"),
    @NamedQuery(name = "Todaycasesall.findByCaseWalkin", query = "SELECT t FROM Todaycasesall t WHERE t.caseWalkin = :caseWalkin"),
    @NamedQuery(name = "Todaycasesall.findByCaseNewPrev", query = "SELECT t FROM Todaycasesall t WHERE t.caseNewPrev = :caseNewPrev"),
    @NamedQuery(name = "Todaycasesall.findByCaseNewDiff", query = "SELECT t FROM Todaycasesall t WHERE t.caseNewDiff = :caseNewDiff"),
    @NamedQuery(name = "Todaycasesall.findByDeathNewPrev", query = "SELECT t FROM Todaycasesall t WHERE t.deathNewPrev = :deathNewPrev"),
    @NamedQuery(name = "Todaycasesall.findByDeathNewDiff", query = "SELECT t FROM Todaycasesall t WHERE t.deathNewDiff = :deathNewDiff"),
    @NamedQuery(name = "Todaycasesall.findByUpdateDate", query = "SELECT t FROM Todaycasesall t WHERE t.updateDate = :updateDate")})
public class Todaycasesall implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "YEAR_CASE")
    private Integer yearCase;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "WEEKNUM_CASE")
    private Integer weeknumCase;
    @Column(name = "NEW_CASE")
    private Integer newCase;
    @Column(name = "TOTAL_CASE")
    private Integer totalCase;
    @Column(name = "NEW_CASE_EXCLUDEABROAD")
    private Integer newCaseExcludeabroad;
    @Column(name = "TOTAL_CASE_EXCLUDEABROAD")
    private Integer totalCaseExcludeabroad;
    @Column(name = "NEW_RECOVERED")
    private Integer newRecovered;
    @Column(name = "TOTAL_RECOVERED")
    private Integer totalRecovered;
    @Column(name = "NEW_DEATH")
    private Integer newDeath;
    @Column(name = "TOTAL_DEATH")
    private Integer totalDeath;
    @Column(name = "CASE_FOREIGN")
    private Integer caseForeign;
    @Column(name = "CASE_PRISON")
    private Integer casePrison;
    @Column(name = "CASE_WALKIN")
    private Integer caseWalkin;
    @Column(name = "CASE_NEW_PREV")
    private Integer caseNewPrev;
    @Column(name = "CASE_NEW_DIFF")
    private Integer caseNewDiff;
    @Column(name = "DEATH_NEW_PREV")
    private Integer deathNewPrev;
    @Column(name = "DEATH_NEW_DIFF")
    private Integer deathNewDiff;
    @Size(max = 80)
    @Column(name = "UPDATE_DATE")
    private String updateDate;

    public Todaycasesall() {
    }

    public Todaycasesall(Integer weeknumCase) {
        this.weeknumCase = weeknumCase;
    }

    public Integer getYearCase() {
        return yearCase;
    }

    public void setYearCase(Integer yearCase) {
        this.yearCase = yearCase;
    }

    public Integer getWeeknumCase() {
        return weeknumCase;
    }

    public void setWeeknumCase(Integer weeknumCase) {
        this.weeknumCase = weeknumCase;
    }

    public Integer getNewCase() {
        return newCase;
    }

    public void setNewCase(Integer newCase) {
        this.newCase = newCase;
    }

    public Integer getTotalCase() {
        return totalCase;
    }

    public void setTotalCase(Integer totalCase) {
        this.totalCase = totalCase;
    }

    public Integer getNewCaseExcludeabroad() {
        return newCaseExcludeabroad;
    }

    public void setNewCaseExcludeabroad(Integer newCaseExcludeabroad) {
        this.newCaseExcludeabroad = newCaseExcludeabroad;
    }

    public Integer getTotalCaseExcludeabroad() {
        return totalCaseExcludeabroad;
    }

    public void setTotalCaseExcludeabroad(Integer totalCaseExcludeabroad) {
        this.totalCaseExcludeabroad = totalCaseExcludeabroad;
    }

    public Integer getNewRecovered() {
        return newRecovered;
    }

    public void setNewRecovered(Integer newRecovered) {
        this.newRecovered = newRecovered;
    }

    public Integer getTotalRecovered() {
        return totalRecovered;
    }

    public void setTotalRecovered(Integer totalRecovered) {
        this.totalRecovered = totalRecovered;
    }

    public Integer getNewDeath() {
        return newDeath;
    }

    public void setNewDeath(Integer newDeath) {
        this.newDeath = newDeath;
    }

    public Integer getTotalDeath() {
        return totalDeath;
    }

    public void setTotalDeath(Integer totalDeath) {
        this.totalDeath = totalDeath;
    }

    public Integer getCaseForeign() {
        return caseForeign;
    }

    public void setCaseForeign(Integer caseForeign) {
        this.caseForeign = caseForeign;
    }

    public Integer getCasePrison() {
        return casePrison;
    }

    public void setCasePrison(Integer casePrison) {
        this.casePrison = casePrison;
    }

    public Integer getCaseWalkin() {
        return caseWalkin;
    }

    public void setCaseWalkin(Integer caseWalkin) {
        this.caseWalkin = caseWalkin;
    }

    public Integer getCaseNewPrev() {
        return caseNewPrev;
    }

    public void setCaseNewPrev(Integer caseNewPrev) {
        this.caseNewPrev = caseNewPrev;
    }

    public Integer getCaseNewDiff() {
        return caseNewDiff;
    }

    public void setCaseNewDiff(Integer caseNewDiff) {
        this.caseNewDiff = caseNewDiff;
    }

    public Integer getDeathNewPrev() {
        return deathNewPrev;
    }

    public void setDeathNewPrev(Integer deathNewPrev) {
        this.deathNewPrev = deathNewPrev;
    }

    public Integer getDeathNewDiff() {
        return deathNewDiff;
    }

    public void setDeathNewDiff(Integer deathNewDiff) {
        this.deathNewDiff = deathNewDiff;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (weeknumCase != null ? weeknumCase.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Todaycasesall)) {
            return false;
        }
        Todaycasesall other = (Todaycasesall) object;
        if ((this.weeknumCase == null && other.weeknumCase != null) || (this.weeknumCase != null && !this.weeknumCase.equals(other.weeknumCase))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Todaycasesall[ weeknumCase=" + weeknumCase + " ]";
    }
    
}
