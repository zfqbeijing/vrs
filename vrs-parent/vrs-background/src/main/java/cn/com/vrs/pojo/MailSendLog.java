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
@Table ( name ="mail_send_log" , schema = "")
public class MailSendLog  implements Serializable {

	private static final long serialVersionUID =  803884085762704651L;

   	@Column(name = "msgId" )
	private String msgId;

   	@Column(name = "empId" )
	private Long empId;

	/**
	 * 0发送中，1发送成功，2发送失败
	 */
   	@Column(name = "status" )
	private Long status;

   	@Column(name = "routeKey" )
	private String routeKey;

   	@Column(name = "exchange" )
	private String exchange;

	/**
	 * 重试次数
	 */
   	@Column(name = "count" )
	private Long count;

	/**
	 * 第一次重试时间
	 */
   	@Column(name = "tryTime" )
	private Date tryTime;

   	@Column(name = "createTime" )
	private Date createTime;

   	@Column(name = "updateTime" )
	private Date updateTime;

	public String getMsgId() {
		return this.msgId;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public Long getEmpId() {
		return this.empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public Long getStatus() {
		return this.status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public String getRouteKey() {
		return this.routeKey;
	}

	public void setRouteKey(String routeKey) {
		this.routeKey = routeKey;
	}

	public String getExchange() {
		return this.exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public Long getCount() {
		return this.count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public Date getTryTime() {
		return this.tryTime;
	}

	public void setTryTime(Date tryTime) {
		this.tryTime = tryTime;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "{" +
					"msgId='" + msgId + '\'' +
					"empId='" + empId + '\'' +
					"status='" + status + '\'' +
					"routeKey='" + routeKey + '\'' +
					"exchange='" + exchange + '\'' +
					"count='" + count + '\'' +
					"tryTime='" + tryTime + '\'' +
					"createTime='" + createTime + '\'' +
					"updateTime='" + updateTime + '\'' +
				'}';
	}

}
