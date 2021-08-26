package java_mysql_erp.dao;

import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java_mysql_erp.dao.impl.TitleDaoImpl;
import java_mysql_erp.dto.Title;

public class TitleDaoTest {
	
	private TitleDao dao;
	
	@Before
	public void setUp() throws Exception {
		dao = TitleDaoImpl.getInstance();
	}

	@After
	public void tearDown() throws Exception {
		dao= null;
	}

	@Test
	public void testSelectTitleByAll() {
		System.out.println("selectTitleByCode()");

	}

	@Test
	public void testSelectTitleByCode() {
		System.out.println("testSelectTitleByAll()");
	}

	@Test
	public void testInsertTitle() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateTitle() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteTitle() {
		fail("Not yet implemented");
	}

}
