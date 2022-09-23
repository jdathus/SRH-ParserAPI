package ht.brh.srhparser.service;

import org.springframework.transaction.annotation.Transactional;

import ht.brh.srhparser.dao.AbsenceDAO;
import ht.brh.srhparser.model.Absence;

public class AbsenceManagerImpl implements AbsenceManager {

		private AbsenceDAO absenceDAO;

	public void setAbsenceDAO(AbsenceDAO AbsenceDAO) {
		this.absenceDAO = absenceDAO;
	}
	@Transactional
	@Override
	public void TransfererAbsence(Absence abs) {
		// TODO Auto-generated method stub
		absenceDAO.transferer (abs);
	}

}
