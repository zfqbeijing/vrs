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
@Table ( name ="appraise" , schema = "")
public class Appraise  implements Serializable {

	private static final long serialVersionUID =  5863128212084148109L;

	@Id
   	@Column(name = "id" )
	private Long id;

   	@Column(name = "eid" )
	private Long eid;

	/**
	 * 考评日期
	 */
   	@Column(name = "appDate" )
	private Date appDate;

	/**
	 * 考评结果
	 */
   	@Column(name = "appResult" )
	private String appResult;

	/**
	 * 考评内容
	 */
   	@Column(name = "appContent" )
	private String appContent;

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

	public Date getAppDate() {
		return this.appDate;
	}

	public void setAppDate(Date appDate) {
		this.appDate = appDate;
	}

	public String getAppResult() {
		return this.appResult;
	}

	public void setAppResult(String appResult) {
		this.appResult = appResult;
	}

	public String getAppContent() {
		return this.appContent;
	}

	public void setAppContent(String appContent) {
		this.appContent = appContent;
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
					"appDate='" + appDate + '\'' +
					"appResult='" + appResult + '\'' +
					"appContent='" + appContent + '\'' +
					"remark='" + remark + '\'' +
				'}';
	}

}
