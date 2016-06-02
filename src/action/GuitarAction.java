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
		//��ô��ݹ�����ѧ�����
		String serialNumber=request.getParameter("serialNumber");
		  GuitarDao gdao =new GuitarDaoImpl();
		  Guitar g =gdao.querybyNumber(serialNumber);
		  //�����ڻỰ��
		  session.setAttribute("query_guitar", g);
		  return "query_success";
	}
}
