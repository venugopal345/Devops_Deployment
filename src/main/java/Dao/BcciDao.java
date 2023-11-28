package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Dto.BcciheadDto;
import Dto.TeamDto;

public class BcciDao 
{
	EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
	EntityManager m = f.createEntityManager();
	EntityTransaction t = m.getTransaction();
	
	public void insert(BcciheadDto b)
	{
		t.begin();
		m.persist(b);
		t.commit();
	}

	public List<TeamDto> fetchall()
	{
		Query q = m.createQuery("select a from TeamDto a");
		List<TeamDto> l = q.getResultList();
		return l;
	}
	public void delete(int jsno)
	{
		TeamDto dt = m.find(TeamDto.class, jsno);
		if(dt!=null)
		{
			t.begin();
			m.remove(dt);
			t.commit();
		}
		else
		{
			System.out.println("Please Enter Valid Jersy Number");
		}
	}
	public String Update(TeamDto jsno)
	{
		t.begin();
		m.merge(jsno);
		t.commit();
		return "Data Updated";
	}
}
