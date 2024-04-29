package exam.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("mgr")
public class WriteArticleMgr implements IWriteArticleMgr {
	@Autowired
	@Qualifier("mysql")
	private IArticleDAO articleDAO;
	
	@Autowired
	@Qualifier("oracle")
	private IArticleDAO articleDAO2;
	
	public WriteArticleMgr() {
		super();
	}

	public WriteArticleMgr(IArticleDAO articleDAO, IArticleDAO articleDAO2) {
		super();
		this.articleDAO = articleDAO;
		this.articleDAO2 = articleDAO2;
	}

	@Override
	public void write(ArticleDTO article) {
		articleDAO.insert(article);
		articleDAO2.insert(article);
	}
}