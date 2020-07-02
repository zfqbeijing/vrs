package cn.com.vrs.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import java.io.Serializable;

/**
 * @Description  
 * @Author  linmengmeng
 * @Date 2020-06-30 11:03:12 
 */

@Entity
@Table ( name ="department" , schema = "")
public class Department  implements Serializable {

	private static final long serialVersionUID =  416486098444006454L;

	@Id
   	@Column(name = "id" )
	private Long id;

	/**
	 * 部门名称
	 */
   	@Column(name = "name" )
	private String name;

   	@Column(name = "parentId" )
	private Long parentId;

   	@Column(name = "depPath" )
	private String depPath;

   	@Column(name = "enabled" )
	private Integer enabled;

   	@Column(name = "isParent" )
	private Integer isParent;

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

	public Long getParentId() {
		return this.parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getDepPath() {
		return this.depPath;
	}

	public void setDepPath(String depPath) {
		this.depPath = depPath;
	}

	public Integer getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	public Integer getIsParent() {
		return this.isParent;
	}

	public void setIsParent(Integer isParent) {
		this.isParent = isParent;
	}

	@Override
	public String toString() {
		return "{" +
					"id='" + id + '\'' +
					"name='" + name + '\'' +
					"parentId='" + parentId + '\'' +
					"depPath='" + depPath + '\'' +
					"enabled='" + enabled + '\'' +
					"isParent='" + isParent + '\'' +
				'}';
	}

}
