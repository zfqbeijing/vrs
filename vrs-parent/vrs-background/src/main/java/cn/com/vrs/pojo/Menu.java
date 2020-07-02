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
@Table ( name ="menu" , schema = "")
public class Menu  implements Serializable {

	private static final long serialVersionUID =  2142922018355441838L;

	@Id
   	@Column(name = "id" )
	private Long id;

   	@Column(name = "url" )
	private String url;

   	@Column(name = "path" )
	private String path;

   	@Column(name = "component" )
	private String component;

   	@Column(name = "name" )
	private String name;

   	@Column(name = "iconCls" )
	private String iconCls;

   	@Column(name = "keepAlive" )
	private Integer keepAlive;

   	@Column(name = "requireAuth" )
	private Integer requireAuth;

   	@Column(name = "parentId" )
	private Long parentId;

   	@Column(name = "enabled" )
	private Integer enabled;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getComponent() {
		return this.component;
	}

	public void setComponent(String component) {
		this.component = component;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIconCls() {
		return this.iconCls;
	}

	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}

	public Integer getKeepAlive() {
		return this.keepAlive;
	}

	public void setKeepAlive(Integer keepAlive) {
		this.keepAlive = keepAlive;
	}

	public Integer getRequireAuth() {
		return this.requireAuth;
	}

	public void setRequireAuth(Integer requireAuth) {
		this.requireAuth = requireAuth;
	}

	public Long getParentId() {
		return this.parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
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
					"url='" + url + '\'' +
					"path='" + path + '\'' +
					"component='" + component + '\'' +
					"name='" + name + '\'' +
					"iconCls='" + iconCls + '\'' +
					"keepAlive='" + keepAlive + '\'' +
					"requireAuth='" + requireAuth + '\'' +
					"parentId='" + parentId + '\'' +
					"enabled='" + enabled + '\'' +
				'}';
	}

}
