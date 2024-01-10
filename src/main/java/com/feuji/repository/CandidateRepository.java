package com.feuji.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.feuji.entities.CandidateEntity;

@Repository
@Transactional
public class CandidateRepository
{
	@Autowired
	HibernateTemplate hibernateTemplate;

	public void save(CandidateEntity candidate) {
		hibernateTemplate.save(candidate);
	}

	public CandidateEntity get(Integer refId) {
		CandidateEntity entity = hibernateTemplate.get(CandidateEntity.class, refId);
		return entity;
	}

	public List<CandidateEntity> getAllRecords()
	{
		return hibernateTemplate.loadAll(CandidateEntity.class);
	}
	
}
