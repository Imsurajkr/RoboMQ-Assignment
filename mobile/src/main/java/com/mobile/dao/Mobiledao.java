package com.mobile.dao;

import java.util.List;
import com.mobile.pojo.Mobile;

public interface Mobiledao {
	Mobile getMobileById(int id);
	List<Mobile> getAllMobile();
	boolean deleteMobile(Mobile mobile);
	boolean updateMobile(Mobile mobile);
	boolean createMobile(Mobile mobile);
	
	
}
