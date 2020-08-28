package edu.bit.ex.mapper;

import org.apache.ibatis.annotations.Select;

import edu.bit.ex.vo.EmpVO;

public interface EmpMapper {
	
	@Select("select * from emp where ename = #{ename}")
	public EmpVO readUser(String ename);

}
