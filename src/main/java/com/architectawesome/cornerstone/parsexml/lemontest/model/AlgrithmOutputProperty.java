package com.architectawesome.cornerstone.parsexml.lemontest.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 
 * </p>
 *
 * @author ly
 * @since 2018-06-26
 */
@ApiModel("AlgrithmOutputProperty")
@TableName("algrithm_output_property")
public class AlgrithmOutputProperty extends Model<AlgrithmOutputProperty> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(type = IdType.UUID)
    private String id;
    /**
     * 创建时间
     */
    @TableField(value = "create_time",update = "now()",fill =FieldFill.INSERT)
    private Date createTime;
    /**
     * 创建用户
     */
    @TableField("create_user")
    private String createUser;
    /**
     * 修改时间
     */
    @TableField("update_time")
    private Date updateTime;
    /**
     * 修改用户
     */
    @TableField("update_user")
    private String updateUser;
    /**
     * 输出数据类型
     */
    @ApiModelProperty("输出数据类型")
    @TableField("output_data_type")
    private String outputDataType;
    /**
     * 输出数据名称
     */
    @ApiModelProperty("输出数据名称")
    @TableField("output_name")
    private String outputName;
    /**
     * 输出数据描述
     */
    @ApiModelProperty("输出数据描述")
    @TableField("output_desc")
    private String outputDesc;
    /**
     * 算法ID
     */
    @ApiModelProperty("算法ID")
    @TableField("algrithm_id")
    private String algrithmId;
    /**
     * 输出参数角色,包含：view_data_table(界面展示表格数据)，view_data_line(界面展示折线图数据)，view_data_pie(界面展示饼图数据)，view_data_bar(界面展示柱状图数据)，view_data_scatter(界面展示散点图数据)，view_data_pic(界面展示图片数据),view_data_log(界面展示日志数据)，view_data_tree(界面展示决策树数据)，alg_input_data(输入算法数据)，可包含多个角色，逗号分隔
     */
    @ApiModelProperty("输出参数角色,包含：view_data_table(界面展示表格数据)，view_data_line(界面展示折线图数据)，view_data_pie(界面展示饼图数据)，view_data_bar(界面展示柱状图数据)，view_data_scatter(界面展示散点图数据)，view_data_pic(界面展示图片数据),view_data_log(界面展示日志数据)，view_data_tree(界面展示决策树数据)，alg_input_data(输入算法数据)，可包含多个角色，逗号分隔")
    @TableField("output_property_role")
    private String outputPropertyRole;

    @TableField(exist = false)
    @XmlElementWrapper(name = "outputPropertyRoles")
    @XmlElement(name = "role")
    private List<String> outputPropertyRoleList;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public String getOutputDataType() {
        return outputDataType;
    }

    public void setOutputDataType(String outputDataType) {
        this.outputDataType = outputDataType;
    }

    public String getOutputName() {
        return outputName;
    }

    public void setOutputName(String outputName) {
        this.outputName = outputName;
    }

    public String getOutputDesc() {
        return outputDesc;
    }

    public void setOutputDesc(String outputDesc) {
        this.outputDesc = outputDesc;
    }

    public String getAlgrithmId() {
        return algrithmId;
    }

    public void setAlgrithmId(String algrithmId) {
        this.algrithmId = algrithmId;
    }

    public String getOutputPropertyRole() {
        return String.join(",", this.outputPropertyRoleList);
    }

    public void setOutputPropertyRole(String outputPropertyRole) {
        this.outputPropertyRole = String.join(",", this.outputPropertyRoleList);;
    }

    @XmlTransient
    public List<String> getOutputPropertyRoleList() {
        return outputPropertyRoleList;
    }

    public void setOutputPropertyRoleList(List<String> outputPropertyRoleList) {
        this.outputPropertyRoleList = outputPropertyRoleList;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "AlgrithmOutputProperty{" +
        ", id=" + id +
        ", createTime=" + createTime +
        ", createUser=" + createUser +
        ", updateTime=" + updateTime +
        ", updateUser=" + updateUser +
        ", outputDataType=" + outputDataType +
        ", outputName=" + outputName +
        ", outputDesc=" + outputDesc +
        ", algrithmId=" + algrithmId +
            ", outputPropertyRole=" + getOutputPropertyRole() +
        "}";
    }
}
