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
@Table ( name ="oplog" , schema = "")
public class Oplog  implements Serializable {

	private static final long serialVersionUID =  3587400342792715777L;

	@Id
   	@Column(name = "id" )
	private Long id;

	/**
	 * 添加日期
	 */
   	@Column(name = "addDate" )
	private Date addDate;

	/**
	 * 操作内容
	 */
   	@Column(name = "operate" )
	private String operate;

	/**
	 * 操作员ID
	 */
   	@Column(name = "hrid" )
	private Long hrid;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getAddDate() {
		return this.addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	public String getOperate() {
		return this.operate;
	}

	public void setOperate(String operate) {
		this.operate = operate;
	}

	public Long getHrid() {
		return this.hrid;
	}

	public void setHrid(Long hrid) {
		this.hrid = hrid;
	}

	@Override
	public String toString() {
		return "{" +
					"id='" + id + '\'' +
					"addDate='" + addDate + '\'' +
					"operate='" + operate + '\'' +
					"hrid='" + hrid + '\'' +
				'}';
	}

}
