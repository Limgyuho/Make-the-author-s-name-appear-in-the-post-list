package article.dao;

import java.util.ArrayList;
import java.util.List;

import creatboard16.dto.Member;

public class MemberDao {
	public List<Member> members;
	
	public MemberDao() {
		members = new ArrayList<>();
	}
}
