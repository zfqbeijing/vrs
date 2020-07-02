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
@Table ( name ="employeeec" , schema = "")
public class Employeeec  implements Serializable {

	private static final long serialVersionUID =  1811479831604525169L;

	@Id
   	@Column(name = "id" )
	private Long id;

	/**
	 * 员工编号
	 */
   	@Column(name = "eid" )
	private Long eid;

	/**
	 * 奖罚日期
	 */
   	@Column(name = "ecDate" )
	private Date ecDate;

	/**
	 * 奖罚原因
	 */
   	@Column(name = "ecReason" )
	private String ecReason;

	/**
	 * 奖罚分
	 */
   	@Column(name = "ecPoint" )
	private Long ecPoint;

	/**
	 * 奖罚类别，0：奖，1：罚
	 */
   	@Column(name = "ecType" )
	private Long ecType;

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

	public Date getEcDate() {
		return this.ecDate;
	}

	public void setEcDate(Date ecDate) {
		this.ecDate = ecDate;
	}

	public String getEcReason() {
		return this.ecReason;
	}

	public void setEcReason(String ecReason) {
		this.ecReason = ecReason;
	}

	public Long getEcPoint() {
		return this.ecPoint;
	}

	public void setEcPoint(Long ecPoint) {
		this.ecPoint = ecPoint;
	}

	public Long getEcType() {
		return this.ecType;
	}

	public void setEcType(Long ecType) {
		this.ecType = ecType;
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
					"ecDate='" + ecDate + '\'' +
					"ecReason='" + ecReason + '\'' +
					"ecPoint='" + ecPoint + '\'' +
					"ecType='" + ecType + '\'' +
					"remark='" + remark + '\'' +
				'}';
	}

}
