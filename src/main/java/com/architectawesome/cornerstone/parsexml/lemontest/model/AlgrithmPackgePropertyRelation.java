package com.architectawesome.cornerstone.parsexml.lemontest.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <p>
 * 算法参数关联表，表示哪些算法可以链接哪些算法，可以链接哪些算法的参数
 * </p>
 *
 * @author ly
 * @since 2018-06-26
 */
@ApiModel("algrithmPackgePropertyRelation")
@TableName("algrithm_packge_property_relation")
public class AlgrithmPackgePropertyRelation extends Model<AlgrithmPackgePropertyRelation> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(type =IdType.UUID)
    private String id;
    /**
     * 输入算法名称
     */
    @ApiModelProperty("输入算法名称")
    @TableField("input_alg_name")
    private String inputAlgName;
    /**
     * 输出算法名称
     */
    @ApiModelProperty("输出算法名称")
    @TableField("output_alg_name")
    private String outputAlgName;
    /**
     * 输入算法参数名称
     */
    @ApiModelProperty("输入算法参数名称")
    @TableField("input_alg_property_name")
    private String inputAlgPropertyName;
    /**
     * 输入算法参数名称
     */
    @ApiModelProperty("输入算法参数名称")
    @TableField("output_alg_property_name")
    private String outputAlgPropertyName;
    /**
     * 输入算法参数ID
     */
    @TableField("输入算法参数ID")
    private String inputAlgPropertyId;
    /**
     * 输出算法参数ID
     */
    @ApiModelProperty("输出算法参数ID")
    @TableField("output_alg_property_id")
    private String outputAlgPropertyId;
    /**
     * 输入算法ID
     */
    @ApiModelProperty("输入算法ID")
    @TableField("input_alg_id")
    private String inputAlgId;
    /**
     * 输出算法ID
     */
    @ApiModelProperty("输出算法ID")
    @TableField("output_alg_id")
    private String outputAlgId;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInputAlgName() {
        return inputAlgName;
    }

    public void setInputAlgName(String inputAlgName) {
        this.inputAlgName = inputAlgName;
    }

    public String getOutputAlgName() {
        return outputAlgName;
    }

    public void setOutputAlgName(String outputAlgName) {
        this.outputAlgName = outputAlgName;
    }

    public String getInputAlgPropertyName() {
        return inputAlgPropertyName;
    }

    public void setInputAlgPropertyName(String inputAlgPropertyName) {
        this.inputAlgPropertyName = inputAlgPropertyName;
    }

    public String getOutputAlgPropertyName() {
        return outputAlgPropertyName;
    }

    public void setOutputAlgPropertyName(String outputAlgPropertyName) {
        this.outputAlgPropertyName = outputAlgPropertyName;
    }

    public String getInputAlgPropertyId() {
        return inputAlgPropertyId;
    }

    public void setInputAlgPropertyId(String inputAlgPropertyId) {
        this.inputAlgPropertyId = inputAlgPropertyId;
    }

    public String getOutputAlgPropertyId() {
        return outputAlgPropertyId;
    }

    public void setOutputAlgPropertyId(String outputAlgPropertyId) {
        this.outputAlgPropertyId = outputAlgPropertyId;
    }

    public String getInputAlgId() {
        return inputAlgId;
    }

    public void setInputAlgId(String inputAlgId) {
        this.inputAlgId = inputAlgId;
    }

    public String getOutputAlgId() {
        return outputAlgId;
    }

    public void setOutputAlgId(String outputAlgId) {
        this.outputAlgId = outputAlgId;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "AlgrithmPackgePropertyRelation{" +
        ", id=" + id +
        ", inputAlgName=" + inputAlgName +
        ", outputAlgName=" + outputAlgName +
        ", inputAlgPropertyName=" + inputAlgPropertyName +
        ", outputAlgPropertyName=" + outputAlgPropertyName +
        ", inputAlgPropertyId=" + inputAlgPropertyId +
        ", outputAlgPropertyId=" + outputAlgPropertyId +
        ", inputAlgId=" + inputAlgId +
        ", outputAlgId=" + outputAlgId +
        "}";
    }
}
