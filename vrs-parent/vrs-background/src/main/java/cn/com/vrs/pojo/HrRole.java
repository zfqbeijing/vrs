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
@Table ( name ="hr_role" , schema = "")
public class HrRole  implements Serializable {

	private static final long serialVersionUID =  3893084271049258979L;

	@Id
   	@Column(name = "id" )
	private Long id;

   	@Column(name = "hrid" )
	private Long hrid;

   	@Column(name = "rid" )
	private Long rid;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getHrid() {
		return this.hrid;
	}

	public void setHrid(Long hrid) {
		this.hrid = hrid;
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
					"hrid='" + hrid + '\'' +
					"rid='" + rid + '\'' +
				'}';
	}

}
