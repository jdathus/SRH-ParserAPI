package ht.brh.srhparser.dao.impl;

import java.time.LocalDateTime;

import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import ht.brh.srhparser.dao.AbsenceDAO;
import ht.brh.srhparser.model.Absence;

public class AbsenceDAOImpl implements AbsenceDAO {
	 @Autowired
	 @Qualifier("jdbcTemplateEasyclocking")
	 private JdbcTemplate jdbcTemplateEasyclocking;
	 
	 @Autowired
	 @Qualifier("jdbcTemplateTms")
	 private JdbcTemplate jdbcTemplateTms;
	
	@Transactional
	 @Override 
	public Absence transferer(LocalDateTime jour) {
		// TODO Auto-generated method stub
	final var sqlAbsenceMotive ="select distinct a.user_id from TA_ABSENCE a WHERE a.ABSENCE_TYPE_ID = 6 and convert(varchar,cast(a.DATE as date)) = ?";
	 // return  jdbcTemplateEasyclocking.update(sqlAbsenceMotive,jour);
	  return jdbcTemplateEasyclocking.queryForObject(sqlAbsenceMotive, new Object[]{jour}, new AbsenceRowMapper());
	
	}

}
