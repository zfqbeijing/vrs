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
@Table ( name ="employeetrain" , schema = "")
public class Employeetrain  implements Serializable {

	private static final long serialVersionUID =  8441065119114462587L;

	@Id
   	@Column(name = "id" )
	private Long id;

	/**
	 * 员工编号
	 */
   	@Column(name = "eid" )
	private Long eid;

	/**
	 * 培训日期
	 */
   	@Column(name = "trainDate" )
	private Date trainDate;

	/**
	 * 培训内容
	 */
   	@Column(name = "trainContent" )
	private String trainContent;

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

	public Date getTrainDate() {
		return this.trainDate;
	}

	public void setTrainDate(Date trainDate) {
		this.trainDate = trainDate;
	}

	public String getTrainContent() {
		return this.trainContent;
	}

	public void setTrainContent(String trainContent) {
		this.trainContent = trainContent;
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
					"trainDate='" + trainDate + '\'' +
					"trainContent='" + trainContent + '\'' +
					"remark='" + remark + '\'' +
				'}';
	}

}
