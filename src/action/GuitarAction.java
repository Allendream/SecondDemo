package action;

import dao.GuitarDao;
import entity.Guitar;
import service.impl.GuitarDaoImpl;

public class GuitarAction extends SuperAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String query()
	{
		//获得传递过来的学生编号
		String serialNumber=request.getParameter("serialNumber");
		  GuitarDao gdao =new GuitarDaoImpl();
		  Guitar g =gdao.querybyNumber(serialNumber);
		  //保存在会话中
		  session.setAttribute("query_guitar", g);
		  return "query_success";
	}
}
