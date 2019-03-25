package com.ssm.service.accidentlevel;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.ssm.mapper.accidentlevel.AccidentLevelMapper;
import com.ssm.pojo.Vo.Accidentlevel_t_Vo;

public class AccidentlevelServiceImpl{

	@Autowired
	private AccidentLevelMapper mapper;

	public Accidentlevel_t_Vo serviceFindAccidentlevel(String id) throws Exception {
		// TODO Auto-generated method stub
		Accidentlevel_t_Vo accident=this.mapper.findAccidentlevelById(id);
		return accident;
	}

	public List<Accidentlevel_t_Vo> findAllAccidentlevel() throws Exception{
		return this.mapper.findAllAccidentlevel();
	};

	public void serviceinsert(Accidentlevel_t_Vo level) throws Exception{
		this.mapper.insertAccidentlevel(level);
	}

	public void serviceupdate(Accidentlevel_t_Vo level) throws Exception{
		this.mapper.updateAccidentlevel(level);
	}

	public void servicedelete(String id) throws Exception{
		this.mapper.deleteAccidentlevel(id);
	}
}
