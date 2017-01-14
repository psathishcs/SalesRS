package org.sales.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TIMES")
public class Times implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="TIME_ID")
	private Date timeID;
	@Column(name="DAY_NAME") 
	private String dayName;
	@Column(name="DAY_NUMBER_IN_WEEK") 
	private Integer dayNumberInWeek;
	@Column(name="DAY_NUMBER_IN_MONTH") 
	private Integer dayNumberInMonth;
	@Column(name="CALENDAR_WEEK_NUMBER") 
	private Integer calanderWeekNumber;
	@Column(name="FISCAL_WEEK_NUMBER") 
	private Integer fisalWeekNumber;
	@Column(name="WEEK_ENDING_DAY") 
	private Date weekEndingDay;
	@Column(name="WEEK_ENDING_DAY_ID") 
	private Integer weekEndingDayID;
	@Column(name="CALENDAR_MONTH_NUMBER") 
	private Integer calanderMonthNumber;
	@Column(name="FISCAL_MONTH_NUMBER") 
	private Integer fisalMonthNumber;
	@Column(name="CALENDAR_MONTH_DESC") 
	private String calanderMonthDesc;
	@Column(name="CALENDAR_MONTH_ID") 
	private Integer calanderMonthID;
	@Column(name="FISCAL_MONTH_DESC")
	private String fisalMonthDesc;
	@Column(name="FISCAL_MONTH_ID")
	private Integer fisalMonthID;
	@Column(name="DAYS_IN_CAL_MONTH")
	private Integer daysInCalMonth;
	@Column(name="DAYS_IN_FIS_MONTH")
	private Integer daysInFisMonth;
	@Column(name="END_OF_CAL_MONTH")
	private Date endOfCalMonth;
	@Column(name="END_OF_FIS_MONTH") 
	private Date endOfFisMonth;
	@Column(name="CALENDAR_MONTH_NAME") 
	private String calanderMonthName;
	@Column(name="FISCAL_MONTH_NAME") 
	private String fisalMonthName;
	@Column(name="CALENDAR_QUARTER_DESC")
	private String calanderQuarterDesc;
	@Column(name="CALENDAR_QUARTER_ID")
	private Integer calanderQuarterID;
	@Column(name="FISCAL_QUARTER_DESC") 
	private String fisalQuarterDesc;
	@Column(name="FISCAL_QUARTER_ID") 
	private Integer fisalQuarterID;
	@Column(name="DAYS_IN_CAL_QUARTER")
	private Integer daysInCalQuarter;
	@Column(name="DAYS_IN_FIS_QUARTER") 
	private Integer daysInFisQuarter;
	@Column(name="END_OF_CAL_QUARTER")
	private Date endOfCalQuarter;
	@Column(name="END_OF_FIS_QUARTER") 
	private Date endOfFisQuarter;
	@Column(name="CALENDAR_QUARTER_NUMBER") 
	private Integer calanderQuarterNumber;
	@Column(name="FISCAL_QUARTER_NUMBER") 
	private Integer fisalQuarterNumber;
	@Column(name="CALENDAR_YEAR") 
	private Integer calanderYear;
	@Column(name="CALENDAR_YEAR_ID") 
	private Integer calanderYearID;
	@Column(name="FISCAL_YEAR") 
	private Integer fisalYear;
	@Column(name="FISCAL_YEAR_ID")
	private Integer fisalYearID;
	@Column(name="DAYS_IN_CAL_YEAR")
	private Integer daysInCalYear;
	@Column(name="DAYS_IN_FIS_YEAR") 
	private Integer daysInFisYear;
	@Column(name="END_OF_CAL_YEAR")
	private Date endOfCalYear;
	@Column(name="END_OF_FIS_YEAR") 
	private Date endOfFisYear;
	public Date getTimeID() {
		return timeID;
	}
	public void setTimeID(Date timeID) {
		this.timeID = timeID;
	}
	public String getDayName() {
		return dayName;
	}
	public void setDayName(String dayName) {
		this.dayName = dayName;
	}
	public Integer getDayNumberInWeek() {
		return dayNumberInWeek;
	}
	public void setDayNumberInWeek(Integer dayNumberInWeek) {
		this.dayNumberInWeek = dayNumberInWeek;
	}
	public Integer getDayNumberInMonth() {
		return dayNumberInMonth;
	}
	public void setDayNumberInMonth(Integer dayNumberInMonth) {
		this.dayNumberInMonth = dayNumberInMonth;
	}
	public Integer getCalanderWeekNumber() {
		return calanderWeekNumber;
	}
	public void setCalanderWeekNumber(Integer calanderWeekNumber) {
		this.calanderWeekNumber = calanderWeekNumber;
	}
	public Integer getFisalWeekNumber() {
		return fisalWeekNumber;
	}
	public void setFisalWeekNumber(Integer fisalWeekNumber) {
		this.fisalWeekNumber = fisalWeekNumber;
	}
	public Date getWeekEndingDay() {
		return weekEndingDay;
	}
	public void setWeekEndingDay(Date weekEndingDay) {
		this.weekEndingDay = weekEndingDay;
	}
	public Integer getWeekEndingDayID() {
		return weekEndingDayID;
	}
	public void setWeekEndingDayID(Integer weekEndingDayID) {
		this.weekEndingDayID = weekEndingDayID;
	}
	public Integer getCalanderMonthNumber() {
		return calanderMonthNumber;
	}
	public void setCalanderMonthNumber(Integer calanderMonthNumber) {
		this.calanderMonthNumber = calanderMonthNumber;
	}
	public Integer getFisalMonthNumber() {
		return fisalMonthNumber;
	}
	public void setFisalMonthNumber(Integer fisalMonthNumber) {
		this.fisalMonthNumber = fisalMonthNumber;
	}
	public String getCalanderMonthDesc() {
		return calanderMonthDesc;
	}
	public void setCalanderMonthDesc(String calanderMonthDesc) {
		this.calanderMonthDesc = calanderMonthDesc;
	}
	public Integer getCalanderMonthID() {
		return calanderMonthID;
	}
	public void setCalanderMonthID(Integer calanderMonthID) {
		this.calanderMonthID = calanderMonthID;
	}
	public String getFisalMonthDesc() {
		return fisalMonthDesc;
	}
	public void setFisalMonthDesc(String fisalMonthDesc) {
		this.fisalMonthDesc = fisalMonthDesc;
	}
	public Integer getFisalMonthID() {
		return fisalMonthID;
	}
	public void setFisalMonthID(Integer fisalMonthID) {
		this.fisalMonthID = fisalMonthID;
	}
	public Integer getDaysInCalMonth() {
		return daysInCalMonth;
	}
	public void setDaysInCalMonth(Integer daysInCalMonth) {
		this.daysInCalMonth = daysInCalMonth;
	}
	public Integer getDaysInFisMonth() {
		return daysInFisMonth;
	}
	public void setDaysInFisMonth(Integer daysInFisMonth) {
		this.daysInFisMonth = daysInFisMonth;
	}
	public Date getEndOfCalMonth() {
		return endOfCalMonth;
	}
	public void setEndOfCalMonth(Date endOfCalMonth) {
		this.endOfCalMonth = endOfCalMonth;
	}
	public Date getEndOfFisMonth() {
		return endOfFisMonth;
	}
	public void setEndOfFisMonth(Date endOfFisMonth) {
		this.endOfFisMonth = endOfFisMonth;
	}
	public String getCalanderMonthName() {
		return calanderMonthName;
	}
	public void setCalanderMonthName(String calanderMonthName) {
		this.calanderMonthName = calanderMonthName;
	}
	public String getFisalMonthName() {
		return fisalMonthName;
	}
	public void setFisalMonthName(String fisalMonthName) {
		this.fisalMonthName = fisalMonthName;
	}
	public String getCalanderQuarterDesc() {
		return calanderQuarterDesc;
	}
	public void setCalanderQuarterDesc(String calanderQuarterDesc) {
		this.calanderQuarterDesc = calanderQuarterDesc;
	}
	public Integer getCalanderQuarterID() {
		return calanderQuarterID;
	}
	public void setCalanderQuarterID(Integer calanderQuarterID) {
		this.calanderQuarterID = calanderQuarterID;
	}
	public String getFisalQuarterDesc() {
		return fisalQuarterDesc;
	}
	public void setFisalQuarterDesc(String fisalQuarterDesc) {
		this.fisalQuarterDesc = fisalQuarterDesc;
	}
	public Integer getFisalQuarterID() {
		return fisalQuarterID;
	}
	public void setFisalQuarterID(Integer fisalQuarterID) {
		this.fisalQuarterID = fisalQuarterID;
	}
	public Integer getDaysInCalQuarter() {
		return daysInCalQuarter;
	}
	public void setDaysInCalQuarter(Integer daysInCalQuarter) {
		this.daysInCalQuarter = daysInCalQuarter;
	}
	public Integer getDaysInFisQuarter() {
		return daysInFisQuarter;
	}
	public void setDaysInFisQuarter(Integer daysInFisQuarter) {
		this.daysInFisQuarter = daysInFisQuarter;
	}
	public Date getEndOfCalQuarter() {
		return endOfCalQuarter;
	}
	public void setEndOfCalQuarter(Date endOfCalQuarter) {
		this.endOfCalQuarter = endOfCalQuarter;
	}
	public Date getEndOfFisQuarter() {
		return endOfFisQuarter;
	}
	public void setEndOfFisQuarter(Date endOfFisQuarter) {
		this.endOfFisQuarter = endOfFisQuarter;
	}
	public Integer getCalanderQuarterNumber() {
		return calanderQuarterNumber;
	}
	public void setCalanderQuarterNumber(Integer calanderQuarterNumber) {
		this.calanderQuarterNumber = calanderQuarterNumber;
	}
	public Integer getFisalQuarterNumber() {
		return fisalQuarterNumber;
	}
	public void setFisalQuarterNumber(Integer fisalQuarterNumber) {
		this.fisalQuarterNumber = fisalQuarterNumber;
	}
	public Integer getCalanderYear() {
		return calanderYear;
	}
	public void setCalanderYear(Integer calanderYear) {
		this.calanderYear = calanderYear;
	}
	public Integer getCalanderYearID() {
		return calanderYearID;
	}
	public void setCalanderYearID(Integer calanderYearID) {
		this.calanderYearID = calanderYearID;
	}
	public Integer getFisalYear() {
		return fisalYear;
	}
	public void setFisalYear(Integer fisalYear) {
		this.fisalYear = fisalYear;
	}
	public Integer getFisalYearID() {
		return fisalYearID;
	}
	public void setFisalYearID(Integer fisalYearID) {
		this.fisalYearID = fisalYearID;
	}
	public Integer getDaysInCalYear() {
		return daysInCalYear;
	}
	public void setDaysInCalYear(Integer daysInCalYear) {
		this.daysInCalYear = daysInCalYear;
	}
	public Integer getDaysInFisYear() {
		return daysInFisYear;
	}
	public void setDaysInFisYear(Integer daysInFisYear) {
		this.daysInFisYear = daysInFisYear;
	}
	public Date getEndOfCalYear() {
		return endOfCalYear;
	}
	public void setEndOfCalYear(Date endOfCalYear) {
		this.endOfCalYear = endOfCalYear;
	}
	public Date getEndOfFisYear() {
		return endOfFisYear;
	}
	public void setEndOfFisYear(Date endOfFisYear) {
		this.endOfFisYear = endOfFisYear;
	}
	
}
