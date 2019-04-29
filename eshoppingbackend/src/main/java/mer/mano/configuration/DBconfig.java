package mer.mano.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import mer.mano.model.Category;
import mer.mano.model.Supplier;


@Configuration
@EnableTransactionManagement
@ComponentScan("mer.mano.DBConfig")
public class DBconfig {

	@Bean(name="dataSource")
	public DataSource getH2Datasource()
	{
		 DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setDriverClassName("org.h2.Driver");
	        dataSource.setUrl("jdbc:h2:tcp://localhost/~/test3");
	        dataSource.setUsername("sa");
	        dataSource.setPassword("sa");
	        System.out.println("Datasource created");
	    return dataSource;
	}
	/*
	 * <bean id="sessionFactory" class="org.springframework.orm.hibernate4.LocalSessionFactoryBuilder">
	 * <property name="dataSource" ref="dataSource">
	 */

	@Bean
	public SessionFactory sessionFactory() 
	{
		LocalSessionFactoryBuilder lsf=
				new LocalSessionFactoryBuilder(getH2Datasource());
		Properties hibernateProperties=new Properties();
		hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
		hibernateProperties.setProperty("hibernate.show_sql", "true");
		lsf.addProperties(hibernateProperties);
		System.out.println("Session factory object created");
		//An array of Class objects of all the entities
		//Map all entities to relational table
		//Class classes[]=new Class[]{Product.class,Category.class,User.class,Authorities.class,Customer.class,BillingAddress.class,ShippingAddress.class,Cart.class,CartItem.class,CustomerOrder.class};
		Class classes[]=new Class[]{Category.class,Supplier.class};
	    return lsf.addAnnotatedClasses(classes).buildSessionFactory();
	}
	@Bean
	public HibernateTransactionManager hibTransManagement()
	{
		System.out.println("Transaction management created");
		return new HibernateTransactionManager(sessionFactory());
	}

}
