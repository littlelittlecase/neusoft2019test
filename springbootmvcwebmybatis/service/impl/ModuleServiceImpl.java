package com.neusoft.busmis.security.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.busmis.factory.MyBatisFactory;
import com.neusoft.busmis.security.dao.IFunctionDao;
import com.neusoft.busmis.security.dao.IModuleDao;
import com.neusoft.busmis.security.model.ModuleModel;
import com.neusoft.busmis.security.service.IModuleService;

@Service("moduleservice")
//系统模块业务实现类
public class ModuleServiceImpl implements IModuleService {

	@Autowired
	private IModuleDao moduleDao;
	@Override
	public void add(ModuleModel role) throws Exception {
		moduleDao.create(role);

	}

	@Override
	public void modify(ModuleModel role) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(ModuleModel role) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public List<ModuleModel> getListByAll() throws Exception {
		List<ModuleModel> list=moduleDao.selectListByAll();
		return list;
	}

	
	@Override
	public ModuleModel getByNo(int no) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCountByAll() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ModuleModel> getListByRole(int roleNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkAccessForRole(int moduleNo, int roleNo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<ModuleModel> getselectListByAllWithFunctionsByNestedSelect() throws Exception {
		
		List<ModuleModel> list=moduleDao.selectListByAllWithFunctionsByNestedSelect();
		
		return list;
	}

	@Override
	public List<ModuleModel> getselectListByAllWithFunctionsByNestedResultMap() throws Exception {
		
		List<ModuleModel> list=moduleDao.selectListByAllWithFunctionsByNestedResultMap();
		
		return list;
	}

	@Override
	public List<ModuleModel> getListByAllWithRolesByNestedSelect() throws Exception {
		
		List<ModuleModel> list=moduleDao.selectListByAllWithRolesByNestedSelect();
		
		return list;
	}

	@Override
	public List<ModuleModel> getListByAllWithRolesByNestedResultMap() throws Exception {
		
		List<ModuleModel> list=moduleDao.selectListByAllWithRolesByNestedResultMap();
		
		return list;
	}

	@Override
	public List<ModuleModel> getListByAllWithFunctionsAndRolesFunctionByNestedSelect() throws Exception {
		
		return null;
	}

	@Override
	public List<ModuleModel> getListByAllWithFunctionsAndRolesFunctionsByNestedResultMap() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
