package amz.gdpr.HerokuJdbcTemplate.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import amz.gdpr.HerokuJdbcTemplate.model.Application;

@Repository
public class HerokuJdbcTemplateTestDaoImpl implements HerokuJdbcTemplateTestDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void updateData() {
		String candidateId=null;
		String felony_conviction_question_1__c=null;
		String requisition_hiring_function__c=null;
		String national_id_country_ps__c=null;
		String candidate_withdraws_detail__c=null;
		int id;
		
		for(int i=1 ;i<= 3710  ;i++ ) {
		try {
			candidateId="$$AT"+i;
			felony_conviction_question_1__c="XXXFe"+i;
			requisition_hiring_function__c="RRRHI1"+i;
			national_id_country_ps__c="NNNIDS"+i;
		candidate_withdraws_detail__c="CWCWCWD"+i;
String UPDATE_EMPLOYEE_SQL = "UPDATE heroku_depersonalisation.application__d set candidate__c=? , felony_conviction_question_1__c=? , requisition_hiring_function__c=? , national_id_country_ps__c=? , candidate_withdraws_detail__c=?  WHERE id=?";
//String UPDATE_EMPLOYEE_SQL = "UPDATE heroku_depersonalisation.application__d set candidate__c=? , felony_conviction_question_1__c=?  WHERE id=?";
// define query arguments
Object[] params = { candidateId,felony_conviction_question_1__c,requisition_hiring_function__c,national_id_country_ps__c,candidate_withdraws_detail__c, i};


// define SQL types of the arguments
int[] types = {Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR ,Types.BIGINT};


int update = jdbcTemplate.update(UPDATE_EMPLOYEE_SQL, params, types);
//int update = jdbcTemplate.update(UPDATE_EMPLOYEE_SQL, candidateId,felony_conviction_question_1__c,i);
		if(update == 1){
			System.out.println("Record  is Updated...."+i);
		}	
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
	}

	
}
