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
@Table ( name ="joblevel" , schema = "")
public class Joblevel  implements Serializable {

	private static final long serialVersionUID =  7498134577939575551L;

	@Id
   	@Column(name = "id" )
	private Long id;

	/**
	 * 职称名称
	 */
   	@Column(name = "name" )
	private String name;

   	@Column(name = "titleLevel" )
	private String titleLevel;

   	@Column(name = "createDate" )
	private Date createDate;

   	@Column(name = "enabled" )
	private Integer enabled;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitleLevel() {
		return this.titleLevel;
	}

	public void setTitleLevel(String titleLevel) {
		this.titleLevel = titleLevel;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Integer getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "{" +
					"id='" + id + '\'' +
					"name='" + name + '\'' +
					"titleLevel='" + titleLevel + '\'' +
					"createDate='" + createDate + '\'' +
					"enabled='" + enabled + '\'' +
				'}';
	}

}
