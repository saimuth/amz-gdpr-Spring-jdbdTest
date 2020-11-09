package amz.gdpr.HerokuJdbcTemplate.model;





public class Application {
	//@Id
//	@GeneratedValue
    private int id;
  //  @Column(name = "candidate__c")
    private String candidate;
  //  @Column(name = "felony_conviction_question_1__c")
    private String felony_conviction_question;
  //  @Column(name = "requisition_hiring_function__c")
    private String requisition_hiring_function;
    
  //  @Column(name = "national_id_country_ps__c")
    private String national_id_country_ps_c;

  //  @Column(name = "candidate_withdraws_detail__c")
    private String candidate_withdraws_detail_c;
    
    
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCandidate() {
		return candidate;
	}
	public void setCandidate(String candidate) {
		this.candidate = candidate;
	}
	public String getFelony_conviction_question() {
		return felony_conviction_question;
	}
	public void setFelony_conviction_question(String felony_conviction_question) {
		this.felony_conviction_question = felony_conviction_question;
	}
	public String getRequisition_hiring_function() {
		return requisition_hiring_function;
	}
	public void setRequisition_hiring_function(String requisition_hiring_function) {
		this.requisition_hiring_function = requisition_hiring_function;
	}
	public String getNational_id_country_ps_c() {
		return national_id_country_ps_c;
	}
	public void setNational_id_country_ps_c(String national_id_country_ps_c) {
		this.national_id_country_ps_c = national_id_country_ps_c;
	}
	public String getCandidate_withdraws_detail_c() {
		return candidate_withdraws_detail_c;
	}
	public void setCandidate_withdraws_detail_c(String candidate_withdraws_detail_c) {
		this.candidate_withdraws_detail_c = candidate_withdraws_detail_c;
	}
	
	@Override
	public String toString() {
		return "Application [id=" + id + ", candidate=" + candidate + ", felony_conviction_question="
				+ felony_conviction_question + ", requisition_hiring_function=" + requisition_hiring_function
				+ ", national_id_country_ps_c=" + national_id_country_ps_c + ", candidate_withdraws_detail_c="
				+ candidate_withdraws_detail_c + "]";
	}
	
    
}
