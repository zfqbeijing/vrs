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
@Table ( name ="empsalary" , schema = "")
public class Empsalary  implements Serializable {

	private static final long serialVersionUID =  4232038916939085123L;

	@Id
   	@Column(name = "id" )
	private Long id;

   	@Column(name = "eid" )
	private Long eid;

   	@Column(name = "sid" )
	private Long sid;

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

	public Long getSid() {
		return this.sid;
	}

	public void setSid(Long sid) {
		this.sid = sid;
	}

	@Override
	public String toString() {
		return "{" +
					"id='" + id + '\'' +
					"eid='" + eid + '\'' +
					"sid='" + sid + '\'' +
				'}';
	}

}
