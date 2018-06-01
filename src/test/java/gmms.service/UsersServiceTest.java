package gmms.service;

import com.alibaba.fastjson.JSON;
import gmms.domain.db.VmVehicle;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import java.util.List;


/**
 * Created by wangfs on 2017/6/28. helloWorld
 */
/*@ContextConfiguration(locations = { "/applicationContext.xml" })*/
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@RunWith(SpringJUnit4ClassRunner.class)
public class UsersServiceTest {
	private static Logger logger = Logger.getLogger(UsersServiceTest.class);
	@Autowired
	private VmVehicleService vmVehicleService;
	@Test
	public void findById() throws Exception {
		VmVehicle vmVehicle=vmVehicleService.getVmVEhicleById("00001201804190000002");
		//logger.info(JSON.toJSONString(vmVehicle));
		System.out.println(vmVehicle.getPlateno());
	}



}