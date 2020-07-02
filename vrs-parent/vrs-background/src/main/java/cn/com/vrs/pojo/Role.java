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
@Table ( name ="role" , schema = "")
public class Role  implements Serializable {

	private static final long serialVersionUID =  8413327866263410887L;

	@Id
   	@Column(name = "id" )
	private Long id;

   	@Column(name = "name" )
	private String name;

	/**
	 * 角色名称
	 */
   	@Column(name = "nameZh" )
	private String nameZh;

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

	public String getNameZh() {
		return this.nameZh;
	}

	public void setNameZh(String nameZh) {
		this.nameZh = nameZh;
	}

	@Override
	public String toString() {
		return "{" +
					"id='" + id + '\'' +
					"name='" + name + '\'' +
					"nameZh='" + nameZh + '\'' +
				'}';
	}

}
