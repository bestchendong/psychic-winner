package com.trust.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Category
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-15T03:06:26.991Z")

public class Category implements Serializable {
  @JsonProperty("categoryId")
  private Long categoryId = null;

  @JsonProperty("pid")
  private Long pid = null;

  @JsonProperty("categoryCode")
  private String categoryCode = null;

  @JsonProperty("categoryName")
  private String categoryName = null;

  @JsonProperty("categoryImage")
  private String categoryImage = null;

  @JsonProperty("categoryLevel")
  private Integer categoryLevel = null;

  @JsonProperty("childrenCategory")
  private List<Category> childrenCategory = null;

  public Category(){
    super();
  };

  public Category(Long categoryId, Long pid, String categoryCode, String categoryName, String categoryImage, Integer categoryLevel) {
    this.categoryId = categoryId;
    this.pid = pid;
    this.categoryCode = categoryCode;
    this.categoryName = categoryName;
    this.categoryImage = categoryImage;
    this.categoryLevel = categoryLevel;
  }

  public Category categoryId(Long categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * 类别id
   * @return categoryId
  **/
  @ApiModelProperty(value = "类别id")


  public Long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  public Category cid(Long pid) {
    this.pid = pid;
    return this;
  }

   /**
   * 父级类别id
   * @return cPid
  **/
  @ApiModelProperty(value = "父级类别id")


  public Long getPid() {
    return pid;
  }

  public void setPid(Long pid) {
    this.pid = pid;
  }

  public Category categoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
    return this;
  }

   /**
   * 分类唯一编码，按一定规则编写
   * @return cCategoryCode
  **/
  @ApiModelProperty(value = "分类唯一编码，按一定规则编写")


  public String getCategoryCode() {
    return categoryCode;
  }

  public void setCategoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
  }

  public Category categoryName(String categoryName) {
    this.categoryName = categoryName;
    return this;
  }

   /**
   * 分类名称
   * @return cCategoryName
  **/
  @ApiModelProperty(value = "分类名称")


  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  public Category categoryImage(String categoryImage) {
    this.categoryImage = categoryImage;
    return this;
  }

   /**
   * 分类图片
   * @return cCategoryImage
  **/
  @ApiModelProperty(value = "分类图片")


  public String getCategoryImage() {
    return categoryImage;
  }

  public void setCategoryImage(String cCategoryImage) {
    this.categoryImage = categoryImage;
  }

  public Category categoryLevel(Integer categoryLevel) {
    this.categoryLevel = categoryLevel;
    return this;
  }

   /**
   * 分类级别
   * @return cCategoryLevel
  **/
  @ApiModelProperty(value = "分类级别")


  public Integer getCategoryLevel() {
    return categoryLevel;
  }

  public void setCategoryLevel(Integer cCategoryLevel) {
    this.categoryLevel = categoryLevel;
  }

  public Category childrenCategory(List<Category> childrenCategory) {
    this.childrenCategory = childrenCategory;
    return this;
  }

  public Category addChildrenCategoryItem(Category childrenCategoryItem) {
    if (this.childrenCategory == null) {
      this.childrenCategory = new ArrayList<Category>();
    }
    this.childrenCategory.add(childrenCategoryItem);
    return this;
  }

   /**
   * Get childrenCategory
   * @return childrenCategory
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Category> getChildrenCategory() {
    return childrenCategory;
  }

  public void setChildrenCategory(List<Category> childrenCategory) {
    this.childrenCategory = childrenCategory;
  }


}

