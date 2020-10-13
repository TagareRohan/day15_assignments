package com.training;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.model.Author;
import com.training.model.Book;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		
		Book headFirst=ctx.getBean(Book.class);
		
		System.out.println(ctx.isSingleton("bookBean"));
		System.out.println(ctx.isPrototype("bookBean"));
		
		System.out.println(headFirst);
		
		Author auth=ctx.getBean("authorRamesh",Author.class);
		
		System.out.println(headFirst.getAuthor());
		System.out.println(auth);
		
		Author mang=ctx.getBean("authorMangesh",Author.class);
		System.out.println(mang);
		
	}

}
