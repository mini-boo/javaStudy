package com.spring.mybatis;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.dto.Dept;
import com.spring.service.DeptService;

@Controller
public class DeptController {
	
	@Autowired
	DeptService deptService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public void dept(Locale locale, Model model) {
		
		// 1. getAllDepts()
		List<Dept> deptList = deptService.getAllDepts(); 
		System.out.println(deptList);
		
		// 2. getDeptByDeptno(int deptno)
		Dept dept = deptService.getDeptByDeptno(10);
    
    // 3. getDnameByDeptno(int deptno)
		String dname = deptService.getDnameByDeptno(10);

		// 4. getDnameByDeptnoAndLoc(int deptno, String loc)
		String dname2 = deptService.getDnameByDeptnoAndLoc(10, "NEW YORK");
    
		// 5. getDnameByDeptnoAndLocMap(HashMap<String, Object> hashmap)
//		HashMap<String, Object> hashmap = new HashMap<String, Object>();
//		hashmap.put("deptno", 10);
//		hashmap.put("loc", "NEW YORK");
//		
//		String dname3 = deptService.getDnameByDeptnoAndLocMap(hashmap);
		//System.out.println(dname3);

		// 6. getAllDeptsHashMap()
		//System.out.println(deptService.getAllDeptsHashMap());
		
		//7. insertDept(new Dept(90, "DEV", "TECH"))
		Void dept2 = deptService.insertDept(90, "DEV", "TECH");
		System.out.println(dept2);
		
		//8. updateDept(90, "IT")
		//Void dept3 = deptService.updateDept(90, "IT");
		
		//9. deleteDeptByDeptno(90)
		Boolean dept4 = deptService.deleteDeptByDeptno(90);
		//System.out.println(dept4);
		

	}
}