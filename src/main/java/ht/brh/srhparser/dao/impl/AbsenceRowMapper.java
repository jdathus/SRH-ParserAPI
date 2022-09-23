package ht.brh.srhparser.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ht.brh.srhparser.model.Absence;

public class AbsenceRowMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Absence abs = new Absence();
		abs.setJour()
	}

}
