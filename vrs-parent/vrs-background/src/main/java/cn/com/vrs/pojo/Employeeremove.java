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
@Table ( name ="employeeremove" , schema = "")
public class Employeeremove  implements Serializable {

	private static final long serialVersionUID =  16612468872294099L;

	@Id
   	@Column(name = "id" )
	private Long id;

   	@Column(name = "eid" )
	private Long eid;

	/**
	 * 调动后部门
	 */
   	@Column(name = "afterDepId" )
	private Long afterDepId;

	/**
	 * 调动后职位
	 */
   	@Column(name = "afterJobId" )
	private Long afterJobId;

	/**
	 * 调动日期
	 */
   	@Column(name = "removeDate" )
	private Date removeDate;

	/**
	 * 调动原因
	 */
   	@Column(name = "reason" )
	private String reason;

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

	public Long getAfterDepId() {
		return this.afterDepId;
	}

	public void setAfterDepId(Long afterDepId) {
		this.afterDepId = afterDepId;
	}

	public Long getAfterJobId() {
		return this.afterJobId;
	}

	public void setAfterJobId(Long afterJobId) {
		this.afterJobId = afterJobId;
	}

	public Date getRemoveDate() {
		return this.removeDate;
	}

	public void setRemoveDate(Date removeDate) {
		this.removeDate = removeDate;
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
					"afterDepId='" + afterDepId + '\'' +
					"afterJobId='" + afterJobId + '\'' +
					"removeDate='" + removeDate + '\'' +
					"reason='" + reason + '\'' +
					"remark='" + remark + '\'' +
				'}';
	}

}
