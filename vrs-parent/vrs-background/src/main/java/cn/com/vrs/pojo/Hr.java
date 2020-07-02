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
@Table ( name ="hr" , schema = "")
public class Hr  implements Serializable {

	private static final long serialVersionUID =  8004203384174201855L;

	/**
	 * hrID
	 */
	@Id
   	@Column(name = "id" )
	private Long id;

	/**
	 * 姓名
	 */
   	@Column(name = "name" )
	private String name;

	/**
	 * 手机号码
	 */
   	@Column(name = "phone" )
	private String phone;

	/**
	 * 住宅电话
	 */
   	@Column(name = "telephone" )
	private String telephone;

	/**
	 * 联系地址
	 */
   	@Column(name = "address" )
	private String address;

   	@Column(name = "enabled" )
	private Integer enabled;

	/**
	 * 用户名
	 */
   	@Column(name = "username" )
	private String username;

	/**
	 * 密码
	 */
   	@Column(name = "password" )
	private String password;

   	@Column(name = "userface" )
	private String userface;

   	@Column(name = "remark" )
	private String remark;

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

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserface() {
		return this.userface;
	}

	public void setUserface(String userface) {
		this.userface = userface;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "{" +
					"id='" + id + '\'' +
					"name='" + name + '\'' +
					"phone='" + phone + '\'' +
					"telephone='" + telephone + '\'' +
					"address='" + address + '\'' +
					"enabled='" + enabled + '\'' +
					"username='" + username + '\'' +
					"password='" + password + '\'' +
					"userface='" + userface + '\'' +
					"remark='" + remark + '\'' +
				'}';
	}

}
