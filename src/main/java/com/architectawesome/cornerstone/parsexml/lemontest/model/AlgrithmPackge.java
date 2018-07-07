package com.architectawesome.cornerstone.parsexml.lemontest.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 算法表
 * </p>
 *
 * @author ly
 * @since 2018-06-26
 */
@ApiModel("algrithmPackge")
@TableName("algrithm_packge")
public class AlgrithmPackge extends Model<AlgrithmPackge> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(type = IdType.INPUT)
    private String id;
    /**
     * 算法名称,算法名称唯一
     */
    @ApiModelProperty("算法名称,算法名称唯一")
    private String name;
    /**
     * 算法显示名称
     */
    @ApiModelProperty("算法显示名称")
    @TableField("display_name")
    private String displayName;
    /**
     * 算法包类型，python、R、java jar
     */
    @ApiModelProperty("算法包类型，python、R、java jar")
    private String program;
    /**
     * 算法描述
     */
    @ApiModelProperty("算法描述")
    private String description;
    /**
     * 所属分组
     */
    @ApiModelProperty("分组id")
    @TableField("group_id")
    private String groupId;
    /**
     * 最多提供输入数量
     */
    @ApiModelProperty("最多提供输入数量")
    @TableField("max_parent")
    private Integer maxParent;
    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
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
     * 状态,0为正常状态，1为删除状态（不可用）
     */
    @ApiModelProperty("状态,0为正常状态，1为删除状态（不可用）")
    private Integer status;
    /**
     * 图标
     */
    @ApiModelProperty("图标")
    private String icon;
    /**
     * 存储路径
     */
    @ApiModelProperty("存储路径")
    @TableField("save_path")
    private String savePath;
    /**
     * 执行主文件
     */
    @ApiModelProperty("执行主文件")
    @TableField("main_class")
    private String mainClass;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Integer getMaxParent() {
        return maxParent;
    }

    public void setMaxParent(Integer maxParent) {
        this.maxParent = maxParent;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    public String getMainClass() {
        return mainClass;
    }

    public void setMainClass(String mainClass) {
        this.mainClass = mainClass;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "AlgrithmPackge{" +
        ", id=" + id +
        ", name=" + name +
        ", displayName=" + displayName +
        ", program=" + program +
        ", description=" + description +
        ", groupId=" + groupId +
        ", maxParent=" + maxParent +
        ", createTime=" + createTime +
        ", createUser=" + createUser +
        ", updateTime=" + updateTime +
        ", updateUser=" + updateUser +
        ", status=" + status +
        ", icon=" + icon +
        ", savePath=" + savePath +
        ", mainClass=" + mainClass +
        "}";
    }
}
