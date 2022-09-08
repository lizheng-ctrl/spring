package com.bjpowernode.config;

import com.bjpowernode.bean.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: spring
 * @description:
 * @author: LZ
 * @create: 2022-09-07 14:59
 **/
@Configuration  //== xml 文件
public class SpringConfig {


	@Bean
	public MyBean myBean(){
		return new MyBean();
	}
}
