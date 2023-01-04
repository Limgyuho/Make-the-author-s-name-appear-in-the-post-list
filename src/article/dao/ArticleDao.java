package article.dao;

import java.util.ArrayList;
import java.util.List;

import creatboard16.dto.Article;

public class ArticleDao {

	public List<Article> articles;
	
	public ArticleDao() {
		articles = new ArrayList<>();
	}
}
