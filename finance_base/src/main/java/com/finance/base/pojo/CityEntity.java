package com.finance.base.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 城市表
 * 
 * @author sanzu
 * @email lxf@atguigu.com
 * @date 2020-02-25 16:33:59
 */
@ApiModel
@Data
@TableName("t_city")
public class CityEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	@ApiModelProperty(name = "tId",value = "主键")
	private Long tId;
	/**
	 * 城市编号
	 */
	@ApiModelProperty(name = "tCityAreaNum",value = "城市编号")
	private Integer tCityAreaNum;
	/**
	 * 城市名称
	 */
	@ApiModelProperty(name = "tCityName",value = "城市名称")
	private String tCityName;
	/**
	 * 城市级别 (0：省 ；1：市；2：县)
	 */
	@ApiModelProperty(name = "tCityLevel",value = "城市级别 (0：省 ；1：市；2：县)")
	private String tCityLevel;
	/**
	 * 父级城市编号
	 */
	@ApiModelProperty(name = "tParentCityNum",value = "父级城市编号")
	private Integer tParentCityNum;

}
