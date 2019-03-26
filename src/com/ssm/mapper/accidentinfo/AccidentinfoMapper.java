package com.ssm.mapper.accidentinfo;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.ssm.pojo.PageIndex;
import com.ssm.pojo.Vo.Accidentinfo_t_Vo;

public interface AccidentinfoMapper {

	public Accidentinfo_t_Vo findAccidentById(String id) throws Exception;

	public List<Accidentinfo_t_Vo> findAccidentByLevel(String id) throws Exception;

	public void insertAccidentinfo(Accidentinfo_t_Vo accident) throws Exception;

	public void updateAccidentinfo(Accidentinfo_t_Vo accident) throws Exception;

	public void deleteAccidentinfo(String id) throws Exception;

	public List<Accidentinfo_t_Vo> findAll(PageIndex pageindex) throws Exception;
	
	public List<Accidentinfo_t_Vo> ClassFinds(PageIndex pageindex) throws Exception;

	public Integer findCounts() throws Exception;

	public List<Accidentinfo_t_Vo> likefinds(String name) throws Exception;
	//根据事故等级查询事故数量
	public List<Map<String,String>> findCountByLevel(@Param("industryId")String industryId) throws Exception;
	//根据时间查询事故伤亡数量
	public List<Accidentinfo_t_Vo> findSumByTime(@Param("industryId")String industryId) throws Exception;
	//
	public List<Accidentinfo_t_Vo> selAccidentById(String rank)throws Exception;

	public List<Map<String,String>> findAllAccidentID();

	public List<Map<String,String>> selCountIndustry();
}
