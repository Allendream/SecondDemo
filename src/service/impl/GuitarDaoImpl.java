package service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.GuitarDao;
import db.MyHibernateSessionFactory;
import entity.Guitar;


//������ѯҵ���߼��ӿڵ�ʵ����
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
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();// ���һ���Ự����
			tx = session.beginTransaction();// ����һ������
			g= (Guitar)session.get(Guitar.class, serialNumber);
			tx.commit();// ��return֮ǰ�ύ����
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
