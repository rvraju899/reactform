package com.raju;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean("id1")
	public StudentBean createStudentBean()
	{
	StudentBean sb=new StudentBean();
			sb.setSub1(77);
	        sb.setSub2(70);
	        sb.setSub3(60);
	        return sb;
	}

}
