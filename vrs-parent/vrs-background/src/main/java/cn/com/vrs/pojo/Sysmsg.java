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
@Table ( name ="sysmsg" , schema = "")
public class Sysmsg  implements Serializable {

	private static final long serialVersionUID =  3502090457965832969L;

	@Id
   	@Column(name = "id" )
	private Long id;

	/**
	 * 消息id
	 */
   	@Column(name = "mid" )
	private Long mid;

	/**
	 * 0表示群发消息
	 */
   	@Column(name = "type" )
	private Long type;

	/**
	 * 这条消息是给谁的
	 */
   	@Column(name = "hrid" )
	private Long hrid;

	/**
	 * 0 未读 1 已读
	 */
   	@Column(name = "state" )
	private Long state;

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

	public Long getType() {
		return this.type;
	}

	public void setType(Long type) {
		this.type = type;
	}

	public Long getHrid() {
		return this.hrid;
	}

	public void setHrid(Long hrid) {
		this.hrid = hrid;
	}

	public Long getState() {
		return this.state;
	}

	public void setState(Long state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "{" +
					"id='" + id + '\'' +
					"mid='" + mid + '\'' +
					"type='" + type + '\'' +
					"hrid='" + hrid + '\'' +
					"state='" + state + '\'' +
				'}';
	}

}
