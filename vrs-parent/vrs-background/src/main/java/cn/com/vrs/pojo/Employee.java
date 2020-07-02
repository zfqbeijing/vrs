package cn.com.vrs.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Description  
 * @Author  linmengmeng
 * @Date 2020-06-30 11:03:12 
 */

@Entity
@Table ( name ="employee" , schema = "")
public class Employee  implements Serializable {

	private static final long serialVersionUID =  3982668939662438419L;

	/**
	 * 员工编号
	 */
	@Id
   	@Column(name = "id" )
	private Long id;

	/**
	 * 员工姓名
	 */
   	@Column(name = "name" )
	private String name;

	/**
	 * 性别
	 */
   	@Column(name = "gender" )
	private String gender;

	/**
	 * 出生日期
	 */
   	@Column(name = "birthday" )
	private Date birthday;

	/**
	 * 身份证号
	 */
   	@Column(name = "idCard" )
	private String idCard;

	/**
	 * 婚姻状况
	 */
   	@Column(name = "wedlock" )
	private String wedlock;

	/**
	 * 民族
	 */
   	@Column(name = "nationId" )
	private Long nationId;

	/**
	 * 籍贯
	 */
   	@Column(name = "nativePlace" )
	private String nativePlace;

	/**
	 * 政治面貌
	 */
   	@Column(name = "politicId" )
	private Long politicId;

	/**
	 * 邮箱
	 */
   	@Column(name = "email" )
	private String email;

	/**
	 * 电话号码
	 */
   	@Column(name = "phone" )
	private String phone;

	/**
	 * 联系地址
	 */
   	@Column(name = "address" )
	private String address;

	/**
	 * 所属部门
	 */
   	@Column(name = "departmentId" )
	private Long departmentId;

	/**
	 * 职称ID
	 */
   	@Column(name = "jobLevelId" )
	private Long jobLevelId;

	/**
	 * 职位ID
	 */
   	@Column(name = "posId" )
	private Long posId;

	/**
	 * 聘用形式
	 */
   	@Column(name = "engageForm" )
	private String engageForm;

	/**
	 * 最高学历
	 */
   	@Column(name = "tiptopDegree" )
	private String tiptopDegree;

	/**
	 * 所属专业
	 */
   	@Column(name = "specialty" )
	private String specialty;

	/**
	 * 毕业院校
	 */
   	@Column(name = "school" )
	private String school;

	/**
	 * 入职日期
	 */
   	@Column(name = "beginDate" )
	private Date beginDate;

	/**
	 * 在职状态
	 */
   	@Column(name = "workState" )
	private String workState;

	/**
	 * 工号
	 */
   	@Column(name = "workID" )
	private String workId;

	/**
	 * 合同期限
	 */
   	@Column(name = "contractTerm" )
	private BigDecimal contractTerm;

	/**
	 * 转正日期
	 */
   	@Column(name = "conversionTime" )
	private Date conversionTime;

	/**
	 * 离职日期
	 */
   	@Column(name = "notWorkDate" )
	private Date notWorkDate;

	/**
	 * 合同起始日期
	 */
   	@Column(name = "beginContract" )
	private Date beginContract;

	/**
	 * 合同终止日期
	 */
   	@Column(name = "endContract" )
	private Date endContract;

	/**
	 * 工龄
	 */
   	@Column(name = "workAge" )

	private Long workAge;
	private Nation nation;
	private Politicsstatus politicsstatus;
	private Department department;
	private Joblevel jobLevel;
	private Position position;
	private Salary salary;


	public Nation getNation() {
		return nation;
	}

	public void setNation(Nation nation) {
		this.nation = nation;
	}

	public Politicsstatus getPoliticsstatus() {
		return politicsstatus;
	}

	public void setPoliticsstatus(Politicsstatus politicsstatus) {
		this.politicsstatus = politicsstatus;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Joblevel getJobLevel() {
		return jobLevel;
	}

	public void setJobLevel(Joblevel jobLevel) {
		this.jobLevel = jobLevel;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

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

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getIdCard() {
		return this.idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getWedlock() {
		return this.wedlock;
	}

	public void setWedlock(String wedlock) {
		this.wedlock = wedlock;
	}

	public Long getNationId() {
		return this.nationId;
	}

	public void setNationId(Long nationId) {
		this.nationId = nationId;
	}

	public String getNativePlace() {
		return this.nativePlace;
	}

	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}

	public Long getPoliticId() {
		return this.politicId;
	}

	public void setPoliticId(Long politicId) {
		this.politicId = politicId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public Long getJobLevelId() {
		return this.jobLevelId;
	}

	public void setJobLevelId(Long jobLevelId) {
		this.jobLevelId = jobLevelId;
	}

	public Long getPosId() {
		return this.posId;
	}

	public void setPosId(Long posId) {
		this.posId = posId;
	}

	public String getEngageForm() {
		return this.engageForm;
	}

	public void setEngageForm(String engageForm) {
		this.engageForm = engageForm;
	}

	public String getTiptopDegree() {
		return this.tiptopDegree;
	}

	public void setTiptopDegree(String tiptopDegree) {
		this.tiptopDegree = tiptopDegree;
	}

	public String getSpecialty() {
		return this.specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public String getSchool() {
		return this.school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public Date getBeginDate() {
		return this.beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public String getWorkState() {
		return this.workState;
	}

	public void setWorkState(String workState) {
		this.workState = workState;
	}

	public String getWorkId() {
		return this.workId;
	}

	public void setWorkId(String workId) {
		this.workId = workId;
	}

	public BigDecimal getContractTerm() {
		return this.contractTerm;
	}

	public void setContractTerm(BigDecimal contractTerm) {
		this.contractTerm = contractTerm;
	}

	public Date getConversionTime() {
		return this.conversionTime;
	}

	public void setConversionTime(Date conversionTime) {
		this.conversionTime = conversionTime;
	}

	public Date getNotWorkDate() {
		return this.notWorkDate;
	}

	public void setNotWorkDate(Date notWorkDate) {
		this.notWorkDate = notWorkDate;
	}

	public Date getBeginContract() {
		return this.beginContract;
	}

	public void setBeginContract(Date beginContract) {
		this.beginContract = beginContract;
	}

	public Date getEndContract() {
		return this.endContract;
	}

	public void setEndContract(Date endContract) {
		this.endContract = endContract;
	}

	public Long getWorkAge() {
		return this.workAge;
	}

	public void setWorkAge(Long workAge) {
		this.workAge = workAge;
	}

	@Override
	public String toString() {
		return "{" +
					"id='" + id + '\'' +
					"name='" + name + '\'' +
					"gender='" + gender + '\'' +
					"birthday='" + birthday + '\'' +
					"idCard='" + idCard + '\'' +
					"wedlock='" + wedlock + '\'' +
					"nationId='" + nationId + '\'' +
					"nativePlace='" + nativePlace + '\'' +
					"politicId='" + politicId + '\'' +
					"email='" + email + '\'' +
					"phone='" + phone + '\'' +
					"address='" + address + '\'' +
					"departmentId='" + departmentId + '\'' +
					"jobLevelId='" + jobLevelId + '\'' +
					"posId='" + posId + '\'' +
					"engageForm='" + engageForm + '\'' +
					"tiptopDegree='" + tiptopDegree + '\'' +
					"specialty='" + specialty + '\'' +
					"school='" + school + '\'' +
					"beginDate='" + beginDate + '\'' +
					"workState='" + workState + '\'' +
					"workId='" + workId + '\'' +
					"contractTerm='" + contractTerm + '\'' +
					"conversionTime='" + conversionTime + '\'' +
					"notWorkDate='" + notWorkDate + '\'' +
					"beginContract='" + beginContract + '\'' +
					"endContract='" + endContract + '\'' +
					"workAge='" + workAge + '\'' +
				'}';
	}

}
