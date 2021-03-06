package com.zhike.sql.servicesImpl;

import java.util.List;

import com.zhike.sql.beans.MemberBean;
import com.zhike.sql.beans.MemberEntityCardBean;
import com.zhike.sql.beans.MemberInfoBean;
import com.zhike.sql.beans.MemberInfoCogBean;
import com.zhike.sql.dao.MemberDAO;
import com.zhike.sql.services.MemberService;

public class MemberServiceImpl implements MemberService {
	
	public MemberDAO memberDAO;

	


	public MemberDAO getMemberDAO() {
		return memberDAO;
	}



	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}



	public List<MemberBean> selectAllByAppID(MemberBean memberBean) {
		return memberDAO.selectAllByAppID(memberBean);
	}



	public int insertOneMember(MemberBean memberBean) {
		return memberDAO.insertOneMember(memberBean);
	}



	public MemberInfoBean selectOneMemberInfo(MemberInfoBean memberInfoBean) {
		return memberDAO.selectOneMemberInfo(memberInfoBean);
	}

	public MemberInfoBean selectOneMemberInfoById(MemberInfoBean memberInfoBean) {
		return memberDAO.selectOneMemberInfoById(memberInfoBean);
	}
	


	public MemberBean selectOneMember(MemberBean memberBean) {
		return memberDAO.selectOneMember(memberBean);
	}



	public int insertOneMemberInfo(MemberInfoBean memberInfoBean) {
		return memberDAO.insertOneMemberInfo(memberInfoBean);
	}



	public int delInfosByServiceId(MemberBean memberBean) {
		return memberDAO.delInfosByServiceId(memberBean);
	}



	public int delOneMember(MemberBean memberBean) {
		return memberDAO.delOneMember(memberBean);
	}



	public int updateOneMember(MemberBean memberBean) {
		return memberDAO.updateOneMember(memberBean);
	}



	public int selectCountInfosByPage(MemberInfoBean memberInfoBean) {
		return  memberDAO.selectCountInfosByPage(memberInfoBean);
	}



	public List<MemberInfoBean> selectInfosByPage(MemberInfoBean memberInfoBean) {
		return memberDAO.selectInfosByPage(memberInfoBean);
	}



	public int insertOneMemberInfoCog(MemberInfoCogBean memberInfoCogBean) {
		return memberDAO.insertOneMemberInfoCog(memberInfoCogBean);
	}



	public int updateOneMemberInfoForYueAndJifen(MemberInfoBean memberInfoBean) {
			return memberDAO.updateOneMemberInfoForYueAndJifen(memberInfoBean);
	}



	public int selectCountInfoListByPage(MemberInfoCogBean memberInfoCogBean) {
		return  memberDAO.selectCountInfoListByPage(memberInfoCogBean);
	}



	public List<MemberInfoCogBean> selectInfoListByPage(
			MemberInfoCogBean memberInfoCogBean) {
		return  memberDAO.selectInfoListByPage(memberInfoCogBean);
	}



	public int selectForIsCheck(MemberInfoBean memberInfoBean) {
		return  memberDAO.selectForIsCheck(memberInfoBean);
	}



	public int delInfoCogsByServiceId(MemberBean memberBean) {
		return memberDAO.delInfoCogsByServiceId(memberBean);
	}



	public int selectCountEntityCardByPage(
			MemberEntityCardBean memberEntityCardBean) {
		return memberDAO.selectCountEntityCardByPage(memberEntityCardBean);
	}



	public List<MemberEntityCardBean> selectEntityCardByPage(
			MemberEntityCardBean memberEntityCardBean) {
		return memberDAO.selectEntityCardByPage(memberEntityCardBean);
	}



	public int insertOneEntityCard(MemberEntityCardBean memberEntityCardBean) {
		return memberDAO.insertOneEntityCard(memberEntityCardBean);
	}

	public int updateOneEntityCard(MemberEntityCardBean memberEntityCardBean) {
		return memberDAO.updateOneEntityCard(memberEntityCardBean);
	}

	public int delOneEntityCard(MemberEntityCardBean memberEntityCardBean) {
		return memberDAO.delOneEntityCard(memberEntityCardBean);
	}



	public int delEntityCardByServiceId(MemberBean memberBean) {
		return memberDAO.delEntityCardByServiceId(memberBean);
	}



	public List<MemberEntityCardBean> selectEntityCardByCheck(
			MemberEntityCardBean memberEntityCardBean) {
		return memberDAO.selectEntityCardByCheck(memberEntityCardBean);
	}



	public int useOneEntityCard(MemberEntityCardBean memberEntityCardBean) {
		return memberDAO.useOneEntityCard(memberEntityCardBean);
	}



	public int bindOneMemberInfo(MemberInfoBean memberInfoBean) {
		return memberDAO.bindOneMemberInfo(memberInfoBean);
	}



	public int perfectOneMemberInfo(MemberInfoBean memberInfoBean) {
		return memberDAO.perfectOneMemberInfo(memberInfoBean);
	}



	public MemberEntityCardBean selectEntityCardByCardId(MemberEntityCardBean memberEntityCardBean) {
		return memberDAO.selectEntityCardByCardId(memberEntityCardBean);
	}



	public int updateOneMemberInfoForRemark(MemberInfoBean memberInfoBean) {
		return memberDAO.updateOneMemberInfoForRemark(memberInfoBean);
	}


	//API
	public int updateOneMemberInfoByAPI(MemberInfoBean memberInfoBean) {
		return memberDAO.updateOneMemberInfoByAPI(memberInfoBean);
	}



	public int delOneMemberInfoByAPI(MemberInfoBean memberInfoBean) {
		return memberDAO.delOneMemberInfoByAPI(memberInfoBean);
	}
	

}
