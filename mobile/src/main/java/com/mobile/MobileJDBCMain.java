package com.mobile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mobile.config.AppConfig;
import com.mobile.dao.Mobiledao;
import com.mobile.pojo.Mobile;
import com.mobile.*;
import com.mobile.pojo.*;

public class MobileJDBCMain{
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Mobiledao mobiledao = context.getBean(Mobiledao.class);
		
		System.out.println("List of Mobile is:");
		for(Mobile m : mobiledao.getAllMobile()) {
			System.out.println("\n Get person with ID 2 ");
		}
		Mobile mobileById = mobiledao.getMobileById("id");
		System.out.println(mobileById);

		System.out.println("\n Mobiles: ");
		Mobile mobile = new Mobile(4,"samsung", "2500", "10", "Charger");
		System.out.println(mobile);
		mobiledao.createMobile(mobile);
		System.out.println("\nList of mobile is:");

		for (Mobile m : mobiledao.getAllMobile()) {
			System.out.println(m);
		}

		System.out.println("\nDeleting Mobile with ID 2");
		mobiledao.deleteMobile(mobileById);

		System.out.println("\nUpdate Mobile with ID 4");

		Mobile mmobile = mobiledao.getMobileById("id");
		mmobile.setId(2);
		mobiledao.updateMobile(mmobile);

		System.out.println("\nList of Mobile is:");
		for (Mobile m : mobiledao.getAllMobile()) {
			System.out.println(m);
		}

		context.close();
	}

}
