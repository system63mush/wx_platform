package com.zhike.sql.services;

import java.util.List;

import com.zhike.sql.beans.LBSBean;
import com.zhike.sql.beans.MemberBean;
import com.zhike.sql.beans.MemberEntityCardBean;
import com.zhike.sql.beans.MemberInfoBean;
import com.zhike.sql.beans.MemberInfoCogBean;

public interface MemberService {

	List<MemberBean> selectAllByAppID(MemberBean memberBean);

	int insertOneMember(MemberBean memberBean);

	MemberInfoBean selectOneMemberInfo(MemberInfoBean memberInfoBean);

	MemberBean selectOneMember(MemberBean memberBean);

	int insertOneMemberInfo(MemberInfoBean memberInfoBean);

	MemberInfoBean selectOneMemberInfoById(MemberInfoBean memberInfoBean);

	int delOneMember(MemberBean memberBean);

	int delEntityCardByServiceId(MemberBean memberBean);
	
	int delInfosByServiceId(MemberBean memberBean);

	int updateOneMember(MemberBean memberBean);

	int selectCountInfosByPage(MemberInfoBean memberInfoBean);

	List<MemberInfoBean> selectInfosByPage(MemberInfoBean memberInfoBean);

	int insertOneMemberInfoCog(MemberInfoCogBean memberInfoCogBean);

	int updateOneMemberInfoForYueAndJifen(MemberInfoBean memberInfoBean);

	int selectCountInfoListByPage(MemberInfoCogBean memberInfoCogBean);

	List<MemberInfoCogBean> selectInfoListByPage(MemberInfoCogBean memberInfoCogBean);

	int selectForIsCheck(MemberInfoBean memberInfoBean);

	int delInfoCogsByServiceId(MemberBean memberBean);

	int selectCountEntityCardByPage(MemberEntityCardBean memberEntityCardBean);

	List<MemberEntityCardBean> selectEntityCardByPage(MemberEntityCardBean memberEntityCardBean);

	int insertOneEntityCard(MemberEntityCardBean memberEntityCardBean);

	int updateOneEntityCard(MemberEntityCardBean memberEntityCardBean);

	int delOneEntityCard(MemberEntityCardBean memberEntityCardBean);

	List<MemberEntityCardBean> selectEntityCardByCheck(
			MemberEntityCardBean memberEntityCardBean);

	int useOneEntityCard(MemberEntityCardBean memberEntityCardBean);

	int bindOneMemberInfo(MemberInfoBean memberInfoBean);

	int perfectOneMemberInfo(MemberInfoBean memberInfoBean);

	MemberEntityCardBean selectEntityCardByCardId(MemberEntityCardBean memberEntityCardBean);

	int updateOneMemberInfoForRemark(MemberInfoBean memberInfoBean);

	
	//API
	int updateOneMemberInfoByAPI(MemberInfoBean memberInfoBean);

	int delOneMemberInfoByAPI(MemberInfoBean memberInfoBean);

	



}