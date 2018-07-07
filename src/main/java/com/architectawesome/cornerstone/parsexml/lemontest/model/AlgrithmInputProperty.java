package com.architectawesome.cornerstone.parsexml.lemontest.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 算法输入参数表
 * </p>
 *
 * @author ly
 * @since 2018-06-26
 */
@ApiModel("AlgrithmInputProperty")
@TableName("algrithm_input_property")
public class AlgrithmInputProperty extends Model<AlgrithmInputProperty> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(type = IdType.UUID)
    private String id;
    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
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
     * 参数名
     */
    private String name;
    /**
     * 显示名称
     */
    @TableField("display_name")
    private String displayName;
    /**
     * 算法ID
     */
    @ApiModelProperty("算法ID")
    @TableField("algrithm_id")
    private String algrithmId;
    /**
     * 参数描述
     */
    @ApiModelProperty("参数描述")
    private String description;
    /**
     * 参数值数据类型
     */
    @ApiModelProperty("参数值数据类型")
    @TableField("data_type")
    private String dataType;
    /**
     * 参数值
     */
    @ApiModelProperty("参数值")
    private String value;
    /**
     * 参数值描述
     */
    @ApiModelProperty("参数值描述")
    @TableField("value_description")
    private String valueDescription;
    /**
     * 参数输入说明
     */
    @ApiModelProperty("参数输入说明")
    @TableField("value_input_desc")
    private String valueInputDesc;
    /**
     * 输入上限
     */
    @ApiModelProperty("输入上限")
    @TableField("value_max_length")
    private Integer valueMaxLength;
    /**
     * 输入下限
     */
    @ApiModelProperty("输入下限")
    @TableField("value_min_length")
    private Integer valueMinLength;
    /**
     * 是否默认,0默认，1不默认
     */
    @ApiModelProperty("是否默认,0默认，1不默认")
    @TableField("is_default")
    private Integer isDefault;
    /**
     * 是否可编辑,0可编辑，1不可编辑
     */
    @ApiModelProperty("是否可编辑,0可编辑，1不可编辑")
    @TableField("is_edit")
    private Integer isEdit;
    /**
     * 互斥参数名
     */
    @ApiModelProperty("互斥参数名")
    @TableField("exd_property_name")
    private String exdPropertyName;
    /**
     * 互斥参数值
     */
    @ApiModelProperty("互斥参数值")
    @TableField("exd_property_value")
    private String exdPropertyValue;
    /**
     * 关联参数名
     */
    @ApiModelProperty("关联参数名")
    @TableField("relation_property_name")
    private String relationPropertyName;
    /**
     * 关联参数值
     */
    @ApiModelProperty("关联参数值")
    @TableField("relation_property_value")
    private String relationPropertyValue;
    /**
     * 视图控件类型，控件类型为空表示为上一个节点输入,否则为配置参数需动态渲染配置表单
     */
    @ApiModelProperty("视图控件类型，控件类型为空表示为上一个节点输入,否则为配置参数需动态渲染配置表单")
    @TableField("view_type")
    private String viewType;
    /**
     * 控件值选项,仅当为下拉组件时存在
     */
    @ApiModelProperty("控件值选项,仅当为下拉组件时存在")
    @TableField("view_value_options")
    private String viewValueOptions;
    /**
     * 是否多选，仅为下拉时有效,0为否，1为是
     */
    @ApiModelProperty("是否多选，仅为下拉时有效,0为否，1为是")
    private Integer multiple;
    /**
     * 步长，类型为RANGE类型时有效
     */
    @ApiModelProperty("步长，类型为RANGE类型时有效")
    private Integer step;
    /**
     * 控件分组
     */
    @ApiModelProperty("控件分组")
    @TableField("view_group_id")
    private String viewGroupId;
    /**
     * 值来源，分为来源于界面用户定义：from_view，来源于算法：from_alg
     */
    @ApiModelProperty("值来源，分为来源于界面用户定义：from_view，来源于算法：from_alg")
    @TableField("value_from")
    private String valueFrom;


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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getAlgrithmId() {
        return algrithmId;
    }

    public void setAlgrithmId(String algrithmId) {
        this.algrithmId = algrithmId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValueDescription() {
        return valueDescription;
    }

    public void setValueDescription(String valueDescription) {
        this.valueDescription = valueDescription;
    }

    public String getValueInputDesc() {
        return valueInputDesc;
    }

    public void setValueInputDesc(String valueInputDesc) {
        this.valueInputDesc = valueInputDesc;
    }

    public Integer getValueMaxLength() {
        return valueMaxLength;
    }

    public void setValueMaxLength(Integer valueMaxLength) {
        this.valueMaxLength = valueMaxLength;
    }

    public Integer getValueMinLength() {
        return valueMinLength;
    }

    public void setValueMinLength(Integer valueMinLength) {
        this.valueMinLength = valueMinLength;
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    public Integer getIsEdit() {
        return isEdit;
    }

    public void setIsEdit(Integer isEdit) {
        this.isEdit = isEdit;
    }

    public String getExdPropertyName() {
        return exdPropertyName;
    }

    public void setExdPropertyName(String exdPropertyName) {
        this.exdPropertyName = exdPropertyName;
    }

    public String getExdPropertyValue() {
        return exdPropertyValue;
    }

    public void setExdPropertyValue(String exdPropertyValue) {
        this.exdPropertyValue = exdPropertyValue;
    }

    public String getRelationPropertyName() {
        return relationPropertyName;
    }

    public void setRelationPropertyName(String relationPropertyName) {
        this.relationPropertyName = relationPropertyName;
    }

    public String getRelationPropertyValue() {
        return relationPropertyValue;
    }

    public void setRelationPropertyValue(String relationPropertyValue) {
        this.relationPropertyValue = relationPropertyValue;
    }

    public String getViewType() {
        return viewType;
    }

    public void setViewType(String viewType) {
        this.viewType = viewType;
    }

    public String getViewValueOptions() {
        return viewValueOptions;
    }

    public void setViewValueOptions(String viewValueOptions) {
        this.viewValueOptions = viewValueOptions;
    }

    public Integer getMultiple() {
        return multiple;
    }

    public void setMultiple(Integer multiple) {
        this.multiple = multiple;
    }

    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public String getViewGroupId() {
        return viewGroupId;
    }

    public void setViewGroupId(String viewGroupId) {
        this.viewGroupId = viewGroupId;
    }

    public String getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(String valueFrom) {
        this.valueFrom = valueFrom;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "AlgrithmInputProperty{" +
        ", id=" + id +
        ", createTime=" + createTime +
        ", createUser=" + createUser +
        ", updateTime=" + updateTime +
        ", updateUser=" + updateUser +
        ", name=" + name +
        ", displayName=" + displayName +
        ", algrithmId=" + algrithmId +
        ", description=" + description +
        ", dataType=" + dataType +
        ", value=" + value +
        ", valueDescription=" + valueDescription +
        ", valueInputDesc=" + valueInputDesc +
        ", valueMaxLength=" + valueMaxLength +
        ", valueMinLength=" + valueMinLength +
        ", isDefault=" + isDefault +
        ", isEdit=" + isEdit +
        ", exdPropertyName=" + exdPropertyName +
        ", exdPropertyValue=" + exdPropertyValue +
        ", relationPropertyName=" + relationPropertyName +
        ", relationPropertyValue=" + relationPropertyValue +
        ", viewType=" + viewType +
        ", viewValueOptions=" + viewValueOptions +
        ", multiple=" + multiple +
        ", step=" + step +
        ", viewGroupId=" + viewGroupId +
        ", valueFrom=" + valueFrom +
        "}";
    }
}
