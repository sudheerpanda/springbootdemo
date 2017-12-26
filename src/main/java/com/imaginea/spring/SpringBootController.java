/*
 * Copyright 2017-2018 the original author or authors.
 *
 * Licensed under imaginea
 *
 */
package com.imaginea.spring;

import com.imaginea.exception.ServiceException;
import com.imaginea.model.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 
 * @author sudheer panda 
 * 			This class is used to get the book details
 */
@RestController
@RequestMapping("/book")
public class SpringBootController {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(SpringBootController.class);


	@ExceptionHandler(ServiceException.class)
	@ResponseBody
	@RequestMapping(value = "/get", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Book getBook(
			@RequestParam(value = "name", required = true) String name)
			throws ServiceException, IOException {
		LOGGER.info("Getting the Book details by name");

		Book book =new Book();
		book.setName(name);
		book.setAuthor("by imaginea");
		LOGGER.info("Successfully got the book details by name");
		return book;
	}
}