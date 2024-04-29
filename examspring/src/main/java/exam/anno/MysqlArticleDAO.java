package exam.anno;

import org.springframework.stereotype.Repository;

@Repository("mysql")
public class MysqlArticleDAO implements IArticleDAO {
	public void insert(ArticleDTO article) {
		System.out.println("MySQL");
	}
}