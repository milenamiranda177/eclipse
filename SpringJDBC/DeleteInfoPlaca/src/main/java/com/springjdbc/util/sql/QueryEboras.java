package com.springjdbc.util.sql;

public enum QueryEborasUser {

	DELETECONFIG("select *  from co.tb_ebrs_config_score_group_vehicle where grvh_plate in "
			+ "(select vhcl_number_plate from co.tb_ebrs_vehicle where pk_vhcl_id in "
			+ "(select fk_vhcl_id from co.tb_ebrs_vehicle_master where fk_mast_id in "
			+ "(select pk_mast_id from co.tb_ebrs_master where mast_login=?)));"),
	UPDATECPMOUNTED("update co.tb_ebrs_cp_mounted set cpmo_date_desmount = now() where fk_number_plate "
			+ "in (select vhcl_number_plate from co.tb_ebrs_vehicle where pk_vhcl_id in "
			+ "(select fk_vhcl_id from co.tb_ebrs_vehicle_master where fk_mast_id in "
			+ "(select pk_mast_id from co.tb_ebrs_master where mast_login='MARIO')));"),
	EMPTYCP("update co.tb_ebrs_vehicle set fk_cps_id= null where pk_vhcl_id in "
			+ "(select fk_vhcl_id from co.tb_ebrs_vehicle_master where fk_mast_id in "
			+ "(select pk_mast_id from co.tb_ebrs_master where mast_login='MARIO'));"),
	DELETEMASTER("delete from co.tb_ebrs_vehicle_master where fk_vhcl_id in "
			+ "(select fk_vhcl_id from co.tb_ebrs_vehicle_master where "
			+ "fk_mast_id in (select pk_mast_id from co.tb_ebrs_master"
			+ " where mast_login=?));");
	
}
