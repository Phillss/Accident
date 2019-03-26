package com.ssm.service.accidentinfo;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import com.ssm.mapper.accidentinfo.AccidentinfoMapper;
import com.ssm.pojo.PageIndex;
import com.ssm.pojo.Vo.Accidentinfo_t_Vo;

public class AccidentinfoServiceImpl{

	@Autowired
	public AccidentinfoMapper accidentMapper;


	public Accidentinfo_t_Vo serviceAccidentinfoFind(String id) throws Exception {
		// TODO Auto-generated method stub
		Accidentinfo_t_Vo accident =this.accidentMapper.findAccidentById(id);
		return accident;
	}

	public List<Accidentinfo_t_Vo> serviceAccidentinfoFindByLevel(String id) throws Exception{
		List<Accidentinfo_t_Vo> accident = this.accidentMapper.findAccidentByLevel(id);
		return accident;
	};

	public void serviceinsert(Accidentinfo_t_Vo accident) throws Exception{
		this.accidentMapper.insertAccidentinfo(accident);
	}

	public void serviceupdate(Accidentinfo_t_Vo accident) throws Exception{
		this.accidentMapper.updateAccidentinfo(accident);
	}

	public void servicedelete(String id) throws Exception{
		this.accidentMapper.deleteAccidentinfo(id);
	}

	//查询所有(分页)
	public List<Accidentinfo_t_Vo> servicefindall(PageIndex pageindex) throws Exception{
		return this.accidentMapper.findAll(pageindex);

	}
	
	public List<Accidentinfo_t_Vo> serviceClassFinds(PageIndex pageindex) throws Exception{
		return this.accidentMapper.ClassFinds(pageindex);

	}

	public Integer serviceFindCounts() throws Exception{
		return this.accidentMapper.findCounts();
	}

	public List<Accidentinfo_t_Vo> servicelikefinds(String name) throws Exception{
		return this.accidentMapper.likefinds(name);
	}

	public List<Map<String,String>> findCountByLevel(String industryId) throws Exception{
		return this.accidentMapper.findCountByLevel(industryId);
	};

	public List<Accidentinfo_t_Vo> findSumByTime(String industryId) throws Exception{
		return this.accidentMapper.findSumByTime(industryId);
	};

	public List<Accidentinfo_t_Vo> selAccidentById(String rank)throws Exception{
		return this.accidentMapper.selAccidentById(rank);
	};



}
