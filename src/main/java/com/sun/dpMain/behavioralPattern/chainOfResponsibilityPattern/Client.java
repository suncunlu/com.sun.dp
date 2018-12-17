package com.sun.dpMain.behavioralPattern.chainOfResponsibilityPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author :suncunlu
 * @date :2018-12-13 14:38:31
 * @description : ① GroupLeader（组长 ）：他能批准的假期为2天，如果请假天数超过2天就将请假邮件自动转发到组长和经理邮箱。 ②
 *              Manager（经理）：他能批准的假期为4天以内，如果请假天数大于4天将该邮件转发到自动转发到组长、经理和部门领导的邮箱。 ③
 *              DepartmentHeader（部门领导）：他能批准的假期为7天以内，如果大于7天就只批准7天。
 *              --------------------- 作者：lzy_tinyjoy 来源：CSDN
 *              原文：https://blog.csdn.net/u012810020/article/details/71194853
 *              版权声明：本文为博主原创文章，转载请附上博文链接！
 */
public class Client {
	private static Logger logger = LoggerFactory.getLogger(Client.class);

	public static void main(String[] args) {
		LeaveRequest request = new Builder().setName("张三").setDays(5).setReason("事假").build();
		ChainOfResponsibilityClient client = new ChainOfResponsibilityClient();
		Result result = client.execute(request);
		logger.info("结果:" + result.toString());
	}
}
