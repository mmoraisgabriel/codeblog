package com.spring.codeblog.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeblogRepository;

@Component
public class DummyData {
	
	@Autowired
	CodeblogRepository codeblogRepository;
	
	//@PostConstruct
	public void savePosts() {
		List<Post> postList = new ArrayList<>();
		Post post1 = new Post();
		post1.setAutor("Gabriel M. Morais");
		post1.setData(LocalDate.now());
		post1.setTitulo("Docker");
		post1.setTexto("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum fringilla nisl mauris, ac commodo libero interdum at. Duis tincidunt lorem arcu. Fusce sit amet est congue, mattis purus quis, lobortis lacus. Vestibulum quam orci, molestie nec velit sit amet, iaculis pulvinar ligula. Aenean laoreet enim vitae pulvinar bibendum. Pellentesque ut vehicula nunc. In eu vulputate quam, vel ultricies nulla. Nullam scelerisque posuere neque, in condimentum mauris placerat quis. Curabitur molestie arcu non molestie blandit. Fusce nec ullamcorper arcu, ut euismod urna. Quisque ipsum urna, placerat et dui id, vehicula mollis justo. Donec posuere augue sed libero convallis, suscipit rhoncus orci pulvinar. Nulla lacinia dui eget arcu fringilla, vel sodales justo auctor. ");
		
		Post post2 = new Post();
		post2.setAutor("Gabriel M. Morais");
		post2.setData(LocalDate.now());
		post2.setTitulo("API REST");
		post2.setTexto("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum fringilla nisl mauris, ac commodo libero interdum at. Duis tincidunt lorem arcu. Fusce sit amet est congue, mattis purus quis, lobortis lacus. Vestibulum quam orci, molestie nec velit sit amet, iaculis pulvinar ligula. Aenean laoreet enim vitae pulvinar bibendum. Pellentesque ut vehicula nunc. In eu vulputate quam, vel ultricies nulla. Nullam scelerisque posuere neque, in condimentum mauris placerat quis. Curabitur molestie arcu non molestie blandit. Fusce nec ullamcorper arcu, ut euismod urna. Quisque ipsum urna, placerat et dui id, vehicula mollis justo. Donec posuere augue sed libero convallis, suscipit rhoncus orci pulvinar. Nulla lacinia dui eget arcu fringilla, vel sodales justo auctor. ");
		
		postList.add(post1);
		postList.add(post2);
		
		for(Post post: postList) {
			Post postSaved = codeblogRepository.save(post);
			System.out.println(postSaved.getId());
		}
	}

}
