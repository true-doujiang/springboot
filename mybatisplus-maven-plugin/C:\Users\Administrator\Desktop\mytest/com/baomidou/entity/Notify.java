package com.baomidou.entity;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 服务通知
 * </p>
 *
 * @author tangguo
 * @since 2018-06-17
 */
@TableName("mc_notify")
public class Notify implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	@TableId(type = IdType.UUID)
	private Long id;

	/**
	 * 用户id
	 */
	@TableField(value="user_id")
	private Long id;

	/**
	 * 用户id
	 */
	@TableField(value="open_id")
	private String id;

	/**
	 * 所需下发的模板消息的id
	 */
	@TableField(value="template_id")
	private Long id;

	/**
	 * 
	 */
	@TableField(value="form_id")
	private String id;

	/**
	 * 模板内容
	 */
	private String data;

	/**
	 * success: 提醒成功  fail提醒失败 init：未执行初始化
	 */
	@TableField(value="notify_result")
	private String result;

	/**
	 * 执行结果
	 */
	@TableField(value="notify_result_data")
	private String resultData;

	/**
	 * 提醒时间
	 */
	@TableField(value="notify_time")
	private Date time;

	/**
	 * 创建时间
	 */
	@TableField(value="create_time")
	private Date time;

	/**
	 * 修改时间
	 */
	@TableField(value="update_time")
	private Date time;

	/**
	 * 是否删除 0:否 1:是
	 */
	@TableField(value="is_deleted")
	private Integer deleted;



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getResultData() {
		return resultData;
	}

	public void setResultData(String resultData) {
		this.resultData = resultData;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Integer getDeleted() {
		return deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

}
