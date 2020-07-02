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
@Table ( name ="position" , schema = "")
public class Position  implements Serializable {

	private static final long serialVersionUID =  3071073582617743305L;

	@Id
   	@Column(name = "id" )
	private Long id;

	/**
	 * 职位
	 */
   	@Column(name = "name" )
	private String name;

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
					"createDate='" + createDate + '\'' +
					"enabled='" + enabled + '\'' +
				'}';
	}

}
