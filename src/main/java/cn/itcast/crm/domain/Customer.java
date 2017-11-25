package cn.itcast.crm.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

/**
 * @description:客户信息表
 * 
 */
@Entity
@Table(name = "T_CUSTOMER")
@XmlRootElement // REST资源标识
@Data
public class Customer {
	@Id
	@GeneratedValue
	@Column(name = "C_ID")
	private Integer id; // 主键id
	@Column(name = "C_USERNAME")
	private String username; // 用户名
	@Column(name = "C_PASSWORD")
	private String password; // 密码
	@Column(name = "C_TYPE")
	private Integer type; // 类型 设置1 绑定邮箱
	@Column(name = "C_BRITHDAY")
	@Temporal(TemporalType.DATE)
	private Date birthday; // 生日
	@Column(name = "C_SEX")
	private Integer sex; // 性别 1男 2女
	@Column(name = "C_TELEPHONE")
	private String telephone; // 手机
	@Column(name = "C_COMPANY")
	private String company; // 公司
	@Column(name = "C_DEPARTMENT")
	private String department; // 部门
	@Column(name = "C_POSITION")
	private String position; // 职位
	@Column(name = "C_ADDRESS")
	private String address; // 地址
	@Column(name = "C_MOBILEPHONE")
	private String mobilePhone; // 座机
	@Column(name = "C_EMAIL")
	private String email; // 邮箱
	@Column(name = "C_Fixed_AREA_ID")
	private String fixedAreaId; // 定区编码
}