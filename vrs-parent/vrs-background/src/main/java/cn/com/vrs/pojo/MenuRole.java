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
@Table ( name ="menu_role" , schema = "")
public class MenuRole  implements Serializable {

	private static final long serialVersionUID =  6812405980641239158L;

	@Id
   	@Column(name = "id" )
	private Long id;

   	@Column(name = "mid" )
	private Long mid;

   	@Column(name = "rid" )
	private Long rid;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMid() {
		return this.mid;
	}

	public void setMid(Long mid) {
		this.mid = mid;
	}

	public Long getRid() {
		return this.rid;
	}

	public void setRid(Long rid) {
		this.rid = rid;
	}

	@Override
	public String toString() {
		return "{" +
					"id='" + id + '\'' +
					"mid='" + mid + '\'' +
					"rid='" + rid + '\'' +
				'}';
	}

}
