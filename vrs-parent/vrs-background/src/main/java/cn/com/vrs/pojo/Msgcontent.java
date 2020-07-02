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
@Table ( name ="msgcontent" , schema = "")
public class Msgcontent  implements Serializable {

	private static final long serialVersionUID =  1470909269950879432L;

	@Id
   	@Column(name = "id" )
	private Long id;

   	@Column(name = "title" )
	private String title;

   	@Column(name = "message" )
	private String message;

   	@Column(name = "createDate" )
	private Date createDate;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "{" +
					"id='" + id + '\'' +
					"title='" + title + '\'' +
					"message='" + message + '\'' +
					"createDate='" + createDate + '\'' +
				'}';
	}

}
