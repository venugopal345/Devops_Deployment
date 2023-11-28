package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Dto.TeamDto;

public class TeamDao 
{
	EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
	EntityManager m = f.createEntityManager();
	EntityTransaction t = m.getTransaction();
	
	public void insert(TeamDto tm)
	{
		t.begin();
		m.persist(tm);
		t.commit();
	}
	
	public TeamDto fetchid(int it)
	{
		TeamDto l = m.find(TeamDto.class, it);
		return l;
	}
	
	public List<TeamDto> fetchall()
	{
		Query q = m.createQuery("select a from TeamDto a");
		List<TeamDto> l = q.getResultList();
		return l;
	}
}
