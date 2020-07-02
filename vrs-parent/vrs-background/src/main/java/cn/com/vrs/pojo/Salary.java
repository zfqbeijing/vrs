package cn.com.vrs.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

/**
 * @Description  
 * @Author  linmengmeng
 * @Date 2020-06-30 11:03:12 
 */

@Entity
@Table ( name ="salary" , schema = "")
public class Salary  implements Serializable {

	private static final long serialVersionUID =  4085388938610729853L;

	@Id
   	@Column(name = "id" )
	private Long id;

	/**
	 * 基本工资
	 */
   	@Column(name = "basicSalary" )
	private Long basicSalary;

	/**
	 * 奖金
	 */
   	@Column(name = "bonus" )
	private Long bonus;

	/**
	 * 午餐补助
	 */
   	@Column(name = "lunchSalary" )
	private Long lunchSalary;

	/**
	 * 交通补助
	 */
   	@Column(name = "trafficSalary" )
	private Long trafficSalary;

	/**
	 * 应发工资
	 */
   	@Column(name = "allSalary" )
	private Long allSalary;

	/**
	 * 养老金基数
	 */
   	@Column(name = "pensionBase" )
	private Long pensionBase;

	/**
	 * 养老金比率
	 */
   	@Column(name = "pensionPer" )
	private BigDecimal pensionPer;

	/**
	 * 启用时间
	 */
   	@Column(name = "createDate" )
	private Date createDate;

	/**
	 * 医疗基数
	 */
   	@Column(name = "medicalBase" )
	private Long medicalBase;

	/**
	 * 医疗保险比率
	 */
   	@Column(name = "medicalPer" )
	private BigDecimal medicalPer;

	/**
	 * 公积金基数
	 */
   	@Column(name = "accumulationFundBase" )
	private Long accumulationFundBase;

	/**
	 * 公积金比率
	 */
   	@Column(name = "accumulationFundPer" )
	private BigDecimal accumulationFundPer;

   	@Column(name = "name" )
	private String name;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBasicSalary() {
		return this.basicSalary;
	}

	public void setBasicSalary(Long basicSalary) {
		this.basicSalary = basicSalary;
	}

	public Long getBonus() {
		return this.bonus;
	}

	public void setBonus(Long bonus) {
		this.bonus = bonus;
	}

	public Long getLunchSalary() {
		return this.lunchSalary;
	}

	public void setLunchSalary(Long lunchSalary) {
		this.lunchSalary = lunchSalary;
	}

	public Long getTrafficSalary() {
		return this.trafficSalary;
	}

	public void setTrafficSalary(Long trafficSalary) {
		this.trafficSalary = trafficSalary;
	}

	public Long getAllSalary() {
		return this.allSalary;
	}

	public void setAllSalary(Long allSalary) {
		this.allSalary = allSalary;
	}

	public Long getPensionBase() {
		return this.pensionBase;
	}

	public void setPensionBase(Long pensionBase) {
		this.pensionBase = pensionBase;
	}

	public BigDecimal getPensionPer() {
		return this.pensionPer;
	}

	public void setPensionPer(BigDecimal pensionPer) {
		this.pensionPer = pensionPer;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Long getMedicalBase() {
		return this.medicalBase;
	}

	public void setMedicalBase(Long medicalBase) {
		this.medicalBase = medicalBase;
	}

	public BigDecimal getMedicalPer() {
		return this.medicalPer;
	}

	public void setMedicalPer(BigDecimal medicalPer) {
		this.medicalPer = medicalPer;
	}

	public Long getAccumulationFundBase() {
		return this.accumulationFundBase;
	}

	public void setAccumulationFundBase(Long accumulationFundBase) {
		this.accumulationFundBase = accumulationFundBase;
	}

	public BigDecimal getAccumulationFundPer() {
		return this.accumulationFundPer;
	}

	public void setAccumulationFundPer(BigDecimal accumulationFundPer) {
		this.accumulationFundPer = accumulationFundPer;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "{" +
					"id='" + id + '\'' +
					"basicSalary='" + basicSalary + '\'' +
					"bonus='" + bonus + '\'' +
					"lunchSalary='" + lunchSalary + '\'' +
					"trafficSalary='" + trafficSalary + '\'' +
					"allSalary='" + allSalary + '\'' +
					"pensionBase='" + pensionBase + '\'' +
					"pensionPer='" + pensionPer + '\'' +
					"createDate='" + createDate + '\'' +
					"medicalBase='" + medicalBase + '\'' +
					"medicalPer='" + medicalPer + '\'' +
					"accumulationFundBase='" + accumulationFundBase + '\'' +
					"accumulationFundPer='" + accumulationFundPer + '\'' +
					"name='" + name + '\'' +
				'}';
	}

}
