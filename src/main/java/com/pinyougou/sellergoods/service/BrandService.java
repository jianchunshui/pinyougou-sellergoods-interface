package com.pinyougou.sellergoods.service;

import java.util.List;
import java.util.Map;

import com.pinyougou.pojo.TbBrand;

import entity.PageResult;

/**
 * 品牌接口
 * @author ebs
 *
 */
public interface BrandService {

	public List<TbBrand> findAll();
	
	/**
	 * 品牌分页
	 * @param pageNum 当前页码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	/**
	 * 增加
	 * @param tbBrand
	 */
	public void add(TbBrand tbBrand);
	
	/**
	 * 根据id 查询实体
	 * @param id
	 * @return
	 */
	public TbBrand findOne(Long id);
	
	public void update(TbBrand tbBrand);
	
	public void delete(Long[] ids);
	
	
	public PageResult findPage(TbBrand tbBrand,int pageNum,int pageSize);

	
	/**
	 * 返回下拉列表数据
	 */
	public List<Map> selectOptionList();
}
