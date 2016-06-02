package entity;
import java.util.EnumSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.tool.schema.TargetType;
import org.junit.Test;

public class TestGuitar {
	 @Test
	 public void testSchemaExport()
	 { 
		 	ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().configure().build();
			Metadata metadata=new MetadataSources(serviceRegistry).buildMetadata();
			SchemaExport export=new SchemaExport();
			export.create(EnumSet.of(TargetType.DATABASE), metadata);

	 }
	 @Test
	 public void testSaveStudents()
	 {
	 	Configuration config=new Configuration().configure();
	 	ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().configure().build();
	 	Metadata metadata=new MetadataSources(serviceRegistry).buildMetadata();
	 	SessionFactory sessionFactory =config.buildSessionFactory(serviceRegistry);
	 	Session session=sessionFactory.getCurrentSession();
	 //´´½¨ÊÂÎï¶ÔÏó
	 	Transaction tx =session.beginTransaction();
	 	Guitar g1=new Guitar("001",500,"A","aaa","Ä¾¼ªËû",111,"ÌÒÄ¾","ÌÒÄ¾");
	 	Guitar g2=new Guitar("002",500,"A","bbb","Ä¾¼ªËû",222,"ÌÒÄ¾","ÌÒÄ¾");
	 	Guitar g3=new Guitar("003",500,"A","bbb","Ä¾¼ªËû",333,"ÌÒÄ¾","ÌÒÄ¾");
	     session.save(g1);
	     session.save(g2);
	     session.save(g3);
	     tx.commit();
	     sessionFactory.close();

	 }
}
