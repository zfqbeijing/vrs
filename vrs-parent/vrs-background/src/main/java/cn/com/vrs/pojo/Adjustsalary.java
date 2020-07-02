package cn.com.vrs.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import java.io.Serializable;
import java.util.Date;

/**
 * @Description  
 * @Author  linmengmeng
 * @Date 2020-06-30 11:03:12 
 */

@Entity
@Table ( name ="adjustsalary" , schema = "")
public class Adjustsalary  implements Serializable {

	private static final long serialVersionUID =  1180564002699505612L;

	@Id
   	@Column(name = "id" )
	private Long id;

   	@Column(name = "eid" )
	private Long eid;

	/**
	 * 调薪日期
	 */
   	@Column(name = "asDate" )
	private Date asDate;

	/**
	 * 调前薪资
	 */
   	@Column(name = "beforeSalary" )
	private Long beforeSalary;

	/**
	 * 调后薪资
	 */
   	@Column(name = "afterSalary" )
	private Long afterSalary;

	/**
	 * 调薪原因
	 */
   	@Column(name = "reason" )
	private String reason;

	/**
	 * 备注
	 */
   	@Column(name = "remark" )
	private String remark;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getEid() {
		return this.eid;
	}

	public void setEid(Long eid) {
		this.eid = eid;
	}

	public Date getAsDate() {
		return this.asDate;
	}

	public void setAsDate(Date asDate) {
		this.asDate = asDate;
	}

	public Long getBeforeSalary() {
		return this.beforeSalary;
	}

	public void setBeforeSalary(Long beforeSalary) {
		this.beforeSalary = beforeSalary;
	}

	public Long getAfterSalary() {
		return this.afterSalary;
	}

	public void setAfterSalary(Long afterSalary) {
		this.afterSalary = afterSalary;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "{" +
					"id='" + id + '\'' +
					"eid='" + eid + '\'' +
					"asDate='" + asDate + '\'' +
					"beforeSalary='" + beforeSalary + '\'' +
					"afterSalary='" + afterSalary + '\'' +
					"reason='" + reason + '\'' +
					"remark='" + remark + '\'' +
				'}';
	}

}
