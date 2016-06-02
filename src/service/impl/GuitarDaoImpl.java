package service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.GuitarDao;
import db.MyHibernateSessionFactory;
import entity.Guitar;


//吉他查询业务逻辑接口的实现类
public class GuitarDaoImpl implements GuitarDao {

	@Override
	public List<Guitar> queryAllguitar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Guitar querybyNumber(String serialNumber) {
		// TODO Auto-generated method stub
		Transaction tx = null;
		   Guitar g=null;
			try
			{
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();// 获得一个会话对象
			tx = session.beginTransaction();// 开启一个事物
			g= (Guitar)session.get(Guitar.class, serialNumber);
			tx.commit();// 在return之前提交事物
			return g;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				tx.commit();
				return g;
				
			}
			finally
			{
				if (tx != null) {
					tx = null;
				}
				
			}
		}

}
